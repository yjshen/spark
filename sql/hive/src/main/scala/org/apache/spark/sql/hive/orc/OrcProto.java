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

package org.apache.spark.sql.hive.orc;

public final class OrcProto {
  private OrcProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code orc.proto.CompressionKind}
   */
  public enum CompressionKind
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NONE = 0;</code>
     */
    NONE(0, 0),
    /**
     * <code>ZLIB = 1;</code>
     */
    ZLIB(1, 1),
    /**
     * <code>SNAPPY = 2;</code>
     */
    SNAPPY(2, 2),
    /**
     * <code>LZO = 3;</code>
     */
    LZO(3, 3),
    ;

    /**
     * <code>NONE = 0;</code>
     */
    public static final int NONE_VALUE = 0;
    /**
     * <code>ZLIB = 1;</code>
     */
    public static final int ZLIB_VALUE = 1;
    /**
     * <code>SNAPPY = 2;</code>
     */
    public static final int SNAPPY_VALUE = 2;
    /**
     * <code>LZO = 3;</code>
     */
    public static final int LZO_VALUE = 3;


    public final int getNumber() { return value; }

    public static CompressionKind valueOf(int value) {
      switch (value) {
        case 0: return NONE;
        case 1: return ZLIB;
        case 2: return SNAPPY;
        case 3: return LZO;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CompressionKind>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<CompressionKind>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CompressionKind>() {
            public CompressionKind findValueByNumber(int number) {
              return CompressionKind.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return OrcProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final CompressionKind[] VALUES = values();

    public static CompressionKind valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private CompressionKind(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:orc.proto.CompressionKind)
  }

  public interface IntegerStatisticsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional sint64 minimum = 1;
    /**
     * <code>optional sint64 minimum = 1;</code>
     */
    boolean hasMinimum();
    /**
     * <code>optional sint64 minimum = 1;</code>
     */
    long getMinimum();

    // optional sint64 maximum = 2;
    /**
     * <code>optional sint64 maximum = 2;</code>
     */
    boolean hasMaximum();
    /**
     * <code>optional sint64 maximum = 2;</code>
     */
    long getMaximum();

    // optional sint64 sum = 3;
    /**
     * <code>optional sint64 sum = 3;</code>
     */
    boolean hasSum();
    /**
     * <code>optional sint64 sum = 3;</code>
     */
    long getSum();
  }
  /**
   * Protobuf type {@code orc.proto.IntegerStatistics}
   */
  public static final class IntegerStatistics extends
      com.google.protobuf.GeneratedMessage
      implements IntegerStatisticsOrBuilder {
    // Use IntegerStatistics.newBuilder() to construct.
    private IntegerStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private IntegerStatistics(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final IntegerStatistics defaultInstance;
    public static IntegerStatistics getDefaultInstance() {
      return defaultInstance;
    }

    public IntegerStatistics getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private IntegerStatistics(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              minimum_ = input.readSInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              maximum_ = input.readSInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              sum_ = input.readSInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_IntegerStatistics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_IntegerStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              IntegerStatistics.class, IntegerStatistics.Builder.class);
    }

    public static com.google.protobuf.Parser<IntegerStatistics> PARSER =
        new com.google.protobuf.AbstractParser<IntegerStatistics>() {
      public IntegerStatistics parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IntegerStatistics(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<IntegerStatistics> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional sint64 minimum = 1;
    public static final int MINIMUM_FIELD_NUMBER = 1;
    private long minimum_;
    /**
     * <code>optional sint64 minimum = 1;</code>
     */
    public boolean hasMinimum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional sint64 minimum = 1;</code>
     */
    public long getMinimum() {
      return minimum_;
    }

    // optional sint64 maximum = 2;
    public static final int MAXIMUM_FIELD_NUMBER = 2;
    private long maximum_;
    /**
     * <code>optional sint64 maximum = 2;</code>
     */
    public boolean hasMaximum() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional sint64 maximum = 2;</code>
     */
    public long getMaximum() {
      return maximum_;
    }

    // optional sint64 sum = 3;
    public static final int SUM_FIELD_NUMBER = 3;
    private long sum_;
    /**
     * <code>optional sint64 sum = 3;</code>
     */
    public boolean hasSum() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional sint64 sum = 3;</code>
     */
    public long getSum() {
      return sum_;
    }

    private void initFields() {
      minimum_ = 0L;
      maximum_ = 0L;
      sum_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeSInt64(1, minimum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeSInt64(2, maximum_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeSInt64(3, sum_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt64Size(1, minimum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt64Size(2, maximum_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt64Size(3, sum_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static IntegerStatistics parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static IntegerStatistics parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static IntegerStatistics parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static IntegerStatistics parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static IntegerStatistics parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static IntegerStatistics parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static IntegerStatistics parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static IntegerStatistics parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static IntegerStatistics parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static IntegerStatistics parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(IntegerStatistics prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.IntegerStatistics}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements IntegerStatisticsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_IntegerStatistics_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_IntegerStatistics_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                IntegerStatistics.class, IntegerStatistics.Builder.class);
      }

      // Construct using IntegerStatistics.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        minimum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        maximum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        sum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_IntegerStatistics_descriptor;
      }

      public IntegerStatistics getDefaultInstanceForType() {
        return IntegerStatistics.getDefaultInstance();
      }

      public IntegerStatistics build() {
        IntegerStatistics result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public IntegerStatistics buildPartial() {
        IntegerStatistics result = new IntegerStatistics(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.minimum_ = minimum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.maximum_ = maximum_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.sum_ = sum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof IntegerStatistics) {
          return mergeFrom((IntegerStatistics)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(IntegerStatistics other) {
        if (other == IntegerStatistics.getDefaultInstance()) return this;
        if (other.hasMinimum()) {
          setMinimum(other.getMinimum());
        }
        if (other.hasMaximum()) {
          setMaximum(other.getMaximum());
        }
        if (other.hasSum()) {
          setSum(other.getSum());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        IntegerStatistics parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (IntegerStatistics) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional sint64 minimum = 1;
      private long minimum_ ;
      /**
       * <code>optional sint64 minimum = 1;</code>
       */
      public boolean hasMinimum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional sint64 minimum = 1;</code>
       */
      public long getMinimum() {
        return minimum_;
      }
      /**
       * <code>optional sint64 minimum = 1;</code>
       */
      public Builder setMinimum(long value) {
        bitField0_ |= 0x00000001;
        minimum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional sint64 minimum = 1;</code>
       */
      public Builder clearMinimum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        minimum_ = 0L;
        onChanged();
        return this;
      }

      // optional sint64 maximum = 2;
      private long maximum_ ;
      /**
       * <code>optional sint64 maximum = 2;</code>
       */
      public boolean hasMaximum() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional sint64 maximum = 2;</code>
       */
      public long getMaximum() {
        return maximum_;
      }
      /**
       * <code>optional sint64 maximum = 2;</code>
       */
      public Builder setMaximum(long value) {
        bitField0_ |= 0x00000002;
        maximum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional sint64 maximum = 2;</code>
       */
      public Builder clearMaximum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        maximum_ = 0L;
        onChanged();
        return this;
      }

      // optional sint64 sum = 3;
      private long sum_ ;
      /**
       * <code>optional sint64 sum = 3;</code>
       */
      public boolean hasSum() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional sint64 sum = 3;</code>
       */
      public long getSum() {
        return sum_;
      }
      /**
       * <code>optional sint64 sum = 3;</code>
       */
      public Builder setSum(long value) {
        bitField0_ |= 0x00000004;
        sum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional sint64 sum = 3;</code>
       */
      public Builder clearSum() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sum_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.IntegerStatistics)
    }

    static {
      defaultInstance = new IntegerStatistics(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.IntegerStatistics)
  }

  public interface DoubleStatisticsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional double minimum = 1;
    /**
     * <code>optional double minimum = 1;</code>
     */
    boolean hasMinimum();
    /**
     * <code>optional double minimum = 1;</code>
     */
    double getMinimum();

    // optional double maximum = 2;
    /**
     * <code>optional double maximum = 2;</code>
     */
    boolean hasMaximum();
    /**
     * <code>optional double maximum = 2;</code>
     */
    double getMaximum();

    // optional double sum = 3;
    /**
     * <code>optional double sum = 3;</code>
     */
    boolean hasSum();
    /**
     * <code>optional double sum = 3;</code>
     */
    double getSum();
  }
  /**
   * Protobuf type {@code orc.proto.DoubleStatistics}
   */
  public static final class DoubleStatistics extends
      com.google.protobuf.GeneratedMessage
      implements DoubleStatisticsOrBuilder {
    // Use DoubleStatistics.newBuilder() to construct.
    private DoubleStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DoubleStatistics(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DoubleStatistics defaultInstance;
    public static DoubleStatistics getDefaultInstance() {
      return defaultInstance;
    }

    public DoubleStatistics getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DoubleStatistics(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 9: {
              bitField0_ |= 0x00000001;
              minimum_ = input.readDouble();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              maximum_ = input.readDouble();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              sum_ = input.readDouble();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_DoubleStatistics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_DoubleStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DoubleStatistics.class, DoubleStatistics.Builder.class);
    }

    public static com.google.protobuf.Parser<DoubleStatistics> PARSER =
        new com.google.protobuf.AbstractParser<DoubleStatistics>() {
      public DoubleStatistics parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DoubleStatistics(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DoubleStatistics> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional double minimum = 1;
    public static final int MINIMUM_FIELD_NUMBER = 1;
    private double minimum_;
    /**
     * <code>optional double minimum = 1;</code>
     */
    public boolean hasMinimum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional double minimum = 1;</code>
     */
    public double getMinimum() {
      return minimum_;
    }

    // optional double maximum = 2;
    public static final int MAXIMUM_FIELD_NUMBER = 2;
    private double maximum_;
    /**
     * <code>optional double maximum = 2;</code>
     */
    public boolean hasMaximum() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional double maximum = 2;</code>
     */
    public double getMaximum() {
      return maximum_;
    }

    // optional double sum = 3;
    public static final int SUM_FIELD_NUMBER = 3;
    private double sum_;
    /**
     * <code>optional double sum = 3;</code>
     */
    public boolean hasSum() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional double sum = 3;</code>
     */
    public double getSum() {
      return sum_;
    }

    private void initFields() {
      minimum_ = 0D;
      maximum_ = 0D;
      sum_ = 0D;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeDouble(1, minimum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeDouble(2, maximum_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeDouble(3, sum_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, minimum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, maximum_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, sum_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static DoubleStatistics parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DoubleStatistics parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DoubleStatistics parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DoubleStatistics parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DoubleStatistics parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static DoubleStatistics parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static DoubleStatistics parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static DoubleStatistics parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static DoubleStatistics parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static DoubleStatistics parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(DoubleStatistics prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.DoubleStatistics}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements DoubleStatisticsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_DoubleStatistics_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_DoubleStatistics_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DoubleStatistics.class, DoubleStatistics.Builder.class);
      }

      // Construct using DoubleStatistics.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        minimum_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000001);
        maximum_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        sum_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_DoubleStatistics_descriptor;
      }

      public DoubleStatistics getDefaultInstanceForType() {
        return DoubleStatistics.getDefaultInstance();
      }

      public DoubleStatistics build() {
        DoubleStatistics result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public DoubleStatistics buildPartial() {
        DoubleStatistics result = new DoubleStatistics(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.minimum_ = minimum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.maximum_ = maximum_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.sum_ = sum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof DoubleStatistics) {
          return mergeFrom((DoubleStatistics)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DoubleStatistics other) {
        if (other == DoubleStatistics.getDefaultInstance()) return this;
        if (other.hasMinimum()) {
          setMinimum(other.getMinimum());
        }
        if (other.hasMaximum()) {
          setMaximum(other.getMaximum());
        }
        if (other.hasSum()) {
          setSum(other.getSum());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        DoubleStatistics parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (DoubleStatistics) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional double minimum = 1;
      private double minimum_ ;
      /**
       * <code>optional double minimum = 1;</code>
       */
      public boolean hasMinimum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional double minimum = 1;</code>
       */
      public double getMinimum() {
        return minimum_;
      }
      /**
       * <code>optional double minimum = 1;</code>
       */
      public Builder setMinimum(double value) {
        bitField0_ |= 0x00000001;
        minimum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double minimum = 1;</code>
       */
      public Builder clearMinimum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        minimum_ = 0D;
        onChanged();
        return this;
      }

      // optional double maximum = 2;
      private double maximum_ ;
      /**
       * <code>optional double maximum = 2;</code>
       */
      public boolean hasMaximum() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional double maximum = 2;</code>
       */
      public double getMaximum() {
        return maximum_;
      }
      /**
       * <code>optional double maximum = 2;</code>
       */
      public Builder setMaximum(double value) {
        bitField0_ |= 0x00000002;
        maximum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double maximum = 2;</code>
       */
      public Builder clearMaximum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        maximum_ = 0D;
        onChanged();
        return this;
      }

      // optional double sum = 3;
      private double sum_ ;
      /**
       * <code>optional double sum = 3;</code>
       */
      public boolean hasSum() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional double sum = 3;</code>
       */
      public double getSum() {
        return sum_;
      }
      /**
       * <code>optional double sum = 3;</code>
       */
      public Builder setSum(double value) {
        bitField0_ |= 0x00000004;
        sum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double sum = 3;</code>
       */
      public Builder clearSum() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sum_ = 0D;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.DoubleStatistics)
    }

    static {
      defaultInstance = new DoubleStatistics(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.DoubleStatistics)
  }

  public interface StringStatisticsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string minimum = 1;
    /**
     * <code>optional string minimum = 1;</code>
     */
    boolean hasMinimum();
    /**
     * <code>optional string minimum = 1;</code>
     */
    java.lang.String getMinimum();
    /**
     * <code>optional string minimum = 1;</code>
     */
    com.google.protobuf.ByteString
        getMinimumBytes();

    // optional string maximum = 2;
    /**
     * <code>optional string maximum = 2;</code>
     */
    boolean hasMaximum();
    /**
     * <code>optional string maximum = 2;</code>
     */
    java.lang.String getMaximum();
    /**
     * <code>optional string maximum = 2;</code>
     */
    com.google.protobuf.ByteString
        getMaximumBytes();

    // optional sint64 sum = 3;
    /**
     * <code>optional sint64 sum = 3;</code>
     *
     * <pre>
     * sum will store the total length of all strings in a stripe
     * </pre>
     */
    boolean hasSum();
    /**
     * <code>optional sint64 sum = 3;</code>
     *
     * <pre>
     * sum will store the total length of all strings in a stripe
     * </pre>
     */
    long getSum();
  }
  /**
   * Protobuf type {@code orc.proto.StringStatistics}
   */
  public static final class StringStatistics extends
      com.google.protobuf.GeneratedMessage
      implements StringStatisticsOrBuilder {
    // Use StringStatistics.newBuilder() to construct.
    private StringStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StringStatistics(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StringStatistics defaultInstance;
    public static StringStatistics getDefaultInstance() {
      return defaultInstance;
    }

    public StringStatistics getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StringStatistics(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              minimum_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              maximum_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              sum_ = input.readSInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_StringStatistics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_StringStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StringStatistics.class, StringStatistics.Builder.class);
    }

    public static com.google.protobuf.Parser<StringStatistics> PARSER =
        new com.google.protobuf.AbstractParser<StringStatistics>() {
      public StringStatistics parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StringStatistics(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StringStatistics> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string minimum = 1;
    public static final int MINIMUM_FIELD_NUMBER = 1;
    private java.lang.Object minimum_;
    /**
     * <code>optional string minimum = 1;</code>
     */
    public boolean hasMinimum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string minimum = 1;</code>
     */
    public java.lang.String getMinimum() {
      java.lang.Object ref = minimum_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          minimum_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string minimum = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMinimumBytes() {
      java.lang.Object ref = minimum_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        minimum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string maximum = 2;
    public static final int MAXIMUM_FIELD_NUMBER = 2;
    private java.lang.Object maximum_;
    /**
     * <code>optional string maximum = 2;</code>
     */
    public boolean hasMaximum() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string maximum = 2;</code>
     */
    public java.lang.String getMaximum() {
      java.lang.Object ref = maximum_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          maximum_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string maximum = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMaximumBytes() {
      java.lang.Object ref = maximum_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        maximum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional sint64 sum = 3;
    public static final int SUM_FIELD_NUMBER = 3;
    private long sum_;
    /**
     * <code>optional sint64 sum = 3;</code>
     *
     * <pre>
     * sum will store the total length of all strings in a stripe
     * </pre>
     */
    public boolean hasSum() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional sint64 sum = 3;</code>
     *
     * <pre>
     * sum will store the total length of all strings in a stripe
     * </pre>
     */
    public long getSum() {
      return sum_;
    }

    private void initFields() {
      minimum_ = "";
      maximum_ = "";
      sum_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getMinimumBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getMaximumBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeSInt64(3, sum_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getMinimumBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getMaximumBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt64Size(3, sum_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static StringStatistics parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StringStatistics parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StringStatistics parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StringStatistics parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StringStatistics parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static StringStatistics parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static StringStatistics parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static StringStatistics parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static StringStatistics parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static StringStatistics parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(StringStatistics prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.StringStatistics}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements StringStatisticsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_StringStatistics_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_StringStatistics_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                StringStatistics.class, StringStatistics.Builder.class);
      }

      // Construct using StringStatistics.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        minimum_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        maximum_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        sum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_StringStatistics_descriptor;
      }

      public StringStatistics getDefaultInstanceForType() {
        return StringStatistics.getDefaultInstance();
      }

      public StringStatistics build() {
        StringStatistics result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public StringStatistics buildPartial() {
        StringStatistics result = new StringStatistics(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.minimum_ = minimum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.maximum_ = maximum_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.sum_ = sum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof StringStatistics) {
          return mergeFrom((StringStatistics)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(StringStatistics other) {
        if (other == StringStatistics.getDefaultInstance()) return this;
        if (other.hasMinimum()) {
          bitField0_ |= 0x00000001;
          minimum_ = other.minimum_;
          onChanged();
        }
        if (other.hasMaximum()) {
          bitField0_ |= 0x00000002;
          maximum_ = other.maximum_;
          onChanged();
        }
        if (other.hasSum()) {
          setSum(other.getSum());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        StringStatistics parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (StringStatistics) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string minimum = 1;
      private java.lang.Object minimum_ = "";
      /**
       * <code>optional string minimum = 1;</code>
       */
      public boolean hasMinimum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string minimum = 1;</code>
       */
      public java.lang.String getMinimum() {
        java.lang.Object ref = minimum_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          minimum_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string minimum = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMinimumBytes() {
        java.lang.Object ref = minimum_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          minimum_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string minimum = 1;</code>
       */
      public Builder setMinimum(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        minimum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string minimum = 1;</code>
       */
      public Builder clearMinimum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        minimum_ = getDefaultInstance().getMinimum();
        onChanged();
        return this;
      }
      /**
       * <code>optional string minimum = 1;</code>
       */
      public Builder setMinimumBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        minimum_ = value;
        onChanged();
        return this;
      }

      // optional string maximum = 2;
      private java.lang.Object maximum_ = "";
      /**
       * <code>optional string maximum = 2;</code>
       */
      public boolean hasMaximum() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string maximum = 2;</code>
       */
      public java.lang.String getMaximum() {
        java.lang.Object ref = maximum_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          maximum_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string maximum = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMaximumBytes() {
        java.lang.Object ref = maximum_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          maximum_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string maximum = 2;</code>
       */
      public Builder setMaximum(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        maximum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string maximum = 2;</code>
       */
      public Builder clearMaximum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        maximum_ = getDefaultInstance().getMaximum();
        onChanged();
        return this;
      }
      /**
       * <code>optional string maximum = 2;</code>
       */
      public Builder setMaximumBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        maximum_ = value;
        onChanged();
        return this;
      }

      // optional sint64 sum = 3;
      private long sum_ ;
      /**
       * <code>optional sint64 sum = 3;</code>
       *
       * <pre>
       * sum will store the total length of all strings in a stripe
       * </pre>
       */
      public boolean hasSum() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional sint64 sum = 3;</code>
       *
       * <pre>
       * sum will store the total length of all strings in a stripe
       * </pre>
       */
      public long getSum() {
        return sum_;
      }
      /**
       * <code>optional sint64 sum = 3;</code>
       *
       * <pre>
       * sum will store the total length of all strings in a stripe
       * </pre>
       */
      public Builder setSum(long value) {
        bitField0_ |= 0x00000004;
        sum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional sint64 sum = 3;</code>
       *
       * <pre>
       * sum will store the total length of all strings in a stripe
       * </pre>
       */
      public Builder clearSum() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sum_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.StringStatistics)
    }

    static {
      defaultInstance = new StringStatistics(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.StringStatistics)
  }

  public interface BucketStatisticsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated uint64 count = 1 [packed = true];
    /**
     * <code>repeated uint64 count = 1 [packed = true];</code>
     */
    java.util.List<java.lang.Long> getCountList();
    /**
     * <code>repeated uint64 count = 1 [packed = true];</code>
     */
    int getCountCount();
    /**
     * <code>repeated uint64 count = 1 [packed = true];</code>
     */
    long getCount(int index);
  }
  /**
   * Protobuf type {@code orc.proto.BucketStatistics}
   */
  public static final class BucketStatistics extends
      com.google.protobuf.GeneratedMessage
      implements BucketStatisticsOrBuilder {
    // Use BucketStatistics.newBuilder() to construct.
    private BucketStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BucketStatistics(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BucketStatistics defaultInstance;
    public static BucketStatistics getDefaultInstance() {
      return defaultInstance;
    }

    public BucketStatistics getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BucketStatistics(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                count_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000001;
              }
              count_.add(input.readUInt64());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                count_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                count_.add(input.readUInt64());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          count_ = java.util.Collections.unmodifiableList(count_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_BucketStatistics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_BucketStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BucketStatistics.class, BucketStatistics.Builder.class);
    }

    public static com.google.protobuf.Parser<BucketStatistics> PARSER =
        new com.google.protobuf.AbstractParser<BucketStatistics>() {
      public BucketStatistics parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BucketStatistics(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BucketStatistics> getParserForType() {
      return PARSER;
    }

    // repeated uint64 count = 1 [packed = true];
    public static final int COUNT_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Long> count_;
    /**
     * <code>repeated uint64 count = 1 [packed = true];</code>
     */
    public java.util.List<java.lang.Long>
        getCountList() {
      return count_;
    }
    /**
     * <code>repeated uint64 count = 1 [packed = true];</code>
     */
    public int getCountCount() {
      return count_.size();
    }
    /**
     * <code>repeated uint64 count = 1 [packed = true];</code>
     */
    public long getCount(int index) {
      return count_.get(index);
    }
    private int countMemoizedSerializedSize = -1;

    private void initFields() {
      count_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getCountList().size() > 0) {
        output.writeRawVarint32(10);
        output.writeRawVarint32(countMemoizedSerializedSize);
      }
      for (int i = 0; i < count_.size(); i++) {
        output.writeUInt64NoTag(count_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < count_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(count_.get(i));
        }
        size += dataSize;
        if (!getCountList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        countMemoizedSerializedSize = dataSize;
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static BucketStatistics parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BucketStatistics parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BucketStatistics parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BucketStatistics parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BucketStatistics parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static BucketStatistics parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static BucketStatistics parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static BucketStatistics parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static BucketStatistics parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static BucketStatistics parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(BucketStatistics prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.BucketStatistics}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements BucketStatisticsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_BucketStatistics_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_BucketStatistics_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                BucketStatistics.class, BucketStatistics.Builder.class);
      }

      // Construct using BucketStatistics.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        count_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_BucketStatistics_descriptor;
      }

      public BucketStatistics getDefaultInstanceForType() {
        return BucketStatistics.getDefaultInstance();
      }

      public BucketStatistics build() {
        BucketStatistics result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public BucketStatistics buildPartial() {
        BucketStatistics result = new BucketStatistics(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          count_ = java.util.Collections.unmodifiableList(count_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.count_ = count_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof BucketStatistics) {
          return mergeFrom((BucketStatistics)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(BucketStatistics other) {
        if (other == BucketStatistics.getDefaultInstance()) return this;
        if (!other.count_.isEmpty()) {
          if (count_.isEmpty()) {
            count_ = other.count_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCountIsMutable();
            count_.addAll(other.count_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        BucketStatistics parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (BucketStatistics) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated uint64 count = 1 [packed = true];
      private java.util.List<java.lang.Long> count_ = java.util.Collections.emptyList();
      private void ensureCountIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          count_ = new java.util.ArrayList<java.lang.Long>(count_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 count = 1 [packed = true];</code>
       */
      public java.util.List<java.lang.Long>
          getCountList() {
        return java.util.Collections.unmodifiableList(count_);
      }
      /**
       * <code>repeated uint64 count = 1 [packed = true];</code>
       */
      public int getCountCount() {
        return count_.size();
      }
      /**
       * <code>repeated uint64 count = 1 [packed = true];</code>
       */
      public long getCount(int index) {
        return count_.get(index);
      }
      /**
       * <code>repeated uint64 count = 1 [packed = true];</code>
       */
      public Builder setCount(
          int index, long value) {
        ensureCountIsMutable();
        count_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 count = 1 [packed = true];</code>
       */
      public Builder addCount(long value) {
        ensureCountIsMutable();
        count_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 count = 1 [packed = true];</code>
       */
      public Builder addAllCount(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureCountIsMutable();
        super.addAll(values, count_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 count = 1 [packed = true];</code>
       */
      public Builder clearCount() {
        count_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.BucketStatistics)
    }

    static {
      defaultInstance = new BucketStatistics(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.BucketStatistics)
  }

  public interface DecimalStatisticsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string minimum = 1;
    /**
     * <code>optional string minimum = 1;</code>
     */
    boolean hasMinimum();
    /**
     * <code>optional string minimum = 1;</code>
     */
    java.lang.String getMinimum();
    /**
     * <code>optional string minimum = 1;</code>
     */
    com.google.protobuf.ByteString
        getMinimumBytes();

    // optional string maximum = 2;
    /**
     * <code>optional string maximum = 2;</code>
     */
    boolean hasMaximum();
    /**
     * <code>optional string maximum = 2;</code>
     */
    java.lang.String getMaximum();
    /**
     * <code>optional string maximum = 2;</code>
     */
    com.google.protobuf.ByteString
        getMaximumBytes();

    // optional string sum = 3;
    /**
     * <code>optional string sum = 3;</code>
     */
    boolean hasSum();
    /**
     * <code>optional string sum = 3;</code>
     */
    java.lang.String getSum();
    /**
     * <code>optional string sum = 3;</code>
     */
    com.google.protobuf.ByteString
        getSumBytes();
  }
  /**
   * Protobuf type {@code orc.proto.DecimalStatistics}
   */
  public static final class DecimalStatistics extends
      com.google.protobuf.GeneratedMessage
      implements DecimalStatisticsOrBuilder {
    // Use DecimalStatistics.newBuilder() to construct.
    private DecimalStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DecimalStatistics(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DecimalStatistics defaultInstance;
    public static DecimalStatistics getDefaultInstance() {
      return defaultInstance;
    }

    public DecimalStatistics getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DecimalStatistics(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              minimum_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              maximum_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              sum_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_DecimalStatistics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_DecimalStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DecimalStatistics.class, DecimalStatistics.Builder.class);
    }

    public static com.google.protobuf.Parser<DecimalStatistics> PARSER =
        new com.google.protobuf.AbstractParser<DecimalStatistics>() {
      public DecimalStatistics parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DecimalStatistics(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DecimalStatistics> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string minimum = 1;
    public static final int MINIMUM_FIELD_NUMBER = 1;
    private java.lang.Object minimum_;
    /**
     * <code>optional string minimum = 1;</code>
     */
    public boolean hasMinimum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string minimum = 1;</code>
     */
    public java.lang.String getMinimum() {
      java.lang.Object ref = minimum_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          minimum_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string minimum = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMinimumBytes() {
      java.lang.Object ref = minimum_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        minimum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string maximum = 2;
    public static final int MAXIMUM_FIELD_NUMBER = 2;
    private java.lang.Object maximum_;
    /**
     * <code>optional string maximum = 2;</code>
     */
    public boolean hasMaximum() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string maximum = 2;</code>
     */
    public java.lang.String getMaximum() {
      java.lang.Object ref = maximum_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          maximum_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string maximum = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMaximumBytes() {
      java.lang.Object ref = maximum_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        maximum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string sum = 3;
    public static final int SUM_FIELD_NUMBER = 3;
    private java.lang.Object sum_;
    /**
     * <code>optional string sum = 3;</code>
     */
    public boolean hasSum() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string sum = 3;</code>
     */
    public java.lang.String getSum() {
      java.lang.Object ref = sum_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sum_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string sum = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSumBytes() {
      java.lang.Object ref = sum_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      minimum_ = "";
      maximum_ = "";
      sum_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getMinimumBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getMaximumBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getSumBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getMinimumBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getMaximumBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getSumBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static DecimalStatistics parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DecimalStatistics parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DecimalStatistics parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DecimalStatistics parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DecimalStatistics parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static DecimalStatistics parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static DecimalStatistics parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static DecimalStatistics parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static DecimalStatistics parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static DecimalStatistics parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(DecimalStatistics prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.DecimalStatistics}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements DecimalStatisticsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_DecimalStatistics_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_DecimalStatistics_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DecimalStatistics.class, DecimalStatistics.Builder.class);
      }

      // Construct using DecimalStatistics.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        minimum_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        maximum_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        sum_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_DecimalStatistics_descriptor;
      }

      public DecimalStatistics getDefaultInstanceForType() {
        return DecimalStatistics.getDefaultInstance();
      }

      public DecimalStatistics build() {
        DecimalStatistics result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public DecimalStatistics buildPartial() {
        DecimalStatistics result = new DecimalStatistics(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.minimum_ = minimum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.maximum_ = maximum_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.sum_ = sum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof DecimalStatistics) {
          return mergeFrom((DecimalStatistics)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DecimalStatistics other) {
        if (other == DecimalStatistics.getDefaultInstance()) return this;
        if (other.hasMinimum()) {
          bitField0_ |= 0x00000001;
          minimum_ = other.minimum_;
          onChanged();
        }
        if (other.hasMaximum()) {
          bitField0_ |= 0x00000002;
          maximum_ = other.maximum_;
          onChanged();
        }
        if (other.hasSum()) {
          bitField0_ |= 0x00000004;
          sum_ = other.sum_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        DecimalStatistics parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (DecimalStatistics) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string minimum = 1;
      private java.lang.Object minimum_ = "";
      /**
       * <code>optional string minimum = 1;</code>
       */
      public boolean hasMinimum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string minimum = 1;</code>
       */
      public java.lang.String getMinimum() {
        java.lang.Object ref = minimum_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          minimum_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string minimum = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMinimumBytes() {
        java.lang.Object ref = minimum_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          minimum_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string minimum = 1;</code>
       */
      public Builder setMinimum(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        minimum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string minimum = 1;</code>
       */
      public Builder clearMinimum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        minimum_ = getDefaultInstance().getMinimum();
        onChanged();
        return this;
      }
      /**
       * <code>optional string minimum = 1;</code>
       */
      public Builder setMinimumBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        minimum_ = value;
        onChanged();
        return this;
      }

      // optional string maximum = 2;
      private java.lang.Object maximum_ = "";
      /**
       * <code>optional string maximum = 2;</code>
       */
      public boolean hasMaximum() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string maximum = 2;</code>
       */
      public java.lang.String getMaximum() {
        java.lang.Object ref = maximum_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          maximum_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string maximum = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMaximumBytes() {
        java.lang.Object ref = maximum_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          maximum_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string maximum = 2;</code>
       */
      public Builder setMaximum(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        maximum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string maximum = 2;</code>
       */
      public Builder clearMaximum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        maximum_ = getDefaultInstance().getMaximum();
        onChanged();
        return this;
      }
      /**
       * <code>optional string maximum = 2;</code>
       */
      public Builder setMaximumBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        maximum_ = value;
        onChanged();
        return this;
      }

      // optional string sum = 3;
      private java.lang.Object sum_ = "";
      /**
       * <code>optional string sum = 3;</code>
       */
      public boolean hasSum() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string sum = 3;</code>
       */
      public java.lang.String getSum() {
        java.lang.Object ref = sum_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          sum_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string sum = 3;</code>
       */
      public com.google.protobuf.ByteString
          getSumBytes() {
        java.lang.Object ref = sum_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sum_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string sum = 3;</code>
       */
      public Builder setSum(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        sum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string sum = 3;</code>
       */
      public Builder clearSum() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sum_ = getDefaultInstance().getSum();
        onChanged();
        return this;
      }
      /**
       * <code>optional string sum = 3;</code>
       */
      public Builder setSumBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        sum_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.DecimalStatistics)
    }

    static {
      defaultInstance = new DecimalStatistics(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.DecimalStatistics)
  }

  public interface DateStatisticsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional sint32 minimum = 1;
    /**
     * <code>optional sint32 minimum = 1;</code>
     *
     * <pre>
     * min,max values saved as days since epoch
     * </pre>
     */
    boolean hasMinimum();
    /**
     * <code>optional sint32 minimum = 1;</code>
     *
     * <pre>
     * min,max values saved as days since epoch
     * </pre>
     */
    int getMinimum();

    // optional sint32 maximum = 2;
    /**
     * <code>optional sint32 maximum = 2;</code>
     */
    boolean hasMaximum();
    /**
     * <code>optional sint32 maximum = 2;</code>
     */
    int getMaximum();
  }
  /**
   * Protobuf type {@code orc.proto.DateStatistics}
   */
  public static final class DateStatistics extends
      com.google.protobuf.GeneratedMessage
      implements DateStatisticsOrBuilder {
    // Use DateStatistics.newBuilder() to construct.
    private DateStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DateStatistics(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DateStatistics defaultInstance;
    public static DateStatistics getDefaultInstance() {
      return defaultInstance;
    }

    public DateStatistics getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DateStatistics(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              minimum_ = input.readSInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              maximum_ = input.readSInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_DateStatistics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_DateStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DateStatistics.class, DateStatistics.Builder.class);
    }

    public static com.google.protobuf.Parser<DateStatistics> PARSER =
        new com.google.protobuf.AbstractParser<DateStatistics>() {
      public DateStatistics parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DateStatistics(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DateStatistics> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional sint32 minimum = 1;
    public static final int MINIMUM_FIELD_NUMBER = 1;
    private int minimum_;
    /**
     * <code>optional sint32 minimum = 1;</code>
     *
     * <pre>
     * min,max values saved as days since epoch
     * </pre>
     */
    public boolean hasMinimum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional sint32 minimum = 1;</code>
     *
     * <pre>
     * min,max values saved as days since epoch
     * </pre>
     */
    public int getMinimum() {
      return minimum_;
    }

    // optional sint32 maximum = 2;
    public static final int MAXIMUM_FIELD_NUMBER = 2;
    private int maximum_;
    /**
     * <code>optional sint32 maximum = 2;</code>
     */
    public boolean hasMaximum() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional sint32 maximum = 2;</code>
     */
    public int getMaximum() {
      return maximum_;
    }

    private void initFields() {
      minimum_ = 0;
      maximum_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeSInt32(1, minimum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeSInt32(2, maximum_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(1, minimum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(2, maximum_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static DateStatistics parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DateStatistics parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DateStatistics parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DateStatistics parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DateStatistics parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static DateStatistics parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static DateStatistics parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static DateStatistics parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static DateStatistics parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static DateStatistics parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(DateStatistics prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.DateStatistics}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements DateStatisticsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_DateStatistics_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_DateStatistics_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DateStatistics.class, DateStatistics.Builder.class);
      }

      // Construct using DateStatistics.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        minimum_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        maximum_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_DateStatistics_descriptor;
      }

      public DateStatistics getDefaultInstanceForType() {
        return DateStatistics.getDefaultInstance();
      }

      public DateStatistics build() {
        DateStatistics result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public DateStatistics buildPartial() {
        DateStatistics result = new DateStatistics(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.minimum_ = minimum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.maximum_ = maximum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof DateStatistics) {
          return mergeFrom((DateStatistics)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DateStatistics other) {
        if (other == DateStatistics.getDefaultInstance()) return this;
        if (other.hasMinimum()) {
          setMinimum(other.getMinimum());
        }
        if (other.hasMaximum()) {
          setMaximum(other.getMaximum());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        DateStatistics parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (DateStatistics) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional sint32 minimum = 1;
      private int minimum_ ;
      /**
       * <code>optional sint32 minimum = 1;</code>
       *
       * <pre>
       * min,max values saved as days since epoch
       * </pre>
       */
      public boolean hasMinimum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional sint32 minimum = 1;</code>
       *
       * <pre>
       * min,max values saved as days since epoch
       * </pre>
       */
      public int getMinimum() {
        return minimum_;
      }
      /**
       * <code>optional sint32 minimum = 1;</code>
       *
       * <pre>
       * min,max values saved as days since epoch
       * </pre>
       */
      public Builder setMinimum(int value) {
        bitField0_ |= 0x00000001;
        minimum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional sint32 minimum = 1;</code>
       *
       * <pre>
       * min,max values saved as days since epoch
       * </pre>
       */
      public Builder clearMinimum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        minimum_ = 0;
        onChanged();
        return this;
      }

      // optional sint32 maximum = 2;
      private int maximum_ ;
      /**
       * <code>optional sint32 maximum = 2;</code>
       */
      public boolean hasMaximum() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional sint32 maximum = 2;</code>
       */
      public int getMaximum() {
        return maximum_;
      }
      /**
       * <code>optional sint32 maximum = 2;</code>
       */
      public Builder setMaximum(int value) {
        bitField0_ |= 0x00000002;
        maximum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional sint32 maximum = 2;</code>
       */
      public Builder clearMaximum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        maximum_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.DateStatistics)
    }

    static {
      defaultInstance = new DateStatistics(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.DateStatistics)
  }

  public interface TimestampStatisticsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional sint64 minimum = 1;
    /**
     * <code>optional sint64 minimum = 1;</code>
     *
     * <pre>
     * min,max values saved as milliseconds since epoch
     * </pre>
     */
    boolean hasMinimum();
    /**
     * <code>optional sint64 minimum = 1;</code>
     *
     * <pre>
     * min,max values saved as milliseconds since epoch
     * </pre>
     */
    long getMinimum();

    // optional sint64 maximum = 2;
    /**
     * <code>optional sint64 maximum = 2;</code>
     */
    boolean hasMaximum();
    /**
     * <code>optional sint64 maximum = 2;</code>
     */
    long getMaximum();
  }
  /**
   * Protobuf type {@code orc.proto.TimestampStatistics}
   */
  public static final class TimestampStatistics extends
      com.google.protobuf.GeneratedMessage
      implements TimestampStatisticsOrBuilder {
    // Use TimestampStatistics.newBuilder() to construct.
    private TimestampStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TimestampStatistics(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TimestampStatistics defaultInstance;
    public static TimestampStatistics getDefaultInstance() {
      return defaultInstance;
    }

    public TimestampStatistics getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TimestampStatistics(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              minimum_ = input.readSInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              maximum_ = input.readSInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_TimestampStatistics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_TimestampStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TimestampStatistics.class, TimestampStatistics.Builder.class);
    }

    public static com.google.protobuf.Parser<TimestampStatistics> PARSER =
        new com.google.protobuf.AbstractParser<TimestampStatistics>() {
      public TimestampStatistics parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TimestampStatistics(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TimestampStatistics> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional sint64 minimum = 1;
    public static final int MINIMUM_FIELD_NUMBER = 1;
    private long minimum_;
    /**
     * <code>optional sint64 minimum = 1;</code>
     *
     * <pre>
     * min,max values saved as milliseconds since epoch
     * </pre>
     */
    public boolean hasMinimum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional sint64 minimum = 1;</code>
     *
     * <pre>
     * min,max values saved as milliseconds since epoch
     * </pre>
     */
    public long getMinimum() {
      return minimum_;
    }

    // optional sint64 maximum = 2;
    public static final int MAXIMUM_FIELD_NUMBER = 2;
    private long maximum_;
    /**
     * <code>optional sint64 maximum = 2;</code>
     */
    public boolean hasMaximum() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional sint64 maximum = 2;</code>
     */
    public long getMaximum() {
      return maximum_;
    }

    private void initFields() {
      minimum_ = 0L;
      maximum_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeSInt64(1, minimum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeSInt64(2, maximum_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt64Size(1, minimum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt64Size(2, maximum_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static TimestampStatistics parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TimestampStatistics parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TimestampStatistics parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TimestampStatistics parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TimestampStatistics parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static TimestampStatistics parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static TimestampStatistics parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static TimestampStatistics parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static TimestampStatistics parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static TimestampStatistics parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(TimestampStatistics prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.TimestampStatistics}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements TimestampStatisticsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_TimestampStatistics_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_TimestampStatistics_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                TimestampStatistics.class, TimestampStatistics.Builder.class);
      }

      // Construct using TimestampStatistics.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        minimum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        maximum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_TimestampStatistics_descriptor;
      }

      public TimestampStatistics getDefaultInstanceForType() {
        return TimestampStatistics.getDefaultInstance();
      }

      public TimestampStatistics build() {
        TimestampStatistics result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public TimestampStatistics buildPartial() {
        TimestampStatistics result = new TimestampStatistics(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.minimum_ = minimum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.maximum_ = maximum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TimestampStatistics) {
          return mergeFrom((TimestampStatistics)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(TimestampStatistics other) {
        if (other == TimestampStatistics.getDefaultInstance()) return this;
        if (other.hasMinimum()) {
          setMinimum(other.getMinimum());
        }
        if (other.hasMaximum()) {
          setMaximum(other.getMaximum());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        TimestampStatistics parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (TimestampStatistics) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional sint64 minimum = 1;
      private long minimum_ ;
      /**
       * <code>optional sint64 minimum = 1;</code>
       *
       * <pre>
       * min,max values saved as milliseconds since epoch
       * </pre>
       */
      public boolean hasMinimum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional sint64 minimum = 1;</code>
       *
       * <pre>
       * min,max values saved as milliseconds since epoch
       * </pre>
       */
      public long getMinimum() {
        return minimum_;
      }
      /**
       * <code>optional sint64 minimum = 1;</code>
       *
       * <pre>
       * min,max values saved as milliseconds since epoch
       * </pre>
       */
      public Builder setMinimum(long value) {
        bitField0_ |= 0x00000001;
        minimum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional sint64 minimum = 1;</code>
       *
       * <pre>
       * min,max values saved as milliseconds since epoch
       * </pre>
       */
      public Builder clearMinimum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        minimum_ = 0L;
        onChanged();
        return this;
      }

      // optional sint64 maximum = 2;
      private long maximum_ ;
      /**
       * <code>optional sint64 maximum = 2;</code>
       */
      public boolean hasMaximum() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional sint64 maximum = 2;</code>
       */
      public long getMaximum() {
        return maximum_;
      }
      /**
       * <code>optional sint64 maximum = 2;</code>
       */
      public Builder setMaximum(long value) {
        bitField0_ |= 0x00000002;
        maximum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional sint64 maximum = 2;</code>
       */
      public Builder clearMaximum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        maximum_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.TimestampStatistics)
    }

    static {
      defaultInstance = new TimestampStatistics(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.TimestampStatistics)
  }

  public interface BinaryStatisticsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional sint64 sum = 1;
    /**
     * <code>optional sint64 sum = 1;</code>
     *
     * <pre>
     * sum will store the total binary blob length in a stripe
     * </pre>
     */
    boolean hasSum();
    /**
     * <code>optional sint64 sum = 1;</code>
     *
     * <pre>
     * sum will store the total binary blob length in a stripe
     * </pre>
     */
    long getSum();
  }
  /**
   * Protobuf type {@code orc.proto.BinaryStatistics}
   */
  public static final class BinaryStatistics extends
      com.google.protobuf.GeneratedMessage
      implements BinaryStatisticsOrBuilder {
    // Use BinaryStatistics.newBuilder() to construct.
    private BinaryStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BinaryStatistics(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BinaryStatistics defaultInstance;
    public static BinaryStatistics getDefaultInstance() {
      return defaultInstance;
    }

    public BinaryStatistics getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BinaryStatistics(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              sum_ = input.readSInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_BinaryStatistics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_BinaryStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BinaryStatistics.class, BinaryStatistics.Builder.class);
    }

    public static com.google.protobuf.Parser<BinaryStatistics> PARSER =
        new com.google.protobuf.AbstractParser<BinaryStatistics>() {
      public BinaryStatistics parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BinaryStatistics(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BinaryStatistics> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional sint64 sum = 1;
    public static final int SUM_FIELD_NUMBER = 1;
    private long sum_;
    /**
     * <code>optional sint64 sum = 1;</code>
     *
     * <pre>
     * sum will store the total binary blob length in a stripe
     * </pre>
     */
    public boolean hasSum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional sint64 sum = 1;</code>
     *
     * <pre>
     * sum will store the total binary blob length in a stripe
     * </pre>
     */
    public long getSum() {
      return sum_;
    }

    private void initFields() {
      sum_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeSInt64(1, sum_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt64Size(1, sum_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static BinaryStatistics parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BinaryStatistics parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BinaryStatistics parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BinaryStatistics parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BinaryStatistics parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static BinaryStatistics parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static BinaryStatistics parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static BinaryStatistics parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static BinaryStatistics parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static BinaryStatistics parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(BinaryStatistics prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.BinaryStatistics}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements BinaryStatisticsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_BinaryStatistics_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_BinaryStatistics_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                BinaryStatistics.class, BinaryStatistics.Builder.class);
      }

      // Construct using BinaryStatistics.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        sum_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_BinaryStatistics_descriptor;
      }

      public BinaryStatistics getDefaultInstanceForType() {
        return BinaryStatistics.getDefaultInstance();
      }

      public BinaryStatistics build() {
        BinaryStatistics result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public BinaryStatistics buildPartial() {
        BinaryStatistics result = new BinaryStatistics(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sum_ = sum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof BinaryStatistics) {
          return mergeFrom((BinaryStatistics)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(BinaryStatistics other) {
        if (other == BinaryStatistics.getDefaultInstance()) return this;
        if (other.hasSum()) {
          setSum(other.getSum());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        BinaryStatistics parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (BinaryStatistics) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional sint64 sum = 1;
      private long sum_ ;
      /**
       * <code>optional sint64 sum = 1;</code>
       *
       * <pre>
       * sum will store the total binary blob length in a stripe
       * </pre>
       */
      public boolean hasSum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional sint64 sum = 1;</code>
       *
       * <pre>
       * sum will store the total binary blob length in a stripe
       * </pre>
       */
      public long getSum() {
        return sum_;
      }
      /**
       * <code>optional sint64 sum = 1;</code>
       *
       * <pre>
       * sum will store the total binary blob length in a stripe
       * </pre>
       */
      public Builder setSum(long value) {
        bitField0_ |= 0x00000001;
        sum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional sint64 sum = 1;</code>
       *
       * <pre>
       * sum will store the total binary blob length in a stripe
       * </pre>
       */
      public Builder clearSum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sum_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.BinaryStatistics)
    }

    static {
      defaultInstance = new BinaryStatistics(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.BinaryStatistics)
  }

  public interface ColumnStatisticsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional uint64 numberOfValues = 1;
    /**
     * <code>optional uint64 numberOfValues = 1;</code>
     */
    boolean hasNumberOfValues();
    /**
     * <code>optional uint64 numberOfValues = 1;</code>
     */
    long getNumberOfValues();

    // optional .orc.proto.IntegerStatistics intStatistics = 2;
    /**
     * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
     */
    boolean hasIntStatistics();
    /**
     * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
     */
    IntegerStatistics getIntStatistics();
    /**
     * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
     */
    IntegerStatisticsOrBuilder getIntStatisticsOrBuilder();

    // optional .orc.proto.DoubleStatistics doubleStatistics = 3;
    /**
     * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
     */
    boolean hasDoubleStatistics();
    /**
     * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
     */
    DoubleStatistics getDoubleStatistics();
    /**
     * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
     */
    DoubleStatisticsOrBuilder getDoubleStatisticsOrBuilder();

    // optional .orc.proto.StringStatistics stringStatistics = 4;
    /**
     * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
     */
    boolean hasStringStatistics();
    /**
     * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
     */
    StringStatistics getStringStatistics();
    /**
     * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
     */
    StringStatisticsOrBuilder getStringStatisticsOrBuilder();

    // optional .orc.proto.BucketStatistics bucketStatistics = 5;
    /**
     * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
     */
    boolean hasBucketStatistics();
    /**
     * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
     */
    BucketStatistics getBucketStatistics();
    /**
     * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
     */
    BucketStatisticsOrBuilder getBucketStatisticsOrBuilder();

    // optional .orc.proto.DecimalStatistics decimalStatistics = 6;
    /**
     * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
     */
    boolean hasDecimalStatistics();
    /**
     * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
     */
    DecimalStatistics getDecimalStatistics();
    /**
     * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
     */
    DecimalStatisticsOrBuilder getDecimalStatisticsOrBuilder();

    // optional .orc.proto.DateStatistics dateStatistics = 7;
    /**
     * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
     */
    boolean hasDateStatistics();
    /**
     * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
     */
    DateStatistics getDateStatistics();
    /**
     * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
     */
    DateStatisticsOrBuilder getDateStatisticsOrBuilder();

    // optional .orc.proto.BinaryStatistics binaryStatistics = 8;
    /**
     * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
     */
    boolean hasBinaryStatistics();
    /**
     * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
     */
    BinaryStatistics getBinaryStatistics();
    /**
     * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
     */
    BinaryStatisticsOrBuilder getBinaryStatisticsOrBuilder();

    // optional .orc.proto.TimestampStatistics timestampStatistics = 9;
    /**
     * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
     */
    boolean hasTimestampStatistics();
    /**
     * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
     */
    TimestampStatistics getTimestampStatistics();
    /**
     * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
     */
    TimestampStatisticsOrBuilder getTimestampStatisticsOrBuilder();

    // optional bool hasNull = 10;
    /**
     * <code>optional bool hasNull = 10;</code>
     */
    boolean hasHasNull();
    /**
     * <code>optional bool hasNull = 10;</code>
     */
    boolean getHasNull();
  }
  /**
   * Protobuf type {@code orc.proto.ColumnStatistics}
   */
  public static final class ColumnStatistics extends
      com.google.protobuf.GeneratedMessage
      implements ColumnStatisticsOrBuilder {
    // Use ColumnStatistics.newBuilder() to construct.
    private ColumnStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ColumnStatistics(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ColumnStatistics defaultInstance;
    public static ColumnStatistics getDefaultInstance() {
      return defaultInstance;
    }

    public ColumnStatistics getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ColumnStatistics(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              numberOfValues_ = input.readUInt64();
              break;
            }
            case 18: {
              IntegerStatistics.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = intStatistics_.toBuilder();
              }
              intStatistics_ = input.readMessage(IntegerStatistics.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(intStatistics_);
                intStatistics_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 26: {
              DoubleStatistics.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = doubleStatistics_.toBuilder();
              }
              doubleStatistics_ = input.readMessage(DoubleStatistics.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(doubleStatistics_);
                doubleStatistics_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 34: {
              StringStatistics.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) == 0x00000008)) {
                subBuilder = stringStatistics_.toBuilder();
              }
              stringStatistics_ = input.readMessage(StringStatistics.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(stringStatistics_);
                stringStatistics_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
            case 42: {
              BucketStatistics.Builder subBuilder = null;
              if (((bitField0_ & 0x00000010) == 0x00000010)) {
                subBuilder = bucketStatistics_.toBuilder();
              }
              bucketStatistics_ = input.readMessage(BucketStatistics.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(bucketStatistics_);
                bucketStatistics_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000010;
              break;
            }
            case 50: {
              DecimalStatistics.Builder subBuilder = null;
              if (((bitField0_ & 0x00000020) == 0x00000020)) {
                subBuilder = decimalStatistics_.toBuilder();
              }
              decimalStatistics_ = input.readMessage(DecimalStatistics.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(decimalStatistics_);
                decimalStatistics_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000020;
              break;
            }
            case 58: {
              DateStatistics.Builder subBuilder = null;
              if (((bitField0_ & 0x00000040) == 0x00000040)) {
                subBuilder = dateStatistics_.toBuilder();
              }
              dateStatistics_ = input.readMessage(DateStatistics.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(dateStatistics_);
                dateStatistics_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000040;
              break;
            }
            case 66: {
              BinaryStatistics.Builder subBuilder = null;
              if (((bitField0_ & 0x00000080) == 0x00000080)) {
                subBuilder = binaryStatistics_.toBuilder();
              }
              binaryStatistics_ = input.readMessage(BinaryStatistics.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(binaryStatistics_);
                binaryStatistics_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000080;
              break;
            }
            case 74: {
              TimestampStatistics.Builder subBuilder = null;
              if (((bitField0_ & 0x00000100) == 0x00000100)) {
                subBuilder = timestampStatistics_.toBuilder();
              }
              timestampStatistics_ = input.readMessage(TimestampStatistics.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(timestampStatistics_);
                timestampStatistics_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000100;
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              hasNull_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_ColumnStatistics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_ColumnStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ColumnStatistics.class, ColumnStatistics.Builder.class);
    }

    public static com.google.protobuf.Parser<ColumnStatistics> PARSER =
        new com.google.protobuf.AbstractParser<ColumnStatistics>() {
      public ColumnStatistics parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ColumnStatistics(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ColumnStatistics> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional uint64 numberOfValues = 1;
    public static final int NUMBEROFVALUES_FIELD_NUMBER = 1;
    private long numberOfValues_;
    /**
     * <code>optional uint64 numberOfValues = 1;</code>
     */
    public boolean hasNumberOfValues() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 numberOfValues = 1;</code>
     */
    public long getNumberOfValues() {
      return numberOfValues_;
    }

    // optional .orc.proto.IntegerStatistics intStatistics = 2;
    public static final int INTSTATISTICS_FIELD_NUMBER = 2;
    private IntegerStatistics intStatistics_;
    /**
     * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
     */
    public boolean hasIntStatistics() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
     */
    public IntegerStatistics getIntStatistics() {
      return intStatistics_;
    }
    /**
     * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
     */
    public IntegerStatisticsOrBuilder getIntStatisticsOrBuilder() {
      return intStatistics_;
    }

    // optional .orc.proto.DoubleStatistics doubleStatistics = 3;
    public static final int DOUBLESTATISTICS_FIELD_NUMBER = 3;
    private DoubleStatistics doubleStatistics_;
    /**
     * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
     */
    public boolean hasDoubleStatistics() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
     */
    public DoubleStatistics getDoubleStatistics() {
      return doubleStatistics_;
    }
    /**
     * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
     */
    public DoubleStatisticsOrBuilder getDoubleStatisticsOrBuilder() {
      return doubleStatistics_;
    }

    // optional .orc.proto.StringStatistics stringStatistics = 4;
    public static final int STRINGSTATISTICS_FIELD_NUMBER = 4;
    private StringStatistics stringStatistics_;
    /**
     * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
     */
    public boolean hasStringStatistics() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
     */
    public StringStatistics getStringStatistics() {
      return stringStatistics_;
    }
    /**
     * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
     */
    public StringStatisticsOrBuilder getStringStatisticsOrBuilder() {
      return stringStatistics_;
    }

    // optional .orc.proto.BucketStatistics bucketStatistics = 5;
    public static final int BUCKETSTATISTICS_FIELD_NUMBER = 5;
    private BucketStatistics bucketStatistics_;
    /**
     * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
     */
    public boolean hasBucketStatistics() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
     */
    public BucketStatistics getBucketStatistics() {
      return bucketStatistics_;
    }
    /**
     * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
     */
    public BucketStatisticsOrBuilder getBucketStatisticsOrBuilder() {
      return bucketStatistics_;
    }

    // optional .orc.proto.DecimalStatistics decimalStatistics = 6;
    public static final int DECIMALSTATISTICS_FIELD_NUMBER = 6;
    private DecimalStatistics decimalStatistics_;
    /**
     * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
     */
    public boolean hasDecimalStatistics() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
     */
    public DecimalStatistics getDecimalStatistics() {
      return decimalStatistics_;
    }
    /**
     * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
     */
    public DecimalStatisticsOrBuilder getDecimalStatisticsOrBuilder() {
      return decimalStatistics_;
    }

    // optional .orc.proto.DateStatistics dateStatistics = 7;
    public static final int DATESTATISTICS_FIELD_NUMBER = 7;
    private DateStatistics dateStatistics_;
    /**
     * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
     */
    public boolean hasDateStatistics() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
     */
    public DateStatistics getDateStatistics() {
      return dateStatistics_;
    }
    /**
     * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
     */
    public DateStatisticsOrBuilder getDateStatisticsOrBuilder() {
      return dateStatistics_;
    }

    // optional .orc.proto.BinaryStatistics binaryStatistics = 8;
    public static final int BINARYSTATISTICS_FIELD_NUMBER = 8;
    private BinaryStatistics binaryStatistics_;
    /**
     * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
     */
    public boolean hasBinaryStatistics() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
     */
    public BinaryStatistics getBinaryStatistics() {
      return binaryStatistics_;
    }
    /**
     * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
     */
    public BinaryStatisticsOrBuilder getBinaryStatisticsOrBuilder() {
      return binaryStatistics_;
    }

    // optional .orc.proto.TimestampStatistics timestampStatistics = 9;
    public static final int TIMESTAMPSTATISTICS_FIELD_NUMBER = 9;
    private TimestampStatistics timestampStatistics_;
    /**
     * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
     */
    public boolean hasTimestampStatistics() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
     */
    public TimestampStatistics getTimestampStatistics() {
      return timestampStatistics_;
    }
    /**
     * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
     */
    public TimestampStatisticsOrBuilder getTimestampStatisticsOrBuilder() {
      return timestampStatistics_;
    }

    // optional bool hasNull = 10;
    public static final int HASNULL_FIELD_NUMBER = 10;
    private boolean hasNull_;
    /**
     * <code>optional bool hasNull = 10;</code>
     */
    public boolean hasHasNull() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>optional bool hasNull = 10;</code>
     */
    public boolean getHasNull() {
      return hasNull_;
    }

    private void initFields() {
      numberOfValues_ = 0L;
      intStatistics_ = IntegerStatistics.getDefaultInstance();
      doubleStatistics_ = DoubleStatistics.getDefaultInstance();
      stringStatistics_ = StringStatistics.getDefaultInstance();
      bucketStatistics_ = BucketStatistics.getDefaultInstance();
      decimalStatistics_ = DecimalStatistics.getDefaultInstance();
      dateStatistics_ = DateStatistics.getDefaultInstance();
      binaryStatistics_ = BinaryStatistics.getDefaultInstance();
      timestampStatistics_ = TimestampStatistics.getDefaultInstance();
      hasNull_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, numberOfValues_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, intStatistics_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, doubleStatistics_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, stringStatistics_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(5, bucketStatistics_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeMessage(6, decimalStatistics_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeMessage(7, dateStatistics_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeMessage(8, binaryStatistics_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeMessage(9, timestampStatistics_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeBool(10, hasNull_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, numberOfValues_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, intStatistics_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, doubleStatistics_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, stringStatistics_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, bucketStatistics_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, decimalStatistics_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, dateStatistics_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, binaryStatistics_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, timestampStatistics_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, hasNull_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ColumnStatistics parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ColumnStatistics parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ColumnStatistics parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ColumnStatistics parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ColumnStatistics parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ColumnStatistics parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ColumnStatistics parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ColumnStatistics parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ColumnStatistics parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ColumnStatistics parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ColumnStatistics prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.ColumnStatistics}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements ColumnStatisticsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_ColumnStatistics_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_ColumnStatistics_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ColumnStatistics.class, ColumnStatistics.Builder.class);
      }

      // Construct using ColumnStatistics.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getIntStatisticsFieldBuilder();
          getDoubleStatisticsFieldBuilder();
          getStringStatisticsFieldBuilder();
          getBucketStatisticsFieldBuilder();
          getDecimalStatisticsFieldBuilder();
          getDateStatisticsFieldBuilder();
          getBinaryStatisticsFieldBuilder();
          getTimestampStatisticsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        numberOfValues_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (intStatisticsBuilder_ == null) {
          intStatistics_ = IntegerStatistics.getDefaultInstance();
        } else {
          intStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (doubleStatisticsBuilder_ == null) {
          doubleStatistics_ = DoubleStatistics.getDefaultInstance();
        } else {
          doubleStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (stringStatisticsBuilder_ == null) {
          stringStatistics_ = StringStatistics.getDefaultInstance();
        } else {
          stringStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (bucketStatisticsBuilder_ == null) {
          bucketStatistics_ = BucketStatistics.getDefaultInstance();
        } else {
          bucketStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        if (decimalStatisticsBuilder_ == null) {
          decimalStatistics_ = DecimalStatistics.getDefaultInstance();
        } else {
          decimalStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        if (dateStatisticsBuilder_ == null) {
          dateStatistics_ = DateStatistics.getDefaultInstance();
        } else {
          dateStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        if (binaryStatisticsBuilder_ == null) {
          binaryStatistics_ = BinaryStatistics.getDefaultInstance();
        } else {
          binaryStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000080);
        if (timestampStatisticsBuilder_ == null) {
          timestampStatistics_ = TimestampStatistics.getDefaultInstance();
        } else {
          timestampStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000100);
        hasNull_ = false;
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_ColumnStatistics_descriptor;
      }

      public ColumnStatistics getDefaultInstanceForType() {
        return ColumnStatistics.getDefaultInstance();
      }

      public ColumnStatistics build() {
        ColumnStatistics result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ColumnStatistics buildPartial() {
        ColumnStatistics result = new ColumnStatistics(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.numberOfValues_ = numberOfValues_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (intStatisticsBuilder_ == null) {
          result.intStatistics_ = intStatistics_;
        } else {
          result.intStatistics_ = intStatisticsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (doubleStatisticsBuilder_ == null) {
          result.doubleStatistics_ = doubleStatistics_;
        } else {
          result.doubleStatistics_ = doubleStatisticsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (stringStatisticsBuilder_ == null) {
          result.stringStatistics_ = stringStatistics_;
        } else {
          result.stringStatistics_ = stringStatisticsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (bucketStatisticsBuilder_ == null) {
          result.bucketStatistics_ = bucketStatistics_;
        } else {
          result.bucketStatistics_ = bucketStatisticsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        if (decimalStatisticsBuilder_ == null) {
          result.decimalStatistics_ = decimalStatistics_;
        } else {
          result.decimalStatistics_ = decimalStatisticsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        if (dateStatisticsBuilder_ == null) {
          result.dateStatistics_ = dateStatistics_;
        } else {
          result.dateStatistics_ = dateStatisticsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        if (binaryStatisticsBuilder_ == null) {
          result.binaryStatistics_ = binaryStatistics_;
        } else {
          result.binaryStatistics_ = binaryStatisticsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        if (timestampStatisticsBuilder_ == null) {
          result.timestampStatistics_ = timestampStatistics_;
        } else {
          result.timestampStatistics_ = timestampStatisticsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.hasNull_ = hasNull_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ColumnStatistics) {
          return mergeFrom((ColumnStatistics)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ColumnStatistics other) {
        if (other == ColumnStatistics.getDefaultInstance()) return this;
        if (other.hasNumberOfValues()) {
          setNumberOfValues(other.getNumberOfValues());
        }
        if (other.hasIntStatistics()) {
          mergeIntStatistics(other.getIntStatistics());
        }
        if (other.hasDoubleStatistics()) {
          mergeDoubleStatistics(other.getDoubleStatistics());
        }
        if (other.hasStringStatistics()) {
          mergeStringStatistics(other.getStringStatistics());
        }
        if (other.hasBucketStatistics()) {
          mergeBucketStatistics(other.getBucketStatistics());
        }
        if (other.hasDecimalStatistics()) {
          mergeDecimalStatistics(other.getDecimalStatistics());
        }
        if (other.hasDateStatistics()) {
          mergeDateStatistics(other.getDateStatistics());
        }
        if (other.hasBinaryStatistics()) {
          mergeBinaryStatistics(other.getBinaryStatistics());
        }
        if (other.hasTimestampStatistics()) {
          mergeTimestampStatistics(other.getTimestampStatistics());
        }
        if (other.hasHasNull()) {
          setHasNull(other.getHasNull());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ColumnStatistics parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ColumnStatistics) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional uint64 numberOfValues = 1;
      private long numberOfValues_ ;
      /**
       * <code>optional uint64 numberOfValues = 1;</code>
       */
      public boolean hasNumberOfValues() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint64 numberOfValues = 1;</code>
       */
      public long getNumberOfValues() {
        return numberOfValues_;
      }
      /**
       * <code>optional uint64 numberOfValues = 1;</code>
       */
      public Builder setNumberOfValues(long value) {
        bitField0_ |= 0x00000001;
        numberOfValues_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 numberOfValues = 1;</code>
       */
      public Builder clearNumberOfValues() {
        bitField0_ = (bitField0_ & ~0x00000001);
        numberOfValues_ = 0L;
        onChanged();
        return this;
      }

      // optional .orc.proto.IntegerStatistics intStatistics = 2;
      private IntegerStatistics intStatistics_ = IntegerStatistics.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          IntegerStatistics, IntegerStatistics.Builder, IntegerStatisticsOrBuilder> intStatisticsBuilder_;
      /**
       * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
       */
      public boolean hasIntStatistics() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
       */
      public IntegerStatistics getIntStatistics() {
        if (intStatisticsBuilder_ == null) {
          return intStatistics_;
        } else {
          return intStatisticsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
       */
      public Builder setIntStatistics(IntegerStatistics value) {
        if (intStatisticsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          intStatistics_ = value;
          onChanged();
        } else {
          intStatisticsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
       */
      public Builder setIntStatistics(
          IntegerStatistics.Builder builderForValue) {
        if (intStatisticsBuilder_ == null) {
          intStatistics_ = builderForValue.build();
          onChanged();
        } else {
          intStatisticsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
       */
      public Builder mergeIntStatistics(IntegerStatistics value) {
        if (intStatisticsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              intStatistics_ != IntegerStatistics.getDefaultInstance()) {
            intStatistics_ =
              IntegerStatistics.newBuilder(intStatistics_).mergeFrom(value).buildPartial();
          } else {
            intStatistics_ = value;
          }
          onChanged();
        } else {
          intStatisticsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
       */
      public Builder clearIntStatistics() {
        if (intStatisticsBuilder_ == null) {
          intStatistics_ = IntegerStatistics.getDefaultInstance();
          onChanged();
        } else {
          intStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
       */
      public IntegerStatistics.Builder getIntStatisticsBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getIntStatisticsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
       */
      public IntegerStatisticsOrBuilder getIntStatisticsOrBuilder() {
        if (intStatisticsBuilder_ != null) {
          return intStatisticsBuilder_.getMessageOrBuilder();
        } else {
          return intStatistics_;
        }
      }
      /**
       * <code>optional .orc.proto.IntegerStatistics intStatistics = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          IntegerStatistics, IntegerStatistics.Builder, IntegerStatisticsOrBuilder> 
          getIntStatisticsFieldBuilder() {
        if (intStatisticsBuilder_ == null) {
          intStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              IntegerStatistics, IntegerStatistics.Builder, IntegerStatisticsOrBuilder>(
                  intStatistics_,
                  getParentForChildren(),
                  isClean());
          intStatistics_ = null;
        }
        return intStatisticsBuilder_;
      }

      // optional .orc.proto.DoubleStatistics doubleStatistics = 3;
      private DoubleStatistics doubleStatistics_ = DoubleStatistics.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          DoubleStatistics, DoubleStatistics.Builder, DoubleStatisticsOrBuilder> doubleStatisticsBuilder_;
      /**
       * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
       */
      public boolean hasDoubleStatistics() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
       */
      public DoubleStatistics getDoubleStatistics() {
        if (doubleStatisticsBuilder_ == null) {
          return doubleStatistics_;
        } else {
          return doubleStatisticsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
       */
      public Builder setDoubleStatistics(DoubleStatistics value) {
        if (doubleStatisticsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          doubleStatistics_ = value;
          onChanged();
        } else {
          doubleStatisticsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
       */
      public Builder setDoubleStatistics(
          DoubleStatistics.Builder builderForValue) {
        if (doubleStatisticsBuilder_ == null) {
          doubleStatistics_ = builderForValue.build();
          onChanged();
        } else {
          doubleStatisticsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
       */
      public Builder mergeDoubleStatistics(DoubleStatistics value) {
        if (doubleStatisticsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              doubleStatistics_ != DoubleStatistics.getDefaultInstance()) {
            doubleStatistics_ =
              DoubleStatistics.newBuilder(doubleStatistics_).mergeFrom(value).buildPartial();
          } else {
            doubleStatistics_ = value;
          }
          onChanged();
        } else {
          doubleStatisticsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
       */
      public Builder clearDoubleStatistics() {
        if (doubleStatisticsBuilder_ == null) {
          doubleStatistics_ = DoubleStatistics.getDefaultInstance();
          onChanged();
        } else {
          doubleStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
       */
      public DoubleStatistics.Builder getDoubleStatisticsBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getDoubleStatisticsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
       */
      public DoubleStatisticsOrBuilder getDoubleStatisticsOrBuilder() {
        if (doubleStatisticsBuilder_ != null) {
          return doubleStatisticsBuilder_.getMessageOrBuilder();
        } else {
          return doubleStatistics_;
        }
      }
      /**
       * <code>optional .orc.proto.DoubleStatistics doubleStatistics = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          DoubleStatistics, DoubleStatistics.Builder, DoubleStatisticsOrBuilder> 
          getDoubleStatisticsFieldBuilder() {
        if (doubleStatisticsBuilder_ == null) {
          doubleStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              DoubleStatistics, DoubleStatistics.Builder, DoubleStatisticsOrBuilder>(
                  doubleStatistics_,
                  getParentForChildren(),
                  isClean());
          doubleStatistics_ = null;
        }
        return doubleStatisticsBuilder_;
      }

      // optional .orc.proto.StringStatistics stringStatistics = 4;
      private StringStatistics stringStatistics_ = StringStatistics.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          StringStatistics, StringStatistics.Builder, StringStatisticsOrBuilder> stringStatisticsBuilder_;
      /**
       * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
       */
      public boolean hasStringStatistics() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
       */
      public StringStatistics getStringStatistics() {
        if (stringStatisticsBuilder_ == null) {
          return stringStatistics_;
        } else {
          return stringStatisticsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
       */
      public Builder setStringStatistics(StringStatistics value) {
        if (stringStatisticsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          stringStatistics_ = value;
          onChanged();
        } else {
          stringStatisticsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
       */
      public Builder setStringStatistics(
          StringStatistics.Builder builderForValue) {
        if (stringStatisticsBuilder_ == null) {
          stringStatistics_ = builderForValue.build();
          onChanged();
        } else {
          stringStatisticsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
       */
      public Builder mergeStringStatistics(StringStatistics value) {
        if (stringStatisticsBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) &&
              stringStatistics_ != StringStatistics.getDefaultInstance()) {
            stringStatistics_ =
              StringStatistics.newBuilder(stringStatistics_).mergeFrom(value).buildPartial();
          } else {
            stringStatistics_ = value;
          }
          onChanged();
        } else {
          stringStatisticsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
       */
      public Builder clearStringStatistics() {
        if (stringStatisticsBuilder_ == null) {
          stringStatistics_ = StringStatistics.getDefaultInstance();
          onChanged();
        } else {
          stringStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
       */
      public StringStatistics.Builder getStringStatisticsBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getStringStatisticsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
       */
      public StringStatisticsOrBuilder getStringStatisticsOrBuilder() {
        if (stringStatisticsBuilder_ != null) {
          return stringStatisticsBuilder_.getMessageOrBuilder();
        } else {
          return stringStatistics_;
        }
      }
      /**
       * <code>optional .orc.proto.StringStatistics stringStatistics = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          StringStatistics, StringStatistics.Builder, StringStatisticsOrBuilder> 
          getStringStatisticsFieldBuilder() {
        if (stringStatisticsBuilder_ == null) {
          stringStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              StringStatistics, StringStatistics.Builder, StringStatisticsOrBuilder>(
                  stringStatistics_,
                  getParentForChildren(),
                  isClean());
          stringStatistics_ = null;
        }
        return stringStatisticsBuilder_;
      }

      // optional .orc.proto.BucketStatistics bucketStatistics = 5;
      private BucketStatistics bucketStatistics_ = BucketStatistics.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          BucketStatistics, BucketStatistics.Builder, BucketStatisticsOrBuilder> bucketStatisticsBuilder_;
      /**
       * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
       */
      public boolean hasBucketStatistics() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
       */
      public BucketStatistics getBucketStatistics() {
        if (bucketStatisticsBuilder_ == null) {
          return bucketStatistics_;
        } else {
          return bucketStatisticsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
       */
      public Builder setBucketStatistics(BucketStatistics value) {
        if (bucketStatisticsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          bucketStatistics_ = value;
          onChanged();
        } else {
          bucketStatisticsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
       */
      public Builder setBucketStatistics(
          BucketStatistics.Builder builderForValue) {
        if (bucketStatisticsBuilder_ == null) {
          bucketStatistics_ = builderForValue.build();
          onChanged();
        } else {
          bucketStatisticsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
       */
      public Builder mergeBucketStatistics(BucketStatistics value) {
        if (bucketStatisticsBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010) &&
              bucketStatistics_ != BucketStatistics.getDefaultInstance()) {
            bucketStatistics_ =
              BucketStatistics.newBuilder(bucketStatistics_).mergeFrom(value).buildPartial();
          } else {
            bucketStatistics_ = value;
          }
          onChanged();
        } else {
          bucketStatisticsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
       */
      public Builder clearBucketStatistics() {
        if (bucketStatisticsBuilder_ == null) {
          bucketStatistics_ = BucketStatistics.getDefaultInstance();
          onChanged();
        } else {
          bucketStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
       */
      public BucketStatistics.Builder getBucketStatisticsBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getBucketStatisticsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
       */
      public BucketStatisticsOrBuilder getBucketStatisticsOrBuilder() {
        if (bucketStatisticsBuilder_ != null) {
          return bucketStatisticsBuilder_.getMessageOrBuilder();
        } else {
          return bucketStatistics_;
        }
      }
      /**
       * <code>optional .orc.proto.BucketStatistics bucketStatistics = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          BucketStatistics, BucketStatistics.Builder, BucketStatisticsOrBuilder> 
          getBucketStatisticsFieldBuilder() {
        if (bucketStatisticsBuilder_ == null) {
          bucketStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              BucketStatistics, BucketStatistics.Builder, BucketStatisticsOrBuilder>(
                  bucketStatistics_,
                  getParentForChildren(),
                  isClean());
          bucketStatistics_ = null;
        }
        return bucketStatisticsBuilder_;
      }

      // optional .orc.proto.DecimalStatistics decimalStatistics = 6;
      private DecimalStatistics decimalStatistics_ = DecimalStatistics.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          DecimalStatistics, DecimalStatistics.Builder, DecimalStatisticsOrBuilder> decimalStatisticsBuilder_;
      /**
       * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
       */
      public boolean hasDecimalStatistics() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
       */
      public DecimalStatistics getDecimalStatistics() {
        if (decimalStatisticsBuilder_ == null) {
          return decimalStatistics_;
        } else {
          return decimalStatisticsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
       */
      public Builder setDecimalStatistics(DecimalStatistics value) {
        if (decimalStatisticsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          decimalStatistics_ = value;
          onChanged();
        } else {
          decimalStatisticsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
       */
      public Builder setDecimalStatistics(
          DecimalStatistics.Builder builderForValue) {
        if (decimalStatisticsBuilder_ == null) {
          decimalStatistics_ = builderForValue.build();
          onChanged();
        } else {
          decimalStatisticsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
       */
      public Builder mergeDecimalStatistics(DecimalStatistics value) {
        if (decimalStatisticsBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020) &&
              decimalStatistics_ != DecimalStatistics.getDefaultInstance()) {
            decimalStatistics_ =
              DecimalStatistics.newBuilder(decimalStatistics_).mergeFrom(value).buildPartial();
          } else {
            decimalStatistics_ = value;
          }
          onChanged();
        } else {
          decimalStatisticsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
       */
      public Builder clearDecimalStatistics() {
        if (decimalStatisticsBuilder_ == null) {
          decimalStatistics_ = DecimalStatistics.getDefaultInstance();
          onChanged();
        } else {
          decimalStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }
      /**
       * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
       */
      public DecimalStatistics.Builder getDecimalStatisticsBuilder() {
        bitField0_ |= 0x00000020;
        onChanged();
        return getDecimalStatisticsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
       */
      public DecimalStatisticsOrBuilder getDecimalStatisticsOrBuilder() {
        if (decimalStatisticsBuilder_ != null) {
          return decimalStatisticsBuilder_.getMessageOrBuilder();
        } else {
          return decimalStatistics_;
        }
      }
      /**
       * <code>optional .orc.proto.DecimalStatistics decimalStatistics = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          DecimalStatistics, DecimalStatistics.Builder, DecimalStatisticsOrBuilder> 
          getDecimalStatisticsFieldBuilder() {
        if (decimalStatisticsBuilder_ == null) {
          decimalStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              DecimalStatistics, DecimalStatistics.Builder, DecimalStatisticsOrBuilder>(
                  decimalStatistics_,
                  getParentForChildren(),
                  isClean());
          decimalStatistics_ = null;
        }
        return decimalStatisticsBuilder_;
      }

      // optional .orc.proto.DateStatistics dateStatistics = 7;
      private DateStatistics dateStatistics_ = DateStatistics.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          DateStatistics, DateStatistics.Builder, DateStatisticsOrBuilder> dateStatisticsBuilder_;
      /**
       * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
       */
      public boolean hasDateStatistics() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
       */
      public DateStatistics getDateStatistics() {
        if (dateStatisticsBuilder_ == null) {
          return dateStatistics_;
        } else {
          return dateStatisticsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
       */
      public Builder setDateStatistics(DateStatistics value) {
        if (dateStatisticsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dateStatistics_ = value;
          onChanged();
        } else {
          dateStatisticsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
       */
      public Builder setDateStatistics(
          DateStatistics.Builder builderForValue) {
        if (dateStatisticsBuilder_ == null) {
          dateStatistics_ = builderForValue.build();
          onChanged();
        } else {
          dateStatisticsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
       */
      public Builder mergeDateStatistics(DateStatistics value) {
        if (dateStatisticsBuilder_ == null) {
          if (((bitField0_ & 0x00000040) == 0x00000040) &&
              dateStatistics_ != DateStatistics.getDefaultInstance()) {
            dateStatistics_ =
              DateStatistics.newBuilder(dateStatistics_).mergeFrom(value).buildPartial();
          } else {
            dateStatistics_ = value;
          }
          onChanged();
        } else {
          dateStatisticsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
       */
      public Builder clearDateStatistics() {
        if (dateStatisticsBuilder_ == null) {
          dateStatistics_ = DateStatistics.getDefaultInstance();
          onChanged();
        } else {
          dateStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      /**
       * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
       */
      public DateStatistics.Builder getDateStatisticsBuilder() {
        bitField0_ |= 0x00000040;
        onChanged();
        return getDateStatisticsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
       */
      public DateStatisticsOrBuilder getDateStatisticsOrBuilder() {
        if (dateStatisticsBuilder_ != null) {
          return dateStatisticsBuilder_.getMessageOrBuilder();
        } else {
          return dateStatistics_;
        }
      }
      /**
       * <code>optional .orc.proto.DateStatistics dateStatistics = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          DateStatistics, DateStatistics.Builder, DateStatisticsOrBuilder> 
          getDateStatisticsFieldBuilder() {
        if (dateStatisticsBuilder_ == null) {
          dateStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              DateStatistics, DateStatistics.Builder, DateStatisticsOrBuilder>(
                  dateStatistics_,
                  getParentForChildren(),
                  isClean());
          dateStatistics_ = null;
        }
        return dateStatisticsBuilder_;
      }

      // optional .orc.proto.BinaryStatistics binaryStatistics = 8;
      private BinaryStatistics binaryStatistics_ = BinaryStatistics.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          BinaryStatistics, BinaryStatistics.Builder, BinaryStatisticsOrBuilder> binaryStatisticsBuilder_;
      /**
       * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
       */
      public boolean hasBinaryStatistics() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
       */
      public BinaryStatistics getBinaryStatistics() {
        if (binaryStatisticsBuilder_ == null) {
          return binaryStatistics_;
        } else {
          return binaryStatisticsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
       */
      public Builder setBinaryStatistics(BinaryStatistics value) {
        if (binaryStatisticsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          binaryStatistics_ = value;
          onChanged();
        } else {
          binaryStatisticsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000080;
        return this;
      }
      /**
       * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
       */
      public Builder setBinaryStatistics(
          BinaryStatistics.Builder builderForValue) {
        if (binaryStatisticsBuilder_ == null) {
          binaryStatistics_ = builderForValue.build();
          onChanged();
        } else {
          binaryStatisticsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000080;
        return this;
      }
      /**
       * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
       */
      public Builder mergeBinaryStatistics(BinaryStatistics value) {
        if (binaryStatisticsBuilder_ == null) {
          if (((bitField0_ & 0x00000080) == 0x00000080) &&
              binaryStatistics_ != BinaryStatistics.getDefaultInstance()) {
            binaryStatistics_ =
              BinaryStatistics.newBuilder(binaryStatistics_).mergeFrom(value).buildPartial();
          } else {
            binaryStatistics_ = value;
          }
          onChanged();
        } else {
          binaryStatisticsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000080;
        return this;
      }
      /**
       * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
       */
      public Builder clearBinaryStatistics() {
        if (binaryStatisticsBuilder_ == null) {
          binaryStatistics_ = BinaryStatistics.getDefaultInstance();
          onChanged();
        } else {
          binaryStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }
      /**
       * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
       */
      public BinaryStatistics.Builder getBinaryStatisticsBuilder() {
        bitField0_ |= 0x00000080;
        onChanged();
        return getBinaryStatisticsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
       */
      public BinaryStatisticsOrBuilder getBinaryStatisticsOrBuilder() {
        if (binaryStatisticsBuilder_ != null) {
          return binaryStatisticsBuilder_.getMessageOrBuilder();
        } else {
          return binaryStatistics_;
        }
      }
      /**
       * <code>optional .orc.proto.BinaryStatistics binaryStatistics = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          BinaryStatistics, BinaryStatistics.Builder, BinaryStatisticsOrBuilder> 
          getBinaryStatisticsFieldBuilder() {
        if (binaryStatisticsBuilder_ == null) {
          binaryStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              BinaryStatistics, BinaryStatistics.Builder, BinaryStatisticsOrBuilder>(
                  binaryStatistics_,
                  getParentForChildren(),
                  isClean());
          binaryStatistics_ = null;
        }
        return binaryStatisticsBuilder_;
      }

      // optional .orc.proto.TimestampStatistics timestampStatistics = 9;
      private TimestampStatistics timestampStatistics_ = TimestampStatistics.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          TimestampStatistics, TimestampStatistics.Builder, TimestampStatisticsOrBuilder> timestampStatisticsBuilder_;
      /**
       * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
       */
      public boolean hasTimestampStatistics() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
       */
      public TimestampStatistics getTimestampStatistics() {
        if (timestampStatisticsBuilder_ == null) {
          return timestampStatistics_;
        } else {
          return timestampStatisticsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
       */
      public Builder setTimestampStatistics(TimestampStatistics value) {
        if (timestampStatisticsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          timestampStatistics_ = value;
          onChanged();
        } else {
          timestampStatisticsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000100;
        return this;
      }
      /**
       * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
       */
      public Builder setTimestampStatistics(
          TimestampStatistics.Builder builderForValue) {
        if (timestampStatisticsBuilder_ == null) {
          timestampStatistics_ = builderForValue.build();
          onChanged();
        } else {
          timestampStatisticsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000100;
        return this;
      }
      /**
       * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
       */
      public Builder mergeTimestampStatistics(TimestampStatistics value) {
        if (timestampStatisticsBuilder_ == null) {
          if (((bitField0_ & 0x00000100) == 0x00000100) &&
              timestampStatistics_ != TimestampStatistics.getDefaultInstance()) {
            timestampStatistics_ =
              TimestampStatistics.newBuilder(timestampStatistics_).mergeFrom(value).buildPartial();
          } else {
            timestampStatistics_ = value;
          }
          onChanged();
        } else {
          timestampStatisticsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000100;
        return this;
      }
      /**
       * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
       */
      public Builder clearTimestampStatistics() {
        if (timestampStatisticsBuilder_ == null) {
          timestampStatistics_ = TimestampStatistics.getDefaultInstance();
          onChanged();
        } else {
          timestampStatisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }
      /**
       * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
       */
      public TimestampStatistics.Builder getTimestampStatisticsBuilder() {
        bitField0_ |= 0x00000100;
        onChanged();
        return getTimestampStatisticsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
       */
      public TimestampStatisticsOrBuilder getTimestampStatisticsOrBuilder() {
        if (timestampStatisticsBuilder_ != null) {
          return timestampStatisticsBuilder_.getMessageOrBuilder();
        } else {
          return timestampStatistics_;
        }
      }
      /**
       * <code>optional .orc.proto.TimestampStatistics timestampStatistics = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          TimestampStatistics, TimestampStatistics.Builder, TimestampStatisticsOrBuilder> 
          getTimestampStatisticsFieldBuilder() {
        if (timestampStatisticsBuilder_ == null) {
          timestampStatisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              TimestampStatistics, TimestampStatistics.Builder, TimestampStatisticsOrBuilder>(
                  timestampStatistics_,
                  getParentForChildren(),
                  isClean());
          timestampStatistics_ = null;
        }
        return timestampStatisticsBuilder_;
      }

      // optional bool hasNull = 10;
      private boolean hasNull_ ;
      /**
       * <code>optional bool hasNull = 10;</code>
       */
      public boolean hasHasNull() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional bool hasNull = 10;</code>
       */
      public boolean getHasNull() {
        return hasNull_;
      }
      /**
       * <code>optional bool hasNull = 10;</code>
       */
      public Builder setHasNull(boolean value) {
        bitField0_ |= 0x00000200;
        hasNull_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool hasNull = 10;</code>
       */
      public Builder clearHasNull() {
        bitField0_ = (bitField0_ & ~0x00000200);
        hasNull_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.ColumnStatistics)
    }

    static {
      defaultInstance = new ColumnStatistics(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.ColumnStatistics)
  }

  public interface RowIndexEntryOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated uint64 positions = 1 [packed = true];
    /**
     * <code>repeated uint64 positions = 1 [packed = true];</code>
     */
    java.util.List<java.lang.Long> getPositionsList();
    /**
     * <code>repeated uint64 positions = 1 [packed = true];</code>
     */
    int getPositionsCount();
    /**
     * <code>repeated uint64 positions = 1 [packed = true];</code>
     */
    long getPositions(int index);

    // optional .orc.proto.ColumnStatistics statistics = 2;
    /**
     * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
     */
    boolean hasStatistics();
    /**
     * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
     */
    ColumnStatistics getStatistics();
    /**
     * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
     */
    ColumnStatisticsOrBuilder getStatisticsOrBuilder();
  }
  /**
   * Protobuf type {@code orc.proto.RowIndexEntry}
   */
  public static final class RowIndexEntry extends
      com.google.protobuf.GeneratedMessage
      implements RowIndexEntryOrBuilder {
    // Use RowIndexEntry.newBuilder() to construct.
    private RowIndexEntry(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RowIndexEntry(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RowIndexEntry defaultInstance;
    public static RowIndexEntry getDefaultInstance() {
      return defaultInstance;
    }

    public RowIndexEntry getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RowIndexEntry(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                positions_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000001;
              }
              positions_.add(input.readUInt64());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                positions_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                positions_.add(input.readUInt64());
              }
              input.popLimit(limit);
              break;
            }
            case 18: {
              ColumnStatistics.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = statistics_.toBuilder();
              }
              statistics_ = input.readMessage(ColumnStatistics.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(statistics_);
                statistics_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          positions_ = java.util.Collections.unmodifiableList(positions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_RowIndexEntry_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_RowIndexEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RowIndexEntry.class, RowIndexEntry.Builder.class);
    }

    public static com.google.protobuf.Parser<RowIndexEntry> PARSER =
        new com.google.protobuf.AbstractParser<RowIndexEntry>() {
      public RowIndexEntry parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RowIndexEntry(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RowIndexEntry> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // repeated uint64 positions = 1 [packed = true];
    public static final int POSITIONS_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Long> positions_;
    /**
     * <code>repeated uint64 positions = 1 [packed = true];</code>
     */
    public java.util.List<java.lang.Long>
        getPositionsList() {
      return positions_;
    }
    /**
     * <code>repeated uint64 positions = 1 [packed = true];</code>
     */
    public int getPositionsCount() {
      return positions_.size();
    }
    /**
     * <code>repeated uint64 positions = 1 [packed = true];</code>
     */
    public long getPositions(int index) {
      return positions_.get(index);
    }
    private int positionsMemoizedSerializedSize = -1;

    // optional .orc.proto.ColumnStatistics statistics = 2;
    public static final int STATISTICS_FIELD_NUMBER = 2;
    private ColumnStatistics statistics_;
    /**
     * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
     */
    public boolean hasStatistics() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
     */
    public ColumnStatistics getStatistics() {
      return statistics_;
    }
    /**
     * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
     */
    public ColumnStatisticsOrBuilder getStatisticsOrBuilder() {
      return statistics_;
    }

    private void initFields() {
      positions_ = java.util.Collections.emptyList();
      statistics_ = ColumnStatistics.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getPositionsList().size() > 0) {
        output.writeRawVarint32(10);
        output.writeRawVarint32(positionsMemoizedSerializedSize);
      }
      for (int i = 0; i < positions_.size(); i++) {
        output.writeUInt64NoTag(positions_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(2, statistics_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < positions_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(positions_.get(i));
        }
        size += dataSize;
        if (!getPositionsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        positionsMemoizedSerializedSize = dataSize;
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, statistics_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static RowIndexEntry parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RowIndexEntry parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RowIndexEntry parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RowIndexEntry parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RowIndexEntry parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static RowIndexEntry parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static RowIndexEntry parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static RowIndexEntry parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static RowIndexEntry parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static RowIndexEntry parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(RowIndexEntry prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.RowIndexEntry}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements RowIndexEntryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_RowIndexEntry_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_RowIndexEntry_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RowIndexEntry.class, RowIndexEntry.Builder.class);
      }

      // Construct using RowIndexEntry.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getStatisticsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        positions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        if (statisticsBuilder_ == null) {
          statistics_ = ColumnStatistics.getDefaultInstance();
        } else {
          statisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_RowIndexEntry_descriptor;
      }

      public RowIndexEntry getDefaultInstanceForType() {
        return RowIndexEntry.getDefaultInstance();
      }

      public RowIndexEntry build() {
        RowIndexEntry result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public RowIndexEntry buildPartial() {
        RowIndexEntry result = new RowIndexEntry(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          positions_ = java.util.Collections.unmodifiableList(positions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.positions_ = positions_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        if (statisticsBuilder_ == null) {
          result.statistics_ = statistics_;
        } else {
          result.statistics_ = statisticsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RowIndexEntry) {
          return mergeFrom((RowIndexEntry)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RowIndexEntry other) {
        if (other == RowIndexEntry.getDefaultInstance()) return this;
        if (!other.positions_.isEmpty()) {
          if (positions_.isEmpty()) {
            positions_ = other.positions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePositionsIsMutable();
            positions_.addAll(other.positions_);
          }
          onChanged();
        }
        if (other.hasStatistics()) {
          mergeStatistics(other.getStatistics());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RowIndexEntry parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RowIndexEntry) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated uint64 positions = 1 [packed = true];
      private java.util.List<java.lang.Long> positions_ = java.util.Collections.emptyList();
      private void ensurePositionsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          positions_ = new java.util.ArrayList<java.lang.Long>(positions_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 positions = 1 [packed = true];</code>
       */
      public java.util.List<java.lang.Long>
          getPositionsList() {
        return java.util.Collections.unmodifiableList(positions_);
      }
      /**
       * <code>repeated uint64 positions = 1 [packed = true];</code>
       */
      public int getPositionsCount() {
        return positions_.size();
      }
      /**
       * <code>repeated uint64 positions = 1 [packed = true];</code>
       */
      public long getPositions(int index) {
        return positions_.get(index);
      }
      /**
       * <code>repeated uint64 positions = 1 [packed = true];</code>
       */
      public Builder setPositions(
          int index, long value) {
        ensurePositionsIsMutable();
        positions_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 positions = 1 [packed = true];</code>
       */
      public Builder addPositions(long value) {
        ensurePositionsIsMutable();
        positions_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 positions = 1 [packed = true];</code>
       */
      public Builder addAllPositions(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensurePositionsIsMutable();
        super.addAll(values, positions_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 positions = 1 [packed = true];</code>
       */
      public Builder clearPositions() {
        positions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // optional .orc.proto.ColumnStatistics statistics = 2;
      private ColumnStatistics statistics_ = ColumnStatistics.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          ColumnStatistics, ColumnStatistics.Builder, ColumnStatisticsOrBuilder> statisticsBuilder_;
      /**
       * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
       */
      public boolean hasStatistics() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
       */
      public ColumnStatistics getStatistics() {
        if (statisticsBuilder_ == null) {
          return statistics_;
        } else {
          return statisticsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
       */
      public Builder setStatistics(ColumnStatistics value) {
        if (statisticsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          statistics_ = value;
          onChanged();
        } else {
          statisticsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
       */
      public Builder setStatistics(
          ColumnStatistics.Builder builderForValue) {
        if (statisticsBuilder_ == null) {
          statistics_ = builderForValue.build();
          onChanged();
        } else {
          statisticsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
       */
      public Builder mergeStatistics(ColumnStatistics value) {
        if (statisticsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              statistics_ != ColumnStatistics.getDefaultInstance()) {
            statistics_ =
              ColumnStatistics.newBuilder(statistics_).mergeFrom(value).buildPartial();
          } else {
            statistics_ = value;
          }
          onChanged();
        } else {
          statisticsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
       */
      public Builder clearStatistics() {
        if (statisticsBuilder_ == null) {
          statistics_ = ColumnStatistics.getDefaultInstance();
          onChanged();
        } else {
          statisticsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
       */
      public ColumnStatistics.Builder getStatisticsBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getStatisticsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
       */
      public ColumnStatisticsOrBuilder getStatisticsOrBuilder() {
        if (statisticsBuilder_ != null) {
          return statisticsBuilder_.getMessageOrBuilder();
        } else {
          return statistics_;
        }
      }
      /**
       * <code>optional .orc.proto.ColumnStatistics statistics = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          ColumnStatistics, ColumnStatistics.Builder, ColumnStatisticsOrBuilder> 
          getStatisticsFieldBuilder() {
        if (statisticsBuilder_ == null) {
          statisticsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              ColumnStatistics, ColumnStatistics.Builder, ColumnStatisticsOrBuilder>(
                  statistics_,
                  getParentForChildren(),
                  isClean());
          statistics_ = null;
        }
        return statisticsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.RowIndexEntry)
    }

    static {
      defaultInstance = new RowIndexEntry(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.RowIndexEntry)
  }

  public interface RowIndexOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated .orc.proto.RowIndexEntry entry = 1;
    /**
     * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
     */
    java.util.List<RowIndexEntry> 
        getEntryList();
    /**
     * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
     */
    RowIndexEntry getEntry(int index);
    /**
     * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
     */
    int getEntryCount();
    /**
     * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
     */
    java.util.List<? extends RowIndexEntryOrBuilder> 
        getEntryOrBuilderList();
    /**
     * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
     */
    RowIndexEntryOrBuilder getEntryOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code orc.proto.RowIndex}
   */
  public static final class RowIndex extends
      com.google.protobuf.GeneratedMessage
      implements RowIndexOrBuilder {
    // Use RowIndex.newBuilder() to construct.
    private RowIndex(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RowIndex(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RowIndex defaultInstance;
    public static RowIndex getDefaultInstance() {
      return defaultInstance;
    }

    public RowIndex getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RowIndex(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                entry_ = new java.util.ArrayList<RowIndexEntry>();
                mutable_bitField0_ |= 0x00000001;
              }
              entry_.add(input.readMessage(RowIndexEntry.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          entry_ = java.util.Collections.unmodifiableList(entry_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_RowIndex_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_RowIndex_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RowIndex.class, RowIndex.Builder.class);
    }

    public static com.google.protobuf.Parser<RowIndex> PARSER =
        new com.google.protobuf.AbstractParser<RowIndex>() {
      public RowIndex parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RowIndex(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RowIndex> getParserForType() {
      return PARSER;
    }

    // repeated .orc.proto.RowIndexEntry entry = 1;
    public static final int ENTRY_FIELD_NUMBER = 1;
    private java.util.List<RowIndexEntry> entry_;
    /**
     * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
     */
    public java.util.List<RowIndexEntry> getEntryList() {
      return entry_;
    }
    /**
     * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
     */
    public java.util.List<? extends RowIndexEntryOrBuilder> 
        getEntryOrBuilderList() {
      return entry_;
    }
    /**
     * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
     */
    public int getEntryCount() {
      return entry_.size();
    }
    /**
     * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
     */
    public RowIndexEntry getEntry(int index) {
      return entry_.get(index);
    }
    /**
     * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
     */
    public RowIndexEntryOrBuilder getEntryOrBuilder(
        int index) {
      return entry_.get(index);
    }

    private void initFields() {
      entry_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < entry_.size(); i++) {
        output.writeMessage(1, entry_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < entry_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, entry_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static RowIndex parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RowIndex parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RowIndex parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RowIndex parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RowIndex parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static RowIndex parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static RowIndex parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static RowIndex parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static RowIndex parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static RowIndex parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(RowIndex prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.RowIndex}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements RowIndexOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_RowIndex_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_RowIndex_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RowIndex.class, RowIndex.Builder.class);
      }

      // Construct using RowIndex.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getEntryFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (entryBuilder_ == null) {
          entry_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          entryBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_RowIndex_descriptor;
      }

      public RowIndex getDefaultInstanceForType() {
        return RowIndex.getDefaultInstance();
      }

      public RowIndex build() {
        RowIndex result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public RowIndex buildPartial() {
        RowIndex result = new RowIndex(this);
        int from_bitField0_ = bitField0_;
        if (entryBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            entry_ = java.util.Collections.unmodifiableList(entry_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.entry_ = entry_;
        } else {
          result.entry_ = entryBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RowIndex) {
          return mergeFrom((RowIndex)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RowIndex other) {
        if (other == RowIndex.getDefaultInstance()) return this;
        if (entryBuilder_ == null) {
          if (!other.entry_.isEmpty()) {
            if (entry_.isEmpty()) {
              entry_ = other.entry_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEntryIsMutable();
              entry_.addAll(other.entry_);
            }
            onChanged();
          }
        } else {
          if (!other.entry_.isEmpty()) {
            if (entryBuilder_.isEmpty()) {
              entryBuilder_.dispose();
              entryBuilder_ = null;
              entry_ = other.entry_;
              bitField0_ = (bitField0_ & ~0x00000001);
              entryBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getEntryFieldBuilder() : null;
            } else {
              entryBuilder_.addAllMessages(other.entry_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RowIndex parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RowIndex) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated .orc.proto.RowIndexEntry entry = 1;
      private java.util.List<RowIndexEntry> entry_ =
        java.util.Collections.emptyList();
      private void ensureEntryIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          entry_ = new java.util.ArrayList<RowIndexEntry>(entry_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          RowIndexEntry, RowIndexEntry.Builder, RowIndexEntryOrBuilder> entryBuilder_;

      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public java.util.List<RowIndexEntry> getEntryList() {
        if (entryBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entry_);
        } else {
          return entryBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public int getEntryCount() {
        if (entryBuilder_ == null) {
          return entry_.size();
        } else {
          return entryBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public RowIndexEntry getEntry(int index) {
        if (entryBuilder_ == null) {
          return entry_.get(index);
        } else {
          return entryBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public Builder setEntry(
          int index, RowIndexEntry value) {
        if (entryBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntryIsMutable();
          entry_.set(index, value);
          onChanged();
        } else {
          entryBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public Builder setEntry(
          int index, RowIndexEntry.Builder builderForValue) {
        if (entryBuilder_ == null) {
          ensureEntryIsMutable();
          entry_.set(index, builderForValue.build());
          onChanged();
        } else {
          entryBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public Builder addEntry(RowIndexEntry value) {
        if (entryBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntryIsMutable();
          entry_.add(value);
          onChanged();
        } else {
          entryBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public Builder addEntry(
          int index, RowIndexEntry value) {
        if (entryBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntryIsMutable();
          entry_.add(index, value);
          onChanged();
        } else {
          entryBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public Builder addEntry(
          RowIndexEntry.Builder builderForValue) {
        if (entryBuilder_ == null) {
          ensureEntryIsMutable();
          entry_.add(builderForValue.build());
          onChanged();
        } else {
          entryBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public Builder addEntry(
          int index, RowIndexEntry.Builder builderForValue) {
        if (entryBuilder_ == null) {
          ensureEntryIsMutable();
          entry_.add(index, builderForValue.build());
          onChanged();
        } else {
          entryBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public Builder addAllEntry(
          java.lang.Iterable<? extends RowIndexEntry> values) {
        if (entryBuilder_ == null) {
          ensureEntryIsMutable();
          super.addAll(values, entry_);
          onChanged();
        } else {
          entryBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public Builder clearEntry() {
        if (entryBuilder_ == null) {
          entry_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          entryBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public Builder removeEntry(int index) {
        if (entryBuilder_ == null) {
          ensureEntryIsMutable();
          entry_.remove(index);
          onChanged();
        } else {
          entryBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public RowIndexEntry.Builder getEntryBuilder(
          int index) {
        return getEntryFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public RowIndexEntryOrBuilder getEntryOrBuilder(
          int index) {
        if (entryBuilder_ == null) {
          return entry_.get(index);  } else {
          return entryBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public java.util.List<? extends RowIndexEntryOrBuilder> 
           getEntryOrBuilderList() {
        if (entryBuilder_ != null) {
          return entryBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(entry_);
        }
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public RowIndexEntry.Builder addEntryBuilder() {
        return getEntryFieldBuilder().addBuilder(
            RowIndexEntry.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public RowIndexEntry.Builder addEntryBuilder(
          int index) {
        return getEntryFieldBuilder().addBuilder(
            index, RowIndexEntry.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.RowIndexEntry entry = 1;</code>
       */
      public java.util.List<RowIndexEntry.Builder> 
           getEntryBuilderList() {
        return getEntryFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          RowIndexEntry, RowIndexEntry.Builder, RowIndexEntryOrBuilder> 
          getEntryFieldBuilder() {
        if (entryBuilder_ == null) {
          entryBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              RowIndexEntry, RowIndexEntry.Builder, RowIndexEntryOrBuilder>(
                  entry_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          entry_ = null;
        }
        return entryBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.RowIndex)
    }

    static {
      defaultInstance = new RowIndex(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.RowIndex)
  }

  public interface BloomFilterOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional uint32 numHashFunctions = 1;
    /**
     * <code>optional uint32 numHashFunctions = 1;</code>
     */
    boolean hasNumHashFunctions();
    /**
     * <code>optional uint32 numHashFunctions = 1;</code>
     */
    int getNumHashFunctions();

    // repeated fixed64 bitset = 2;
    /**
     * <code>repeated fixed64 bitset = 2;</code>
     */
    java.util.List<java.lang.Long> getBitsetList();
    /**
     * <code>repeated fixed64 bitset = 2;</code>
     */
    int getBitsetCount();
    /**
     * <code>repeated fixed64 bitset = 2;</code>
     */
    long getBitset(int index);
  }
  /**
   * Protobuf type {@code orc.proto.BloomFilter}
   */
  public static final class BloomFilter extends
      com.google.protobuf.GeneratedMessage
      implements BloomFilterOrBuilder {
    // Use BloomFilter.newBuilder() to construct.
    private BloomFilter(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BloomFilter(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BloomFilter defaultInstance;
    public static BloomFilter getDefaultInstance() {
      return defaultInstance;
    }

    public BloomFilter getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BloomFilter(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              numHashFunctions_ = input.readUInt32();
              break;
            }
            case 17: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                bitset_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000002;
              }
              bitset_.add(input.readFixed64());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                bitset_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                bitset_.add(input.readFixed64());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          bitset_ = java.util.Collections.unmodifiableList(bitset_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_BloomFilter_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_BloomFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BloomFilter.class, BloomFilter.Builder.class);
    }

    public static com.google.protobuf.Parser<BloomFilter> PARSER =
        new com.google.protobuf.AbstractParser<BloomFilter>() {
      public BloomFilter parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BloomFilter(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BloomFilter> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional uint32 numHashFunctions = 1;
    public static final int NUMHASHFUNCTIONS_FIELD_NUMBER = 1;
    private int numHashFunctions_;
    /**
     * <code>optional uint32 numHashFunctions = 1;</code>
     */
    public boolean hasNumHashFunctions() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 numHashFunctions = 1;</code>
     */
    public int getNumHashFunctions() {
      return numHashFunctions_;
    }

    // repeated fixed64 bitset = 2;
    public static final int BITSET_FIELD_NUMBER = 2;
    private java.util.List<java.lang.Long> bitset_;
    /**
     * <code>repeated fixed64 bitset = 2;</code>
     */
    public java.util.List<java.lang.Long>
        getBitsetList() {
      return bitset_;
    }
    /**
     * <code>repeated fixed64 bitset = 2;</code>
     */
    public int getBitsetCount() {
      return bitset_.size();
    }
    /**
     * <code>repeated fixed64 bitset = 2;</code>
     */
    public long getBitset(int index) {
      return bitset_.get(index);
    }

    private void initFields() {
      numHashFunctions_ = 0;
      bitset_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(1, numHashFunctions_);
      }
      for (int i = 0; i < bitset_.size(); i++) {
        output.writeFixed64(2, bitset_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, numHashFunctions_);
      }
      {
        int dataSize = 0;
        dataSize = 8 * getBitsetList().size();
        size += dataSize;
        size += 1 * getBitsetList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static BloomFilter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BloomFilter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BloomFilter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BloomFilter parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BloomFilter parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static BloomFilter parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static BloomFilter parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static BloomFilter parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static BloomFilter parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static BloomFilter parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(BloomFilter prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.BloomFilter}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements BloomFilterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_BloomFilter_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_BloomFilter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                BloomFilter.class, BloomFilter.Builder.class);
      }

      // Construct using BloomFilter.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        numHashFunctions_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        bitset_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_BloomFilter_descriptor;
      }

      public BloomFilter getDefaultInstanceForType() {
        return BloomFilter.getDefaultInstance();
      }

      public BloomFilter build() {
        BloomFilter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public BloomFilter buildPartial() {
        BloomFilter result = new BloomFilter(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.numHashFunctions_ = numHashFunctions_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          bitset_ = java.util.Collections.unmodifiableList(bitset_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.bitset_ = bitset_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof BloomFilter) {
          return mergeFrom((BloomFilter)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(BloomFilter other) {
        if (other == BloomFilter.getDefaultInstance()) return this;
        if (other.hasNumHashFunctions()) {
          setNumHashFunctions(other.getNumHashFunctions());
        }
        if (!other.bitset_.isEmpty()) {
          if (bitset_.isEmpty()) {
            bitset_ = other.bitset_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureBitsetIsMutable();
            bitset_.addAll(other.bitset_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        BloomFilter parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (BloomFilter) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional uint32 numHashFunctions = 1;
      private int numHashFunctions_ ;
      /**
       * <code>optional uint32 numHashFunctions = 1;</code>
       */
      public boolean hasNumHashFunctions() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint32 numHashFunctions = 1;</code>
       */
      public int getNumHashFunctions() {
        return numHashFunctions_;
      }
      /**
       * <code>optional uint32 numHashFunctions = 1;</code>
       */
      public Builder setNumHashFunctions(int value) {
        bitField0_ |= 0x00000001;
        numHashFunctions_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 numHashFunctions = 1;</code>
       */
      public Builder clearNumHashFunctions() {
        bitField0_ = (bitField0_ & ~0x00000001);
        numHashFunctions_ = 0;
        onChanged();
        return this;
      }

      // repeated fixed64 bitset = 2;
      private java.util.List<java.lang.Long> bitset_ = java.util.Collections.emptyList();
      private void ensureBitsetIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          bitset_ = new java.util.ArrayList<java.lang.Long>(bitset_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated fixed64 bitset = 2;</code>
       */
      public java.util.List<java.lang.Long>
          getBitsetList() {
        return java.util.Collections.unmodifiableList(bitset_);
      }
      /**
       * <code>repeated fixed64 bitset = 2;</code>
       */
      public int getBitsetCount() {
        return bitset_.size();
      }
      /**
       * <code>repeated fixed64 bitset = 2;</code>
       */
      public long getBitset(int index) {
        return bitset_.get(index);
      }
      /**
       * <code>repeated fixed64 bitset = 2;</code>
       */
      public Builder setBitset(
          int index, long value) {
        ensureBitsetIsMutable();
        bitset_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated fixed64 bitset = 2;</code>
       */
      public Builder addBitset(long value) {
        ensureBitsetIsMutable();
        bitset_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated fixed64 bitset = 2;</code>
       */
      public Builder addAllBitset(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureBitsetIsMutable();
        super.addAll(values, bitset_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated fixed64 bitset = 2;</code>
       */
      public Builder clearBitset() {
        bitset_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.BloomFilter)
    }

    static {
      defaultInstance = new BloomFilter(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.BloomFilter)
  }

  public interface BloomFilterIndexOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated .orc.proto.BloomFilter bloomFilter = 1;
    /**
     * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
     */
    java.util.List<BloomFilter> 
        getBloomFilterList();
    /**
     * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
     */
    BloomFilter getBloomFilter(int index);
    /**
     * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
     */
    int getBloomFilterCount();
    /**
     * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
     */
    java.util.List<? extends BloomFilterOrBuilder> 
        getBloomFilterOrBuilderList();
    /**
     * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
     */
    BloomFilterOrBuilder getBloomFilterOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code orc.proto.BloomFilterIndex}
   */
  public static final class BloomFilterIndex extends
      com.google.protobuf.GeneratedMessage
      implements BloomFilterIndexOrBuilder {
    // Use BloomFilterIndex.newBuilder() to construct.
    private BloomFilterIndex(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BloomFilterIndex(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BloomFilterIndex defaultInstance;
    public static BloomFilterIndex getDefaultInstance() {
      return defaultInstance;
    }

    public BloomFilterIndex getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BloomFilterIndex(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                bloomFilter_ = new java.util.ArrayList<BloomFilter>();
                mutable_bitField0_ |= 0x00000001;
              }
              bloomFilter_.add(input.readMessage(BloomFilter.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          bloomFilter_ = java.util.Collections.unmodifiableList(bloomFilter_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_BloomFilterIndex_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_BloomFilterIndex_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BloomFilterIndex.class, BloomFilterIndex.Builder.class);
    }

    public static com.google.protobuf.Parser<BloomFilterIndex> PARSER =
        new com.google.protobuf.AbstractParser<BloomFilterIndex>() {
      public BloomFilterIndex parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BloomFilterIndex(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BloomFilterIndex> getParserForType() {
      return PARSER;
    }

    // repeated .orc.proto.BloomFilter bloomFilter = 1;
    public static final int BLOOMFILTER_FIELD_NUMBER = 1;
    private java.util.List<BloomFilter> bloomFilter_;
    /**
     * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
     */
    public java.util.List<BloomFilter> getBloomFilterList() {
      return bloomFilter_;
    }
    /**
     * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
     */
    public java.util.List<? extends BloomFilterOrBuilder> 
        getBloomFilterOrBuilderList() {
      return bloomFilter_;
    }
    /**
     * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
     */
    public int getBloomFilterCount() {
      return bloomFilter_.size();
    }
    /**
     * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
     */
    public BloomFilter getBloomFilter(int index) {
      return bloomFilter_.get(index);
    }
    /**
     * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
     */
    public BloomFilterOrBuilder getBloomFilterOrBuilder(
        int index) {
      return bloomFilter_.get(index);
    }

    private void initFields() {
      bloomFilter_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < bloomFilter_.size(); i++) {
        output.writeMessage(1, bloomFilter_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < bloomFilter_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, bloomFilter_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static BloomFilterIndex parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BloomFilterIndex parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BloomFilterIndex parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BloomFilterIndex parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BloomFilterIndex parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static BloomFilterIndex parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static BloomFilterIndex parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static BloomFilterIndex parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static BloomFilterIndex parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static BloomFilterIndex parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(BloomFilterIndex prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.BloomFilterIndex}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements BloomFilterIndexOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_BloomFilterIndex_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_BloomFilterIndex_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                BloomFilterIndex.class, BloomFilterIndex.Builder.class);
      }

      // Construct using BloomFilterIndex.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBloomFilterFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (bloomFilterBuilder_ == null) {
          bloomFilter_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          bloomFilterBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_BloomFilterIndex_descriptor;
      }

      public BloomFilterIndex getDefaultInstanceForType() {
        return BloomFilterIndex.getDefaultInstance();
      }

      public BloomFilterIndex build() {
        BloomFilterIndex result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public BloomFilterIndex buildPartial() {
        BloomFilterIndex result = new BloomFilterIndex(this);
        int from_bitField0_ = bitField0_;
        if (bloomFilterBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            bloomFilter_ = java.util.Collections.unmodifiableList(bloomFilter_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.bloomFilter_ = bloomFilter_;
        } else {
          result.bloomFilter_ = bloomFilterBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof BloomFilterIndex) {
          return mergeFrom((BloomFilterIndex)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(BloomFilterIndex other) {
        if (other == BloomFilterIndex.getDefaultInstance()) return this;
        if (bloomFilterBuilder_ == null) {
          if (!other.bloomFilter_.isEmpty()) {
            if (bloomFilter_.isEmpty()) {
              bloomFilter_ = other.bloomFilter_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBloomFilterIsMutable();
              bloomFilter_.addAll(other.bloomFilter_);
            }
            onChanged();
          }
        } else {
          if (!other.bloomFilter_.isEmpty()) {
            if (bloomFilterBuilder_.isEmpty()) {
              bloomFilterBuilder_.dispose();
              bloomFilterBuilder_ = null;
              bloomFilter_ = other.bloomFilter_;
              bitField0_ = (bitField0_ & ~0x00000001);
              bloomFilterBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getBloomFilterFieldBuilder() : null;
            } else {
              bloomFilterBuilder_.addAllMessages(other.bloomFilter_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        BloomFilterIndex parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (BloomFilterIndex) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated .orc.proto.BloomFilter bloomFilter = 1;
      private java.util.List<BloomFilter> bloomFilter_ =
        java.util.Collections.emptyList();
      private void ensureBloomFilterIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          bloomFilter_ = new java.util.ArrayList<BloomFilter>(bloomFilter_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          BloomFilter, BloomFilter.Builder, BloomFilterOrBuilder> bloomFilterBuilder_;

      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public java.util.List<BloomFilter> getBloomFilterList() {
        if (bloomFilterBuilder_ == null) {
          return java.util.Collections.unmodifiableList(bloomFilter_);
        } else {
          return bloomFilterBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public int getBloomFilterCount() {
        if (bloomFilterBuilder_ == null) {
          return bloomFilter_.size();
        } else {
          return bloomFilterBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public BloomFilter getBloomFilter(int index) {
        if (bloomFilterBuilder_ == null) {
          return bloomFilter_.get(index);
        } else {
          return bloomFilterBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public Builder setBloomFilter(
          int index, BloomFilter value) {
        if (bloomFilterBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBloomFilterIsMutable();
          bloomFilter_.set(index, value);
          onChanged();
        } else {
          bloomFilterBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public Builder setBloomFilter(
          int index, BloomFilter.Builder builderForValue) {
        if (bloomFilterBuilder_ == null) {
          ensureBloomFilterIsMutable();
          bloomFilter_.set(index, builderForValue.build());
          onChanged();
        } else {
          bloomFilterBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public Builder addBloomFilter(BloomFilter value) {
        if (bloomFilterBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBloomFilterIsMutable();
          bloomFilter_.add(value);
          onChanged();
        } else {
          bloomFilterBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public Builder addBloomFilter(
          int index, BloomFilter value) {
        if (bloomFilterBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBloomFilterIsMutable();
          bloomFilter_.add(index, value);
          onChanged();
        } else {
          bloomFilterBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public Builder addBloomFilter(
          BloomFilter.Builder builderForValue) {
        if (bloomFilterBuilder_ == null) {
          ensureBloomFilterIsMutable();
          bloomFilter_.add(builderForValue.build());
          onChanged();
        } else {
          bloomFilterBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public Builder addBloomFilter(
          int index, BloomFilter.Builder builderForValue) {
        if (bloomFilterBuilder_ == null) {
          ensureBloomFilterIsMutable();
          bloomFilter_.add(index, builderForValue.build());
          onChanged();
        } else {
          bloomFilterBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public Builder addAllBloomFilter(
          java.lang.Iterable<? extends BloomFilter> values) {
        if (bloomFilterBuilder_ == null) {
          ensureBloomFilterIsMutable();
          super.addAll(values, bloomFilter_);
          onChanged();
        } else {
          bloomFilterBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public Builder clearBloomFilter() {
        if (bloomFilterBuilder_ == null) {
          bloomFilter_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          bloomFilterBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public Builder removeBloomFilter(int index) {
        if (bloomFilterBuilder_ == null) {
          ensureBloomFilterIsMutable();
          bloomFilter_.remove(index);
          onChanged();
        } else {
          bloomFilterBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public BloomFilter.Builder getBloomFilterBuilder(
          int index) {
        return getBloomFilterFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public BloomFilterOrBuilder getBloomFilterOrBuilder(
          int index) {
        if (bloomFilterBuilder_ == null) {
          return bloomFilter_.get(index);  } else {
          return bloomFilterBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public java.util.List<? extends BloomFilterOrBuilder> 
           getBloomFilterOrBuilderList() {
        if (bloomFilterBuilder_ != null) {
          return bloomFilterBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(bloomFilter_);
        }
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public BloomFilter.Builder addBloomFilterBuilder() {
        return getBloomFilterFieldBuilder().addBuilder(
            BloomFilter.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public BloomFilter.Builder addBloomFilterBuilder(
          int index) {
        return getBloomFilterFieldBuilder().addBuilder(
            index, BloomFilter.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.BloomFilter bloomFilter = 1;</code>
       */
      public java.util.List<BloomFilter.Builder> 
           getBloomFilterBuilderList() {
        return getBloomFilterFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          BloomFilter, BloomFilter.Builder, BloomFilterOrBuilder> 
          getBloomFilterFieldBuilder() {
        if (bloomFilterBuilder_ == null) {
          bloomFilterBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              BloomFilter, BloomFilter.Builder, BloomFilterOrBuilder>(
                  bloomFilter_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          bloomFilter_ = null;
        }
        return bloomFilterBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.BloomFilterIndex)
    }

    static {
      defaultInstance = new BloomFilterIndex(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.BloomFilterIndex)
  }

  public interface StreamOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional .orc.proto.Stream.Kind kind = 1;
    /**
     * <code>optional .orc.proto.Stream.Kind kind = 1;</code>
     */
    boolean hasKind();
    /**
     * <code>optional .orc.proto.Stream.Kind kind = 1;</code>
     */
    Stream.Kind getKind();

    // optional uint32 column = 2;
    /**
     * <code>optional uint32 column = 2;</code>
     */
    boolean hasColumn();
    /**
     * <code>optional uint32 column = 2;</code>
     */
    int getColumn();

    // optional uint64 length = 3;
    /**
     * <code>optional uint64 length = 3;</code>
     */
    boolean hasLength();
    /**
     * <code>optional uint64 length = 3;</code>
     */
    long getLength();
  }
  /**
   * Protobuf type {@code orc.proto.Stream}
   */
  public static final class Stream extends
      com.google.protobuf.GeneratedMessage
      implements StreamOrBuilder {
    // Use Stream.newBuilder() to construct.
    private Stream(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Stream(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Stream defaultInstance;
    public static Stream getDefaultInstance() {
      return defaultInstance;
    }

    public Stream getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Stream(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              Stream.Kind value = Stream.Kind.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                kind_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              column_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              length_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_Stream_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_Stream_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Stream.class, Stream.Builder.class);
    }

    public static com.google.protobuf.Parser<Stream> PARSER =
        new com.google.protobuf.AbstractParser<Stream>() {
      public Stream parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Stream(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Stream> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code orc.proto.Stream.Kind}
     *
     * <pre>
     * if you add new index stream kinds, you need to make sure to update
     * StreamName to ensure it is added to the stripe in the right area
     * </pre>
     */
    public enum Kind
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>PRESENT = 0;</code>
       */
      PRESENT(0, 0),
      /**
       * <code>DATA = 1;</code>
       */
      DATA(1, 1),
      /**
       * <code>LENGTH = 2;</code>
       */
      LENGTH(2, 2),
      /**
       * <code>DICTIONARY_DATA = 3;</code>
       */
      DICTIONARY_DATA(3, 3),
      /**
       * <code>DICTIONARY_COUNT = 4;</code>
       */
      DICTIONARY_COUNT(4, 4),
      /**
       * <code>SECONDARY = 5;</code>
       */
      SECONDARY(5, 5),
      /**
       * <code>ROW_INDEX = 6;</code>
       */
      ROW_INDEX(6, 6),
      /**
       * <code>BLOOM_FILTER = 7;</code>
       */
      BLOOM_FILTER(7, 7),
      ;

      /**
       * <code>PRESENT = 0;</code>
       */
      public static final int PRESENT_VALUE = 0;
      /**
       * <code>DATA = 1;</code>
       */
      public static final int DATA_VALUE = 1;
      /**
       * <code>LENGTH = 2;</code>
       */
      public static final int LENGTH_VALUE = 2;
      /**
       * <code>DICTIONARY_DATA = 3;</code>
       */
      public static final int DICTIONARY_DATA_VALUE = 3;
      /**
       * <code>DICTIONARY_COUNT = 4;</code>
       */
      public static final int DICTIONARY_COUNT_VALUE = 4;
      /**
       * <code>SECONDARY = 5;</code>
       */
      public static final int SECONDARY_VALUE = 5;
      /**
       * <code>ROW_INDEX = 6;</code>
       */
      public static final int ROW_INDEX_VALUE = 6;
      /**
       * <code>BLOOM_FILTER = 7;</code>
       */
      public static final int BLOOM_FILTER_VALUE = 7;


      public final int getNumber() { return value; }

      public static Kind valueOf(int value) {
        switch (value) {
          case 0: return PRESENT;
          case 1: return DATA;
          case 2: return LENGTH;
          case 3: return DICTIONARY_DATA;
          case 4: return DICTIONARY_COUNT;
          case 5: return SECONDARY;
          case 6: return ROW_INDEX;
          case 7: return BLOOM_FILTER;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Kind>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Kind>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Kind>() {
              public Kind findValueByNumber(int number) {
                return Kind.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return Stream.getDescriptor().getEnumTypes().get(0);
      }

      private static final Kind[] VALUES = values();

      public static Kind valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Kind(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:orc.proto.Stream.Kind)
    }

    private int bitField0_;
    // optional .orc.proto.Stream.Kind kind = 1;
    public static final int KIND_FIELD_NUMBER = 1;
    private Stream.Kind kind_;
    /**
     * <code>optional .orc.proto.Stream.Kind kind = 1;</code>
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .orc.proto.Stream.Kind kind = 1;</code>
     */
    public Stream.Kind getKind() {
      return kind_;
    }

    // optional uint32 column = 2;
    public static final int COLUMN_FIELD_NUMBER = 2;
    private int column_;
    /**
     * <code>optional uint32 column = 2;</code>
     */
    public boolean hasColumn() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 column = 2;</code>
     */
    public int getColumn() {
      return column_;
    }

    // optional uint64 length = 3;
    public static final int LENGTH_FIELD_NUMBER = 3;
    private long length_;
    /**
     * <code>optional uint64 length = 3;</code>
     */
    public boolean hasLength() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint64 length = 3;</code>
     */
    public long getLength() {
      return length_;
    }

    private void initFields() {
      kind_ = Stream.Kind.PRESENT;
      column_ = 0;
      length_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, kind_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, column_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, length_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, kind_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, column_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, length_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static Stream parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Stream parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Stream parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Stream parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Stream parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Stream parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Stream parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Stream parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Stream parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Stream parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Stream prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.Stream}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements StreamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_Stream_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_Stream_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Stream.class, Stream.Builder.class);
      }

      // Construct using Stream.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        kind_ = Stream.Kind.PRESENT;
        bitField0_ = (bitField0_ & ~0x00000001);
        column_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        length_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_Stream_descriptor;
      }

      public Stream getDefaultInstanceForType() {
        return Stream.getDefaultInstance();
      }

      public Stream build() {
        Stream result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Stream buildPartial() {
        Stream result = new Stream(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.kind_ = kind_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.column_ = column_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.length_ = length_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Stream) {
          return mergeFrom((Stream)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Stream other) {
        if (other == Stream.getDefaultInstance()) return this;
        if (other.hasKind()) {
          setKind(other.getKind());
        }
        if (other.hasColumn()) {
          setColumn(other.getColumn());
        }
        if (other.hasLength()) {
          setLength(other.getLength());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Stream parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Stream) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional .orc.proto.Stream.Kind kind = 1;
      private Stream.Kind kind_ = Stream.Kind.PRESENT;
      /**
       * <code>optional .orc.proto.Stream.Kind kind = 1;</code>
       */
      public boolean hasKind() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .orc.proto.Stream.Kind kind = 1;</code>
       */
      public Stream.Kind getKind() {
        return kind_;
      }
      /**
       * <code>optional .orc.proto.Stream.Kind kind = 1;</code>
       */
      public Builder setKind(Stream.Kind value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        kind_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .orc.proto.Stream.Kind kind = 1;</code>
       */
      public Builder clearKind() {
        bitField0_ = (bitField0_ & ~0x00000001);
        kind_ = Stream.Kind.PRESENT;
        onChanged();
        return this;
      }

      // optional uint32 column = 2;
      private int column_ ;
      /**
       * <code>optional uint32 column = 2;</code>
       */
      public boolean hasColumn() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 column = 2;</code>
       */
      public int getColumn() {
        return column_;
      }
      /**
       * <code>optional uint32 column = 2;</code>
       */
      public Builder setColumn(int value) {
        bitField0_ |= 0x00000002;
        column_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 column = 2;</code>
       */
      public Builder clearColumn() {
        bitField0_ = (bitField0_ & ~0x00000002);
        column_ = 0;
        onChanged();
        return this;
      }

      // optional uint64 length = 3;
      private long length_ ;
      /**
       * <code>optional uint64 length = 3;</code>
       */
      public boolean hasLength() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint64 length = 3;</code>
       */
      public long getLength() {
        return length_;
      }
      /**
       * <code>optional uint64 length = 3;</code>
       */
      public Builder setLength(long value) {
        bitField0_ |= 0x00000004;
        length_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 length = 3;</code>
       */
      public Builder clearLength() {
        bitField0_ = (bitField0_ & ~0x00000004);
        length_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.Stream)
    }

    static {
      defaultInstance = new Stream(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.Stream)
  }

  public interface ColumnEncodingOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional .orc.proto.ColumnEncoding.Kind kind = 1;
    /**
     * <code>optional .orc.proto.ColumnEncoding.Kind kind = 1;</code>
     */
    boolean hasKind();
    /**
     * <code>optional .orc.proto.ColumnEncoding.Kind kind = 1;</code>
     */
    ColumnEncoding.Kind getKind();

    // optional uint32 dictionarySize = 2;
    /**
     * <code>optional uint32 dictionarySize = 2;</code>
     */
    boolean hasDictionarySize();
    /**
     * <code>optional uint32 dictionarySize = 2;</code>
     */
    int getDictionarySize();
  }
  /**
   * Protobuf type {@code orc.proto.ColumnEncoding}
   */
  public static final class ColumnEncoding extends
      com.google.protobuf.GeneratedMessage
      implements ColumnEncodingOrBuilder {
    // Use ColumnEncoding.newBuilder() to construct.
    private ColumnEncoding(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ColumnEncoding(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ColumnEncoding defaultInstance;
    public static ColumnEncoding getDefaultInstance() {
      return defaultInstance;
    }

    public ColumnEncoding getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ColumnEncoding(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              ColumnEncoding.Kind value = ColumnEncoding.Kind.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                kind_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              dictionarySize_ = input.readUInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_ColumnEncoding_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_ColumnEncoding_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ColumnEncoding.class, ColumnEncoding.Builder.class);
    }

    public static com.google.protobuf.Parser<ColumnEncoding> PARSER =
        new com.google.protobuf.AbstractParser<ColumnEncoding>() {
      public ColumnEncoding parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ColumnEncoding(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ColumnEncoding> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code orc.proto.ColumnEncoding.Kind}
     */
    public enum Kind
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>DIRECT = 0;</code>
       */
      DIRECT(0, 0),
      /**
       * <code>DICTIONARY = 1;</code>
       */
      DICTIONARY(1, 1),
      /**
       * <code>DIRECT_V2 = 2;</code>
       */
      DIRECT_V2(2, 2),
      /**
       * <code>DICTIONARY_V2 = 3;</code>
       */
      DICTIONARY_V2(3, 3),
      ;

      /**
       * <code>DIRECT = 0;</code>
       */
      public static final int DIRECT_VALUE = 0;
      /**
       * <code>DICTIONARY = 1;</code>
       */
      public static final int DICTIONARY_VALUE = 1;
      /**
       * <code>DIRECT_V2 = 2;</code>
       */
      public static final int DIRECT_V2_VALUE = 2;
      /**
       * <code>DICTIONARY_V2 = 3;</code>
       */
      public static final int DICTIONARY_V2_VALUE = 3;


      public final int getNumber() { return value; }

      public static Kind valueOf(int value) {
        switch (value) {
          case 0: return DIRECT;
          case 1: return DICTIONARY;
          case 2: return DIRECT_V2;
          case 3: return DICTIONARY_V2;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Kind>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Kind>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Kind>() {
              public Kind findValueByNumber(int number) {
                return Kind.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return ColumnEncoding.getDescriptor().getEnumTypes().get(0);
      }

      private static final Kind[] VALUES = values();

      public static Kind valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Kind(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:orc.proto.ColumnEncoding.Kind)
    }

    private int bitField0_;
    // optional .orc.proto.ColumnEncoding.Kind kind = 1;
    public static final int KIND_FIELD_NUMBER = 1;
    private ColumnEncoding.Kind kind_;
    /**
     * <code>optional .orc.proto.ColumnEncoding.Kind kind = 1;</code>
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .orc.proto.ColumnEncoding.Kind kind = 1;</code>
     */
    public ColumnEncoding.Kind getKind() {
      return kind_;
    }

    // optional uint32 dictionarySize = 2;
    public static final int DICTIONARYSIZE_FIELD_NUMBER = 2;
    private int dictionarySize_;
    /**
     * <code>optional uint32 dictionarySize = 2;</code>
     */
    public boolean hasDictionarySize() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 dictionarySize = 2;</code>
     */
    public int getDictionarySize() {
      return dictionarySize_;
    }

    private void initFields() {
      kind_ = ColumnEncoding.Kind.DIRECT;
      dictionarySize_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, kind_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, dictionarySize_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, kind_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, dictionarySize_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ColumnEncoding parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ColumnEncoding parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ColumnEncoding parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ColumnEncoding parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ColumnEncoding parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ColumnEncoding parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ColumnEncoding parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ColumnEncoding parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ColumnEncoding parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ColumnEncoding parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ColumnEncoding prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.ColumnEncoding}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements ColumnEncodingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_ColumnEncoding_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_ColumnEncoding_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ColumnEncoding.class, ColumnEncoding.Builder.class);
      }

      // Construct using ColumnEncoding.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        kind_ = ColumnEncoding.Kind.DIRECT;
        bitField0_ = (bitField0_ & ~0x00000001);
        dictionarySize_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_ColumnEncoding_descriptor;
      }

      public ColumnEncoding getDefaultInstanceForType() {
        return ColumnEncoding.getDefaultInstance();
      }

      public ColumnEncoding build() {
        ColumnEncoding result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ColumnEncoding buildPartial() {
        ColumnEncoding result = new ColumnEncoding(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.kind_ = kind_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.dictionarySize_ = dictionarySize_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ColumnEncoding) {
          return mergeFrom((ColumnEncoding)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ColumnEncoding other) {
        if (other == ColumnEncoding.getDefaultInstance()) return this;
        if (other.hasKind()) {
          setKind(other.getKind());
        }
        if (other.hasDictionarySize()) {
          setDictionarySize(other.getDictionarySize());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ColumnEncoding parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ColumnEncoding) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional .orc.proto.ColumnEncoding.Kind kind = 1;
      private ColumnEncoding.Kind kind_ = ColumnEncoding.Kind.DIRECT;
      /**
       * <code>optional .orc.proto.ColumnEncoding.Kind kind = 1;</code>
       */
      public boolean hasKind() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .orc.proto.ColumnEncoding.Kind kind = 1;</code>
       */
      public ColumnEncoding.Kind getKind() {
        return kind_;
      }
      /**
       * <code>optional .orc.proto.ColumnEncoding.Kind kind = 1;</code>
       */
      public Builder setKind(ColumnEncoding.Kind value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        kind_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .orc.proto.ColumnEncoding.Kind kind = 1;</code>
       */
      public Builder clearKind() {
        bitField0_ = (bitField0_ & ~0x00000001);
        kind_ = ColumnEncoding.Kind.DIRECT;
        onChanged();
        return this;
      }

      // optional uint32 dictionarySize = 2;
      private int dictionarySize_ ;
      /**
       * <code>optional uint32 dictionarySize = 2;</code>
       */
      public boolean hasDictionarySize() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 dictionarySize = 2;</code>
       */
      public int getDictionarySize() {
        return dictionarySize_;
      }
      /**
       * <code>optional uint32 dictionarySize = 2;</code>
       */
      public Builder setDictionarySize(int value) {
        bitField0_ |= 0x00000002;
        dictionarySize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 dictionarySize = 2;</code>
       */
      public Builder clearDictionarySize() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dictionarySize_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.ColumnEncoding)
    }

    static {
      defaultInstance = new ColumnEncoding(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.ColumnEncoding)
  }

  public interface StripeFooterOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated .orc.proto.Stream streams = 1;
    /**
     * <code>repeated .orc.proto.Stream streams = 1;</code>
     */
    java.util.List<Stream> 
        getStreamsList();
    /**
     * <code>repeated .orc.proto.Stream streams = 1;</code>
     */
    Stream getStreams(int index);
    /**
     * <code>repeated .orc.proto.Stream streams = 1;</code>
     */
    int getStreamsCount();
    /**
     * <code>repeated .orc.proto.Stream streams = 1;</code>
     */
    java.util.List<? extends StreamOrBuilder> 
        getStreamsOrBuilderList();
    /**
     * <code>repeated .orc.proto.Stream streams = 1;</code>
     */
    StreamOrBuilder getStreamsOrBuilder(
        int index);

    // repeated .orc.proto.ColumnEncoding columns = 2;
    /**
     * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
     */
    java.util.List<ColumnEncoding> 
        getColumnsList();
    /**
     * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
     */
    ColumnEncoding getColumns(int index);
    /**
     * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
     */
    int getColumnsCount();
    /**
     * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
     */
    java.util.List<? extends ColumnEncodingOrBuilder> 
        getColumnsOrBuilderList();
    /**
     * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
     */
    ColumnEncodingOrBuilder getColumnsOrBuilder(
        int index);

    // optional string writerTimezone = 3;
    /**
     * <code>optional string writerTimezone = 3;</code>
     */
    boolean hasWriterTimezone();
    /**
     * <code>optional string writerTimezone = 3;</code>
     */
    java.lang.String getWriterTimezone();
    /**
     * <code>optional string writerTimezone = 3;</code>
     */
    com.google.protobuf.ByteString
        getWriterTimezoneBytes();
  }
  /**
   * Protobuf type {@code orc.proto.StripeFooter}
   */
  public static final class StripeFooter extends
      com.google.protobuf.GeneratedMessage
      implements StripeFooterOrBuilder {
    // Use StripeFooter.newBuilder() to construct.
    private StripeFooter(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StripeFooter(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StripeFooter defaultInstance;
    public static StripeFooter getDefaultInstance() {
      return defaultInstance;
    }

    public StripeFooter getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StripeFooter(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                streams_ = new java.util.ArrayList<Stream>();
                mutable_bitField0_ |= 0x00000001;
              }
              streams_.add(input.readMessage(Stream.PARSER, extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                columns_ = new java.util.ArrayList<ColumnEncoding>();
                mutable_bitField0_ |= 0x00000002;
              }
              columns_.add(input.readMessage(ColumnEncoding.PARSER, extensionRegistry));
              break;
            }
            case 26: {
              bitField0_ |= 0x00000001;
              writerTimezone_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          streams_ = java.util.Collections.unmodifiableList(streams_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          columns_ = java.util.Collections.unmodifiableList(columns_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_StripeFooter_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_StripeFooter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StripeFooter.class, StripeFooter.Builder.class);
    }

    public static com.google.protobuf.Parser<StripeFooter> PARSER =
        new com.google.protobuf.AbstractParser<StripeFooter>() {
      public StripeFooter parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StripeFooter(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StripeFooter> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // repeated .orc.proto.Stream streams = 1;
    public static final int STREAMS_FIELD_NUMBER = 1;
    private java.util.List<Stream> streams_;
    /**
     * <code>repeated .orc.proto.Stream streams = 1;</code>
     */
    public java.util.List<Stream> getStreamsList() {
      return streams_;
    }
    /**
     * <code>repeated .orc.proto.Stream streams = 1;</code>
     */
    public java.util.List<? extends StreamOrBuilder> 
        getStreamsOrBuilderList() {
      return streams_;
    }
    /**
     * <code>repeated .orc.proto.Stream streams = 1;</code>
     */
    public int getStreamsCount() {
      return streams_.size();
    }
    /**
     * <code>repeated .orc.proto.Stream streams = 1;</code>
     */
    public Stream getStreams(int index) {
      return streams_.get(index);
    }
    /**
     * <code>repeated .orc.proto.Stream streams = 1;</code>
     */
    public StreamOrBuilder getStreamsOrBuilder(
        int index) {
      return streams_.get(index);
    }

    // repeated .orc.proto.ColumnEncoding columns = 2;
    public static final int COLUMNS_FIELD_NUMBER = 2;
    private java.util.List<ColumnEncoding> columns_;
    /**
     * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
     */
    public java.util.List<ColumnEncoding> getColumnsList() {
      return columns_;
    }
    /**
     * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
     */
    public java.util.List<? extends ColumnEncodingOrBuilder> 
        getColumnsOrBuilderList() {
      return columns_;
    }
    /**
     * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
     */
    public int getColumnsCount() {
      return columns_.size();
    }
    /**
     * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
     */
    public ColumnEncoding getColumns(int index) {
      return columns_.get(index);
    }
    /**
     * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
     */
    public ColumnEncodingOrBuilder getColumnsOrBuilder(
        int index) {
      return columns_.get(index);
    }

    // optional string writerTimezone = 3;
    public static final int WRITERTIMEZONE_FIELD_NUMBER = 3;
    private java.lang.Object writerTimezone_;
    /**
     * <code>optional string writerTimezone = 3;</code>
     */
    public boolean hasWriterTimezone() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string writerTimezone = 3;</code>
     */
    public java.lang.String getWriterTimezone() {
      java.lang.Object ref = writerTimezone_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          writerTimezone_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string writerTimezone = 3;</code>
     */
    public com.google.protobuf.ByteString
        getWriterTimezoneBytes() {
      java.lang.Object ref = writerTimezone_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        writerTimezone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      streams_ = java.util.Collections.emptyList();
      columns_ = java.util.Collections.emptyList();
      writerTimezone_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < streams_.size(); i++) {
        output.writeMessage(1, streams_.get(i));
      }
      for (int i = 0; i < columns_.size(); i++) {
        output.writeMessage(2, columns_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(3, getWriterTimezoneBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < streams_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, streams_.get(i));
      }
      for (int i = 0; i < columns_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, columns_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getWriterTimezoneBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static StripeFooter parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StripeFooter parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StripeFooter parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StripeFooter parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StripeFooter parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static StripeFooter parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static StripeFooter parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static StripeFooter parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static StripeFooter parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static StripeFooter parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(StripeFooter prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.StripeFooter}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements StripeFooterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_StripeFooter_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_StripeFooter_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                StripeFooter.class, StripeFooter.Builder.class);
      }

      // Construct using StripeFooter.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getStreamsFieldBuilder();
          getColumnsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (streamsBuilder_ == null) {
          streams_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          streamsBuilder_.clear();
        }
        if (columnsBuilder_ == null) {
          columns_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          columnsBuilder_.clear();
        }
        writerTimezone_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_StripeFooter_descriptor;
      }

      public StripeFooter getDefaultInstanceForType() {
        return StripeFooter.getDefaultInstance();
      }

      public StripeFooter build() {
        StripeFooter result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public StripeFooter buildPartial() {
        StripeFooter result = new StripeFooter(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (streamsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            streams_ = java.util.Collections.unmodifiableList(streams_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.streams_ = streams_;
        } else {
          result.streams_ = streamsBuilder_.build();
        }
        if (columnsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            columns_ = java.util.Collections.unmodifiableList(columns_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.columns_ = columns_;
        } else {
          result.columns_ = columnsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000001;
        }
        result.writerTimezone_ = writerTimezone_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof StripeFooter) {
          return mergeFrom((StripeFooter)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(StripeFooter other) {
        if (other == StripeFooter.getDefaultInstance()) return this;
        if (streamsBuilder_ == null) {
          if (!other.streams_.isEmpty()) {
            if (streams_.isEmpty()) {
              streams_ = other.streams_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStreamsIsMutable();
              streams_.addAll(other.streams_);
            }
            onChanged();
          }
        } else {
          if (!other.streams_.isEmpty()) {
            if (streamsBuilder_.isEmpty()) {
              streamsBuilder_.dispose();
              streamsBuilder_ = null;
              streams_ = other.streams_;
              bitField0_ = (bitField0_ & ~0x00000001);
              streamsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getStreamsFieldBuilder() : null;
            } else {
              streamsBuilder_.addAllMessages(other.streams_);
            }
          }
        }
        if (columnsBuilder_ == null) {
          if (!other.columns_.isEmpty()) {
            if (columns_.isEmpty()) {
              columns_ = other.columns_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureColumnsIsMutable();
              columns_.addAll(other.columns_);
            }
            onChanged();
          }
        } else {
          if (!other.columns_.isEmpty()) {
            if (columnsBuilder_.isEmpty()) {
              columnsBuilder_.dispose();
              columnsBuilder_ = null;
              columns_ = other.columns_;
              bitField0_ = (bitField0_ & ~0x00000002);
              columnsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getColumnsFieldBuilder() : null;
            } else {
              columnsBuilder_.addAllMessages(other.columns_);
            }
          }
        }
        if (other.hasWriterTimezone()) {
          bitField0_ |= 0x00000004;
          writerTimezone_ = other.writerTimezone_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        StripeFooter parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (StripeFooter) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated .orc.proto.Stream streams = 1;
      private java.util.List<Stream> streams_ =
        java.util.Collections.emptyList();
      private void ensureStreamsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          streams_ = new java.util.ArrayList<Stream>(streams_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          Stream, Stream.Builder, StreamOrBuilder> streamsBuilder_;

      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public java.util.List<Stream> getStreamsList() {
        if (streamsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(streams_);
        } else {
          return streamsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public int getStreamsCount() {
        if (streamsBuilder_ == null) {
          return streams_.size();
        } else {
          return streamsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public Stream getStreams(int index) {
        if (streamsBuilder_ == null) {
          return streams_.get(index);
        } else {
          return streamsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public Builder setStreams(
          int index, Stream value) {
        if (streamsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStreamsIsMutable();
          streams_.set(index, value);
          onChanged();
        } else {
          streamsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public Builder setStreams(
          int index, Stream.Builder builderForValue) {
        if (streamsBuilder_ == null) {
          ensureStreamsIsMutable();
          streams_.set(index, builderForValue.build());
          onChanged();
        } else {
          streamsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public Builder addStreams(Stream value) {
        if (streamsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStreamsIsMutable();
          streams_.add(value);
          onChanged();
        } else {
          streamsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public Builder addStreams(
          int index, Stream value) {
        if (streamsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStreamsIsMutable();
          streams_.add(index, value);
          onChanged();
        } else {
          streamsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public Builder addStreams(
          Stream.Builder builderForValue) {
        if (streamsBuilder_ == null) {
          ensureStreamsIsMutable();
          streams_.add(builderForValue.build());
          onChanged();
        } else {
          streamsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public Builder addStreams(
          int index, Stream.Builder builderForValue) {
        if (streamsBuilder_ == null) {
          ensureStreamsIsMutable();
          streams_.add(index, builderForValue.build());
          onChanged();
        } else {
          streamsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public Builder addAllStreams(
          java.lang.Iterable<? extends Stream> values) {
        if (streamsBuilder_ == null) {
          ensureStreamsIsMutable();
          super.addAll(values, streams_);
          onChanged();
        } else {
          streamsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public Builder clearStreams() {
        if (streamsBuilder_ == null) {
          streams_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          streamsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public Builder removeStreams(int index) {
        if (streamsBuilder_ == null) {
          ensureStreamsIsMutable();
          streams_.remove(index);
          onChanged();
        } else {
          streamsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public Stream.Builder getStreamsBuilder(
          int index) {
        return getStreamsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public StreamOrBuilder getStreamsOrBuilder(
          int index) {
        if (streamsBuilder_ == null) {
          return streams_.get(index);  } else {
          return streamsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public java.util.List<? extends StreamOrBuilder> 
           getStreamsOrBuilderList() {
        if (streamsBuilder_ != null) {
          return streamsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(streams_);
        }
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public Stream.Builder addStreamsBuilder() {
        return getStreamsFieldBuilder().addBuilder(
            Stream.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public Stream.Builder addStreamsBuilder(
          int index) {
        return getStreamsFieldBuilder().addBuilder(
            index, Stream.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.Stream streams = 1;</code>
       */
      public java.util.List<Stream.Builder> 
           getStreamsBuilderList() {
        return getStreamsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          Stream, Stream.Builder, StreamOrBuilder> 
          getStreamsFieldBuilder() {
        if (streamsBuilder_ == null) {
          streamsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              Stream, Stream.Builder, StreamOrBuilder>(
                  streams_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          streams_ = null;
        }
        return streamsBuilder_;
      }

      // repeated .orc.proto.ColumnEncoding columns = 2;
      private java.util.List<ColumnEncoding> columns_ =
        java.util.Collections.emptyList();
      private void ensureColumnsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          columns_ = new java.util.ArrayList<ColumnEncoding>(columns_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ColumnEncoding, ColumnEncoding.Builder, ColumnEncodingOrBuilder> columnsBuilder_;

      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public java.util.List<ColumnEncoding> getColumnsList() {
        if (columnsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(columns_);
        } else {
          return columnsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public int getColumnsCount() {
        if (columnsBuilder_ == null) {
          return columns_.size();
        } else {
          return columnsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public ColumnEncoding getColumns(int index) {
        if (columnsBuilder_ == null) {
          return columns_.get(index);
        } else {
          return columnsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public Builder setColumns(
          int index, ColumnEncoding value) {
        if (columnsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureColumnsIsMutable();
          columns_.set(index, value);
          onChanged();
        } else {
          columnsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public Builder setColumns(
          int index, ColumnEncoding.Builder builderForValue) {
        if (columnsBuilder_ == null) {
          ensureColumnsIsMutable();
          columns_.set(index, builderForValue.build());
          onChanged();
        } else {
          columnsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public Builder addColumns(ColumnEncoding value) {
        if (columnsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureColumnsIsMutable();
          columns_.add(value);
          onChanged();
        } else {
          columnsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public Builder addColumns(
          int index, ColumnEncoding value) {
        if (columnsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureColumnsIsMutable();
          columns_.add(index, value);
          onChanged();
        } else {
          columnsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public Builder addColumns(
          ColumnEncoding.Builder builderForValue) {
        if (columnsBuilder_ == null) {
          ensureColumnsIsMutable();
          columns_.add(builderForValue.build());
          onChanged();
        } else {
          columnsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public Builder addColumns(
          int index, ColumnEncoding.Builder builderForValue) {
        if (columnsBuilder_ == null) {
          ensureColumnsIsMutable();
          columns_.add(index, builderForValue.build());
          onChanged();
        } else {
          columnsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public Builder addAllColumns(
          java.lang.Iterable<? extends ColumnEncoding> values) {
        if (columnsBuilder_ == null) {
          ensureColumnsIsMutable();
          super.addAll(values, columns_);
          onChanged();
        } else {
          columnsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public Builder clearColumns() {
        if (columnsBuilder_ == null) {
          columns_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          columnsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public Builder removeColumns(int index) {
        if (columnsBuilder_ == null) {
          ensureColumnsIsMutable();
          columns_.remove(index);
          onChanged();
        } else {
          columnsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public ColumnEncoding.Builder getColumnsBuilder(
          int index) {
        return getColumnsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public ColumnEncodingOrBuilder getColumnsOrBuilder(
          int index) {
        if (columnsBuilder_ == null) {
          return columns_.get(index);  } else {
          return columnsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public java.util.List<? extends ColumnEncodingOrBuilder> 
           getColumnsOrBuilderList() {
        if (columnsBuilder_ != null) {
          return columnsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(columns_);
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public ColumnEncoding.Builder addColumnsBuilder() {
        return getColumnsFieldBuilder().addBuilder(
            ColumnEncoding.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public ColumnEncoding.Builder addColumnsBuilder(
          int index) {
        return getColumnsFieldBuilder().addBuilder(
            index, ColumnEncoding.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.ColumnEncoding columns = 2;</code>
       */
      public java.util.List<ColumnEncoding.Builder> 
           getColumnsBuilderList() {
        return getColumnsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ColumnEncoding, ColumnEncoding.Builder, ColumnEncodingOrBuilder> 
          getColumnsFieldBuilder() {
        if (columnsBuilder_ == null) {
          columnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ColumnEncoding, ColumnEncoding.Builder, ColumnEncodingOrBuilder>(
                  columns_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          columns_ = null;
        }
        return columnsBuilder_;
      }

      // optional string writerTimezone = 3;
      private java.lang.Object writerTimezone_ = "";
      /**
       * <code>optional string writerTimezone = 3;</code>
       */
      public boolean hasWriterTimezone() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string writerTimezone = 3;</code>
       */
      public java.lang.String getWriterTimezone() {
        java.lang.Object ref = writerTimezone_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          writerTimezone_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string writerTimezone = 3;</code>
       */
      public com.google.protobuf.ByteString
          getWriterTimezoneBytes() {
        java.lang.Object ref = writerTimezone_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          writerTimezone_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string writerTimezone = 3;</code>
       */
      public Builder setWriterTimezone(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        writerTimezone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string writerTimezone = 3;</code>
       */
      public Builder clearWriterTimezone() {
        bitField0_ = (bitField0_ & ~0x00000004);
        writerTimezone_ = getDefaultInstance().getWriterTimezone();
        onChanged();
        return this;
      }
      /**
       * <code>optional string writerTimezone = 3;</code>
       */
      public Builder setWriterTimezoneBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        writerTimezone_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.StripeFooter)
    }

    static {
      defaultInstance = new StripeFooter(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.StripeFooter)
  }

  public interface TypeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional .orc.proto.Type.Kind kind = 1;
    /**
     * <code>optional .orc.proto.Type.Kind kind = 1;</code>
     */
    boolean hasKind();
    /**
     * <code>optional .orc.proto.Type.Kind kind = 1;</code>
     */
    Type.Kind getKind();

    // repeated uint32 subtypes = 2 [packed = true];
    /**
     * <code>repeated uint32 subtypes = 2 [packed = true];</code>
     */
    java.util.List<java.lang.Integer> getSubtypesList();
    /**
     * <code>repeated uint32 subtypes = 2 [packed = true];</code>
     */
    int getSubtypesCount();
    /**
     * <code>repeated uint32 subtypes = 2 [packed = true];</code>
     */
    int getSubtypes(int index);

    // repeated string fieldNames = 3;
    /**
     * <code>repeated string fieldNames = 3;</code>
     */
    java.util.List<java.lang.String>
    getFieldNamesList();
    /**
     * <code>repeated string fieldNames = 3;</code>
     */
    int getFieldNamesCount();
    /**
     * <code>repeated string fieldNames = 3;</code>
     */
    java.lang.String getFieldNames(int index);
    /**
     * <code>repeated string fieldNames = 3;</code>
     */
    com.google.protobuf.ByteString
        getFieldNamesBytes(int index);

    // optional uint32 maximumLength = 4;
    /**
     * <code>optional uint32 maximumLength = 4;</code>
     */
    boolean hasMaximumLength();
    /**
     * <code>optional uint32 maximumLength = 4;</code>
     */
    int getMaximumLength();

    // optional uint32 precision = 5;
    /**
     * <code>optional uint32 precision = 5;</code>
     */
    boolean hasPrecision();
    /**
     * <code>optional uint32 precision = 5;</code>
     */
    int getPrecision();

    // optional uint32 scale = 6;
    /**
     * <code>optional uint32 scale = 6;</code>
     */
    boolean hasScale();
    /**
     * <code>optional uint32 scale = 6;</code>
     */
    int getScale();
  }
  /**
   * Protobuf type {@code orc.proto.Type}
   */
  public static final class Type extends
      com.google.protobuf.GeneratedMessage
      implements TypeOrBuilder {
    // Use Type.newBuilder() to construct.
    private Type(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Type(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Type defaultInstance;
    public static Type getDefaultInstance() {
      return defaultInstance;
    }

    public Type getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Type(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              Type.Kind value = Type.Kind.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                kind_ = value;
              }
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                subtypes_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              subtypes_.add(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                subtypes_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                subtypes_.add(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                fieldNames_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000004;
              }
              fieldNames_.add(input.readBytes());
              break;
            }
            case 32: {
              bitField0_ |= 0x00000002;
              maximumLength_ = input.readUInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000004;
              precision_ = input.readUInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000008;
              scale_ = input.readUInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          subtypes_ = java.util.Collections.unmodifiableList(subtypes_);
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          fieldNames_ = new com.google.protobuf.UnmodifiableLazyStringList(fieldNames_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_Type_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_Type_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Type.class, Type.Builder.class);
    }

    public static com.google.protobuf.Parser<Type> PARSER =
        new com.google.protobuf.AbstractParser<Type>() {
      public Type parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Type(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Type> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code orc.proto.Type.Kind}
     */
    public enum Kind
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>BOOLEAN = 0;</code>
       */
      BOOLEAN(0, 0),
      /**
       * <code>BYTE = 1;</code>
       */
      BYTE(1, 1),
      /**
       * <code>SHORT = 2;</code>
       */
      SHORT(2, 2),
      /**
       * <code>INT = 3;</code>
       */
      INT(3, 3),
      /**
       * <code>LONG = 4;</code>
       */
      LONG(4, 4),
      /**
       * <code>FLOAT = 5;</code>
       */
      FLOAT(5, 5),
      /**
       * <code>DOUBLE = 6;</code>
       */
      DOUBLE(6, 6),
      /**
       * <code>STRING = 7;</code>
       */
      STRING(7, 7),
      /**
       * <code>BINARY = 8;</code>
       */
      BINARY(8, 8),
      /**
       * <code>TIMESTAMP = 9;</code>
       */
      TIMESTAMP(9, 9),
      /**
       * <code>LIST = 10;</code>
       */
      LIST(10, 10),
      /**
       * <code>MAP = 11;</code>
       */
      MAP(11, 11),
      /**
       * <code>STRUCT = 12;</code>
       */
      STRUCT(12, 12),
      /**
       * <code>UNION = 13;</code>
       */
      UNION(13, 13),
      /**
       * <code>DECIMAL = 14;</code>
       */
      DECIMAL(14, 14),
      /**
       * <code>DATE = 15;</code>
       */
      DATE(15, 15),
      /**
       * <code>VARCHAR = 16;</code>
       */
      VARCHAR(16, 16),
      /**
       * <code>CHAR = 17;</code>
       */
      CHAR(17, 17),
      ;

      /**
       * <code>BOOLEAN = 0;</code>
       */
      public static final int BOOLEAN_VALUE = 0;
      /**
       * <code>BYTE = 1;</code>
       */
      public static final int BYTE_VALUE = 1;
      /**
       * <code>SHORT = 2;</code>
       */
      public static final int SHORT_VALUE = 2;
      /**
       * <code>INT = 3;</code>
       */
      public static final int INT_VALUE = 3;
      /**
       * <code>LONG = 4;</code>
       */
      public static final int LONG_VALUE = 4;
      /**
       * <code>FLOAT = 5;</code>
       */
      public static final int FLOAT_VALUE = 5;
      /**
       * <code>DOUBLE = 6;</code>
       */
      public static final int DOUBLE_VALUE = 6;
      /**
       * <code>STRING = 7;</code>
       */
      public static final int STRING_VALUE = 7;
      /**
       * <code>BINARY = 8;</code>
       */
      public static final int BINARY_VALUE = 8;
      /**
       * <code>TIMESTAMP = 9;</code>
       */
      public static final int TIMESTAMP_VALUE = 9;
      /**
       * <code>LIST = 10;</code>
       */
      public static final int LIST_VALUE = 10;
      /**
       * <code>MAP = 11;</code>
       */
      public static final int MAP_VALUE = 11;
      /**
       * <code>STRUCT = 12;</code>
       */
      public static final int STRUCT_VALUE = 12;
      /**
       * <code>UNION = 13;</code>
       */
      public static final int UNION_VALUE = 13;
      /**
       * <code>DECIMAL = 14;</code>
       */
      public static final int DECIMAL_VALUE = 14;
      /**
       * <code>DATE = 15;</code>
       */
      public static final int DATE_VALUE = 15;
      /**
       * <code>VARCHAR = 16;</code>
       */
      public static final int VARCHAR_VALUE = 16;
      /**
       * <code>CHAR = 17;</code>
       */
      public static final int CHAR_VALUE = 17;


      public final int getNumber() { return value; }

      public static Kind valueOf(int value) {
        switch (value) {
          case 0: return BOOLEAN;
          case 1: return BYTE;
          case 2: return SHORT;
          case 3: return INT;
          case 4: return LONG;
          case 5: return FLOAT;
          case 6: return DOUBLE;
          case 7: return STRING;
          case 8: return BINARY;
          case 9: return TIMESTAMP;
          case 10: return LIST;
          case 11: return MAP;
          case 12: return STRUCT;
          case 13: return UNION;
          case 14: return DECIMAL;
          case 15: return DATE;
          case 16: return VARCHAR;
          case 17: return CHAR;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Kind>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Kind>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Kind>() {
              public Kind findValueByNumber(int number) {
                return Kind.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return Type.getDescriptor().getEnumTypes().get(0);
      }

      private static final Kind[] VALUES = values();

      public static Kind valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Kind(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:orc.proto.Type.Kind)
    }

    private int bitField0_;
    // optional .orc.proto.Type.Kind kind = 1;
    public static final int KIND_FIELD_NUMBER = 1;
    private Type.Kind kind_;
    /**
     * <code>optional .orc.proto.Type.Kind kind = 1;</code>
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .orc.proto.Type.Kind kind = 1;</code>
     */
    public Type.Kind getKind() {
      return kind_;
    }

    // repeated uint32 subtypes = 2 [packed = true];
    public static final int SUBTYPES_FIELD_NUMBER = 2;
    private java.util.List<java.lang.Integer> subtypes_;
    /**
     * <code>repeated uint32 subtypes = 2 [packed = true];</code>
     */
    public java.util.List<java.lang.Integer>
        getSubtypesList() {
      return subtypes_;
    }
    /**
     * <code>repeated uint32 subtypes = 2 [packed = true];</code>
     */
    public int getSubtypesCount() {
      return subtypes_.size();
    }
    /**
     * <code>repeated uint32 subtypes = 2 [packed = true];</code>
     */
    public int getSubtypes(int index) {
      return subtypes_.get(index);
    }
    private int subtypesMemoizedSerializedSize = -1;

    // repeated string fieldNames = 3;
    public static final int FIELDNAMES_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList fieldNames_;
    /**
     * <code>repeated string fieldNames = 3;</code>
     */
    public java.util.List<java.lang.String>
        getFieldNamesList() {
      return fieldNames_;
    }
    /**
     * <code>repeated string fieldNames = 3;</code>
     */
    public int getFieldNamesCount() {
      return fieldNames_.size();
    }
    /**
     * <code>repeated string fieldNames = 3;</code>
     */
    public java.lang.String getFieldNames(int index) {
      return fieldNames_.get(index);
    }
    /**
     * <code>repeated string fieldNames = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFieldNamesBytes(int index) {
      return fieldNames_.getByteString(index);
    }

    // optional uint32 maximumLength = 4;
    public static final int MAXIMUMLENGTH_FIELD_NUMBER = 4;
    private int maximumLength_;
    /**
     * <code>optional uint32 maximumLength = 4;</code>
     */
    public boolean hasMaximumLength() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 maximumLength = 4;</code>
     */
    public int getMaximumLength() {
      return maximumLength_;
    }

    // optional uint32 precision = 5;
    public static final int PRECISION_FIELD_NUMBER = 5;
    private int precision_;
    /**
     * <code>optional uint32 precision = 5;</code>
     */
    public boolean hasPrecision() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint32 precision = 5;</code>
     */
    public int getPrecision() {
      return precision_;
    }

    // optional uint32 scale = 6;
    public static final int SCALE_FIELD_NUMBER = 6;
    private int scale_;
    /**
     * <code>optional uint32 scale = 6;</code>
     */
    public boolean hasScale() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint32 scale = 6;</code>
     */
    public int getScale() {
      return scale_;
    }

    private void initFields() {
      kind_ = Type.Kind.BOOLEAN;
      subtypes_ = java.util.Collections.emptyList();
      fieldNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      maximumLength_ = 0;
      precision_ = 0;
      scale_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, kind_.getNumber());
      }
      if (getSubtypesList().size() > 0) {
        output.writeRawVarint32(18);
        output.writeRawVarint32(subtypesMemoizedSerializedSize);
      }
      for (int i = 0; i < subtypes_.size(); i++) {
        output.writeUInt32NoTag(subtypes_.get(i));
      }
      for (int i = 0; i < fieldNames_.size(); i++) {
        output.writeBytes(3, fieldNames_.getByteString(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(4, maximumLength_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(5, precision_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(6, scale_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, kind_.getNumber());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < subtypes_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(subtypes_.get(i));
        }
        size += dataSize;
        if (!getSubtypesList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        subtypesMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fieldNames_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(fieldNames_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getFieldNamesList().size();
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, maximumLength_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, precision_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, scale_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static Type parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Type parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Type parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Type parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Type parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Type parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Type parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Type parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Type parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Type parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Type prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.Type}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements TypeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_Type_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_Type_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Type.class, Type.Builder.class);
      }

      // Construct using Type.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        kind_ = Type.Kind.BOOLEAN;
        bitField0_ = (bitField0_ & ~0x00000001);
        subtypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        fieldNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        maximumLength_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        precision_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        scale_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_Type_descriptor;
      }

      public Type getDefaultInstanceForType() {
        return Type.getDefaultInstance();
      }

      public Type build() {
        Type result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Type buildPartial() {
        Type result = new Type(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.kind_ = kind_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          subtypes_ = java.util.Collections.unmodifiableList(subtypes_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.subtypes_ = subtypes_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          fieldNames_ = new com.google.protobuf.UnmodifiableLazyStringList(
              fieldNames_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.fieldNames_ = fieldNames_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000002;
        }
        result.maximumLength_ = maximumLength_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000004;
        }
        result.precision_ = precision_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000008;
        }
        result.scale_ = scale_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Type) {
          return mergeFrom((Type)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Type other) {
        if (other == Type.getDefaultInstance()) return this;
        if (other.hasKind()) {
          setKind(other.getKind());
        }
        if (!other.subtypes_.isEmpty()) {
          if (subtypes_.isEmpty()) {
            subtypes_ = other.subtypes_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSubtypesIsMutable();
            subtypes_.addAll(other.subtypes_);
          }
          onChanged();
        }
        if (!other.fieldNames_.isEmpty()) {
          if (fieldNames_.isEmpty()) {
            fieldNames_ = other.fieldNames_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureFieldNamesIsMutable();
            fieldNames_.addAll(other.fieldNames_);
          }
          onChanged();
        }
        if (other.hasMaximumLength()) {
          setMaximumLength(other.getMaximumLength());
        }
        if (other.hasPrecision()) {
          setPrecision(other.getPrecision());
        }
        if (other.hasScale()) {
          setScale(other.getScale());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Type parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Type) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional .orc.proto.Type.Kind kind = 1;
      private Type.Kind kind_ = Type.Kind.BOOLEAN;
      /**
       * <code>optional .orc.proto.Type.Kind kind = 1;</code>
       */
      public boolean hasKind() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .orc.proto.Type.Kind kind = 1;</code>
       */
      public Type.Kind getKind() {
        return kind_;
      }
      /**
       * <code>optional .orc.proto.Type.Kind kind = 1;</code>
       */
      public Builder setKind(Type.Kind value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        kind_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .orc.proto.Type.Kind kind = 1;</code>
       */
      public Builder clearKind() {
        bitField0_ = (bitField0_ & ~0x00000001);
        kind_ = Type.Kind.BOOLEAN;
        onChanged();
        return this;
      }

      // repeated uint32 subtypes = 2 [packed = true];
      private java.util.List<java.lang.Integer> subtypes_ = java.util.Collections.emptyList();
      private void ensureSubtypesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          subtypes_ = new java.util.ArrayList<java.lang.Integer>(subtypes_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 subtypes = 2 [packed = true];</code>
       */
      public java.util.List<java.lang.Integer>
          getSubtypesList() {
        return java.util.Collections.unmodifiableList(subtypes_);
      }
      /**
       * <code>repeated uint32 subtypes = 2 [packed = true];</code>
       */
      public int getSubtypesCount() {
        return subtypes_.size();
      }
      /**
       * <code>repeated uint32 subtypes = 2 [packed = true];</code>
       */
      public int getSubtypes(int index) {
        return subtypes_.get(index);
      }
      /**
       * <code>repeated uint32 subtypes = 2 [packed = true];</code>
       */
      public Builder setSubtypes(
          int index, int value) {
        ensureSubtypesIsMutable();
        subtypes_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 subtypes = 2 [packed = true];</code>
       */
      public Builder addSubtypes(int value) {
        ensureSubtypesIsMutable();
        subtypes_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 subtypes = 2 [packed = true];</code>
       */
      public Builder addAllSubtypes(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSubtypesIsMutable();
        super.addAll(values, subtypes_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 subtypes = 2 [packed = true];</code>
       */
      public Builder clearSubtypes() {
        subtypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      // repeated string fieldNames = 3;
      private com.google.protobuf.LazyStringList fieldNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureFieldNamesIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          fieldNames_ = new com.google.protobuf.LazyStringArrayList(fieldNames_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated string fieldNames = 3;</code>
       */
      public java.util.List<java.lang.String>
          getFieldNamesList() {
        return java.util.Collections.unmodifiableList(fieldNames_);
      }
      /**
       * <code>repeated string fieldNames = 3;</code>
       */
      public int getFieldNamesCount() {
        return fieldNames_.size();
      }
      /**
       * <code>repeated string fieldNames = 3;</code>
       */
      public java.lang.String getFieldNames(int index) {
        return fieldNames_.get(index);
      }
      /**
       * <code>repeated string fieldNames = 3;</code>
       */
      public com.google.protobuf.ByteString
          getFieldNamesBytes(int index) {
        return fieldNames_.getByteString(index);
      }
      /**
       * <code>repeated string fieldNames = 3;</code>
       */
      public Builder setFieldNames(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFieldNamesIsMutable();
        fieldNames_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string fieldNames = 3;</code>
       */
      public Builder addFieldNames(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFieldNamesIsMutable();
        fieldNames_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string fieldNames = 3;</code>
       */
      public Builder addAllFieldNames(
          java.lang.Iterable<java.lang.String> values) {
        ensureFieldNamesIsMutable();
        super.addAll(values, fieldNames_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string fieldNames = 3;</code>
       */
      public Builder clearFieldNames() {
        fieldNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string fieldNames = 3;</code>
       */
      public Builder addFieldNamesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFieldNamesIsMutable();
        fieldNames_.add(value);
        onChanged();
        return this;
      }

      // optional uint32 maximumLength = 4;
      private int maximumLength_ ;
      /**
       * <code>optional uint32 maximumLength = 4;</code>
       */
      public boolean hasMaximumLength() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional uint32 maximumLength = 4;</code>
       */
      public int getMaximumLength() {
        return maximumLength_;
      }
      /**
       * <code>optional uint32 maximumLength = 4;</code>
       */
      public Builder setMaximumLength(int value) {
        bitField0_ |= 0x00000008;
        maximumLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 maximumLength = 4;</code>
       */
      public Builder clearMaximumLength() {
        bitField0_ = (bitField0_ & ~0x00000008);
        maximumLength_ = 0;
        onChanged();
        return this;
      }

      // optional uint32 precision = 5;
      private int precision_ ;
      /**
       * <code>optional uint32 precision = 5;</code>
       */
      public boolean hasPrecision() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional uint32 precision = 5;</code>
       */
      public int getPrecision() {
        return precision_;
      }
      /**
       * <code>optional uint32 precision = 5;</code>
       */
      public Builder setPrecision(int value) {
        bitField0_ |= 0x00000010;
        precision_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 precision = 5;</code>
       */
      public Builder clearPrecision() {
        bitField0_ = (bitField0_ & ~0x00000010);
        precision_ = 0;
        onChanged();
        return this;
      }

      // optional uint32 scale = 6;
      private int scale_ ;
      /**
       * <code>optional uint32 scale = 6;</code>
       */
      public boolean hasScale() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional uint32 scale = 6;</code>
       */
      public int getScale() {
        return scale_;
      }
      /**
       * <code>optional uint32 scale = 6;</code>
       */
      public Builder setScale(int value) {
        bitField0_ |= 0x00000020;
        scale_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 scale = 6;</code>
       */
      public Builder clearScale() {
        bitField0_ = (bitField0_ & ~0x00000020);
        scale_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.Type)
    }

    static {
      defaultInstance = new Type(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.Type)
  }

  public interface StripeInformationOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional uint64 offset = 1;
    /**
     * <code>optional uint64 offset = 1;</code>
     */
    boolean hasOffset();
    /**
     * <code>optional uint64 offset = 1;</code>
     */
    long getOffset();

    // optional uint64 indexLength = 2;
    /**
     * <code>optional uint64 indexLength = 2;</code>
     */
    boolean hasIndexLength();
    /**
     * <code>optional uint64 indexLength = 2;</code>
     */
    long getIndexLength();

    // optional uint64 dataLength = 3;
    /**
     * <code>optional uint64 dataLength = 3;</code>
     */
    boolean hasDataLength();
    /**
     * <code>optional uint64 dataLength = 3;</code>
     */
    long getDataLength();

    // optional uint64 footerLength = 4;
    /**
     * <code>optional uint64 footerLength = 4;</code>
     */
    boolean hasFooterLength();
    /**
     * <code>optional uint64 footerLength = 4;</code>
     */
    long getFooterLength();

    // optional uint64 numberOfRows = 5;
    /**
     * <code>optional uint64 numberOfRows = 5;</code>
     */
    boolean hasNumberOfRows();
    /**
     * <code>optional uint64 numberOfRows = 5;</code>
     */
    long getNumberOfRows();
  }
  /**
   * Protobuf type {@code orc.proto.StripeInformation}
   */
  public static final class StripeInformation extends
      com.google.protobuf.GeneratedMessage
      implements StripeInformationOrBuilder {
    // Use StripeInformation.newBuilder() to construct.
    private StripeInformation(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StripeInformation(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StripeInformation defaultInstance;
    public static StripeInformation getDefaultInstance() {
      return defaultInstance;
    }

    public StripeInformation getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StripeInformation(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              offset_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              indexLength_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              dataLength_ = input.readUInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              footerLength_ = input.readUInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              numberOfRows_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_StripeInformation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_StripeInformation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StripeInformation.class, StripeInformation.Builder.class);
    }

    public static com.google.protobuf.Parser<StripeInformation> PARSER =
        new com.google.protobuf.AbstractParser<StripeInformation>() {
      public StripeInformation parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StripeInformation(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StripeInformation> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional uint64 offset = 1;
    public static final int OFFSET_FIELD_NUMBER = 1;
    private long offset_;
    /**
     * <code>optional uint64 offset = 1;</code>
     */
    public boolean hasOffset() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 offset = 1;</code>
     */
    public long getOffset() {
      return offset_;
    }

    // optional uint64 indexLength = 2;
    public static final int INDEXLENGTH_FIELD_NUMBER = 2;
    private long indexLength_;
    /**
     * <code>optional uint64 indexLength = 2;</code>
     */
    public boolean hasIndexLength() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 indexLength = 2;</code>
     */
    public long getIndexLength() {
      return indexLength_;
    }

    // optional uint64 dataLength = 3;
    public static final int DATALENGTH_FIELD_NUMBER = 3;
    private long dataLength_;
    /**
     * <code>optional uint64 dataLength = 3;</code>
     */
    public boolean hasDataLength() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint64 dataLength = 3;</code>
     */
    public long getDataLength() {
      return dataLength_;
    }

    // optional uint64 footerLength = 4;
    public static final int FOOTERLENGTH_FIELD_NUMBER = 4;
    private long footerLength_;
    /**
     * <code>optional uint64 footerLength = 4;</code>
     */
    public boolean hasFooterLength() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint64 footerLength = 4;</code>
     */
    public long getFooterLength() {
      return footerLength_;
    }

    // optional uint64 numberOfRows = 5;
    public static final int NUMBEROFROWS_FIELD_NUMBER = 5;
    private long numberOfRows_;
    /**
     * <code>optional uint64 numberOfRows = 5;</code>
     */
    public boolean hasNumberOfRows() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional uint64 numberOfRows = 5;</code>
     */
    public long getNumberOfRows() {
      return numberOfRows_;
    }

    private void initFields() {
      offset_ = 0L;
      indexLength_ = 0L;
      dataLength_ = 0L;
      footerLength_ = 0L;
      numberOfRows_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, offset_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, indexLength_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, dataLength_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt64(4, footerLength_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt64(5, numberOfRows_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, offset_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, indexLength_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, dataLength_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, footerLength_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, numberOfRows_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static StripeInformation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StripeInformation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StripeInformation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StripeInformation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StripeInformation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static StripeInformation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static StripeInformation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static StripeInformation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static StripeInformation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static StripeInformation parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(StripeInformation prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.StripeInformation}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements StripeInformationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_StripeInformation_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_StripeInformation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                StripeInformation.class, StripeInformation.Builder.class);
      }

      // Construct using StripeInformation.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        offset_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        indexLength_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        dataLength_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        footerLength_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        numberOfRows_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_StripeInformation_descriptor;
      }

      public StripeInformation getDefaultInstanceForType() {
        return StripeInformation.getDefaultInstance();
      }

      public StripeInformation build() {
        StripeInformation result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public StripeInformation buildPartial() {
        StripeInformation result = new StripeInformation(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.offset_ = offset_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.indexLength_ = indexLength_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.dataLength_ = dataLength_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.footerLength_ = footerLength_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.numberOfRows_ = numberOfRows_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof StripeInformation) {
          return mergeFrom((StripeInformation)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(StripeInformation other) {
        if (other == StripeInformation.getDefaultInstance()) return this;
        if (other.hasOffset()) {
          setOffset(other.getOffset());
        }
        if (other.hasIndexLength()) {
          setIndexLength(other.getIndexLength());
        }
        if (other.hasDataLength()) {
          setDataLength(other.getDataLength());
        }
        if (other.hasFooterLength()) {
          setFooterLength(other.getFooterLength());
        }
        if (other.hasNumberOfRows()) {
          setNumberOfRows(other.getNumberOfRows());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        StripeInformation parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (StripeInformation) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional uint64 offset = 1;
      private long offset_ ;
      /**
       * <code>optional uint64 offset = 1;</code>
       */
      public boolean hasOffset() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint64 offset = 1;</code>
       */
      public long getOffset() {
        return offset_;
      }
      /**
       * <code>optional uint64 offset = 1;</code>
       */
      public Builder setOffset(long value) {
        bitField0_ |= 0x00000001;
        offset_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 offset = 1;</code>
       */
      public Builder clearOffset() {
        bitField0_ = (bitField0_ & ~0x00000001);
        offset_ = 0L;
        onChanged();
        return this;
      }

      // optional uint64 indexLength = 2;
      private long indexLength_ ;
      /**
       * <code>optional uint64 indexLength = 2;</code>
       */
      public boolean hasIndexLength() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint64 indexLength = 2;</code>
       */
      public long getIndexLength() {
        return indexLength_;
      }
      /**
       * <code>optional uint64 indexLength = 2;</code>
       */
      public Builder setIndexLength(long value) {
        bitField0_ |= 0x00000002;
        indexLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 indexLength = 2;</code>
       */
      public Builder clearIndexLength() {
        bitField0_ = (bitField0_ & ~0x00000002);
        indexLength_ = 0L;
        onChanged();
        return this;
      }

      // optional uint64 dataLength = 3;
      private long dataLength_ ;
      /**
       * <code>optional uint64 dataLength = 3;</code>
       */
      public boolean hasDataLength() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint64 dataLength = 3;</code>
       */
      public long getDataLength() {
        return dataLength_;
      }
      /**
       * <code>optional uint64 dataLength = 3;</code>
       */
      public Builder setDataLength(long value) {
        bitField0_ |= 0x00000004;
        dataLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 dataLength = 3;</code>
       */
      public Builder clearDataLength() {
        bitField0_ = (bitField0_ & ~0x00000004);
        dataLength_ = 0L;
        onChanged();
        return this;
      }

      // optional uint64 footerLength = 4;
      private long footerLength_ ;
      /**
       * <code>optional uint64 footerLength = 4;</code>
       */
      public boolean hasFooterLength() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional uint64 footerLength = 4;</code>
       */
      public long getFooterLength() {
        return footerLength_;
      }
      /**
       * <code>optional uint64 footerLength = 4;</code>
       */
      public Builder setFooterLength(long value) {
        bitField0_ |= 0x00000008;
        footerLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 footerLength = 4;</code>
       */
      public Builder clearFooterLength() {
        bitField0_ = (bitField0_ & ~0x00000008);
        footerLength_ = 0L;
        onChanged();
        return this;
      }

      // optional uint64 numberOfRows = 5;
      private long numberOfRows_ ;
      /**
       * <code>optional uint64 numberOfRows = 5;</code>
       */
      public boolean hasNumberOfRows() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional uint64 numberOfRows = 5;</code>
       */
      public long getNumberOfRows() {
        return numberOfRows_;
      }
      /**
       * <code>optional uint64 numberOfRows = 5;</code>
       */
      public Builder setNumberOfRows(long value) {
        bitField0_ |= 0x00000010;
        numberOfRows_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 numberOfRows = 5;</code>
       */
      public Builder clearNumberOfRows() {
        bitField0_ = (bitField0_ & ~0x00000010);
        numberOfRows_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.StripeInformation)
    }

    static {
      defaultInstance = new StripeInformation(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.StripeInformation)
  }

  public interface UserMetadataItemOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string name = 1;
    /**
     * <code>optional string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    // optional bytes value = 2;
    /**
     * <code>optional bytes value = 2;</code>
     */
    boolean hasValue();
    /**
     * <code>optional bytes value = 2;</code>
     */
    com.google.protobuf.ByteString getValue();
  }
  /**
   * Protobuf type {@code orc.proto.UserMetadataItem}
   */
  public static final class UserMetadataItem extends
      com.google.protobuf.GeneratedMessage
      implements UserMetadataItemOrBuilder {
    // Use UserMetadataItem.newBuilder() to construct.
    private UserMetadataItem(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private UserMetadataItem(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final UserMetadataItem defaultInstance;
    public static UserMetadataItem getDefaultInstance() {
      return defaultInstance;
    }

    public UserMetadataItem getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private UserMetadataItem(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              name_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              value_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_UserMetadataItem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_UserMetadataItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UserMetadataItem.class, UserMetadataItem.Builder.class);
    }

    public static com.google.protobuf.Parser<UserMetadataItem> PARSER =
        new com.google.protobuf.AbstractParser<UserMetadataItem>() {
      public UserMetadataItem parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserMetadataItem(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<UserMetadataItem> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    /**
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional bytes value = 2;
    public static final int VALUE_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString value_;
    /**
     * <code>optional bytes value = 2;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bytes value = 2;</code>
     */
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }

    private void initFields() {
      name_ = "";
      value_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, value_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, value_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static UserMetadataItem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static UserMetadataItem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static UserMetadataItem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static UserMetadataItem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static UserMetadataItem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static UserMetadataItem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static UserMetadataItem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static UserMetadataItem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static UserMetadataItem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static UserMetadataItem parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(UserMetadataItem prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.UserMetadataItem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements UserMetadataItemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_UserMetadataItem_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_UserMetadataItem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                UserMetadataItem.class, UserMetadataItem.Builder.class);
      }

      // Construct using UserMetadataItem.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_UserMetadataItem_descriptor;
      }

      public UserMetadataItem getDefaultInstanceForType() {
        return UserMetadataItem.getDefaultInstance();
      }

      public UserMetadataItem build() {
        UserMetadataItem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public UserMetadataItem buildPartial() {
        UserMetadataItem result = new UserMetadataItem(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.value_ = value_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof UserMetadataItem) {
          return mergeFrom((UserMetadataItem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(UserMetadataItem other) {
        if (other == UserMetadataItem.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasValue()) {
          setValue(other.getValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        UserMetadataItem parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (UserMetadataItem) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string name = 1;
      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      // optional bytes value = 2;
      private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes value = 2;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bytes value = 2;</code>
       */
      public com.google.protobuf.ByteString getValue() {
        return value_;
      }
      /**
       * <code>optional bytes value = 2;</code>
       */
      public Builder setValue(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes value = 2;</code>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.UserMetadataItem)
    }

    static {
      defaultInstance = new UserMetadataItem(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.UserMetadataItem)
  }

  public interface StripeStatisticsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated .orc.proto.ColumnStatistics colStats = 1;
    /**
     * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
     */
    java.util.List<ColumnStatistics> 
        getColStatsList();
    /**
     * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
     */
    ColumnStatistics getColStats(int index);
    /**
     * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
     */
    int getColStatsCount();
    /**
     * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
     */
    java.util.List<? extends ColumnStatisticsOrBuilder> 
        getColStatsOrBuilderList();
    /**
     * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
     */
    ColumnStatisticsOrBuilder getColStatsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code orc.proto.StripeStatistics}
   */
  public static final class StripeStatistics extends
      com.google.protobuf.GeneratedMessage
      implements StripeStatisticsOrBuilder {
    // Use StripeStatistics.newBuilder() to construct.
    private StripeStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StripeStatistics(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StripeStatistics defaultInstance;
    public static StripeStatistics getDefaultInstance() {
      return defaultInstance;
    }

    public StripeStatistics getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StripeStatistics(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                colStats_ = new java.util.ArrayList<ColumnStatistics>();
                mutable_bitField0_ |= 0x00000001;
              }
              colStats_.add(input.readMessage(ColumnStatistics.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          colStats_ = java.util.Collections.unmodifiableList(colStats_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_StripeStatistics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_StripeStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              StripeStatistics.class, StripeStatistics.Builder.class);
    }

    public static com.google.protobuf.Parser<StripeStatistics> PARSER =
        new com.google.protobuf.AbstractParser<StripeStatistics>() {
      public StripeStatistics parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StripeStatistics(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StripeStatistics> getParserForType() {
      return PARSER;
    }

    // repeated .orc.proto.ColumnStatistics colStats = 1;
    public static final int COLSTATS_FIELD_NUMBER = 1;
    private java.util.List<ColumnStatistics> colStats_;
    /**
     * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
     */
    public java.util.List<ColumnStatistics> getColStatsList() {
      return colStats_;
    }
    /**
     * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
     */
    public java.util.List<? extends ColumnStatisticsOrBuilder> 
        getColStatsOrBuilderList() {
      return colStats_;
    }
    /**
     * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
     */
    public int getColStatsCount() {
      return colStats_.size();
    }
    /**
     * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
     */
    public ColumnStatistics getColStats(int index) {
      return colStats_.get(index);
    }
    /**
     * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
     */
    public ColumnStatisticsOrBuilder getColStatsOrBuilder(
        int index) {
      return colStats_.get(index);
    }

    private void initFields() {
      colStats_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < colStats_.size(); i++) {
        output.writeMessage(1, colStats_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < colStats_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, colStats_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static StripeStatistics parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StripeStatistics parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StripeStatistics parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static StripeStatistics parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static StripeStatistics parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static StripeStatistics parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static StripeStatistics parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static StripeStatistics parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static StripeStatistics parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static StripeStatistics parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(StripeStatistics prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.StripeStatistics}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements StripeStatisticsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_StripeStatistics_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_StripeStatistics_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                StripeStatistics.class, StripeStatistics.Builder.class);
      }

      // Construct using StripeStatistics.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getColStatsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (colStatsBuilder_ == null) {
          colStats_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          colStatsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_StripeStatistics_descriptor;
      }

      public StripeStatistics getDefaultInstanceForType() {
        return StripeStatistics.getDefaultInstance();
      }

      public StripeStatistics build() {
        StripeStatistics result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public StripeStatistics buildPartial() {
        StripeStatistics result = new StripeStatistics(this);
        int from_bitField0_ = bitField0_;
        if (colStatsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            colStats_ = java.util.Collections.unmodifiableList(colStats_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.colStats_ = colStats_;
        } else {
          result.colStats_ = colStatsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof StripeStatistics) {
          return mergeFrom((StripeStatistics)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(StripeStatistics other) {
        if (other == StripeStatistics.getDefaultInstance()) return this;
        if (colStatsBuilder_ == null) {
          if (!other.colStats_.isEmpty()) {
            if (colStats_.isEmpty()) {
              colStats_ = other.colStats_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureColStatsIsMutable();
              colStats_.addAll(other.colStats_);
            }
            onChanged();
          }
        } else {
          if (!other.colStats_.isEmpty()) {
            if (colStatsBuilder_.isEmpty()) {
              colStatsBuilder_.dispose();
              colStatsBuilder_ = null;
              colStats_ = other.colStats_;
              bitField0_ = (bitField0_ & ~0x00000001);
              colStatsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getColStatsFieldBuilder() : null;
            } else {
              colStatsBuilder_.addAllMessages(other.colStats_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        StripeStatistics parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (StripeStatistics) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated .orc.proto.ColumnStatistics colStats = 1;
      private java.util.List<ColumnStatistics> colStats_ =
        java.util.Collections.emptyList();
      private void ensureColStatsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          colStats_ = new java.util.ArrayList<ColumnStatistics>(colStats_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ColumnStatistics, ColumnStatistics.Builder, ColumnStatisticsOrBuilder> colStatsBuilder_;

      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public java.util.List<ColumnStatistics> getColStatsList() {
        if (colStatsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(colStats_);
        } else {
          return colStatsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public int getColStatsCount() {
        if (colStatsBuilder_ == null) {
          return colStats_.size();
        } else {
          return colStatsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public ColumnStatistics getColStats(int index) {
        if (colStatsBuilder_ == null) {
          return colStats_.get(index);
        } else {
          return colStatsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public Builder setColStats(
          int index, ColumnStatistics value) {
        if (colStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureColStatsIsMutable();
          colStats_.set(index, value);
          onChanged();
        } else {
          colStatsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public Builder setColStats(
          int index, ColumnStatistics.Builder builderForValue) {
        if (colStatsBuilder_ == null) {
          ensureColStatsIsMutable();
          colStats_.set(index, builderForValue.build());
          onChanged();
        } else {
          colStatsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public Builder addColStats(ColumnStatistics value) {
        if (colStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureColStatsIsMutable();
          colStats_.add(value);
          onChanged();
        } else {
          colStatsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public Builder addColStats(
          int index, ColumnStatistics value) {
        if (colStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureColStatsIsMutable();
          colStats_.add(index, value);
          onChanged();
        } else {
          colStatsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public Builder addColStats(
          ColumnStatistics.Builder builderForValue) {
        if (colStatsBuilder_ == null) {
          ensureColStatsIsMutable();
          colStats_.add(builderForValue.build());
          onChanged();
        } else {
          colStatsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public Builder addColStats(
          int index, ColumnStatistics.Builder builderForValue) {
        if (colStatsBuilder_ == null) {
          ensureColStatsIsMutable();
          colStats_.add(index, builderForValue.build());
          onChanged();
        } else {
          colStatsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public Builder addAllColStats(
          java.lang.Iterable<? extends ColumnStatistics> values) {
        if (colStatsBuilder_ == null) {
          ensureColStatsIsMutable();
          super.addAll(values, colStats_);
          onChanged();
        } else {
          colStatsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public Builder clearColStats() {
        if (colStatsBuilder_ == null) {
          colStats_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          colStatsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public Builder removeColStats(int index) {
        if (colStatsBuilder_ == null) {
          ensureColStatsIsMutable();
          colStats_.remove(index);
          onChanged();
        } else {
          colStatsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public ColumnStatistics.Builder getColStatsBuilder(
          int index) {
        return getColStatsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public ColumnStatisticsOrBuilder getColStatsOrBuilder(
          int index) {
        if (colStatsBuilder_ == null) {
          return colStats_.get(index);  } else {
          return colStatsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public java.util.List<? extends ColumnStatisticsOrBuilder> 
           getColStatsOrBuilderList() {
        if (colStatsBuilder_ != null) {
          return colStatsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(colStats_);
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public ColumnStatistics.Builder addColStatsBuilder() {
        return getColStatsFieldBuilder().addBuilder(
            ColumnStatistics.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public ColumnStatistics.Builder addColStatsBuilder(
          int index) {
        return getColStatsFieldBuilder().addBuilder(
            index, ColumnStatistics.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics colStats = 1;</code>
       */
      public java.util.List<ColumnStatistics.Builder> 
           getColStatsBuilderList() {
        return getColStatsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ColumnStatistics, ColumnStatistics.Builder, ColumnStatisticsOrBuilder> 
          getColStatsFieldBuilder() {
        if (colStatsBuilder_ == null) {
          colStatsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ColumnStatistics, ColumnStatistics.Builder, ColumnStatisticsOrBuilder>(
                  colStats_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          colStats_ = null;
        }
        return colStatsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.StripeStatistics)
    }

    static {
      defaultInstance = new StripeStatistics(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.StripeStatistics)
  }

  public interface MetadataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated .orc.proto.StripeStatistics stripeStats = 1;
    /**
     * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
     */
    java.util.List<StripeStatistics> 
        getStripeStatsList();
    /**
     * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
     */
    StripeStatistics getStripeStats(int index);
    /**
     * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
     */
    int getStripeStatsCount();
    /**
     * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
     */
    java.util.List<? extends StripeStatisticsOrBuilder> 
        getStripeStatsOrBuilderList();
    /**
     * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
     */
    StripeStatisticsOrBuilder getStripeStatsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code orc.proto.Metadata}
   */
  public static final class Metadata extends
      com.google.protobuf.GeneratedMessage
      implements MetadataOrBuilder {
    // Use Metadata.newBuilder() to construct.
    private Metadata(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Metadata(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Metadata defaultInstance;
    public static Metadata getDefaultInstance() {
      return defaultInstance;
    }

    public Metadata getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Metadata(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                stripeStats_ = new java.util.ArrayList<StripeStatistics>();
                mutable_bitField0_ |= 0x00000001;
              }
              stripeStats_.add(input.readMessage(StripeStatistics.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          stripeStats_ = java.util.Collections.unmodifiableList(stripeStats_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_Metadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_Metadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Metadata.class, Metadata.Builder.class);
    }

    public static com.google.protobuf.Parser<Metadata> PARSER =
        new com.google.protobuf.AbstractParser<Metadata>() {
      public Metadata parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Metadata(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Metadata> getParserForType() {
      return PARSER;
    }

    // repeated .orc.proto.StripeStatistics stripeStats = 1;
    public static final int STRIPESTATS_FIELD_NUMBER = 1;
    private java.util.List<StripeStatistics> stripeStats_;
    /**
     * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
     */
    public java.util.List<StripeStatistics> getStripeStatsList() {
      return stripeStats_;
    }
    /**
     * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
     */
    public java.util.List<? extends StripeStatisticsOrBuilder> 
        getStripeStatsOrBuilderList() {
      return stripeStats_;
    }
    /**
     * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
     */
    public int getStripeStatsCount() {
      return stripeStats_.size();
    }
    /**
     * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
     */
    public StripeStatistics getStripeStats(int index) {
      return stripeStats_.get(index);
    }
    /**
     * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
     */
    public StripeStatisticsOrBuilder getStripeStatsOrBuilder(
        int index) {
      return stripeStats_.get(index);
    }

    private void initFields() {
      stripeStats_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < stripeStats_.size(); i++) {
        output.writeMessage(1, stripeStats_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < stripeStats_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, stripeStats_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static Metadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Metadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Metadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Metadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Metadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Metadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Metadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Metadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Metadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Metadata parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Metadata prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.Metadata}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements MetadataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_Metadata_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_Metadata_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Metadata.class, Metadata.Builder.class);
      }

      // Construct using Metadata.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getStripeStatsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (stripeStatsBuilder_ == null) {
          stripeStats_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          stripeStatsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_Metadata_descriptor;
      }

      public Metadata getDefaultInstanceForType() {
        return Metadata.getDefaultInstance();
      }

      public Metadata build() {
        Metadata result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Metadata buildPartial() {
        Metadata result = new Metadata(this);
        int from_bitField0_ = bitField0_;
        if (stripeStatsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            stripeStats_ = java.util.Collections.unmodifiableList(stripeStats_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.stripeStats_ = stripeStats_;
        } else {
          result.stripeStats_ = stripeStatsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Metadata) {
          return mergeFrom((Metadata)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Metadata other) {
        if (other == Metadata.getDefaultInstance()) return this;
        if (stripeStatsBuilder_ == null) {
          if (!other.stripeStats_.isEmpty()) {
            if (stripeStats_.isEmpty()) {
              stripeStats_ = other.stripeStats_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStripeStatsIsMutable();
              stripeStats_.addAll(other.stripeStats_);
            }
            onChanged();
          }
        } else {
          if (!other.stripeStats_.isEmpty()) {
            if (stripeStatsBuilder_.isEmpty()) {
              stripeStatsBuilder_.dispose();
              stripeStatsBuilder_ = null;
              stripeStats_ = other.stripeStats_;
              bitField0_ = (bitField0_ & ~0x00000001);
              stripeStatsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getStripeStatsFieldBuilder() : null;
            } else {
              stripeStatsBuilder_.addAllMessages(other.stripeStats_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Metadata parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Metadata) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated .orc.proto.StripeStatistics stripeStats = 1;
      private java.util.List<StripeStatistics> stripeStats_ =
        java.util.Collections.emptyList();
      private void ensureStripeStatsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          stripeStats_ = new java.util.ArrayList<StripeStatistics>(stripeStats_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          StripeStatistics, StripeStatistics.Builder, StripeStatisticsOrBuilder> stripeStatsBuilder_;

      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public java.util.List<StripeStatistics> getStripeStatsList() {
        if (stripeStatsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(stripeStats_);
        } else {
          return stripeStatsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public int getStripeStatsCount() {
        if (stripeStatsBuilder_ == null) {
          return stripeStats_.size();
        } else {
          return stripeStatsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public StripeStatistics getStripeStats(int index) {
        if (stripeStatsBuilder_ == null) {
          return stripeStats_.get(index);
        } else {
          return stripeStatsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public Builder setStripeStats(
          int index, StripeStatistics value) {
        if (stripeStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStripeStatsIsMutable();
          stripeStats_.set(index, value);
          onChanged();
        } else {
          stripeStatsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public Builder setStripeStats(
          int index, StripeStatistics.Builder builderForValue) {
        if (stripeStatsBuilder_ == null) {
          ensureStripeStatsIsMutable();
          stripeStats_.set(index, builderForValue.build());
          onChanged();
        } else {
          stripeStatsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public Builder addStripeStats(StripeStatistics value) {
        if (stripeStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStripeStatsIsMutable();
          stripeStats_.add(value);
          onChanged();
        } else {
          stripeStatsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public Builder addStripeStats(
          int index, StripeStatistics value) {
        if (stripeStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStripeStatsIsMutable();
          stripeStats_.add(index, value);
          onChanged();
        } else {
          stripeStatsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public Builder addStripeStats(
          StripeStatistics.Builder builderForValue) {
        if (stripeStatsBuilder_ == null) {
          ensureStripeStatsIsMutable();
          stripeStats_.add(builderForValue.build());
          onChanged();
        } else {
          stripeStatsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public Builder addStripeStats(
          int index, StripeStatistics.Builder builderForValue) {
        if (stripeStatsBuilder_ == null) {
          ensureStripeStatsIsMutable();
          stripeStats_.add(index, builderForValue.build());
          onChanged();
        } else {
          stripeStatsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public Builder addAllStripeStats(
          java.lang.Iterable<? extends StripeStatistics> values) {
        if (stripeStatsBuilder_ == null) {
          ensureStripeStatsIsMutable();
          super.addAll(values, stripeStats_);
          onChanged();
        } else {
          stripeStatsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public Builder clearStripeStats() {
        if (stripeStatsBuilder_ == null) {
          stripeStats_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          stripeStatsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public Builder removeStripeStats(int index) {
        if (stripeStatsBuilder_ == null) {
          ensureStripeStatsIsMutable();
          stripeStats_.remove(index);
          onChanged();
        } else {
          stripeStatsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public StripeStatistics.Builder getStripeStatsBuilder(
          int index) {
        return getStripeStatsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public StripeStatisticsOrBuilder getStripeStatsOrBuilder(
          int index) {
        if (stripeStatsBuilder_ == null) {
          return stripeStats_.get(index);  } else {
          return stripeStatsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public java.util.List<? extends StripeStatisticsOrBuilder> 
           getStripeStatsOrBuilderList() {
        if (stripeStatsBuilder_ != null) {
          return stripeStatsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(stripeStats_);
        }
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public StripeStatistics.Builder addStripeStatsBuilder() {
        return getStripeStatsFieldBuilder().addBuilder(
            StripeStatistics.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public StripeStatistics.Builder addStripeStatsBuilder(
          int index) {
        return getStripeStatsFieldBuilder().addBuilder(
            index, StripeStatistics.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.StripeStatistics stripeStats = 1;</code>
       */
      public java.util.List<StripeStatistics.Builder> 
           getStripeStatsBuilderList() {
        return getStripeStatsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          StripeStatistics, StripeStatistics.Builder, StripeStatisticsOrBuilder> 
          getStripeStatsFieldBuilder() {
        if (stripeStatsBuilder_ == null) {
          stripeStatsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              StripeStatistics, StripeStatistics.Builder, StripeStatisticsOrBuilder>(
                  stripeStats_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          stripeStats_ = null;
        }
        return stripeStatsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.Metadata)
    }

    static {
      defaultInstance = new Metadata(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.Metadata)
  }

  public interface FooterOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional uint64 headerLength = 1;
    /**
     * <code>optional uint64 headerLength = 1;</code>
     */
    boolean hasHeaderLength();
    /**
     * <code>optional uint64 headerLength = 1;</code>
     */
    long getHeaderLength();

    // optional uint64 contentLength = 2;
    /**
     * <code>optional uint64 contentLength = 2;</code>
     */
    boolean hasContentLength();
    /**
     * <code>optional uint64 contentLength = 2;</code>
     */
    long getContentLength();

    // repeated .orc.proto.StripeInformation stripes = 3;
    /**
     * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
     */
    java.util.List<StripeInformation> 
        getStripesList();
    /**
     * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
     */
    StripeInformation getStripes(int index);
    /**
     * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
     */
    int getStripesCount();
    /**
     * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
     */
    java.util.List<? extends StripeInformationOrBuilder> 
        getStripesOrBuilderList();
    /**
     * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
     */
    StripeInformationOrBuilder getStripesOrBuilder(
        int index);

    // repeated .orc.proto.Type types = 4;
    /**
     * <code>repeated .orc.proto.Type types = 4;</code>
     */
    java.util.List<Type> 
        getTypesList();
    /**
     * <code>repeated .orc.proto.Type types = 4;</code>
     */
    Type getTypes(int index);
    /**
     * <code>repeated .orc.proto.Type types = 4;</code>
     */
    int getTypesCount();
    /**
     * <code>repeated .orc.proto.Type types = 4;</code>
     */
    java.util.List<? extends TypeOrBuilder> 
        getTypesOrBuilderList();
    /**
     * <code>repeated .orc.proto.Type types = 4;</code>
     */
    TypeOrBuilder getTypesOrBuilder(
        int index);

    // repeated .orc.proto.UserMetadataItem metadata = 5;
    /**
     * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
     */
    java.util.List<UserMetadataItem> 
        getMetadataList();
    /**
     * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
     */
    UserMetadataItem getMetadata(int index);
    /**
     * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
     */
    int getMetadataCount();
    /**
     * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
     */
    java.util.List<? extends UserMetadataItemOrBuilder> 
        getMetadataOrBuilderList();
    /**
     * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
     */
    UserMetadataItemOrBuilder getMetadataOrBuilder(
        int index);

    // optional uint64 numberOfRows = 6;
    /**
     * <code>optional uint64 numberOfRows = 6;</code>
     */
    boolean hasNumberOfRows();
    /**
     * <code>optional uint64 numberOfRows = 6;</code>
     */
    long getNumberOfRows();

    // repeated .orc.proto.ColumnStatistics statistics = 7;
    /**
     * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
     */
    java.util.List<ColumnStatistics> 
        getStatisticsList();
    /**
     * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
     */
    ColumnStatistics getStatistics(int index);
    /**
     * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
     */
    int getStatisticsCount();
    /**
     * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
     */
    java.util.List<? extends ColumnStatisticsOrBuilder> 
        getStatisticsOrBuilderList();
    /**
     * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
     */
    ColumnStatisticsOrBuilder getStatisticsOrBuilder(
        int index);

    // optional uint32 rowIndexStride = 8;
    /**
     * <code>optional uint32 rowIndexStride = 8;</code>
     */
    boolean hasRowIndexStride();
    /**
     * <code>optional uint32 rowIndexStride = 8;</code>
     */
    int getRowIndexStride();
  }
  /**
   * Protobuf type {@code orc.proto.Footer}
   */
  public static final class Footer extends
      com.google.protobuf.GeneratedMessage
      implements FooterOrBuilder {
    // Use Footer.newBuilder() to construct.
    private Footer(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Footer(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Footer defaultInstance;
    public static Footer getDefaultInstance() {
      return defaultInstance;
    }

    public Footer getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Footer(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              headerLength_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              contentLength_ = input.readUInt64();
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                stripes_ = new java.util.ArrayList<StripeInformation>();
                mutable_bitField0_ |= 0x00000004;
              }
              stripes_.add(input.readMessage(StripeInformation.PARSER, extensionRegistry));
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                types_ = new java.util.ArrayList<Type>();
                mutable_bitField0_ |= 0x00000008;
              }
              types_.add(input.readMessage(Type.PARSER, extensionRegistry));
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                metadata_ = new java.util.ArrayList<UserMetadataItem>();
                mutable_bitField0_ |= 0x00000010;
              }
              metadata_.add(input.readMessage(UserMetadataItem.PARSER, extensionRegistry));
              break;
            }
            case 48: {
              bitField0_ |= 0x00000004;
              numberOfRows_ = input.readUInt64();
              break;
            }
            case 58: {
              if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                statistics_ = new java.util.ArrayList<ColumnStatistics>();
                mutable_bitField0_ |= 0x00000040;
              }
              statistics_.add(input.readMessage(ColumnStatistics.PARSER, extensionRegistry));
              break;
            }
            case 64: {
              bitField0_ |= 0x00000008;
              rowIndexStride_ = input.readUInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          stripes_ = java.util.Collections.unmodifiableList(stripes_);
        }
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          types_ = java.util.Collections.unmodifiableList(types_);
        }
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          metadata_ = java.util.Collections.unmodifiableList(metadata_);
        }
        if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
          statistics_ = java.util.Collections.unmodifiableList(statistics_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_Footer_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_Footer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Footer.class, Footer.Builder.class);
    }

    public static com.google.protobuf.Parser<Footer> PARSER =
        new com.google.protobuf.AbstractParser<Footer>() {
      public Footer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Footer(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Footer> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional uint64 headerLength = 1;
    public static final int HEADERLENGTH_FIELD_NUMBER = 1;
    private long headerLength_;
    /**
     * <code>optional uint64 headerLength = 1;</code>
     */
    public boolean hasHeaderLength() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 headerLength = 1;</code>
     */
    public long getHeaderLength() {
      return headerLength_;
    }

    // optional uint64 contentLength = 2;
    public static final int CONTENTLENGTH_FIELD_NUMBER = 2;
    private long contentLength_;
    /**
     * <code>optional uint64 contentLength = 2;</code>
     */
    public boolean hasContentLength() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 contentLength = 2;</code>
     */
    public long getContentLength() {
      return contentLength_;
    }

    // repeated .orc.proto.StripeInformation stripes = 3;
    public static final int STRIPES_FIELD_NUMBER = 3;
    private java.util.List<StripeInformation> stripes_;
    /**
     * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
     */
    public java.util.List<StripeInformation> getStripesList() {
      return stripes_;
    }
    /**
     * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
     */
    public java.util.List<? extends StripeInformationOrBuilder> 
        getStripesOrBuilderList() {
      return stripes_;
    }
    /**
     * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
     */
    public int getStripesCount() {
      return stripes_.size();
    }
    /**
     * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
     */
    public StripeInformation getStripes(int index) {
      return stripes_.get(index);
    }
    /**
     * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
     */
    public StripeInformationOrBuilder getStripesOrBuilder(
        int index) {
      return stripes_.get(index);
    }

    // repeated .orc.proto.Type types = 4;
    public static final int TYPES_FIELD_NUMBER = 4;
    private java.util.List<Type> types_;
    /**
     * <code>repeated .orc.proto.Type types = 4;</code>
     */
    public java.util.List<Type> getTypesList() {
      return types_;
    }
    /**
     * <code>repeated .orc.proto.Type types = 4;</code>
     */
    public java.util.List<? extends TypeOrBuilder> 
        getTypesOrBuilderList() {
      return types_;
    }
    /**
     * <code>repeated .orc.proto.Type types = 4;</code>
     */
    public int getTypesCount() {
      return types_.size();
    }
    /**
     * <code>repeated .orc.proto.Type types = 4;</code>
     */
    public Type getTypes(int index) {
      return types_.get(index);
    }
    /**
     * <code>repeated .orc.proto.Type types = 4;</code>
     */
    public TypeOrBuilder getTypesOrBuilder(
        int index) {
      return types_.get(index);
    }

    // repeated .orc.proto.UserMetadataItem metadata = 5;
    public static final int METADATA_FIELD_NUMBER = 5;
    private java.util.List<UserMetadataItem> metadata_;
    /**
     * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
     */
    public java.util.List<UserMetadataItem> getMetadataList() {
      return metadata_;
    }
    /**
     * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
     */
    public java.util.List<? extends UserMetadataItemOrBuilder> 
        getMetadataOrBuilderList() {
      return metadata_;
    }
    /**
     * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
     */
    public int getMetadataCount() {
      return metadata_.size();
    }
    /**
     * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
     */
    public UserMetadataItem getMetadata(int index) {
      return metadata_.get(index);
    }
    /**
     * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
     */
    public UserMetadataItemOrBuilder getMetadataOrBuilder(
        int index) {
      return metadata_.get(index);
    }

    // optional uint64 numberOfRows = 6;
    public static final int NUMBEROFROWS_FIELD_NUMBER = 6;
    private long numberOfRows_;
    /**
     * <code>optional uint64 numberOfRows = 6;</code>
     */
    public boolean hasNumberOfRows() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint64 numberOfRows = 6;</code>
     */
    public long getNumberOfRows() {
      return numberOfRows_;
    }

    // repeated .orc.proto.ColumnStatistics statistics = 7;
    public static final int STATISTICS_FIELD_NUMBER = 7;
    private java.util.List<ColumnStatistics> statistics_;
    /**
     * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
     */
    public java.util.List<ColumnStatistics> getStatisticsList() {
      return statistics_;
    }
    /**
     * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
     */
    public java.util.List<? extends ColumnStatisticsOrBuilder> 
        getStatisticsOrBuilderList() {
      return statistics_;
    }
    /**
     * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
     */
    public int getStatisticsCount() {
      return statistics_.size();
    }
    /**
     * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
     */
    public ColumnStatistics getStatistics(int index) {
      return statistics_.get(index);
    }
    /**
     * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
     */
    public ColumnStatisticsOrBuilder getStatisticsOrBuilder(
        int index) {
      return statistics_.get(index);
    }

    // optional uint32 rowIndexStride = 8;
    public static final int ROWINDEXSTRIDE_FIELD_NUMBER = 8;
    private int rowIndexStride_;
    /**
     * <code>optional uint32 rowIndexStride = 8;</code>
     */
    public boolean hasRowIndexStride() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint32 rowIndexStride = 8;</code>
     */
    public int getRowIndexStride() {
      return rowIndexStride_;
    }

    private void initFields() {
      headerLength_ = 0L;
      contentLength_ = 0L;
      stripes_ = java.util.Collections.emptyList();
      types_ = java.util.Collections.emptyList();
      metadata_ = java.util.Collections.emptyList();
      numberOfRows_ = 0L;
      statistics_ = java.util.Collections.emptyList();
      rowIndexStride_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, headerLength_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, contentLength_);
      }
      for (int i = 0; i < stripes_.size(); i++) {
        output.writeMessage(3, stripes_.get(i));
      }
      for (int i = 0; i < types_.size(); i++) {
        output.writeMessage(4, types_.get(i));
      }
      for (int i = 0; i < metadata_.size(); i++) {
        output.writeMessage(5, metadata_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(6, numberOfRows_);
      }
      for (int i = 0; i < statistics_.size(); i++) {
        output.writeMessage(7, statistics_.get(i));
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(8, rowIndexStride_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, headerLength_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, contentLength_);
      }
      for (int i = 0; i < stripes_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, stripes_.get(i));
      }
      for (int i = 0; i < types_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, types_.get(i));
      }
      for (int i = 0; i < metadata_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, metadata_.get(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, numberOfRows_);
      }
      for (int i = 0; i < statistics_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, statistics_.get(i));
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, rowIndexStride_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static Footer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Footer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Footer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Footer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Footer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Footer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Footer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Footer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Footer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Footer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Footer prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.Footer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements FooterOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_Footer_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_Footer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Footer.class, Footer.Builder.class);
      }

      // Construct using Footer.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getStripesFieldBuilder();
          getTypesFieldBuilder();
          getMetadataFieldBuilder();
          getStatisticsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        headerLength_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        contentLength_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (stripesBuilder_ == null) {
          stripes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          stripesBuilder_.clear();
        }
        if (typesBuilder_ == null) {
          types_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          typesBuilder_.clear();
        }
        if (metadataBuilder_ == null) {
          metadata_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          metadataBuilder_.clear();
        }
        numberOfRows_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        if (statisticsBuilder_ == null) {
          statistics_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
        } else {
          statisticsBuilder_.clear();
        }
        rowIndexStride_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_Footer_descriptor;
      }

      public Footer getDefaultInstanceForType() {
        return Footer.getDefaultInstance();
      }

      public Footer build() {
        Footer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Footer buildPartial() {
        Footer result = new Footer(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.headerLength_ = headerLength_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.contentLength_ = contentLength_;
        if (stripesBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            stripes_ = java.util.Collections.unmodifiableList(stripes_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.stripes_ = stripes_;
        } else {
          result.stripes_ = stripesBuilder_.build();
        }
        if (typesBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            types_ = java.util.Collections.unmodifiableList(types_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.types_ = types_;
        } else {
          result.types_ = typesBuilder_.build();
        }
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            metadata_ = java.util.Collections.unmodifiableList(metadata_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000004;
        }
        result.numberOfRows_ = numberOfRows_;
        if (statisticsBuilder_ == null) {
          if (((bitField0_ & 0x00000040) == 0x00000040)) {
            statistics_ = java.util.Collections.unmodifiableList(statistics_);
            bitField0_ = (bitField0_ & ~0x00000040);
          }
          result.statistics_ = statistics_;
        } else {
          result.statistics_ = statisticsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000008;
        }
        result.rowIndexStride_ = rowIndexStride_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Footer) {
          return mergeFrom((Footer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Footer other) {
        if (other == Footer.getDefaultInstance()) return this;
        if (other.hasHeaderLength()) {
          setHeaderLength(other.getHeaderLength());
        }
        if (other.hasContentLength()) {
          setContentLength(other.getContentLength());
        }
        if (stripesBuilder_ == null) {
          if (!other.stripes_.isEmpty()) {
            if (stripes_.isEmpty()) {
              stripes_ = other.stripes_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureStripesIsMutable();
              stripes_.addAll(other.stripes_);
            }
            onChanged();
          }
        } else {
          if (!other.stripes_.isEmpty()) {
            if (stripesBuilder_.isEmpty()) {
              stripesBuilder_.dispose();
              stripesBuilder_ = null;
              stripes_ = other.stripes_;
              bitField0_ = (bitField0_ & ~0x00000004);
              stripesBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getStripesFieldBuilder() : null;
            } else {
              stripesBuilder_.addAllMessages(other.stripes_);
            }
          }
        }
        if (typesBuilder_ == null) {
          if (!other.types_.isEmpty()) {
            if (types_.isEmpty()) {
              types_ = other.types_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureTypesIsMutable();
              types_.addAll(other.types_);
            }
            onChanged();
          }
        } else {
          if (!other.types_.isEmpty()) {
            if (typesBuilder_.isEmpty()) {
              typesBuilder_.dispose();
              typesBuilder_ = null;
              types_ = other.types_;
              bitField0_ = (bitField0_ & ~0x00000008);
              typesBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getTypesFieldBuilder() : null;
            } else {
              typesBuilder_.addAllMessages(other.types_);
            }
          }
        }
        if (metadataBuilder_ == null) {
          if (!other.metadata_.isEmpty()) {
            if (metadata_.isEmpty()) {
              metadata_ = other.metadata_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureMetadataIsMutable();
              metadata_.addAll(other.metadata_);
            }
            onChanged();
          }
        } else {
          if (!other.metadata_.isEmpty()) {
            if (metadataBuilder_.isEmpty()) {
              metadataBuilder_.dispose();
              metadataBuilder_ = null;
              metadata_ = other.metadata_;
              bitField0_ = (bitField0_ & ~0x00000010);
              metadataBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getMetadataFieldBuilder() : null;
            } else {
              metadataBuilder_.addAllMessages(other.metadata_);
            }
          }
        }
        if (other.hasNumberOfRows()) {
          setNumberOfRows(other.getNumberOfRows());
        }
        if (statisticsBuilder_ == null) {
          if (!other.statistics_.isEmpty()) {
            if (statistics_.isEmpty()) {
              statistics_ = other.statistics_;
              bitField0_ = (bitField0_ & ~0x00000040);
            } else {
              ensureStatisticsIsMutable();
              statistics_.addAll(other.statistics_);
            }
            onChanged();
          }
        } else {
          if (!other.statistics_.isEmpty()) {
            if (statisticsBuilder_.isEmpty()) {
              statisticsBuilder_.dispose();
              statisticsBuilder_ = null;
              statistics_ = other.statistics_;
              bitField0_ = (bitField0_ & ~0x00000040);
              statisticsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getStatisticsFieldBuilder() : null;
            } else {
              statisticsBuilder_.addAllMessages(other.statistics_);
            }
          }
        }
        if (other.hasRowIndexStride()) {
          setRowIndexStride(other.getRowIndexStride());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Footer parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Footer) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional uint64 headerLength = 1;
      private long headerLength_ ;
      /**
       * <code>optional uint64 headerLength = 1;</code>
       */
      public boolean hasHeaderLength() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint64 headerLength = 1;</code>
       */
      public long getHeaderLength() {
        return headerLength_;
      }
      /**
       * <code>optional uint64 headerLength = 1;</code>
       */
      public Builder setHeaderLength(long value) {
        bitField0_ |= 0x00000001;
        headerLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 headerLength = 1;</code>
       */
      public Builder clearHeaderLength() {
        bitField0_ = (bitField0_ & ~0x00000001);
        headerLength_ = 0L;
        onChanged();
        return this;
      }

      // optional uint64 contentLength = 2;
      private long contentLength_ ;
      /**
       * <code>optional uint64 contentLength = 2;</code>
       */
      public boolean hasContentLength() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint64 contentLength = 2;</code>
       */
      public long getContentLength() {
        return contentLength_;
      }
      /**
       * <code>optional uint64 contentLength = 2;</code>
       */
      public Builder setContentLength(long value) {
        bitField0_ |= 0x00000002;
        contentLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 contentLength = 2;</code>
       */
      public Builder clearContentLength() {
        bitField0_ = (bitField0_ & ~0x00000002);
        contentLength_ = 0L;
        onChanged();
        return this;
      }

      // repeated .orc.proto.StripeInformation stripes = 3;
      private java.util.List<StripeInformation> stripes_ =
        java.util.Collections.emptyList();
      private void ensureStripesIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          stripes_ = new java.util.ArrayList<StripeInformation>(stripes_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          StripeInformation, StripeInformation.Builder, StripeInformationOrBuilder> stripesBuilder_;

      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public java.util.List<StripeInformation> getStripesList() {
        if (stripesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(stripes_);
        } else {
          return stripesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public int getStripesCount() {
        if (stripesBuilder_ == null) {
          return stripes_.size();
        } else {
          return stripesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public StripeInformation getStripes(int index) {
        if (stripesBuilder_ == null) {
          return stripes_.get(index);
        } else {
          return stripesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public Builder setStripes(
          int index, StripeInformation value) {
        if (stripesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStripesIsMutable();
          stripes_.set(index, value);
          onChanged();
        } else {
          stripesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public Builder setStripes(
          int index, StripeInformation.Builder builderForValue) {
        if (stripesBuilder_ == null) {
          ensureStripesIsMutable();
          stripes_.set(index, builderForValue.build());
          onChanged();
        } else {
          stripesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public Builder addStripes(StripeInformation value) {
        if (stripesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStripesIsMutable();
          stripes_.add(value);
          onChanged();
        } else {
          stripesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public Builder addStripes(
          int index, StripeInformation value) {
        if (stripesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStripesIsMutable();
          stripes_.add(index, value);
          onChanged();
        } else {
          stripesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public Builder addStripes(
          StripeInformation.Builder builderForValue) {
        if (stripesBuilder_ == null) {
          ensureStripesIsMutable();
          stripes_.add(builderForValue.build());
          onChanged();
        } else {
          stripesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public Builder addStripes(
          int index, StripeInformation.Builder builderForValue) {
        if (stripesBuilder_ == null) {
          ensureStripesIsMutable();
          stripes_.add(index, builderForValue.build());
          onChanged();
        } else {
          stripesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public Builder addAllStripes(
          java.lang.Iterable<? extends StripeInformation> values) {
        if (stripesBuilder_ == null) {
          ensureStripesIsMutable();
          super.addAll(values, stripes_);
          onChanged();
        } else {
          stripesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public Builder clearStripes() {
        if (stripesBuilder_ == null) {
          stripes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          stripesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public Builder removeStripes(int index) {
        if (stripesBuilder_ == null) {
          ensureStripesIsMutable();
          stripes_.remove(index);
          onChanged();
        } else {
          stripesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public StripeInformation.Builder getStripesBuilder(
          int index) {
        return getStripesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public StripeInformationOrBuilder getStripesOrBuilder(
          int index) {
        if (stripesBuilder_ == null) {
          return stripes_.get(index);  } else {
          return stripesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public java.util.List<? extends StripeInformationOrBuilder> 
           getStripesOrBuilderList() {
        if (stripesBuilder_ != null) {
          return stripesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(stripes_);
        }
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public StripeInformation.Builder addStripesBuilder() {
        return getStripesFieldBuilder().addBuilder(
            StripeInformation.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public StripeInformation.Builder addStripesBuilder(
          int index) {
        return getStripesFieldBuilder().addBuilder(
            index, StripeInformation.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.StripeInformation stripes = 3;</code>
       */
      public java.util.List<StripeInformation.Builder> 
           getStripesBuilderList() {
        return getStripesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          StripeInformation, StripeInformation.Builder, StripeInformationOrBuilder> 
          getStripesFieldBuilder() {
        if (stripesBuilder_ == null) {
          stripesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              StripeInformation, StripeInformation.Builder, StripeInformationOrBuilder>(
                  stripes_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          stripes_ = null;
        }
        return stripesBuilder_;
      }

      // repeated .orc.proto.Type types = 4;
      private java.util.List<Type> types_ =
        java.util.Collections.emptyList();
      private void ensureTypesIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          types_ = new java.util.ArrayList<Type>(types_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          Type, Type.Builder, TypeOrBuilder> typesBuilder_;

      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public java.util.List<Type> getTypesList() {
        if (typesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(types_);
        } else {
          return typesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public int getTypesCount() {
        if (typesBuilder_ == null) {
          return types_.size();
        } else {
          return typesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public Type getTypes(int index) {
        if (typesBuilder_ == null) {
          return types_.get(index);
        } else {
          return typesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public Builder setTypes(
          int index, Type value) {
        if (typesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTypesIsMutable();
          types_.set(index, value);
          onChanged();
        } else {
          typesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public Builder setTypes(
          int index, Type.Builder builderForValue) {
        if (typesBuilder_ == null) {
          ensureTypesIsMutable();
          types_.set(index, builderForValue.build());
          onChanged();
        } else {
          typesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public Builder addTypes(Type value) {
        if (typesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTypesIsMutable();
          types_.add(value);
          onChanged();
        } else {
          typesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public Builder addTypes(
          int index, Type value) {
        if (typesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTypesIsMutable();
          types_.add(index, value);
          onChanged();
        } else {
          typesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public Builder addTypes(
          Type.Builder builderForValue) {
        if (typesBuilder_ == null) {
          ensureTypesIsMutable();
          types_.add(builderForValue.build());
          onChanged();
        } else {
          typesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public Builder addTypes(
          int index, Type.Builder builderForValue) {
        if (typesBuilder_ == null) {
          ensureTypesIsMutable();
          types_.add(index, builderForValue.build());
          onChanged();
        } else {
          typesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public Builder addAllTypes(
          java.lang.Iterable<? extends Type> values) {
        if (typesBuilder_ == null) {
          ensureTypesIsMutable();
          super.addAll(values, types_);
          onChanged();
        } else {
          typesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public Builder clearTypes() {
        if (typesBuilder_ == null) {
          types_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          typesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public Builder removeTypes(int index) {
        if (typesBuilder_ == null) {
          ensureTypesIsMutable();
          types_.remove(index);
          onChanged();
        } else {
          typesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public Type.Builder getTypesBuilder(
          int index) {
        return getTypesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public TypeOrBuilder getTypesOrBuilder(
          int index) {
        if (typesBuilder_ == null) {
          return types_.get(index);  } else {
          return typesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public java.util.List<? extends TypeOrBuilder> 
           getTypesOrBuilderList() {
        if (typesBuilder_ != null) {
          return typesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(types_);
        }
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public Type.Builder addTypesBuilder() {
        return getTypesFieldBuilder().addBuilder(
            Type.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public Type.Builder addTypesBuilder(
          int index) {
        return getTypesFieldBuilder().addBuilder(
            index, Type.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.Type types = 4;</code>
       */
      public java.util.List<Type.Builder> 
           getTypesBuilderList() {
        return getTypesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          Type, Type.Builder, TypeOrBuilder> 
          getTypesFieldBuilder() {
        if (typesBuilder_ == null) {
          typesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              Type, Type.Builder, TypeOrBuilder>(
                  types_,
                  ((bitField0_ & 0x00000008) == 0x00000008),
                  getParentForChildren(),
                  isClean());
          types_ = null;
        }
        return typesBuilder_;
      }

      // repeated .orc.proto.UserMetadataItem metadata = 5;
      private java.util.List<UserMetadataItem> metadata_ =
        java.util.Collections.emptyList();
      private void ensureMetadataIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          metadata_ = new java.util.ArrayList<UserMetadataItem>(metadata_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          UserMetadataItem, UserMetadataItem.Builder, UserMetadataItemOrBuilder> metadataBuilder_;

      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public java.util.List<UserMetadataItem> getMetadataList() {
        if (metadataBuilder_ == null) {
          return java.util.Collections.unmodifiableList(metadata_);
        } else {
          return metadataBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public int getMetadataCount() {
        if (metadataBuilder_ == null) {
          return metadata_.size();
        } else {
          return metadataBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public UserMetadataItem getMetadata(int index) {
        if (metadataBuilder_ == null) {
          return metadata_.get(index);
        } else {
          return metadataBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public Builder setMetadata(
          int index, UserMetadataItem value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMetadataIsMutable();
          metadata_.set(index, value);
          onChanged();
        } else {
          metadataBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public Builder setMetadata(
          int index, UserMetadataItem.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          ensureMetadataIsMutable();
          metadata_.set(index, builderForValue.build());
          onChanged();
        } else {
          metadataBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public Builder addMetadata(UserMetadataItem value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMetadataIsMutable();
          metadata_.add(value);
          onChanged();
        } else {
          metadataBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public Builder addMetadata(
          int index, UserMetadataItem value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMetadataIsMutable();
          metadata_.add(index, value);
          onChanged();
        } else {
          metadataBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public Builder addMetadata(
          UserMetadataItem.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          ensureMetadataIsMutable();
          metadata_.add(builderForValue.build());
          onChanged();
        } else {
          metadataBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public Builder addMetadata(
          int index, UserMetadataItem.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          ensureMetadataIsMutable();
          metadata_.add(index, builderForValue.build());
          onChanged();
        } else {
          metadataBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public Builder addAllMetadata(
          java.lang.Iterable<? extends UserMetadataItem> values) {
        if (metadataBuilder_ == null) {
          ensureMetadataIsMutable();
          super.addAll(values, metadata_);
          onChanged();
        } else {
          metadataBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public Builder removeMetadata(int index) {
        if (metadataBuilder_ == null) {
          ensureMetadataIsMutable();
          metadata_.remove(index);
          onChanged();
        } else {
          metadataBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public UserMetadataItem.Builder getMetadataBuilder(
          int index) {
        return getMetadataFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public UserMetadataItemOrBuilder getMetadataOrBuilder(
          int index) {
        if (metadataBuilder_ == null) {
          return metadata_.get(index);  } else {
          return metadataBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public java.util.List<? extends UserMetadataItemOrBuilder> 
           getMetadataOrBuilderList() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(metadata_);
        }
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public UserMetadataItem.Builder addMetadataBuilder() {
        return getMetadataFieldBuilder().addBuilder(
            UserMetadataItem.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public UserMetadataItem.Builder addMetadataBuilder(
          int index) {
        return getMetadataFieldBuilder().addBuilder(
            index, UserMetadataItem.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.UserMetadataItem metadata = 5;</code>
       */
      public java.util.List<UserMetadataItem.Builder> 
           getMetadataBuilderList() {
        return getMetadataFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          UserMetadataItem, UserMetadataItem.Builder, UserMetadataItemOrBuilder> 
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              UserMetadataItem, UserMetadataItem.Builder, UserMetadataItemOrBuilder>(
                  metadata_,
                  ((bitField0_ & 0x00000010) == 0x00000010),
                  getParentForChildren(),
                  isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      // optional uint64 numberOfRows = 6;
      private long numberOfRows_ ;
      /**
       * <code>optional uint64 numberOfRows = 6;</code>
       */
      public boolean hasNumberOfRows() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional uint64 numberOfRows = 6;</code>
       */
      public long getNumberOfRows() {
        return numberOfRows_;
      }
      /**
       * <code>optional uint64 numberOfRows = 6;</code>
       */
      public Builder setNumberOfRows(long value) {
        bitField0_ |= 0x00000020;
        numberOfRows_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 numberOfRows = 6;</code>
       */
      public Builder clearNumberOfRows() {
        bitField0_ = (bitField0_ & ~0x00000020);
        numberOfRows_ = 0L;
        onChanged();
        return this;
      }

      // repeated .orc.proto.ColumnStatistics statistics = 7;
      private java.util.List<ColumnStatistics> statistics_ =
        java.util.Collections.emptyList();
      private void ensureStatisticsIsMutable() {
        if (!((bitField0_ & 0x00000040) == 0x00000040)) {
          statistics_ = new java.util.ArrayList<ColumnStatistics>(statistics_);
          bitField0_ |= 0x00000040;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          ColumnStatistics, ColumnStatistics.Builder, ColumnStatisticsOrBuilder> statisticsBuilder_;

      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public java.util.List<ColumnStatistics> getStatisticsList() {
        if (statisticsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(statistics_);
        } else {
          return statisticsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public int getStatisticsCount() {
        if (statisticsBuilder_ == null) {
          return statistics_.size();
        } else {
          return statisticsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public ColumnStatistics getStatistics(int index) {
        if (statisticsBuilder_ == null) {
          return statistics_.get(index);
        } else {
          return statisticsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public Builder setStatistics(
          int index, ColumnStatistics value) {
        if (statisticsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatisticsIsMutable();
          statistics_.set(index, value);
          onChanged();
        } else {
          statisticsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public Builder setStatistics(
          int index, ColumnStatistics.Builder builderForValue) {
        if (statisticsBuilder_ == null) {
          ensureStatisticsIsMutable();
          statistics_.set(index, builderForValue.build());
          onChanged();
        } else {
          statisticsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public Builder addStatistics(ColumnStatistics value) {
        if (statisticsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatisticsIsMutable();
          statistics_.add(value);
          onChanged();
        } else {
          statisticsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public Builder addStatistics(
          int index, ColumnStatistics value) {
        if (statisticsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatisticsIsMutable();
          statistics_.add(index, value);
          onChanged();
        } else {
          statisticsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public Builder addStatistics(
          ColumnStatistics.Builder builderForValue) {
        if (statisticsBuilder_ == null) {
          ensureStatisticsIsMutable();
          statistics_.add(builderForValue.build());
          onChanged();
        } else {
          statisticsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public Builder addStatistics(
          int index, ColumnStatistics.Builder builderForValue) {
        if (statisticsBuilder_ == null) {
          ensureStatisticsIsMutable();
          statistics_.add(index, builderForValue.build());
          onChanged();
        } else {
          statisticsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public Builder addAllStatistics(
          java.lang.Iterable<? extends ColumnStatistics> values) {
        if (statisticsBuilder_ == null) {
          ensureStatisticsIsMutable();
          super.addAll(values, statistics_);
          onChanged();
        } else {
          statisticsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public Builder clearStatistics() {
        if (statisticsBuilder_ == null) {
          statistics_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
          onChanged();
        } else {
          statisticsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public Builder removeStatistics(int index) {
        if (statisticsBuilder_ == null) {
          ensureStatisticsIsMutable();
          statistics_.remove(index);
          onChanged();
        } else {
          statisticsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public ColumnStatistics.Builder getStatisticsBuilder(
          int index) {
        return getStatisticsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public ColumnStatisticsOrBuilder getStatisticsOrBuilder(
          int index) {
        if (statisticsBuilder_ == null) {
          return statistics_.get(index);  } else {
          return statisticsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public java.util.List<? extends ColumnStatisticsOrBuilder> 
           getStatisticsOrBuilderList() {
        if (statisticsBuilder_ != null) {
          return statisticsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(statistics_);
        }
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public ColumnStatistics.Builder addStatisticsBuilder() {
        return getStatisticsFieldBuilder().addBuilder(
            ColumnStatistics.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public ColumnStatistics.Builder addStatisticsBuilder(
          int index) {
        return getStatisticsFieldBuilder().addBuilder(
            index, ColumnStatistics.getDefaultInstance());
      }
      /**
       * <code>repeated .orc.proto.ColumnStatistics statistics = 7;</code>
       */
      public java.util.List<ColumnStatistics.Builder> 
           getStatisticsBuilderList() {
        return getStatisticsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          ColumnStatistics, ColumnStatistics.Builder, ColumnStatisticsOrBuilder> 
          getStatisticsFieldBuilder() {
        if (statisticsBuilder_ == null) {
          statisticsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              ColumnStatistics, ColumnStatistics.Builder, ColumnStatisticsOrBuilder>(
                  statistics_,
                  ((bitField0_ & 0x00000040) == 0x00000040),
                  getParentForChildren(),
                  isClean());
          statistics_ = null;
        }
        return statisticsBuilder_;
      }

      // optional uint32 rowIndexStride = 8;
      private int rowIndexStride_ ;
      /**
       * <code>optional uint32 rowIndexStride = 8;</code>
       */
      public boolean hasRowIndexStride() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional uint32 rowIndexStride = 8;</code>
       */
      public int getRowIndexStride() {
        return rowIndexStride_;
      }
      /**
       * <code>optional uint32 rowIndexStride = 8;</code>
       */
      public Builder setRowIndexStride(int value) {
        bitField0_ |= 0x00000080;
        rowIndexStride_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 rowIndexStride = 8;</code>
       */
      public Builder clearRowIndexStride() {
        bitField0_ = (bitField0_ & ~0x00000080);
        rowIndexStride_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.Footer)
    }

    static {
      defaultInstance = new Footer(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.Footer)
  }

  public interface PostScriptOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional uint64 footerLength = 1;
    /**
     * <code>optional uint64 footerLength = 1;</code>
     */
    boolean hasFooterLength();
    /**
     * <code>optional uint64 footerLength = 1;</code>
     */
    long getFooterLength();

    // optional .orc.proto.CompressionKind compression = 2;
    /**
     * <code>optional .orc.proto.CompressionKind compression = 2;</code>
     */
    boolean hasCompression();
    /**
     * <code>optional .orc.proto.CompressionKind compression = 2;</code>
     */
    CompressionKind getCompression();

    // optional uint64 compressionBlockSize = 3;
    /**
     * <code>optional uint64 compressionBlockSize = 3;</code>
     */
    boolean hasCompressionBlockSize();
    /**
     * <code>optional uint64 compressionBlockSize = 3;</code>
     */
    long getCompressionBlockSize();

    // repeated uint32 version = 4 [packed = true];
    /**
     * <code>repeated uint32 version = 4 [packed = true];</code>
     *
     * <pre>
     * the version of the file format
     *   [0, 11] = Hive 0.11
     *   [0, 12] = Hive 0.12
     * </pre>
     */
    java.util.List<java.lang.Integer> getVersionList();
    /**
     * <code>repeated uint32 version = 4 [packed = true];</code>
     *
     * <pre>
     * the version of the file format
     *   [0, 11] = Hive 0.11
     *   [0, 12] = Hive 0.12
     * </pre>
     */
    int getVersionCount();
    /**
     * <code>repeated uint32 version = 4 [packed = true];</code>
     *
     * <pre>
     * the version of the file format
     *   [0, 11] = Hive 0.11
     *   [0, 12] = Hive 0.12
     * </pre>
     */
    int getVersion(int index);

    // optional uint64 metadataLength = 5;
    /**
     * <code>optional uint64 metadataLength = 5;</code>
     */
    boolean hasMetadataLength();
    /**
     * <code>optional uint64 metadataLength = 5;</code>
     */
    long getMetadataLength();

    // optional uint32 writerVersion = 6;
    /**
     * <code>optional uint32 writerVersion = 6;</code>
     *
     * <pre>
     * Version of the writer:
     *   0 (or missing) = original
     *   1 = HIVE-8732 fixed
     * </pre>
     */
    boolean hasWriterVersion();
    /**
     * <code>optional uint32 writerVersion = 6;</code>
     *
     * <pre>
     * Version of the writer:
     *   0 (or missing) = original
     *   1 = HIVE-8732 fixed
     * </pre>
     */
    int getWriterVersion();

    // optional string magic = 8000;
    /**
     * <code>optional string magic = 8000;</code>
     *
     * <pre>
     * Leave this last in the record
     * </pre>
     */
    boolean hasMagic();
    /**
     * <code>optional string magic = 8000;</code>
     *
     * <pre>
     * Leave this last in the record
     * </pre>
     */
    java.lang.String getMagic();
    /**
     * <code>optional string magic = 8000;</code>
     *
     * <pre>
     * Leave this last in the record
     * </pre>
     */
    com.google.protobuf.ByteString
        getMagicBytes();
  }
  /**
   * Protobuf type {@code orc.proto.PostScript}
   *
   * <pre>
   * Serialized length must be less that 255 bytes
   * </pre>
   */
  public static final class PostScript extends
      com.google.protobuf.GeneratedMessage
      implements PostScriptOrBuilder {
    // Use PostScript.newBuilder() to construct.
    private PostScript(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PostScript(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PostScript defaultInstance;
    public static PostScript getDefaultInstance() {
      return defaultInstance;
    }

    public PostScript getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PostScript(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              footerLength_ = input.readUInt64();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              CompressionKind value = CompressionKind.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                compression_ = value;
              }
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              compressionBlockSize_ = input.readUInt64();
              break;
            }
            case 32: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                version_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000008;
              }
              version_.add(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008) && input.getBytesUntilLimit() > 0) {
                version_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000008;
              }
              while (input.getBytesUntilLimit() > 0) {
                version_.add(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 40: {
              bitField0_ |= 0x00000008;
              metadataLength_ = input.readUInt64();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000010;
              writerVersion_ = input.readUInt32();
              break;
            }
            case 64002: {
              bitField0_ |= 0x00000020;
              magic_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          version_ = java.util.Collections.unmodifiableList(version_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_orc_proto_PostScript_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_orc_proto_PostScript_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PostScript.class, PostScript.Builder.class);
    }

    public static com.google.protobuf.Parser<PostScript> PARSER =
        new com.google.protobuf.AbstractParser<PostScript>() {
      public PostScript parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PostScript(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PostScript> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional uint64 footerLength = 1;
    public static final int FOOTERLENGTH_FIELD_NUMBER = 1;
    private long footerLength_;
    /**
     * <code>optional uint64 footerLength = 1;</code>
     */
    public boolean hasFooterLength() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 footerLength = 1;</code>
     */
    public long getFooterLength() {
      return footerLength_;
    }

    // optional .orc.proto.CompressionKind compression = 2;
    public static final int COMPRESSION_FIELD_NUMBER = 2;
    private CompressionKind compression_;
    /**
     * <code>optional .orc.proto.CompressionKind compression = 2;</code>
     */
    public boolean hasCompression() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .orc.proto.CompressionKind compression = 2;</code>
     */
    public CompressionKind getCompression() {
      return compression_;
    }

    // optional uint64 compressionBlockSize = 3;
    public static final int COMPRESSIONBLOCKSIZE_FIELD_NUMBER = 3;
    private long compressionBlockSize_;
    /**
     * <code>optional uint64 compressionBlockSize = 3;</code>
     */
    public boolean hasCompressionBlockSize() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint64 compressionBlockSize = 3;</code>
     */
    public long getCompressionBlockSize() {
      return compressionBlockSize_;
    }

    // repeated uint32 version = 4 [packed = true];
    public static final int VERSION_FIELD_NUMBER = 4;
    private java.util.List<java.lang.Integer> version_;
    /**
     * <code>repeated uint32 version = 4 [packed = true];</code>
     *
     * <pre>
     * the version of the file format
     *   [0, 11] = Hive 0.11
     *   [0, 12] = Hive 0.12
     * </pre>
     */
    public java.util.List<java.lang.Integer>
        getVersionList() {
      return version_;
    }
    /**
     * <code>repeated uint32 version = 4 [packed = true];</code>
     *
     * <pre>
     * the version of the file format
     *   [0, 11] = Hive 0.11
     *   [0, 12] = Hive 0.12
     * </pre>
     */
    public int getVersionCount() {
      return version_.size();
    }
    /**
     * <code>repeated uint32 version = 4 [packed = true];</code>
     *
     * <pre>
     * the version of the file format
     *   [0, 11] = Hive 0.11
     *   [0, 12] = Hive 0.12
     * </pre>
     */
    public int getVersion(int index) {
      return version_.get(index);
    }
    private int versionMemoizedSerializedSize = -1;

    // optional uint64 metadataLength = 5;
    public static final int METADATALENGTH_FIELD_NUMBER = 5;
    private long metadataLength_;
    /**
     * <code>optional uint64 metadataLength = 5;</code>
     */
    public boolean hasMetadataLength() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint64 metadataLength = 5;</code>
     */
    public long getMetadataLength() {
      return metadataLength_;
    }

    // optional uint32 writerVersion = 6;
    public static final int WRITERVERSION_FIELD_NUMBER = 6;
    private int writerVersion_;
    /**
     * <code>optional uint32 writerVersion = 6;</code>
     *
     * <pre>
     * Version of the writer:
     *   0 (or missing) = original
     *   1 = HIVE-8732 fixed
     * </pre>
     */
    public boolean hasWriterVersion() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional uint32 writerVersion = 6;</code>
     *
     * <pre>
     * Version of the writer:
     *   0 (or missing) = original
     *   1 = HIVE-8732 fixed
     * </pre>
     */
    public int getWriterVersion() {
      return writerVersion_;
    }

    // optional string magic = 8000;
    public static final int MAGIC_FIELD_NUMBER = 8000;
    private java.lang.Object magic_;
    /**
     * <code>optional string magic = 8000;</code>
     *
     * <pre>
     * Leave this last in the record
     * </pre>
     */
    public boolean hasMagic() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional string magic = 8000;</code>
     *
     * <pre>
     * Leave this last in the record
     * </pre>
     */
    public java.lang.String getMagic() {
      java.lang.Object ref = magic_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          magic_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string magic = 8000;</code>
     *
     * <pre>
     * Leave this last in the record
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMagicBytes() {
      java.lang.Object ref = magic_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        magic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      footerLength_ = 0L;
      compression_ = CompressionKind.NONE;
      compressionBlockSize_ = 0L;
      version_ = java.util.Collections.emptyList();
      metadataLength_ = 0L;
      writerVersion_ = 0;
      magic_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, footerLength_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, compression_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, compressionBlockSize_);
      }
      if (getVersionList().size() > 0) {
        output.writeRawVarint32(34);
        output.writeRawVarint32(versionMemoizedSerializedSize);
      }
      for (int i = 0; i < version_.size(); i++) {
        output.writeUInt32NoTag(version_.get(i));
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt64(5, metadataLength_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt32(6, writerVersion_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(8000, getMagicBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, footerLength_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, compression_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, compressionBlockSize_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < version_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(version_.get(i));
        }
        size += dataSize;
        if (!getVersionList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        versionMemoizedSerializedSize = dataSize;
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, metadataLength_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, writerVersion_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(8000, getMagicBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static PostScript parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PostScript parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PostScript parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PostScript parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PostScript parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static PostScript parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static PostScript parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static PostScript parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static PostScript parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static PostScript parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(PostScript prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code orc.proto.PostScript}
     *
     * <pre>
     * Serialized length must be less that 255 bytes
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements PostScriptOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_orc_proto_PostScript_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_orc_proto_PostScript_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PostScript.class, PostScript.Builder.class);
      }

      // Construct using PostScript.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        footerLength_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        compression_ = CompressionKind.NONE;
        bitField0_ = (bitField0_ & ~0x00000002);
        compressionBlockSize_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        version_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        metadataLength_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        writerVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        magic_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_orc_proto_PostScript_descriptor;
      }

      public PostScript getDefaultInstanceForType() {
        return PostScript.getDefaultInstance();
      }

      public PostScript build() {
        PostScript result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public PostScript buildPartial() {
        PostScript result = new PostScript(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.footerLength_ = footerLength_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.compression_ = compression_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.compressionBlockSize_ = compressionBlockSize_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          version_ = java.util.Collections.unmodifiableList(version_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.version_ = version_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000008;
        }
        result.metadataLength_ = metadataLength_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000010;
        }
        result.writerVersion_ = writerVersion_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000020;
        }
        result.magic_ = magic_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof PostScript) {
          return mergeFrom((PostScript)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PostScript other) {
        if (other == PostScript.getDefaultInstance()) return this;
        if (other.hasFooterLength()) {
          setFooterLength(other.getFooterLength());
        }
        if (other.hasCompression()) {
          setCompression(other.getCompression());
        }
        if (other.hasCompressionBlockSize()) {
          setCompressionBlockSize(other.getCompressionBlockSize());
        }
        if (!other.version_.isEmpty()) {
          if (version_.isEmpty()) {
            version_ = other.version_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureVersionIsMutable();
            version_.addAll(other.version_);
          }
          onChanged();
        }
        if (other.hasMetadataLength()) {
          setMetadataLength(other.getMetadataLength());
        }
        if (other.hasWriterVersion()) {
          setWriterVersion(other.getWriterVersion());
        }
        if (other.hasMagic()) {
          bitField0_ |= 0x00000040;
          magic_ = other.magic_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        PostScript parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (PostScript) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional uint64 footerLength = 1;
      private long footerLength_ ;
      /**
       * <code>optional uint64 footerLength = 1;</code>
       */
      public boolean hasFooterLength() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint64 footerLength = 1;</code>
       */
      public long getFooterLength() {
        return footerLength_;
      }
      /**
       * <code>optional uint64 footerLength = 1;</code>
       */
      public Builder setFooterLength(long value) {
        bitField0_ |= 0x00000001;
        footerLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 footerLength = 1;</code>
       */
      public Builder clearFooterLength() {
        bitField0_ = (bitField0_ & ~0x00000001);
        footerLength_ = 0L;
        onChanged();
        return this;
      }

      // optional .orc.proto.CompressionKind compression = 2;
      private CompressionKind compression_ = CompressionKind.NONE;
      /**
       * <code>optional .orc.proto.CompressionKind compression = 2;</code>
       */
      public boolean hasCompression() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .orc.proto.CompressionKind compression = 2;</code>
       */
      public CompressionKind getCompression() {
        return compression_;
      }
      /**
       * <code>optional .orc.proto.CompressionKind compression = 2;</code>
       */
      public Builder setCompression(CompressionKind value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        compression_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .orc.proto.CompressionKind compression = 2;</code>
       */
      public Builder clearCompression() {
        bitField0_ = (bitField0_ & ~0x00000002);
        compression_ = CompressionKind.NONE;
        onChanged();
        return this;
      }

      // optional uint64 compressionBlockSize = 3;
      private long compressionBlockSize_ ;
      /**
       * <code>optional uint64 compressionBlockSize = 3;</code>
       */
      public boolean hasCompressionBlockSize() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint64 compressionBlockSize = 3;</code>
       */
      public long getCompressionBlockSize() {
        return compressionBlockSize_;
      }
      /**
       * <code>optional uint64 compressionBlockSize = 3;</code>
       */
      public Builder setCompressionBlockSize(long value) {
        bitField0_ |= 0x00000004;
        compressionBlockSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 compressionBlockSize = 3;</code>
       */
      public Builder clearCompressionBlockSize() {
        bitField0_ = (bitField0_ & ~0x00000004);
        compressionBlockSize_ = 0L;
        onChanged();
        return this;
      }

      // repeated uint32 version = 4 [packed = true];
      private java.util.List<java.lang.Integer> version_ = java.util.Collections.emptyList();
      private void ensureVersionIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          version_ = new java.util.ArrayList<java.lang.Integer>(version_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated uint32 version = 4 [packed = true];</code>
       *
       * <pre>
       * the version of the file format
       *   [0, 11] = Hive 0.11
       *   [0, 12] = Hive 0.12
       * </pre>
       */
      public java.util.List<java.lang.Integer>
          getVersionList() {
        return java.util.Collections.unmodifiableList(version_);
      }
      /**
       * <code>repeated uint32 version = 4 [packed = true];</code>
       *
       * <pre>
       * the version of the file format
       *   [0, 11] = Hive 0.11
       *   [0, 12] = Hive 0.12
       * </pre>
       */
      public int getVersionCount() {
        return version_.size();
      }
      /**
       * <code>repeated uint32 version = 4 [packed = true];</code>
       *
       * <pre>
       * the version of the file format
       *   [0, 11] = Hive 0.11
       *   [0, 12] = Hive 0.12
       * </pre>
       */
      public int getVersion(int index) {
        return version_.get(index);
      }
      /**
       * <code>repeated uint32 version = 4 [packed = true];</code>
       *
       * <pre>
       * the version of the file format
       *   [0, 11] = Hive 0.11
       *   [0, 12] = Hive 0.12
       * </pre>
       */
      public Builder setVersion(
          int index, int value) {
        ensureVersionIsMutable();
        version_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 version = 4 [packed = true];</code>
       *
       * <pre>
       * the version of the file format
       *   [0, 11] = Hive 0.11
       *   [0, 12] = Hive 0.12
       * </pre>
       */
      public Builder addVersion(int value) {
        ensureVersionIsMutable();
        version_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 version = 4 [packed = true];</code>
       *
       * <pre>
       * the version of the file format
       *   [0, 11] = Hive 0.11
       *   [0, 12] = Hive 0.12
       * </pre>
       */
      public Builder addAllVersion(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureVersionIsMutable();
        super.addAll(values, version_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 version = 4 [packed = true];</code>
       *
       * <pre>
       * the version of the file format
       *   [0, 11] = Hive 0.11
       *   [0, 12] = Hive 0.12
       * </pre>
       */
      public Builder clearVersion() {
        version_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }

      // optional uint64 metadataLength = 5;
      private long metadataLength_ ;
      /**
       * <code>optional uint64 metadataLength = 5;</code>
       */
      public boolean hasMetadataLength() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional uint64 metadataLength = 5;</code>
       */
      public long getMetadataLength() {
        return metadataLength_;
      }
      /**
       * <code>optional uint64 metadataLength = 5;</code>
       */
      public Builder setMetadataLength(long value) {
        bitField0_ |= 0x00000010;
        metadataLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 metadataLength = 5;</code>
       */
      public Builder clearMetadataLength() {
        bitField0_ = (bitField0_ & ~0x00000010);
        metadataLength_ = 0L;
        onChanged();
        return this;
      }

      // optional uint32 writerVersion = 6;
      private int writerVersion_ ;
      /**
       * <code>optional uint32 writerVersion = 6;</code>
       *
       * <pre>
       * Version of the writer:
       *   0 (or missing) = original
       *   1 = HIVE-8732 fixed
       * </pre>
       */
      public boolean hasWriterVersion() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional uint32 writerVersion = 6;</code>
       *
       * <pre>
       * Version of the writer:
       *   0 (or missing) = original
       *   1 = HIVE-8732 fixed
       * </pre>
       */
      public int getWriterVersion() {
        return writerVersion_;
      }
      /**
       * <code>optional uint32 writerVersion = 6;</code>
       *
       * <pre>
       * Version of the writer:
       *   0 (or missing) = original
       *   1 = HIVE-8732 fixed
       * </pre>
       */
      public Builder setWriterVersion(int value) {
        bitField0_ |= 0x00000020;
        writerVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 writerVersion = 6;</code>
       *
       * <pre>
       * Version of the writer:
       *   0 (or missing) = original
       *   1 = HIVE-8732 fixed
       * </pre>
       */
      public Builder clearWriterVersion() {
        bitField0_ = (bitField0_ & ~0x00000020);
        writerVersion_ = 0;
        onChanged();
        return this;
      }

      // optional string magic = 8000;
      private java.lang.Object magic_ = "";
      /**
       * <code>optional string magic = 8000;</code>
       *
       * <pre>
       * Leave this last in the record
       * </pre>
       */
      public boolean hasMagic() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional string magic = 8000;</code>
       *
       * <pre>
       * Leave this last in the record
       * </pre>
       */
      public java.lang.String getMagic() {
        java.lang.Object ref = magic_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          magic_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string magic = 8000;</code>
       *
       * <pre>
       * Leave this last in the record
       * </pre>
       */
      public com.google.protobuf.ByteString
          getMagicBytes() {
        java.lang.Object ref = magic_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          magic_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string magic = 8000;</code>
       *
       * <pre>
       * Leave this last in the record
       * </pre>
       */
      public Builder setMagic(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        magic_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string magic = 8000;</code>
       *
       * <pre>
       * Leave this last in the record
       * </pre>
       */
      public Builder clearMagic() {
        bitField0_ = (bitField0_ & ~0x00000040);
        magic_ = getDefaultInstance().getMagic();
        onChanged();
        return this;
      }
      /**
       * <code>optional string magic = 8000;</code>
       *
       * <pre>
       * Leave this last in the record
       * </pre>
       */
      public Builder setMagicBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        magic_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:orc.proto.PostScript)
    }

    static {
      defaultInstance = new PostScript(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:orc.proto.PostScript)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_IntegerStatistics_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_IntegerStatistics_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_DoubleStatistics_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_DoubleStatistics_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_StringStatistics_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_StringStatistics_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_BucketStatistics_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_BucketStatistics_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_DecimalStatistics_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_DecimalStatistics_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_DateStatistics_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_DateStatistics_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_TimestampStatistics_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_TimestampStatistics_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_BinaryStatistics_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_BinaryStatistics_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_ColumnStatistics_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_ColumnStatistics_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_RowIndexEntry_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_RowIndexEntry_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_RowIndex_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_RowIndex_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_BloomFilter_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_BloomFilter_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_BloomFilterIndex_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_BloomFilterIndex_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_Stream_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_Stream_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_ColumnEncoding_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_ColumnEncoding_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_StripeFooter_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_StripeFooter_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_Type_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_Type_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_StripeInformation_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_StripeInformation_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_UserMetadataItem_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_UserMetadataItem_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_StripeStatistics_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_StripeStatistics_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_Metadata_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_Metadata_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_Footer_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_Footer_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_orc_proto_PostScript_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_orc_proto_PostScript_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017orc_proto.proto\022\torc.proto\"B\n\021IntegerS" +
      "tatistics\022\017\n\007minimum\030\001 \001(\022\022\017\n\007maximum\030\002 " +
      "\001(\022\022\013\n\003sum\030\003 \001(\022\"A\n\020DoubleStatistics\022\017\n\007" +
      "minimum\030\001 \001(\001\022\017\n\007maximum\030\002 \001(\001\022\013\n\003sum\030\003 " +
      "\001(\001\"A\n\020StringStatistics\022\017\n\007minimum\030\001 \001(\t" +
      "\022\017\n\007maximum\030\002 \001(\t\022\013\n\003sum\030\003 \001(\022\"%\n\020Bucket" +
      "Statistics\022\021\n\005count\030\001 \003(\004B\002\020\001\"B\n\021Decimal" +
      "Statistics\022\017\n\007minimum\030\001 \001(\t\022\017\n\007maximum\030\002" +
      " \001(\t\022\013\n\003sum\030\003 \001(\t\"2\n\016DateStatistics\022\017\n\007m" +
      "inimum\030\001 \001(\021\022\017\n\007maximum\030\002 \001(\021\"7\n\023Timesta",
      "mpStatistics\022\017\n\007minimum\030\001 \001(\022\022\017\n\007maximum" +
      "\030\002 \001(\022\"\037\n\020BinaryStatistics\022\013\n\003sum\030\001 \001(\022\"" +
      "\365\003\n\020ColumnStatistics\022\026\n\016numberOfValues\030\001" +
      " \001(\004\0223\n\rintStatistics\030\002 \001(\0132\034.orc.proto." +
      "IntegerStatistics\0225\n\020doubleStatistics\030\003 " +
      "\001(\0132\033.orc.proto.DoubleStatistics\0225\n\020stri" +
      "ngStatistics\030\004 \001(\0132\033.orc.proto.StringSta" +
      "tistics\0225\n\020bucketStatistics\030\005 \001(\0132\033.orc." +
      "proto.BucketStatistics\0227\n\021decimalStatist" +
      "ics\030\006 \001(\0132\034.orc.proto.DecimalStatistics\022",
      "1\n\016dateStatistics\030\007 \001(\0132\031.orc.proto.Date" +
      "Statistics\0225\n\020binaryStatistics\030\010 \001(\0132\033.o" +
      "rc.proto.BinaryStatistics\022;\n\023timestampSt" +
      "atistics\030\t \001(\0132\036.orc.proto.TimestampStat" +
      "istics\022\017\n\007hasNull\030\n \001(\010\"W\n\rRowIndexEntry" +
      "\022\025\n\tpositions\030\001 \003(\004B\002\020\001\022/\n\nstatistics\030\002 " +
      "\001(\0132\033.orc.proto.ColumnStatistics\"3\n\010RowI" +
      "ndex\022\'\n\005entry\030\001 \003(\0132\030.orc.proto.RowIndex" +
      "Entry\"7\n\013BloomFilter\022\030\n\020numHashFunctions" +
      "\030\001 \001(\r\022\016\n\006bitset\030\002 \003(\006\"?\n\020BloomFilterInd",
      "ex\022+\n\013bloomFilter\030\001 \003(\0132\026.orc.proto.Bloo" +
      "mFilter\"\325\001\n\006Stream\022$\n\004kind\030\001 \001(\0162\026.orc.p" +
      "roto.Stream.Kind\022\016\n\006column\030\002 \001(\r\022\016\n\006leng" +
      "th\030\003 \001(\004\"\204\001\n\004Kind\022\013\n\007PRESENT\020\000\022\010\n\004DATA\020\001" +
      "\022\n\n\006LENGTH\020\002\022\023\n\017DICTIONARY_DATA\020\003\022\024\n\020DIC" +
      "TIONARY_COUNT\020\004\022\r\n\tSECONDARY\020\005\022\r\n\tROW_IN" +
      "DEX\020\006\022\020\n\014BLOOM_FILTER\020\007\"\234\001\n\016ColumnEncodi" +
      "ng\022,\n\004kind\030\001 \001(\0162\036.orc.proto.ColumnEncod" +
      "ing.Kind\022\026\n\016dictionarySize\030\002 \001(\r\"D\n\004Kind" +
      "\022\n\n\006DIRECT\020\000\022\016\n\nDICTIONARY\020\001\022\r\n\tDIRECT_V",
      "2\020\002\022\021\n\rDICTIONARY_V2\020\003\"v\n\014StripeFooter\022\"" +
      "\n\007streams\030\001 \003(\0132\021.orc.proto.Stream\022*\n\007co" +
      "lumns\030\002 \003(\0132\031.orc.proto.ColumnEncoding\022\026" +
      "\n\016writerTimezone\030\003 \001(\t\"\341\002\n\004Type\022\"\n\004kind\030" +
      "\001 \001(\0162\024.orc.proto.Type.Kind\022\024\n\010subtypes\030" +
      "\002 \003(\rB\002\020\001\022\022\n\nfieldNames\030\003 \003(\t\022\025\n\rmaximum" +
      "Length\030\004 \001(\r\022\021\n\tprecision\030\005 \001(\r\022\r\n\005scale" +
      "\030\006 \001(\r\"\321\001\n\004Kind\022\013\n\007BOOLEAN\020\000\022\010\n\004BYTE\020\001\022\t" +
      "\n\005SHORT\020\002\022\007\n\003INT\020\003\022\010\n\004LONG\020\004\022\t\n\005FLOAT\020\005\022" +
      "\n\n\006DOUBLE\020\006\022\n\n\006STRING\020\007\022\n\n\006BINARY\020\010\022\r\n\tT",
      "IMESTAMP\020\t\022\010\n\004LIST\020\n\022\007\n\003MAP\020\013\022\n\n\006STRUCT\020" +
      "\014\022\t\n\005UNION\020\r\022\013\n\007DECIMAL\020\016\022\010\n\004DATE\020\017\022\013\n\007V" +
      "ARCHAR\020\020\022\010\n\004CHAR\020\021\"x\n\021StripeInformation\022" +
      "\016\n\006offset\030\001 \001(\004\022\023\n\013indexLength\030\002 \001(\004\022\022\n\n" +
      "dataLength\030\003 \001(\004\022\024\n\014footerLength\030\004 \001(\004\022\024" +
      "\n\014numberOfRows\030\005 \001(\004\"/\n\020UserMetadataItem" +
      "\022\014\n\004name\030\001 \001(\t\022\r\n\005value\030\002 \001(\014\"A\n\020StripeS" +
      "tatistics\022-\n\010colStats\030\001 \003(\0132\033.orc.proto." +
      "ColumnStatistics\"<\n\010Metadata\0220\n\013stripeSt" +
      "ats\030\001 \003(\0132\033.orc.proto.StripeStatistics\"\222",
      "\002\n\006Footer\022\024\n\014headerLength\030\001 \001(\004\022\025\n\rconte" +
      "ntLength\030\002 \001(\004\022-\n\007stripes\030\003 \003(\0132\034.orc.pr" +
      "oto.StripeInformation\022\036\n\005types\030\004 \003(\0132\017.o" +
      "rc.proto.Type\022-\n\010metadata\030\005 \003(\0132\033.orc.pr" +
      "oto.UserMetadataItem\022\024\n\014numberOfRows\030\006 \001" +
      "(\004\022/\n\nstatistics\030\007 \003(\0132\033.orc.proto.Colum" +
      "nStatistics\022\026\n\016rowIndexStride\030\010 \001(\r\"\305\001\n\n" +
      "PostScript\022\024\n\014footerLength\030\001 \001(\004\022/\n\013comp" +
      "ression\030\002 \001(\0162\032.orc.proto.CompressionKin" +
      "d\022\034\n\024compressionBlockSize\030\003 \001(\004\022\023\n\007versi",
      "on\030\004 \003(\rB\002\020\001\022\026\n\016metadataLength\030\005 \001(\004\022\025\n\r" +
      "writerVersion\030\006 \001(\r\022\016\n\005magic\030\300> \001(\t*:\n\017C" +
      "ompressionKind\022\010\n\004NONE\020\000\022\010\n\004ZLIB\020\001\022\n\n\006SN" +
      "APPY\020\002\022\007\n\003LZO\020\003B\"\n org.apache.hadoop.hiv" +
      "e.ql.io.orc"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_orc_proto_IntegerStatistics_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_orc_proto_IntegerStatistics_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_IntegerStatistics_descriptor,
              new java.lang.String[] { "Minimum", "Maximum", "Sum", });
          internal_static_orc_proto_DoubleStatistics_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_orc_proto_DoubleStatistics_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_DoubleStatistics_descriptor,
              new java.lang.String[] { "Minimum", "Maximum", "Sum", });
          internal_static_orc_proto_StringStatistics_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_orc_proto_StringStatistics_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_StringStatistics_descriptor,
              new java.lang.String[] { "Minimum", "Maximum", "Sum", });
          internal_static_orc_proto_BucketStatistics_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_orc_proto_BucketStatistics_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_BucketStatistics_descriptor,
              new java.lang.String[] { "Count", });
          internal_static_orc_proto_DecimalStatistics_descriptor =
            getDescriptor().getMessageTypes().get(4);
          internal_static_orc_proto_DecimalStatistics_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_DecimalStatistics_descriptor,
              new java.lang.String[] { "Minimum", "Maximum", "Sum", });
          internal_static_orc_proto_DateStatistics_descriptor =
            getDescriptor().getMessageTypes().get(5);
          internal_static_orc_proto_DateStatistics_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_DateStatistics_descriptor,
              new java.lang.String[] { "Minimum", "Maximum", });
          internal_static_orc_proto_TimestampStatistics_descriptor =
            getDescriptor().getMessageTypes().get(6);
          internal_static_orc_proto_TimestampStatistics_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_TimestampStatistics_descriptor,
              new java.lang.String[] { "Minimum", "Maximum", });
          internal_static_orc_proto_BinaryStatistics_descriptor =
            getDescriptor().getMessageTypes().get(7);
          internal_static_orc_proto_BinaryStatistics_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_BinaryStatistics_descriptor,
              new java.lang.String[] { "Sum", });
          internal_static_orc_proto_ColumnStatistics_descriptor =
            getDescriptor().getMessageTypes().get(8);
          internal_static_orc_proto_ColumnStatistics_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_ColumnStatistics_descriptor,
              new java.lang.String[] { "NumberOfValues", "IntStatistics", "DoubleStatistics", "StringStatistics", "BucketStatistics", "DecimalStatistics", "DateStatistics", "BinaryStatistics", "TimestampStatistics", "HasNull", });
          internal_static_orc_proto_RowIndexEntry_descriptor =
            getDescriptor().getMessageTypes().get(9);
          internal_static_orc_proto_RowIndexEntry_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_RowIndexEntry_descriptor,
              new java.lang.String[] { "Positions", "Statistics", });
          internal_static_orc_proto_RowIndex_descriptor =
            getDescriptor().getMessageTypes().get(10);
          internal_static_orc_proto_RowIndex_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_RowIndex_descriptor,
              new java.lang.String[] { "Entry", });
          internal_static_orc_proto_BloomFilter_descriptor =
            getDescriptor().getMessageTypes().get(11);
          internal_static_orc_proto_BloomFilter_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_BloomFilter_descriptor,
              new java.lang.String[] { "NumHashFunctions", "Bitset", });
          internal_static_orc_proto_BloomFilterIndex_descriptor =
            getDescriptor().getMessageTypes().get(12);
          internal_static_orc_proto_BloomFilterIndex_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_BloomFilterIndex_descriptor,
              new java.lang.String[] { "BloomFilter", });
          internal_static_orc_proto_Stream_descriptor =
            getDescriptor().getMessageTypes().get(13);
          internal_static_orc_proto_Stream_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_Stream_descriptor,
              new java.lang.String[] { "Kind", "Column", "Length", });
          internal_static_orc_proto_ColumnEncoding_descriptor =
            getDescriptor().getMessageTypes().get(14);
          internal_static_orc_proto_ColumnEncoding_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_ColumnEncoding_descriptor,
              new java.lang.String[] { "Kind", "DictionarySize", });
          internal_static_orc_proto_StripeFooter_descriptor =
            getDescriptor().getMessageTypes().get(15);
          internal_static_orc_proto_StripeFooter_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_StripeFooter_descriptor,
              new java.lang.String[] { "Streams", "Columns", "WriterTimezone", });
          internal_static_orc_proto_Type_descriptor =
            getDescriptor().getMessageTypes().get(16);
          internal_static_orc_proto_Type_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_Type_descriptor,
              new java.lang.String[] { "Kind", "Subtypes", "FieldNames", "MaximumLength", "Precision", "Scale", });
          internal_static_orc_proto_StripeInformation_descriptor =
            getDescriptor().getMessageTypes().get(17);
          internal_static_orc_proto_StripeInformation_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_StripeInformation_descriptor,
              new java.lang.String[] { "Offset", "IndexLength", "DataLength", "FooterLength", "NumberOfRows", });
          internal_static_orc_proto_UserMetadataItem_descriptor =
            getDescriptor().getMessageTypes().get(18);
          internal_static_orc_proto_UserMetadataItem_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_UserMetadataItem_descriptor,
              new java.lang.String[] { "Name", "Value", });
          internal_static_orc_proto_StripeStatistics_descriptor =
            getDescriptor().getMessageTypes().get(19);
          internal_static_orc_proto_StripeStatistics_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_StripeStatistics_descriptor,
              new java.lang.String[] { "ColStats", });
          internal_static_orc_proto_Metadata_descriptor =
            getDescriptor().getMessageTypes().get(20);
          internal_static_orc_proto_Metadata_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_Metadata_descriptor,
              new java.lang.String[] { "StripeStats", });
          internal_static_orc_proto_Footer_descriptor =
            getDescriptor().getMessageTypes().get(21);
          internal_static_orc_proto_Footer_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_Footer_descriptor,
              new java.lang.String[] { "HeaderLength", "ContentLength", "Stripes", "Types", "Metadata", "NumberOfRows", "Statistics", "RowIndexStride", });
          internal_static_orc_proto_PostScript_descriptor =
            getDescriptor().getMessageTypes().get(22);
          internal_static_orc_proto_PostScript_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_orc_proto_PostScript_descriptor,
              new java.lang.String[] { "FooterLength", "Compression", "CompressionBlockSize", "Version", "MetadataLength", "WriterVersion", "Magic", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
