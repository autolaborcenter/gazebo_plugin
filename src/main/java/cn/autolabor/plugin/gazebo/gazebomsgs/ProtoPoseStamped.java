// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pose_stamped.proto

package cn.autolabor.plugin.gazebo.gazebomsgs;

public final class ProtoPoseStamped {
  private ProtoPoseStamped() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PoseStampedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.PoseStamped)
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
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time getTime();
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder getTimeOrBuilder();

    /**
     * <code>required .gazebo.msgs.Pose pose = 2;</code>
     */
    boolean hasPose();
    /**
     * <code>required .gazebo.msgs.Pose pose = 2;</code>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose getPose();
    /**
     * <code>required .gazebo.msgs.Pose pose = 2;</code>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.PoseOrBuilder getPoseOrBuilder();
  }
  /**
   * Protobuf type {@code gazebo.msgs.PoseStamped}
   */
  public static final class PoseStamped extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.PoseStamped)
      PoseStampedOrBuilder {
    // Use PoseStamped.newBuilder() to construct.
    private PoseStamped(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PoseStamped(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PoseStamped defaultInstance;
    public static PoseStamped getDefaultInstance() {
      return defaultInstance;
    }

    public PoseStamped getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PoseStamped(
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
                subBuilder = time_.toBuilder();
              }
              time_ = input.readMessage(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(time_);
                time_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = pose_.toBuilder();
              }
              pose_ = input.readMessage(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pose_);
                pose_ = subBuilder.buildPartial();
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
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.internal_static_gazebo_msgs_PoseStamped_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.internal_static_gazebo_msgs_PoseStamped_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.Builder.class);
    }

    public static com.google.protobuf.Parser<PoseStamped> PARSER =
        new com.google.protobuf.AbstractParser<PoseStamped>() {
      public PoseStamped parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PoseStamped(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PoseStamped> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TIME_FIELD_NUMBER = 1;
    private cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time time_;
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
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time getTime() {
      return time_;
    }
    /**
     * <code>required .gazebo.msgs.Time time = 1;</code>
     *
     * <pre>
     * Time when the data was captured
     * </pre>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder getTimeOrBuilder() {
      return time_;
    }

    public static final int POSE_FIELD_NUMBER = 2;
    private cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose pose_;
    /**
     * <code>required .gazebo.msgs.Pose pose = 2;</code>
     */
    public boolean hasPose() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .gazebo.msgs.Pose pose = 2;</code>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose getPose() {
      return pose_;
    }
    /**
     * <code>required .gazebo.msgs.Pose pose = 2;</code>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.PoseOrBuilder getPoseOrBuilder() {
      return pose_;
    }

    private void initFields() {
      time_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance();
      pose_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose.getDefaultInstance();
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
      if (!hasPose()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTime().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getPose().isInitialized()) {
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
        output.writeMessage(2, pose_);
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
          .computeMessageSize(2, pose_);
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

    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped prototype) {
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
     * Protobuf type {@code gazebo.msgs.PoseStamped}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.PoseStamped)
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStampedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.internal_static_gazebo_msgs_PoseStamped_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.internal_static_gazebo_msgs_PoseStamped_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoPoseStamped.PoseStamped.newBuilder()
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
          getPoseFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (timeBuilder_ == null) {
          time_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (poseBuilder_ == null) {
          pose_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose.getDefaultInstance();
        } else {
          poseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.internal_static_gazebo_msgs_PoseStamped_descriptor;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped build() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped buildPartial() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped result = new cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped(this);
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
        if (poseBuilder_ == null) {
          result.pose_ = pose_;
        } else {
          result.pose_ = poseBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped) {
          return mergeFrom((cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped other) {
        if (other == cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped.getDefaultInstance()) return this;
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        if (other.hasPose()) {
          mergePose(other.getPose());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTime()) {
          
          return false;
        }
        if (!hasPose()) {
          
          return false;
        }
        if (!getTime().isInitialized()) {
          
          return false;
        }
        if (!getPose().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPoseStamped.PoseStamped) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time time_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder> timeBuilder_;
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
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time getTime() {
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
      public Builder setTime(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time value) {
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
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder builderForValue) {
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
      public Builder mergeTime(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time value) {
        if (timeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              time_ != cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance()) {
            time_ =
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.newBuilder(time_).mergeFrom(value).buildPartial();
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
          time_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance();
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
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder getTimeBuilder() {
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
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder getTimeOrBuilder() {
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
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder>
          getTimeFieldBuilder() {
        if (timeBuilder_ == null) {
          timeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.TimeOrBuilder>(
                  getTime(),
                  getParentForChildren(),
                  isClean());
          time_ = null;
        }
        return timeBuilder_;
      }

      private cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose pose_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.PoseOrBuilder> poseBuilder_;
      /**
       * <code>required .gazebo.msgs.Pose pose = 2;</code>
       */
      public boolean hasPose() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .gazebo.msgs.Pose pose = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose getPose() {
        if (poseBuilder_ == null) {
          return pose_;
        } else {
          return poseBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Pose pose = 2;</code>
       */
      public Builder setPose(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose value) {
        if (poseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pose_ = value;
          onChanged();
        } else {
          poseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Pose pose = 2;</code>
       */
      public Builder setPose(
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose.Builder builderForValue) {
        if (poseBuilder_ == null) {
          pose_ = builderForValue.build();
          onChanged();
        } else {
          poseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Pose pose = 2;</code>
       */
      public Builder mergePose(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose value) {
        if (poseBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              pose_ != cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose.getDefaultInstance()) {
            pose_ =
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose.newBuilder(pose_).mergeFrom(value).buildPartial();
          } else {
            pose_ = value;
          }
          onChanged();
        } else {
          poseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Pose pose = 2;</code>
       */
      public Builder clearPose() {
        if (poseBuilder_ == null) {
          pose_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose.getDefaultInstance();
          onChanged();
        } else {
          poseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Pose pose = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose.Builder getPoseBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getPoseFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Pose pose = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.PoseOrBuilder getPoseOrBuilder() {
        if (poseBuilder_ != null) {
          return poseBuilder_.getMessageOrBuilder();
        } else {
          return pose_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Pose pose = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.PoseOrBuilder>
          getPoseFieldBuilder() {
        if (poseBuilder_ == null) {
          poseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.Pose.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.PoseOrBuilder>(
                  getPose(),
                  getParentForChildren(),
                  isClean());
          pose_ = null;
        }
        return poseBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.PoseStamped)
    }

    static {
      defaultInstance = new PoseStamped(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.PoseStamped)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_PoseStamped_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_PoseStamped_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022pose_stamped.proto\022\013gazebo.msgs\032\ntime." +
      "proto\032\npose.proto\"O\n\013PoseStamped\022\037\n\004time" +
      "\030\001 \002(\0132\021.gazebo.msgs.Time\022\037\n\004pose\030\002 \002(\0132" +
      "\021.gazebo.msgs.PoseB3\n\037cn.autolabor.plugi" +
      "n.gazebo.msgsB\020ProtoPoseStamped"
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
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.getDescriptor(),
        }, assigner);
    internal_static_gazebo_msgs_PoseStamped_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_PoseStamped_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_PoseStamped_descriptor,
        new java.lang.String[] { "Time", "Pose", });
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.getDescriptor();
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoPose.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
