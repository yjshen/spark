package org.apache.spark.sql.hive.orc;

import com.google.common.collect.Lists;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.common.DiskRange;
import org.apache.hadoop.hive.ql.io.orc.CompressionCodec;
import org.apache.hadoop.hive.ql.io.orc.InStream;
import org.apache.hadoop.hive.ql.io.orc.StripeInformation;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

class MetadataReader {
  private final FSDataInputStream file;
  private final CompressionCodec codec;
  private final int bufferSize;
  private final int typeCount;

  public MetadataReader(FileSystem fileSystem, Path path,
                        CompressionCodec codec, int bufferSize, int typeCount) throws IOException {
    this(fileSystem.open(path), codec, bufferSize, typeCount);
  }

  public MetadataReader(FSDataInputStream file,
                        CompressionCodec codec, int bufferSize, int typeCount) {
    this.file = file;
    this.codec = codec;
    this.bufferSize = bufferSize;
    this.typeCount = typeCount;
  }

  public OrcRowBatchReaderImpl.Index readRowIndex(
      StripeInformation stripe, OrcProto.StripeFooter footer,
      boolean[] included, OrcProto.RowIndex[] indexes, boolean[] sargColumns,
      OrcProto.BloomFilterIndex[] bloomFilterIndices) throws IOException {
    if (footer == null) {
      footer = readStripeFooter(stripe);
    }
    if (indexes == null) {
      indexes = new OrcProto.RowIndex[typeCount];
    }
    if (bloomFilterIndices == null) {
      bloomFilterIndices = new OrcProto.BloomFilterIndex[typeCount];
    }
    long offset = stripe.getOffset();
    List<OrcProto.Stream> streams = footer.getStreamsList();
    for (int i = 0; i < streams.size(); i++) {
      OrcProto.Stream stream = streams.get(i);
      OrcProto.Stream nextStream = null;
      if (i < streams.size() - 1) {
        nextStream = streams.get(i+1);
      }
      int col = stream.getColumn();
      int len = (int) stream.getLength();
      // row index stream and bloom filter are interlaced, check if the sarg column contains bloom
      // filter and combine the io to read row index and bloom filters for that column together
      if (stream.hasKind() && (stream.getKind() == OrcProto.Stream.Kind.ROW_INDEX)) {
        boolean readBloomFilter = false;
        if (sargColumns != null && sargColumns[col] &&
            nextStream.getKind() == OrcProto.Stream.Kind.BLOOM_FILTER) {
          len += nextStream.getLength();
          i += 1;
          readBloomFilter = true;
        }
        if ((included == null || included[col]) && indexes[col] == null) {
          byte[] buffer = new byte[len];
          file.seek(offset);
          file.readFully(buffer);
          ByteBuffer[] bb = new ByteBuffer[] {ByteBuffer.wrap(buffer)};
          indexes[col] = OrcProto.RowIndex.parseFrom(InStream.create("index",
              bb, new long[]{0}, stream.getLength(), codec, bufferSize));
          if (readBloomFilter) {
            bb[0].position((int) stream.getLength());
            bloomFilterIndices[col] = OrcProto.BloomFilterIndex.parseFrom(
                InStream.create("bloom_filter", bb, new long[]{0}, nextStream.getLength(),
                    codec, bufferSize));
          }
        }
      }
      offset += len;
    }

    OrcRowBatchReaderImpl.Index index = new OrcRowBatchReaderImpl.Index(indexes, bloomFilterIndices);
    return index;
  }

  public OrcProto.StripeFooter readStripeFooter(StripeInformation stripe) throws IOException {
    long offset = stripe.getOffset() + stripe.getIndexLength() + stripe.getDataLength();
    int tailLength = (int) stripe.getFooterLength();

    // read the footer
    ByteBuffer tailBuf = ByteBuffer.allocate(tailLength);
    file.seek(offset);
    file.readFully(tailBuf.array(), tailBuf.arrayOffset(), tailLength);
    return OrcProto.StripeFooter.parseFrom(InStream.create("footer",
        Lists.<DiskRange>newArrayList(new OrcFileReaderImpl.BufferChunk(tailBuf, 0)),
        tailLength, codec, bufferSize));
  }

  public void close() throws IOException {
    file.close();
  }
}
