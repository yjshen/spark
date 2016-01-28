package org.apache.spark.sql.hive.orc;

import org.apache.hadoop.hive.ql.io.orc.InStream;
import org.apache.hadoop.hive.ql.io.orc.PositionProvider;
import org.apache.spark.sql.catalyst.vector.ColumnVector;

import java.io.EOFException;
import java.io.IOException;

/**
 * A reader that reads a sequence of integers.
 * */
class RunLengthIntegerReader implements IntegerReader {

  static final int MIN_REPEAT_SIZE = 3;
  static final int MAX_LITERAL_SIZE = 128;

  private final InStream input;
  private final boolean signed;
  private final long[] literals =
      new long[MAX_LITERAL_SIZE];
  private int numLiterals = 0;
  private int delta = 0;
  private int used = 0;
  private boolean repeat = false;
  private SerializationUtils utils;

  RunLengthIntegerReader(InStream input, boolean signed) throws IOException {
    this.input = input;
    this.signed = signed;
    this.utils = new SerializationUtils();
  }

  private void readValues() throws IOException {
    int control = input.read();
    if (control == -1) {
      throw new EOFException("Read past end of RLE integer from " + input);
    } else if (control < 0x80) {
      numLiterals = control + MIN_REPEAT_SIZE;
      used = 0;
      repeat = true;
      delta = input.read();
      if (delta == -1) {
        throw new EOFException("End of stream in RLE Integer from " + input);
      }
      // convert from 0 to 255 to -128 to 127 by converting to a signed byte
      delta = (byte) (0 + delta);
      if (signed) {
        literals[0] = utils.readVslong(input);
      } else {
        literals[0] = utils.readVulong(input);
      }
    } else {
      repeat = false;
      numLiterals = 0x100 - control;
      used = 0;
      for(int i=0; i < numLiterals; ++i) {
        if (signed) {
          literals[i] = utils.readVslong(input);
        } else {
          literals[i] = utils.readVulong(input);
        }
      }
    }
  }

  @Override
  public boolean hasNext() throws IOException {
    return used != numLiterals || input.available() > 0;
  }

  @Override
  public long next() throws IOException {
    long result;
    if (used == numLiterals) {
      readValues();
    }
    if (repeat) {
      result = literals[0] + (used++) * delta;
    } else {
      result = literals[used++];
    }
    return result;
  }

  @Override
  public void nextIntVector(ColumnVector previous, long previousLen)
      throws IOException {
    previous.isRepeating = true;
    for (int i = 0; i < previousLen; i++) {
      if (!previous.isNull[i]) {
        previous.intVector[i] = (int) next();
      } else {
        // The default value of null for int type in vectorized
        // processing is 1, so set that if the value is null
        previous.intVector[i] = 1;
      }

      // The default value for nulls in Vectorization for int types is 1
      // and given that non null value can also be 1, we need to check for isNull also
      // when determining the isRepeating flag.
      if (previous.isRepeating
          && i > 0
          && (previous.intVector[i - 1] != previous.intVector[i] || previous.isNull[i - 1] != previous.isNull[i])) {
        previous.isRepeating = false;
      }
    }
  }

  @Override
  public void nextLongVector(ColumnVector previous, long previousLen)
      throws IOException {
    previous.isRepeating = true;
    for (int i = 0; i < previousLen; i++) {
      if (!previous.isNull[i]) {
        previous.longVector[i] = (int) next();
      } else {
        // The default value of null for int type in vectorized
        // processing is 1, so set that if the value is null
        previous.longVector[i] = 1;
      }

      // The default value for nulls in Vectorization for int types is 1
      // and given that non null value can also be 1, we need to check for isNull also
      // when determining the isRepeating flag.
      if (previous.isRepeating
          && i > 0
          && (previous.longVector[i - 1] != previous.longVector[i] || previous.isNull[i - 1] != previous.isNull[i])) {
        previous.isRepeating = false;
      }
    }
  }

  @Override
  public void seek(PositionProvider index) throws IOException {
    input.seek(index);
    int consumed = (int) index.getNext();
    if (consumed != 0) {
      // a loop is required for cases where we break the run into two parts
      while (consumed > 0) {
        readValues();
        used = consumed;
        consumed -= numLiterals;
      }
    } else {
      used = 0;
      numLiterals = 0;
    }
  }

  @Override
  public void skip(long numValues) throws IOException {
    while (numValues > 0) {
      if (used == numLiterals) {
        readValues();
      }
      long consume = Math.min(numValues, numLiterals - used);
      used += consume;
      numValues -= consume;
    }
  }
}

