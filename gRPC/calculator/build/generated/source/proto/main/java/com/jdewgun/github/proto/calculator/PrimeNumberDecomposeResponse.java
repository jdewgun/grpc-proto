// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CalculatorService.proto

package com.jdewgun.github.proto.calculator;

/**
 * Protobuf type {@code CalculatorService.PrimeNumberDecomposeResponse}
 */
public  final class PrimeNumberDecomposeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CalculatorService.PrimeNumberDecomposeResponse)
    PrimeNumberDecomposeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrimeNumberDecomposeResponse.newBuilder() to construct.
  private PrimeNumberDecomposeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrimeNumberDecomposeResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PrimeNumberDecomposeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PrimeNumberDecomposeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            decompositionResult_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.jdewgun.github.proto.calculator.CalculatorServiceOuterClass.internal_static_CalculatorService_PrimeNumberDecomposeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.jdewgun.github.proto.calculator.CalculatorServiceOuterClass.internal_static_CalculatorService_PrimeNumberDecomposeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse.class, com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse.Builder.class);
  }

  public static final int DECOMPOSITIONRESULT_FIELD_NUMBER = 1;
  private int decompositionResult_;
  /**
   * <code>int32 decompositionResult = 1;</code>
   * @return The decompositionResult.
   */
  public int getDecompositionResult() {
    return decompositionResult_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (decompositionResult_ != 0) {
      output.writeInt32(1, decompositionResult_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (decompositionResult_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, decompositionResult_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse)) {
      return super.equals(obj);
    }
    com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse other = (com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse) obj;

    if (getDecompositionResult()
        != other.getDecompositionResult()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DECOMPOSITIONRESULT_FIELD_NUMBER;
    hash = (53 * hash) + getDecompositionResult();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code CalculatorService.PrimeNumberDecomposeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CalculatorService.PrimeNumberDecomposeResponse)
      com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jdewgun.github.proto.calculator.CalculatorServiceOuterClass.internal_static_CalculatorService_PrimeNumberDecomposeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jdewgun.github.proto.calculator.CalculatorServiceOuterClass.internal_static_CalculatorService_PrimeNumberDecomposeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse.class, com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse.Builder.class);
    }

    // Construct using com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      decompositionResult_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.jdewgun.github.proto.calculator.CalculatorServiceOuterClass.internal_static_CalculatorService_PrimeNumberDecomposeResponse_descriptor;
    }

    @java.lang.Override
    public com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse getDefaultInstanceForType() {
      return com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse build() {
      com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse buildPartial() {
      com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse result = new com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse(this);
      result.decompositionResult_ = decompositionResult_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse) {
        return mergeFrom((com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse other) {
      if (other == com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse.getDefaultInstance()) return this;
      if (other.getDecompositionResult() != 0) {
        setDecompositionResult(other.getDecompositionResult());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int decompositionResult_ ;
    /**
     * <code>int32 decompositionResult = 1;</code>
     * @return The decompositionResult.
     */
    public int getDecompositionResult() {
      return decompositionResult_;
    }
    /**
     * <code>int32 decompositionResult = 1;</code>
     * @param value The decompositionResult to set.
     * @return This builder for chaining.
     */
    public Builder setDecompositionResult(int value) {
      
      decompositionResult_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 decompositionResult = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDecompositionResult() {
      
      decompositionResult_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:CalculatorService.PrimeNumberDecomposeResponse)
  }

  // @@protoc_insertion_point(class_scope:CalculatorService.PrimeNumberDecomposeResponse)
  private static final com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse();
  }

  public static com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrimeNumberDecomposeResponse>
      PARSER = new com.google.protobuf.AbstractParser<PrimeNumberDecomposeResponse>() {
    @java.lang.Override
    public PrimeNumberDecomposeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PrimeNumberDecomposeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PrimeNumberDecomposeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrimeNumberDecomposeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.jdewgun.github.proto.calculator.PrimeNumberDecomposeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
