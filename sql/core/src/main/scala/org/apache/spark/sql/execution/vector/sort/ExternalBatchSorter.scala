/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.sql.execution.vector.sort

import java.io.IOException

import scala.collection.mutable

import org.apache.spark.executor.ShuffleWriteMetrics
import org.apache.spark.Logging
import org.apache.spark.memory.{MemoryConsumer, MemoryMode, TaskMemoryManager}
import org.apache.spark.sql.catalyst.expressions.Attribute
import org.apache.spark.sql.catalyst.expressions.vector.InterBatchOrdering
import org.apache.spark.sql.catalyst.vector.RowBatch
import org.apache.spark.storage.BlockManager
import org.apache.spark.TaskContext
import org.apache.spark.util.{TaskCompletionListener, Utils}

class ExternalBatchSorter(
    taskMemoryManager: TaskMemoryManager,
    blockManager: BlockManager,
    taskContext: TaskContext,
    interBatchComparator: InterBatchOrdering,
    schema: Seq[Attribute],
    defaultCapacity: Int)
  extends MemoryConsumer(taskMemoryManager) with Logging {

  val sortedBatches = mutable.ArrayBuffer.empty[RowBatch]
  val spillWriters = mutable.ArrayBuffer.empty[RowBatchSpillWriter]

  var inMemoryBatchSorter: InMemoryBatchSorter = null
  inMemoryBatchSorter = InMemoryBatchSorter(
    interBatchComparator, sortedBatches, schema, defaultCapacity)

  private var readingIterator: SpillableBatchIterator = null

  var peakMemoryUsedBytes: Long = 0L

  private val allocateGranularity: Long = 16 * 1024 * 1024; // 16 MB

  val writeMetrics = new ShuffleWriteMetrics()

  // Register a cleanup task with TaskContext to ensure that memory is guaranteed to be freed at
  // the end of the task. This is necessary to avoid memory leaks in when the downstream operator
  // does not fully consume the sorter's output (e.g. sort followed by limit).
  taskContext.addTaskCompletionListener(new TaskCompletionListener() {
    def onTaskCompletion(context: TaskContext) {
      cleanupResources()
    }
  })

  def insertBatch(rb: RowBatch): Unit = {
    sortedBatches += rb
  }

  def getSortedIterator(): RowBatchSorterIterator = {
    if (spillWriters.isEmpty) {
      assert(inMemoryBatchSorter != null)
      readingIterator = new SpillableBatchIterator(inMemoryBatchSorter.getSortedIterator())
      readingIterator
    } else {
      val num = spillWriters.size + (if (inMemoryBatchSorter != null) 1 else 0)
      val spillMerger =
        new RowBatchSpillMerger(interBatchComparator, num, schema, defaultCapacity)
      for (writer <- spillWriters) {
        spillMerger.addSpillIfNotEmpty(writer.getReader(blockManager))
      }
      if (inMemoryBatchSorter != null) {
        readingIterator = new SpillableBatchIterator(inMemoryBatchSorter.getSortedIterator())
        spillMerger.addSpillIfNotEmpty(readingIterator)
      }
      spillMerger.getSortedIterator()
    }
  }


  override def spill(size: Long, trigger: MemoryConsumer): Long = {
    if (trigger != this) {
      if (readingIterator != null) {
         return readingIterator.spill()
       }
      return 0
    }

    if (inMemoryBatchSorter == null || sortedBatches.isEmpty) {
      return 0
    }

    logInfo(s"Thread ${Thread.currentThread.getId} spilling sort data of " +
      s"${Utils.bytesToString(getMemoryUsage())} to disk (${spillWriters.size} times so far)")

    if (!sortedBatches.isEmpty) {
      val spillWriter: RowBatchSpillWriter =
        new RowBatchSpillWriter(blockManager, writeMetrics, schema, defaultCapacity)
      spillWriters += spillWriter
      val sortedBatches: RowBatchSorterIterator = inMemoryBatchSorter.getSortedIterator()
      while (sortedBatches.hasNext) {
        sortedBatches.loadNext()
        spillWriter.write(sortedBatches.currentBatch)
      }
      spillWriter.close()
      inMemoryBatchSorter.reset()
    }

    val spillSize: Long = freeMemory()
    taskContext.taskMetrics.incMemoryBytesSpilled(spillSize)

    return spillSize
  }

  def freeMemory(): Long = {
    if (sortedBatches.isEmpty) return 0

    val memoryFreed = getMemoryUsage()
    if (memoryFreed > peakMemoryUsedBytes) {
      peakMemoryUsedBytes = memoryFreed
    }
    used -= memoryFreed

    var i = 0
    while (i < sortedBatches.size) {
      val rb = sortedBatches(i)
      rb.free()
      i += 1
    }
    sortedBatches.clear()
    taskMemoryManager.releaseExecutionMemory(memoryFreed, MemoryMode.ON_HEAP, this)
    memoryFreed
  }

  def getMemoryUsage(): Long = {
    val batchSize = if (sortedBatches.nonEmpty) sortedBatches.head.memoryFootprintInBytes() else 0
    val numBatchPerAllocation: Long = allocateGranularity / batchSize
    var allocationCount: Long = sortedBatches.size / numBatchPerAllocation
    if (sortedBatches.size % numBatchPerAllocation != 0) {
      allocationCount += 1
    }
    allocationCount * allocateGranularity
  }

  def updatePeakMemoryUsed(): Unit = {
    val mem = getMemoryUsage()
    if (mem > peakMemoryUsedBytes) {
      peakMemoryUsedBytes = mem
    }
  }

  def peakMemoryUsage(): Long = {
    updatePeakMemoryUsed()
    peakMemoryUsedBytes
  }

  def cleanupResources(): Unit = {
    this.synchronized {
      deleteSpillFiles()
      freeMemory()
      if (inMemoryBatchSorter != null) {
        inMemoryBatchSorter.free()
        inMemoryBatchSorter = null
      }
    }
  }

  def deleteSpillFiles(): Unit = {
    for (writer <- spillWriters) {
      val f = writer.file
      if (f != null && f.exists()) {
        if (!f.delete()) {
          logError(s"Was unable to delete spill file ${f.getAbsolutePath}")
        }
      }
    }
  }

  class SpillableBatchIterator(
      inMemSortedIterator: RowBatchSorterIterator) extends RowBatchSorterIterator {

    var upstream: RowBatchSorterIterator = inMemSortedIterator
    var nextUpstream: RowBatchSorterIterator = null

    override def hasNext(): Boolean = {
      if (nextUpstream != null) {
        nextUpstream.hasNext()
      } else {
        upstream.hasNext()
      }
    }

    @throws[IOException]
    override def loadNext(): Unit = {
      this.synchronized {
        if (nextUpstream != null) {
          upstream = nextUpstream
          nextUpstream = null
        }
        upstream.loadNext()
      }
    }

    override def currentBatch: RowBatch = upstream.currentBatch

    @throws[IOException]
    def spill(): Long = {
      this.synchronized {
        if (!(nextUpstream == null && upstream.hasNext())) {
          return 0
        }

        val spillWriter: RowBatchSpillWriter =
          new RowBatchSpillWriter(blockManager, writeMetrics, schema, defaultCapacity)
        while (upstream.hasNext()) {
          upstream.loadNext()
          spillWriter.write(upstream.currentBatch)
        }
        spillWriter.close()
        inMemoryBatchSorter.reset()

        spillWriters += spillWriter
        nextUpstream = spillWriter.getReader(blockManager)

        var released: Long = 0
        ExternalBatchSorter.this.synchronized {
          released += freeMemory()
        }
        released
      }
    }
  }

}
