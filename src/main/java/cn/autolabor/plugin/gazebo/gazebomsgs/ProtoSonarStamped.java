// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sonar_stamped.proto

package cn.autolabor.plugin.gazebo.gazebomsgs;

public final class ProtoSonarStamped {
  private ProtoSonarStamped() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SonarStampedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:gazebo.msgs.SonarStamped)
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
     * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
     */
    boolean hasSonar();
    /**
     * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar getSonar();
    /**
     * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
     */
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.SonarOrBuilder getSonarOrBuilder();
  }
  /**
   * Protobuf type {@code gazebo.msgs.SonarStamped}
   */
  public static final class SonarStamped extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:gazebo.msgs.SonarStamped)
      SonarStampedOrBuilder {
    // Use SonarStamped.newBuilder() to construct.
    private SonarStamped(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SonarStamped(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SonarStamped defaultInstance;
    public static SonarStamped getDefaultInstance() {
      return defaultInstance;
    }

    public SonarStamped getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SonarStamped(
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
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = sonar_.toBuilder();
              }
              sonar_ = input.readMessage(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(sonar_);
                sonar_ = subBuilder.buildPartial();
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
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.internal_static_gazebo_msgs_SonarStamped_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.internal_static_gazebo_msgs_SonarStamped_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped.Builder.class);
    }

    public static com.google.protobuf.Parser<SonarStamped> PARSER =
        new com.google.protobuf.AbstractParser<SonarStamped>() {
      public SonarStamped parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SonarStamped(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SonarStamped> getParserForType() {
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

    public static final int SONAR_FIELD_NUMBER = 2;
    private cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar sonar_;
    /**
     * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
     */
    public boolean hasSonar() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar getSonar() {
      return sonar_;
    }
    /**
     * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
     */
    public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.SonarOrBuilder getSonarOrBuilder() {
      return sonar_;
    }

    private void initFields() {
      time_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.Time.getDefaultInstance();
      sonar_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar.getDefaultInstance();
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
      if (!hasSonar()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTime().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getSonar().isInitialized()) {
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
        output.writeMessage(2, sonar_);
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
          .computeMessageSize(2, sonar_);
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

    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped prototype) {
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
     * Protobuf type {@code gazebo.msgs.SonarStamped}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:gazebo.msgs.SonarStamped)
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStampedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.internal_static_gazebo_msgs_SonarStamped_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.internal_static_gazebo_msgs_SonarStamped_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped.class, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped.Builder.class);
      }

      // Construct using cn.autolabor.plugin.gazebo.msgs.ProtoSonarStamped.SonarStamped.newBuilder()
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
          getSonarFieldBuilder();
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
        if (sonarBuilder_ == null) {
          sonar_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar.getDefaultInstance();
        } else {
          sonarBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.internal_static_gazebo_msgs_SonarStamped_descriptor;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped getDefaultInstanceForType() {
        return cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped.getDefaultInstance();
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped build() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped buildPartial() {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped result = new cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped(this);
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
        if (sonarBuilder_ == null) {
          result.sonar_ = sonar_;
        } else {
          result.sonar_ = sonarBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped) {
          return mergeFrom((cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped other) {
        if (other == cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped.getDefaultInstance()) return this;
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        if (other.hasSonar()) {
          mergeSonar(other.getSonar());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTime()) {
          
          return false;
        }
        if (!hasSonar()) {
          
          return false;
        }
        if (!getTime().isInitialized()) {
          
          return false;
        }
        if (!getSonar().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonarStamped.SonarStamped) e.getUnfinishedMessage();
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

      private cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar sonar_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.SonarOrBuilder> sonarBuilder_;
      /**
       * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
       */
      public boolean hasSonar() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar getSonar() {
        if (sonarBuilder_ == null) {
          return sonar_;
        } else {
          return sonarBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
       */
      public Builder setSonar(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar value) {
        if (sonarBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          sonar_ = value;
          onChanged();
        } else {
          sonarBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
       */
      public Builder setSonar(
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar.Builder builderForValue) {
        if (sonarBuilder_ == null) {
          sonar_ = builderForValue.build();
          onChanged();
        } else {
          sonarBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
       */
      public Builder mergeSonar(cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar value) {
        if (sonarBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              sonar_ != cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar.getDefaultInstance()) {
            sonar_ =
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar.newBuilder(sonar_).mergeFrom(value).buildPartial();
          } else {
            sonar_ = value;
          }
          onChanged();
        } else {
          sonarBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
       */
      public Builder clearSonar() {
        if (sonarBuilder_ == null) {
          sonar_ = cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar.getDefaultInstance();
          onChanged();
        } else {
          sonarBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar.Builder getSonarBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSonarFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
       */
      public cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.SonarOrBuilder getSonarOrBuilder() {
        if (sonarBuilder_ != null) {
          return sonarBuilder_.getMessageOrBuilder();
        } else {
          return sonar_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Sonar sonar = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.SonarOrBuilder>
          getSonarFieldBuilder() {
        if (sonarBuilder_ == null) {
          sonarBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.Sonar.Builder, cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.SonarOrBuilder>(
                  getSonar(),
                  getParentForChildren(),
                  isClean());
          sonar_ = null;
        }
        return sonarBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.SonarStamped)
    }

    static {
      defaultInstance = new SonarStamped(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.SonarStamped)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_SonarStamped_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_SonarStamped_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023sonar_stamped.proto\022\013gazebo.msgs\032\ntime" +
      ".proto\032\013sonar.proto\"R\n\014SonarStamped\022\037\n\004t" +
      "ime\030\001 \002(\0132\021.gazebo.msgs.Time\022!\n\005sonar\030\002 " +
      "\002(\0132\022.gazebo.msgs.SonarB4\n\037cn.autolabor." +
      "plugin.gazebo.msgsB\021ProtoSonarStamped"
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
          cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.getDescriptor(),
        }, assigner);
    internal_static_gazebo_msgs_SonarStamped_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gazebo_msgs_SonarStamped_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_gazebo_msgs_SonarStamped_descriptor,
        new java.lang.String[] { "Time", "Sonar", });
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoTime.getDescriptor();
    cn.autolabor.plugin.gazebo.gazebomsgs.ProtoSonar.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
