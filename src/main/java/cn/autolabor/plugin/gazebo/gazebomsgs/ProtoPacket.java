// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packet.proto

package cn.autolabor.plugin.gazebo.gazebomsgs;

public final class ProtoPacket {
  private ProtoPacket() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PacketOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Packet)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .gazebo.msgs.Time stamp = 1;</code>
     */
    boolean hasStamp();
    /**
     * <code>required .gazebo.msgs.Time stamp = 1;</code>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time getStamp();
    /**
     * <code>required .gazebo.msgs.Time stamp = 1;</code>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder getStampOrBuilder();

    /**
     * <code>required string type = 2;</code>
     */
    boolean hasType();
    /**
     * <code>required string type = 2;</code>
     */
    java.lang.String getType();
    /**
     * <code>required string type = 2;</code>
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <code>required bytes serialized_data = 3;</code>
     */
    boolean hasSerializedData();
    /**
     * <code>required bytes serialized_data = 3;</code>
     */
    com.google.protobuf.ByteString getSerializedData();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Packet}
   */
  public static final class Packet extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Packet)
      PacketOrBuilder {
    // Use Packet.newBuilder() to construct.
    private Packet(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Packet(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Packet defaultInstance;
    public static Packet getDefaultInstance() {
      return defaultInstance;
    }

    public Packet getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Packet(
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
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = stamp_.toBuilder();
              }
              stamp_ = input.readMessage(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(stamp_);
                stamp_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              type_ = bs;
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              serializedData_ = input.readBytes();
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
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.internal_static_gazebo_msgs_Packet_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.internal_static_gazebo_msgs_Packet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet.Builder.class);
    }

    public static com.google.protobuf.Parser<Packet> PARSER =
        new com.google.protobuf.AbstractParser<Packet>() {
      public Packet parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Packet(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Packet> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int STAMP_FIELD_NUMBER = 1;
    private cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time stamp_;
    /**
     * <code>required .gazebo.msgs.Time stamp = 1;</code>
     */
    public boolean hasStamp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .gazebo.msgs.Time stamp = 1;</code>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time getStamp() {
      return stamp_;
    }
    /**
     * <code>required .gazebo.msgs.Time stamp = 1;</code>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder getStampOrBuilder() {
      return stamp_;
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private java.lang.Object type_;
    /**
     * <code>required string type = 2;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string type = 2;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string type = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SERIALIZED_DATA_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString serializedData_;
    /**
     * <code>required bytes serialized_data = 3;</code>
     */
    public boolean hasSerializedData() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required bytes serialized_data = 3;</code>
     */
    public com.google.protobuf.ByteString getSerializedData() {
      return serializedData_;
    }

    private void initFields() {
      stamp_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance();
      type_ = "";
      serializedData_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasStamp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSerializedData()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getStamp().isInitialized()) {
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
        output.writeMessage(1, stamp_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getTypeBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, serializedData_);
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
          .computeMessageSize(1, stamp_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getTypeBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, serializedData_);
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

    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet prototype) {
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
     * Protobuf type {@code gazebo.msgs.Packet}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Packet)
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.PacketOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.internal_static_gazebo_msgs_Packet_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.internal_static_gazebo_msgs_Packet_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoPacket.Packet.newBuilder()
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
          getStampFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (stampBuilder_ == null) {
          stamp_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance();
        } else {
          stampBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        serializedData_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.internal_static_gazebo_msgs_Packet_descriptor;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet build() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet buildPartial() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet result = new cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (stampBuilder_ == null) {
          result.stamp_ = stamp_;
        } else {
          result.stamp_ = stampBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.serializedData_ = serializedData_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet) {
          return mergeFrom((cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet other) {
        if (other == cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet.getDefaultInstance()) return this;
        if (other.hasStamp()) {
          mergeStamp(other.getStamp());
        }
        if (other.hasType()) {
          bitField0_ |= 0x00000002;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasSerializedData()) {
          setSerializedData(other.getSerializedData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasStamp()) {
          
          return false;
        }
        if (!hasType()) {
          
          return false;
        }
        if (!hasSerializedData()) {
          
          return false;
        }
        if (!getStamp().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPacket.Packet) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time stamp_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder> stampBuilder_;
      /**
       * <code>required .gazebo.msgs.Time stamp = 1;</code>
       */
      public boolean hasStamp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .gazebo.msgs.Time stamp = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time getStamp() {
        if (stampBuilder_ == null) {
          return stamp_;
        } else {
          return stampBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Time stamp = 1;</code>
       */
      public Builder setStamp(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time value) {
        if (stampBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          stamp_ = value;
          onChanged();
        } else {
          stampBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time stamp = 1;</code>
       */
      public Builder setStamp(
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder builderForValue) {
        if (stampBuilder_ == null) {
          stamp_ = builderForValue.build();
          onChanged();
        } else {
          stampBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time stamp = 1;</code>
       */
      public Builder mergeStamp(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time value) {
        if (stampBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              stamp_ != cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance()) {
            stamp_ =
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.newBuilder(stamp_).mergeFrom(value).buildPartial();
          } else {
            stamp_ = value;
          }
          onChanged();
        } else {
          stampBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time stamp = 1;</code>
       */
      public Builder clearStamp() {
        if (stampBuilder_ == null) {
          stamp_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance();
          onChanged();
        } else {
          stampBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time stamp = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder getStampBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getStampFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Time stamp = 1;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder getStampOrBuilder() {
        if (stampBuilder_ != null) {
          return stampBuilder_.getMessageOrBuilder();
        } else {
          return stamp_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Time stamp = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder>
          getStampFieldBuilder() {
        if (stampBuilder_ == null) {
          stampBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder>(
                  getStamp(),
                  getParentForChildren(),
                  isClean());
          stamp_ = null;
        }
        return stampBuilder_;
      }

      private java.lang.Object type_ = "";
      /**
       * <code>required string type = 2;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string type = 2;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            type_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string type = 2;</code>
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string type = 2;</code>
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string type = 2;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       * <code>required string type = 2;</code>
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        type_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString serializedData_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes serialized_data = 3;</code>
       */
      public boolean hasSerializedData() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required bytes serialized_data = 3;</code>
       */
      public com.google.protobuf.ByteString getSerializedData() {
        return serializedData_;
      }
      /**
       * <code>required bytes serialized_data = 3;</code>
       */
      public Builder setSerializedData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        serializedData_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes serialized_data = 3;</code>
       */
      public Builder clearSerializedData() {
        bitField0_ = (bitField0_ & ~0x00000004);
        serializedData_ = getDefaultInstance().getSerializedData();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Packet)
    }

    static {
      defaultInstance = new Packet(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Packet)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Packet_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Packet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014packet.proto\022\013gazebo.msgs\032\ntime.proto\"" +
      "Q\n\006Packet\022 \n\005stamp\030\001 \002(\0132\021.gazebo.msgs.T" +
      "ime\022\014\n\004type\030\002 \002(\t\022\027\n\017serialized_data\030\003 \002" +
      "(\014B.\n\037cn.autolabor.plugin.gazebo.msgsB\013P" +
      "rotoPacket"
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
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.getDescriptor(),
        }, assigner);
    internal_static_gazebo_msgs_Packet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Packet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_Packet_descriptor,
        new java.lang.String[] { "Stamp", "Type", "SerializedData", });
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
