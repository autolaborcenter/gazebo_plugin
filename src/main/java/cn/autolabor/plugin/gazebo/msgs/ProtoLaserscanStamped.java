// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laserscan_stamped.proto

package cn.autolabor.plugin.gazebo.msgs;

public final class ProtoLaserscanStamped {
  private ProtoLaserscanStamped() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LaserScanStampedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.LaserScanStamped)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    boolean hasTime();
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time getTime();
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder getTimeOrBuilder();

    /**
     * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
     */
    boolean hasScan();
    /**
     * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan getScan();
    /**
     * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
     */
    cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScanOrBuilder getScanOrBuilder();
  }
  /**
   * Protobuf type {@code gazebo.msgs.LaserScanStamped}
   */
  public static final class LaserScanStamped extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.LaserScanStamped)
      LaserScanStampedOrBuilder {
    // Use LaserScanStamped.newBuilder() to construct.
    private LaserScanStamped(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private LaserScanStamped(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final LaserScanStamped defaultInstance;
    public static LaserScanStamped getDefaultInstance() {
      return defaultInstance;
    }

    public LaserScanStamped getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private LaserScanStamped(
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
              cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = time_.toBuilder();
              }
              time_ = input.readMessage(cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(time_);
                time_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = scan_.toBuilder();
              }
              scan_ = input.readMessage(cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(scan_);
                scan_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
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
      return cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.internal_static_gazebo_msgs_LaserScanStamped_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.internal_static_gazebo_msgs_LaserScanStamped_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped.class, cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped.Builder.class);
    }

    public static com.google.protobuf.Parser<LaserScanStamped> PARSER =
        new com.google.protobuf.AbstractParser<LaserScanStamped>() {
      public LaserScanStamped parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LaserScanStamped(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<LaserScanStamped> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TIME_FIELD_NUMBER = 1;
    private cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time time_;
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time getTime() {
      return time_;
    }
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder getTimeOrBuilder() {
      return time_;
    }

    public static final int SCAN_FIELD_NUMBER = 2;
    private cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan scan_;
    /**
     * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
     */
    public boolean hasScan() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan getScan() {
      return scan_;
    }
    /**
     * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
     */
    public cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScanOrBuilder getScanOrBuilder() {
      return scan_;
    }

    private void initFields() {
      time_ = cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.getDefaultInstance();
      scan_ = cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasScan()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTime().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getScan().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, time_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, scan_);
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
          .computeMessageSize(1, time_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, scan_);
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

    public static cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped prototype) {
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
     * Protobuf type {@code gazebo.msgs.LaserScanStamped}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.LaserScanStamped)
        cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStampedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.internal_static_gazebo_msgs_LaserScanStamped_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.internal_static_gazebo_msgs_LaserScanStamped_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped.class, cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped.newBuilder()
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
          getTimeFieldBuilder();
          getScanFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (timeBuilder_ == null) {
          time_ = cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.getDefaultInstance();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (scanBuilder_ == null) {
          scan_ = cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan.getDefaultInstance();
        } else {
          scanBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.internal_static_gazebo_msgs_LaserScanStamped_descriptor;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped build() {
        cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped buildPartial() {
        cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped result = new cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (timeBuilder_ == null) {
          result.time_ = time_;
        } else {
          result.time_ = timeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (scanBuilder_ == null) {
          result.scan_ = scan_;
        } else {
          result.scan_ = scanBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped) {
          return mergeFrom((cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped other) {
        if (other == cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped.getDefaultInstance()) return this;
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        if (other.hasScan()) {
          mergeScan(other.getScan());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTime()) {
          
          return false;
        }
        if (!hasScan()) {
          
          return false;
        }
        if (!getTime().isInitialized()) {
          
          return false;
        }
        if (!getScan().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.msgs.ProtoLaserscanStamped.LaserScanStamped) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time time_ = cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder> timeBuilder_;
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time getTime() {
        if (timeBuilder_ == null) {
          return time_;
        } else {
          return timeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public Builder setTime(cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time value) {
        if (timeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          time_ = value;
          onChanged();
        } else {
          timeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public Builder setTime(
          cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder builderForValue) {
        if (timeBuilder_ == null) {
          time_ = builderForValue.build();
          onChanged();
        } else {
          timeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public Builder mergeTime(cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time value) {
        if (timeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              time_ != cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.getDefaultInstance()) {
            time_ =
              cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.newBuilder(time_).mergeFrom(value).buildPartial();
          } else {
            time_ = value;
          }
          onChanged();
        } else {
          timeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public Builder clearTime() {
        if (timeBuilder_ == null) {
          time_ = cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.getDefaultInstance();
          onChanged();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder getTimeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTimeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder getTimeOrBuilder() {
        if (timeBuilder_ != null) {
          return timeBuilder_.getMessageOrBuilder();
        } else {
          return time_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Time time = 1;</code>
       *
       * <pre>
       * Time when the data was captured
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder> 
          getTimeFieldBuilder() {
        if (timeBuilder_ == null) {
          timeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.msgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoTime.TimeOrBuilder>(
                  getTime(),
                  getParentForChildren(),
                  isClean());
          time_ = null;
        }
        return timeBuilder_;
      }

      private cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan scan_ = cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan, cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScanOrBuilder> scanBuilder_;
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      public boolean hasScan() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan getScan() {
        if (scanBuilder_ == null) {
          return scan_;
        } else {
          return scanBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      public Builder setScan(cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan value) {
        if (scanBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          scan_ = value;
          onChanged();
        } else {
          scanBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      public Builder setScan(
          cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan.Builder builderForValue) {
        if (scanBuilder_ == null) {
          scan_ = builderForValue.build();
          onChanged();
        } else {
          scanBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      public Builder mergeScan(cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan value) {
        if (scanBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              scan_ != cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan.getDefaultInstance()) {
            scan_ =
              cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan.newBuilder(scan_).mergeFrom(value).buildPartial();
          } else {
            scan_ = value;
          }
          onChanged();
        } else {
          scanBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      public Builder clearScan() {
        if (scanBuilder_ == null) {
          scan_ = cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan.getDefaultInstance();
          onChanged();
        } else {
          scanBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan.Builder getScanBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getScanFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScanOrBuilder getScanOrBuilder() {
        if (scanBuilder_ != null) {
          return scanBuilder_.getMessageOrBuilder();
        } else {
          return scan_;
        }
      }
      /**
       * <code>required .gazebo.msgs.LaserScan scan = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan, cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScanOrBuilder> 
          getScanFieldBuilder() {
        if (scanBuilder_ == null) {
          scanBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan, cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScan.Builder, cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.LaserScanOrBuilder>(
                  getScan(),
                  getParentForChildren(),
                  isClean());
          scan_ = null;
        }
        return scanBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.LaserScanStamped)
    }

    static {
      defaultInstance = new LaserScanStamped(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.LaserScanStamped)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_LaserScanStamped_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_LaserScanStamped_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027laserscan_stamped.proto\022\013gazebo.msgs\032\n" +
      "time.proto\032\017laserscan.proto\"Y\n\020LaserScan" +
      "Stamped\022\037\n\004time\030\001 \002(\0132\021.gazebo.msgs.Time" +
      "\022$\n\004scan\030\002 \002(\0132\026.gazebo.msgs.LaserScanB8" +
      "\n\037cn.autolabor.plugin.gazebo.msgsB\025Proto" +
      "LaserscanStamped"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cn.autolabor.plugin.gazebo.msgs.ProtoTime.getDescriptor(),
          cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.getDescriptor(),
        }, assigner);
    internal_static_gazebo_msgs_LaserScanStamped_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_LaserScanStamped_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_LaserScanStamped_descriptor,
        new java.lang.String[] { "Time", "Scan", });
    cn.autolabor.plugin.gazebo.msgs.ProtoTime.getDescriptor();
    cn.autolabor.plugin.gazebo.msgs.ProtoLaserscan.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}