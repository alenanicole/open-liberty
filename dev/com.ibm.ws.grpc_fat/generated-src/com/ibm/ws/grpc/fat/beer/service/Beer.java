// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Beer.proto

package com.ibm.ws.grpc.fat.beer.service;

/**
 * <pre>
 * The Beer
 * </pre>
 *
 * Protobuf type {@code beer.Beer}
 */
public final class Beer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:beer.Beer)
    BeerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Beer.newBuilder() to construct.
  private Beer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Beer() {
    beerName_ = "";
    beerMaker_ = "";
    beerType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Beer();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibm.ws.grpc.fat.beer.service.BeerProto.internal_static_beer_Beer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibm.ws.grpc.fat.beer.service.BeerProto.internal_static_beer_Beer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibm.ws.grpc.fat.beer.service.Beer.class, com.ibm.ws.grpc.fat.beer.service.Beer.Builder.class);
  }

  public static final int BEERNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object beerName_;
  /**
   * <code>string beerName = 1;</code>
   * @return The beerName.
   */
  @java.lang.Override
  public java.lang.String getBeerName() {
    java.lang.Object ref = beerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      beerName_ = s;
      return s;
    }
  }
  /**
   * <code>string beerName = 1;</code>
   * @return The bytes for beerName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBeerNameBytes() {
    java.lang.Object ref = beerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      beerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BEERMAKER_FIELD_NUMBER = 2;
  private volatile java.lang.Object beerMaker_;
  /**
   * <code>string beerMaker = 2;</code>
   * @return The beerMaker.
   */
  @java.lang.Override
  public java.lang.String getBeerMaker() {
    java.lang.Object ref = beerMaker_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      beerMaker_ = s;
      return s;
    }
  }
  /**
   * <code>string beerMaker = 2;</code>
   * @return The bytes for beerMaker.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBeerMakerBytes() {
    java.lang.Object ref = beerMaker_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      beerMaker_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BEERTYPE_FIELD_NUMBER = 3;
  private int beerType_;
  /**
   * <code>.beer.BeerType beerType = 3;</code>
   * @return The enum numeric value on the wire for beerType.
   */
  @java.lang.Override public int getBeerTypeValue() {
    return beerType_;
  }
  /**
   * <code>.beer.BeerType beerType = 3;</code>
   * @return The beerType.
   */
  @java.lang.Override public com.ibm.ws.grpc.fat.beer.service.BeerType getBeerType() {
    @SuppressWarnings("deprecation")
    com.ibm.ws.grpc.fat.beer.service.BeerType result = com.ibm.ws.grpc.fat.beer.service.BeerType.valueOf(beerType_);
    return result == null ? com.ibm.ws.grpc.fat.beer.service.BeerType.UNRECOGNIZED : result;
  }

  public static final int BEERRATING_FIELD_NUMBER = 4;
  private float beerRating_;
  /**
   * <code>float beerRating = 4;</code>
   * @return The beerRating.
   */
  @java.lang.Override
  public float getBeerRating() {
    return beerRating_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(beerName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, beerName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(beerMaker_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, beerMaker_);
    }
    if (beerType_ != com.ibm.ws.grpc.fat.beer.service.BeerType.NEWENGLANDIPA.getNumber()) {
      output.writeEnum(3, beerType_);
    }
    if (java.lang.Float.floatToRawIntBits(beerRating_) != 0) {
      output.writeFloat(4, beerRating_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(beerName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, beerName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(beerMaker_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, beerMaker_);
    }
    if (beerType_ != com.ibm.ws.grpc.fat.beer.service.BeerType.NEWENGLANDIPA.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, beerType_);
    }
    if (java.lang.Float.floatToRawIntBits(beerRating_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, beerRating_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ibm.ws.grpc.fat.beer.service.Beer)) {
      return super.equals(obj);
    }
    com.ibm.ws.grpc.fat.beer.service.Beer other = (com.ibm.ws.grpc.fat.beer.service.Beer) obj;

    if (!getBeerName()
        .equals(other.getBeerName())) return false;
    if (!getBeerMaker()
        .equals(other.getBeerMaker())) return false;
    if (beerType_ != other.beerType_) return false;
    if (java.lang.Float.floatToIntBits(getBeerRating())
        != java.lang.Float.floatToIntBits(
            other.getBeerRating())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BEERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getBeerName().hashCode();
    hash = (37 * hash) + BEERMAKER_FIELD_NUMBER;
    hash = (53 * hash) + getBeerMaker().hashCode();
    hash = (37 * hash) + BEERTYPE_FIELD_NUMBER;
    hash = (53 * hash) + beerType_;
    hash = (37 * hash) + BEERRATING_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBeerRating());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibm.ws.grpc.fat.beer.service.Beer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibm.ws.grpc.fat.beer.service.Beer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibm.ws.grpc.fat.beer.service.Beer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibm.ws.grpc.fat.beer.service.Beer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibm.ws.grpc.fat.beer.service.Beer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibm.ws.grpc.fat.beer.service.Beer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibm.ws.grpc.fat.beer.service.Beer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibm.ws.grpc.fat.beer.service.Beer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibm.ws.grpc.fat.beer.service.Beer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibm.ws.grpc.fat.beer.service.Beer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibm.ws.grpc.fat.beer.service.Beer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibm.ws.grpc.fat.beer.service.Beer parseFrom(
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
  public static Builder newBuilder(com.ibm.ws.grpc.fat.beer.service.Beer prototype) {
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
   * <pre>
   * The Beer
   * </pre>
   *
   * Protobuf type {@code beer.Beer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:beer.Beer)
      com.ibm.ws.grpc.fat.beer.service.BeerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibm.ws.grpc.fat.beer.service.BeerProto.internal_static_beer_Beer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibm.ws.grpc.fat.beer.service.BeerProto.internal_static_beer_Beer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibm.ws.grpc.fat.beer.service.Beer.class, com.ibm.ws.grpc.fat.beer.service.Beer.Builder.class);
    }

    // Construct using com.ibm.ws.grpc.fat.beer.service.Beer.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      beerName_ = "";

      beerMaker_ = "";

      beerType_ = 0;

      beerRating_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibm.ws.grpc.fat.beer.service.BeerProto.internal_static_beer_Beer_descriptor;
    }

    @java.lang.Override
    public com.ibm.ws.grpc.fat.beer.service.Beer getDefaultInstanceForType() {
      return com.ibm.ws.grpc.fat.beer.service.Beer.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibm.ws.grpc.fat.beer.service.Beer build() {
      com.ibm.ws.grpc.fat.beer.service.Beer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibm.ws.grpc.fat.beer.service.Beer buildPartial() {
      com.ibm.ws.grpc.fat.beer.service.Beer result = new com.ibm.ws.grpc.fat.beer.service.Beer(this);
      result.beerName_ = beerName_;
      result.beerMaker_ = beerMaker_;
      result.beerType_ = beerType_;
      result.beerRating_ = beerRating_;
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
      if (other instanceof com.ibm.ws.grpc.fat.beer.service.Beer) {
        return mergeFrom((com.ibm.ws.grpc.fat.beer.service.Beer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibm.ws.grpc.fat.beer.service.Beer other) {
      if (other == com.ibm.ws.grpc.fat.beer.service.Beer.getDefaultInstance()) return this;
      if (!other.getBeerName().isEmpty()) {
        beerName_ = other.beerName_;
        onChanged();
      }
      if (!other.getBeerMaker().isEmpty()) {
        beerMaker_ = other.beerMaker_;
        onChanged();
      }
      if (other.beerType_ != 0) {
        setBeerTypeValue(other.getBeerTypeValue());
      }
      if (other.getBeerRating() != 0F) {
        setBeerRating(other.getBeerRating());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              beerName_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              beerMaker_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              beerType_ = input.readEnum();

              break;
            } // case 24
            case 37: {
              beerRating_ = input.readFloat();

              break;
            } // case 37
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object beerName_ = "";
    /**
     * <code>string beerName = 1;</code>
     * @return The beerName.
     */
    public java.lang.String getBeerName() {
      java.lang.Object ref = beerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        beerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string beerName = 1;</code>
     * @return The bytes for beerName.
     */
    public com.google.protobuf.ByteString
        getBeerNameBytes() {
      java.lang.Object ref = beerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        beerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string beerName = 1;</code>
     * @param value The beerName to set.
     * @return This builder for chaining.
     */
    public Builder setBeerName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      beerName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string beerName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBeerName() {
      
      beerName_ = getDefaultInstance().getBeerName();
      onChanged();
      return this;
    }
    /**
     * <code>string beerName = 1;</code>
     * @param value The bytes for beerName to set.
     * @return This builder for chaining.
     */
    public Builder setBeerNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      beerName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object beerMaker_ = "";
    /**
     * <code>string beerMaker = 2;</code>
     * @return The beerMaker.
     */
    public java.lang.String getBeerMaker() {
      java.lang.Object ref = beerMaker_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        beerMaker_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string beerMaker = 2;</code>
     * @return The bytes for beerMaker.
     */
    public com.google.protobuf.ByteString
        getBeerMakerBytes() {
      java.lang.Object ref = beerMaker_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        beerMaker_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string beerMaker = 2;</code>
     * @param value The beerMaker to set.
     * @return This builder for chaining.
     */
    public Builder setBeerMaker(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      beerMaker_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string beerMaker = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBeerMaker() {
      
      beerMaker_ = getDefaultInstance().getBeerMaker();
      onChanged();
      return this;
    }
    /**
     * <code>string beerMaker = 2;</code>
     * @param value The bytes for beerMaker to set.
     * @return This builder for chaining.
     */
    public Builder setBeerMakerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      beerMaker_ = value;
      onChanged();
      return this;
    }

    private int beerType_ = 0;
    /**
     * <code>.beer.BeerType beerType = 3;</code>
     * @return The enum numeric value on the wire for beerType.
     */
    @java.lang.Override public int getBeerTypeValue() {
      return beerType_;
    }
    /**
     * <code>.beer.BeerType beerType = 3;</code>
     * @param value The enum numeric value on the wire for beerType to set.
     * @return This builder for chaining.
     */
    public Builder setBeerTypeValue(int value) {
      
      beerType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.beer.BeerType beerType = 3;</code>
     * @return The beerType.
     */
    @java.lang.Override
    public com.ibm.ws.grpc.fat.beer.service.BeerType getBeerType() {
      @SuppressWarnings("deprecation")
      com.ibm.ws.grpc.fat.beer.service.BeerType result = com.ibm.ws.grpc.fat.beer.service.BeerType.valueOf(beerType_);
      return result == null ? com.ibm.ws.grpc.fat.beer.service.BeerType.UNRECOGNIZED : result;
    }
    /**
     * <code>.beer.BeerType beerType = 3;</code>
     * @param value The beerType to set.
     * @return This builder for chaining.
     */
    public Builder setBeerType(com.ibm.ws.grpc.fat.beer.service.BeerType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      beerType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.beer.BeerType beerType = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBeerType() {
      
      beerType_ = 0;
      onChanged();
      return this;
    }

    private float beerRating_ ;
    /**
     * <code>float beerRating = 4;</code>
     * @return The beerRating.
     */
    @java.lang.Override
    public float getBeerRating() {
      return beerRating_;
    }
    /**
     * <code>float beerRating = 4;</code>
     * @param value The beerRating to set.
     * @return This builder for chaining.
     */
    public Builder setBeerRating(float value) {
      
      beerRating_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float beerRating = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBeerRating() {
      
      beerRating_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:beer.Beer)
  }

  // @@protoc_insertion_point(class_scope:beer.Beer)
  private static final com.ibm.ws.grpc.fat.beer.service.Beer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibm.ws.grpc.fat.beer.service.Beer();
  }

  public static com.ibm.ws.grpc.fat.beer.service.Beer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Beer>
      PARSER = new com.google.protobuf.AbstractParser<Beer>() {
    @java.lang.Override
    public Beer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Beer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Beer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibm.ws.grpc.fat.beer.service.Beer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

