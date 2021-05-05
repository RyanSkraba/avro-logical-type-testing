/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CustomLogicalTypeNullableFieldRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4683369917305233372L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CustomLogicalTypeNullableFieldRecord\",\"fields\":[{\"name\":\"nullableZdt\",\"type\":[\"null\",{\"type\":\"string\",\"logicalType\":\"zoned-date-time\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new ZonedDateTimeConversion());
  }

  private static final BinaryMessageEncoder<CustomLogicalTypeNullableFieldRecord> ENCODER =
      new BinaryMessageEncoder<CustomLogicalTypeNullableFieldRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CustomLogicalTypeNullableFieldRecord> DECODER =
      new BinaryMessageDecoder<CustomLogicalTypeNullableFieldRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CustomLogicalTypeNullableFieldRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CustomLogicalTypeNullableFieldRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CustomLogicalTypeNullableFieldRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CustomLogicalTypeNullableFieldRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CustomLogicalTypeNullableFieldRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CustomLogicalTypeNullableFieldRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CustomLogicalTypeNullableFieldRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CustomLogicalTypeNullableFieldRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.time.ZonedDateTime nullableZdt;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CustomLogicalTypeNullableFieldRecord() {}

  /**
   * All-args constructor.
   * @param nullableZdt The new value for nullableZdt
   */
  public CustomLogicalTypeNullableFieldRecord(java.time.ZonedDateTime nullableZdt) {
    this.nullableZdt = nullableZdt;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nullableZdt;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nullableZdt = (java.time.ZonedDateTime)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'nullableZdt' field.
   * @return The value of the 'nullableZdt' field.
   */
  public java.time.ZonedDateTime getNullableZdt() {
    return nullableZdt;
  }



  /**
   * Creates a new CustomLogicalTypeNullableFieldRecord RecordBuilder.
   * @return A new CustomLogicalTypeNullableFieldRecord RecordBuilder
   */
  public static CustomLogicalTypeNullableFieldRecord.Builder newBuilder() {
    return new CustomLogicalTypeNullableFieldRecord.Builder();
  }

  /**
   * Creates a new CustomLogicalTypeNullableFieldRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CustomLogicalTypeNullableFieldRecord RecordBuilder
   */
  public static CustomLogicalTypeNullableFieldRecord.Builder newBuilder(CustomLogicalTypeNullableFieldRecord.Builder other) {
    if (other == null) {
      return new CustomLogicalTypeNullableFieldRecord.Builder();
    } else {
      return new CustomLogicalTypeNullableFieldRecord.Builder(other);
    }
  }

  /**
   * Creates a new CustomLogicalTypeNullableFieldRecord RecordBuilder by copying an existing CustomLogicalTypeNullableFieldRecord instance.
   * @param other The existing instance to copy.
   * @return A new CustomLogicalTypeNullableFieldRecord RecordBuilder
   */
  public static CustomLogicalTypeNullableFieldRecord.Builder newBuilder(CustomLogicalTypeNullableFieldRecord other) {
    if (other == null) {
      return new CustomLogicalTypeNullableFieldRecord.Builder();
    } else {
      return new CustomLogicalTypeNullableFieldRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for CustomLogicalTypeNullableFieldRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CustomLogicalTypeNullableFieldRecord>
    implements org.apache.avro.data.RecordBuilder<CustomLogicalTypeNullableFieldRecord> {

    private java.time.ZonedDateTime nullableZdt;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(CustomLogicalTypeNullableFieldRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nullableZdt)) {
        this.nullableZdt = data().deepCopy(fields()[0].schema(), other.nullableZdt);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing CustomLogicalTypeNullableFieldRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(CustomLogicalTypeNullableFieldRecord other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.nullableZdt)) {
        this.nullableZdt = data().deepCopy(fields()[0].schema(), other.nullableZdt);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'nullableZdt' field.
      * @return The value.
      */
    public java.time.ZonedDateTime getNullableZdt() {
      return nullableZdt;
    }


    /**
      * Sets the value of the 'nullableZdt' field.
      * @param value The value of 'nullableZdt'.
      * @return This builder.
      */
    public CustomLogicalTypeNullableFieldRecord.Builder setNullableZdt(java.time.ZonedDateTime value) {
      validate(fields()[0], value);
      this.nullableZdt = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'nullableZdt' field has been set.
      * @return True if the 'nullableZdt' field has been set, false otherwise.
      */
    public boolean hasNullableZdt() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'nullableZdt' field.
      * @return This builder.
      */
    public CustomLogicalTypeNullableFieldRecord.Builder clearNullableZdt() {
      nullableZdt = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CustomLogicalTypeNullableFieldRecord build() {
      try {
        CustomLogicalTypeNullableFieldRecord record = new CustomLogicalTypeNullableFieldRecord();
        record.nullableZdt = fieldSetFlags()[0] ? this.nullableZdt : (java.time.ZonedDateTime) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CustomLogicalTypeNullableFieldRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<CustomLogicalTypeNullableFieldRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CustomLogicalTypeNullableFieldRecord>
    READER$ = (org.apache.avro.io.DatumReader<CustomLogicalTypeNullableFieldRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










