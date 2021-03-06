// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vector3d.proto

package cn.autolabor.plugin.gazebo.gazebomsgs;

public final class ProtoVector3d {
  private ProtoVector3d() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Vector3dOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.Vector3d)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required double x = 1;</code>
     */
    boolean hasX();
    /**
     * <code>required double x = 1;</code>
     */
    double getX();

    /**
     * <code>required double y = 2;</code>
     */
    boolean hasY();
    /**
     * <code>required double y = 2;</code>
     */
    double getY();

    /**
     * <code>required double z = 3;</code>
     */
    boolean hasZ();
    /**
     * <code>required double z = 3;</code>
     */
    double getZ();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Vector3d}
   */
  public static final class Vector3d extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.Vector3d)
      Vector3dOrBuilder {
    // Use Vector3d.newBuilder() to construct.
    private Vector3d(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Vector3d(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Vector3d defaultInstance;
    public static Vector3d getDefaultInstance() {
      return defaultInstance;
    }

    public Vector3d getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Vector3d(
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
              x_ = input.readDouble();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              y_ = input.readDouble();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              z_ = input.readDouble();
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
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.internal_static_gazebo_msgs_Vector3d_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.internal_static_gazebo_msgs_Vector3d_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d.Builder.class);
    }

    public static com.google.protobuf.Parser<Vector3d> PARSER =
        new com.google.protobuf.AbstractParser<Vector3d>() {
      public Vector3d parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Vector3d(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Vector3d> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int X_FIELD_NUMBER = 1;
    private double x_;
    /**
     * <code>required double x = 1;</code>
     */
    public boolean hasX() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required double x = 1;</code>
     */
    public double getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private double y_;
    /**
     * <code>required double y = 2;</code>
     */
    public boolean hasY() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required double y = 2;</code>
     */
    public double getY() {
      return y_;
    }

    public static final int Z_FIELD_NUMBER = 3;
    private double z_;
    /**
     * <code>required double z = 3;</code>
     */
    public boolean hasZ() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required double z = 3;</code>
     */
    public double getZ() {
      return z_;
    }

    private void initFields() {
      x_ = 0D;
      y_ = 0D;
      z_ = 0D;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasX()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasY()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasZ()) {
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
        output.writeDouble(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeDouble(2, y_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeDouble(3, z_);
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
          .computeDoubleSize(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, y_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, z_);
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

    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d prototype) {
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
     * Protobuf type {@code gazebo.msgs.Vector3d}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.Vector3d)
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3dOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.internal_static_gazebo_msgs_Vector3d_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.internal_static_gazebo_msgs_Vector3d_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoVector3d.Vector3d.newBuilder()
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
        x_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000001);
        y_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        z_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.internal_static_gazebo_msgs_Vector3d_descriptor;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d build() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d buildPartial() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d result = new cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.y_ = y_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.z_ = z_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d) {
          return mergeFrom((cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d other) {
        if (other == cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d.getDefaultInstance()) return this;
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        if (other.hasZ()) {
          setZ(other.getZ());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasX()) {
          
          return false;
        }
        if (!hasY()) {
          
          return false;
        }
        if (!hasZ()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.gazebomsgs.ProtoVector3d.Vector3d) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private double x_ ;
      /**
       * <code>required double x = 1;</code>
       */
      public boolean hasX() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required double x = 1;</code>
       */
      public double getX() {
        return x_;
      }
      /**
       * <code>required double x = 1;</code>
       */
      public Builder setX(double value) {
        bitField0_ |= 0x00000001;
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double x = 1;</code>
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0D;
        onChanged();
        return this;
      }

      private double y_ ;
      /**
       * <code>required double y = 2;</code>
       */
      public boolean hasY() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required double y = 2;</code>
       */
      public double getY() {
        return y_;
      }
      /**
       * <code>required double y = 2;</code>
       */
      public Builder setY(double value) {
        bitField0_ |= 0x00000002;
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double y = 2;</code>
       */
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000002);
        y_ = 0D;
        onChanged();
        return this;
      }

      private double z_ ;
      /**
       * <code>required double z = 3;</code>
       */
      public boolean hasZ() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required double z = 3;</code>
       */
      public double getZ() {
        return z_;
      }
      /**
       * <code>required double z = 3;</code>
       */
      public Builder setZ(double value) {
        bitField0_ |= 0x00000004;
        z_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double z = 3;</code>
       */
      public Builder clearZ() {
        bitField0_ = (bitField0_ & ~0x00000004);
        z_ = 0D;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Vector3d)
    }

    static {
      defaultInstance = new Vector3d(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Vector3d)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Vector3d_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Vector3d_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016vector3d.proto\022\013gazebo.msgs\"+\n\010Vector3" +
      "d\022\t\n\001x\030\001 \002(\001\022\t\n\001y\030\002 \002(\001\022\t\n\001z\030\003 \002(\001B0\n\037cn" +
      ".autolabor.plugin.gazebo.msgsB\rProtoVect" +
      "or3d"
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
    internal_static_gazebo_msgs_Vector3d_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_Vector3d_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_Vector3d_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
