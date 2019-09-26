// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gz_string.proto

package cn.autolabor.plugin.gazebo.gazebomsgs;

public final class ProtoGzString {
  private ProtoGzString() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GzStringOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.GzString)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string data = 1;</code>
     */
    boolean hasData();
    /**
     * <code>required string data = 1;</code>
     */
    java.lang.String getData();
    /**
     * <code>required string data = 1;</code>
     */
    com.google.protobuf.ByteString
        getDataBytes();
  }
  /**
   * Protobuf type {@code gazebo.msgs.GzString}
   */
  public static final class GzString extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.GzString)
      GzStringOrBuilder {
    // Use GzString.newBuilder() to construct.
    private GzString(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GzString(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GzString defaultInstance;
    public static GzString getDefaultInstance() {
      return defaultInstance;
    }

    public GzString getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GzString(
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
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              data_ = bs;
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
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.internal_static_gazebo_msgs_GzString_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.internal_static_gazebo_msgs_GzString_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString.Builder.class);
    }

    public static com.google.protobuf.Parser<GzString> PARSER =
        new com.google.protobuf.AbstractParser<GzString>() {
      public GzString parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GzString(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GzString> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int DATA_FIELD_NUMBER = 1;
    private java.lang.Object data_;
    /**
     * <code>required string data = 1;</code>
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string data = 1;</code>
     */
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          data_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string data = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      data_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasData()) {
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
        output.writeBytes(1, getDataBytes());
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
          .computeBytesSize(1, getDataBytes());
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

    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString prototype) {
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
     * Protobuf type {@code gazebo.msgs.GzString}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.GzString)
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzStringOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.internal_static_gazebo_msgs_GzString_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.internal_static_gazebo_msgs_GzString_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoGzString.GzString.newBuilder()
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
        data_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.internal_static_gazebo_msgs_GzString_descriptor;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString build() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString buildPartial() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString result = new cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.data_ = data_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString) {
          return mergeFrom((cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString other) {
        if (other == cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString.getDefaultInstance()) return this;
        if (other.hasData()) {
          bitField0_ |= 0x00000001;
          data_ = other.data_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasData()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.gazebomsgs.ProtoGzString.GzString) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object data_ = "";
      /**
       * <code>required string data = 1;</code>
       */
      public boolean hasData() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string data = 1;</code>
       */
      public java.lang.String getData() {
        java.lang.Object ref = data_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            data_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string data = 1;</code>
       */
      public com.google.protobuf.ByteString
          getDataBytes() {
        java.lang.Object ref = data_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          data_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string data = 1;</code>
       */
      public Builder setData(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string data = 1;</code>
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000001);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      /**
       * <code>required string data = 1;</code>
       */
      public Builder setDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        data_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.GzString)
    }

    static {
      defaultInstance = new GzString(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.GzString)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_GzString_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_GzString_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017gz_string.proto\022\013gazebo.msgs\"\030\n\010GzStri" +
      "ng\022\014\n\004data\030\001 \002(\tB0\n\037cn.autolabor.plugin." +
      "gazebo.msgsB\rProtoGzString"
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
        }, assigner);
    internal_static_gazebo_msgs_GzString_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_GzString_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_GzString_descriptor,
        new java.lang.String[] { "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}