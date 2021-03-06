/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.domain;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AvroCar2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1526904198280115974L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroCar2\",\"namespace\":\"com.example.domain\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"manufacturerYear\",\"type\":\"int\",\"default\":0,\"aliases\":[\"year\"]},{\"name\":\"make\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"model\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"review\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String id;
  @Deprecated public int manufacturerYear;
  @Deprecated public java.lang.String make;
  @Deprecated public java.lang.String model;
  @Deprecated public java.lang.String review;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroCar2() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param manufacturerYear The new value for manufacturerYear
   * @param make The new value for make
   * @param model The new value for model
   * @param review The new value for review
   */
  public AvroCar2(java.lang.String id, java.lang.Integer manufacturerYear, java.lang.String make, java.lang.String model, java.lang.String review) {
    this.id = id;
    this.manufacturerYear = manufacturerYear;
    this.make = make;
    this.model = model;
    this.review = review;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return manufacturerYear;
    case 2: return make;
    case 3: return model;
    case 4: return review;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: manufacturerYear = (java.lang.Integer)value$; break;
    case 2: make = (java.lang.String)value$; break;
    case 3: model = (java.lang.String)value$; break;
    case 4: review = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'manufacturerYear' field.
   * @return The value of the 'manufacturerYear' field.
   */
  public java.lang.Integer getManufacturerYear() {
    return manufacturerYear;
  }

  /**
   * Sets the value of the 'manufacturerYear' field.
   * @param value the value to set.
   */
  public void setManufacturerYear(java.lang.Integer value) {
    this.manufacturerYear = value;
  }

  /**
   * Gets the value of the 'make' field.
   * @return The value of the 'make' field.
   */
  public java.lang.String getMake() {
    return make;
  }

  /**
   * Sets the value of the 'make' field.
   * @param value the value to set.
   */
  public void setMake(java.lang.String value) {
    this.make = value;
  }

  /**
   * Gets the value of the 'model' field.
   * @return The value of the 'model' field.
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * Sets the value of the 'model' field.
   * @param value the value to set.
   */
  public void setModel(java.lang.String value) {
    this.model = value;
  }

  /**
   * Gets the value of the 'review' field.
   * @return The value of the 'review' field.
   */
  public java.lang.String getReview() {
    return review;
  }

  /**
   * Sets the value of the 'review' field.
   * @param value the value to set.
   */
  public void setReview(java.lang.String value) {
    this.review = value;
  }

  /**
   * Creates a new AvroCar2 RecordBuilder.
   * @return A new AvroCar2 RecordBuilder
   */
  public static com.example.domain.AvroCar2.Builder newBuilder() {
    return new com.example.domain.AvroCar2.Builder();
  }

  /**
   * Creates a new AvroCar2 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroCar2 RecordBuilder
   */
  public static com.example.domain.AvroCar2.Builder newBuilder(com.example.domain.AvroCar2.Builder other) {
    return new com.example.domain.AvroCar2.Builder(other);
  }

  /**
   * Creates a new AvroCar2 RecordBuilder by copying an existing AvroCar2 instance.
   * @param other The existing instance to copy.
   * @return A new AvroCar2 RecordBuilder
   */
  public static com.example.domain.AvroCar2.Builder newBuilder(com.example.domain.AvroCar2 other) {
    return new com.example.domain.AvroCar2.Builder(other);
  }

  /**
   * RecordBuilder for AvroCar2 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroCar2>
    implements org.apache.avro.data.RecordBuilder<AvroCar2> {

    private java.lang.String id;
    private int manufacturerYear;
    private java.lang.String make;
    private java.lang.String model;
    private java.lang.String review;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.domain.AvroCar2.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.manufacturerYear)) {
        this.manufacturerYear = data().deepCopy(fields()[1].schema(), other.manufacturerYear);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.make)) {
        this.make = data().deepCopy(fields()[2].schema(), other.make);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.model)) {
        this.model = data().deepCopy(fields()[3].schema(), other.model);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.review)) {
        this.review = data().deepCopy(fields()[4].schema(), other.review);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AvroCar2 instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.domain.AvroCar2 other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.manufacturerYear)) {
        this.manufacturerYear = data().deepCopy(fields()[1].schema(), other.manufacturerYear);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.make)) {
        this.make = data().deepCopy(fields()[2].schema(), other.make);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.model)) {
        this.model = data().deepCopy(fields()[3].schema(), other.model);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.review)) {
        this.review = data().deepCopy(fields()[4].schema(), other.review);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.String getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.example.domain.AvroCar2.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.example.domain.AvroCar2.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'manufacturerYear' field.
      * @return The value.
      */
    public java.lang.Integer getManufacturerYear() {
      return manufacturerYear;
    }

    /**
      * Sets the value of the 'manufacturerYear' field.
      * @param value The value of 'manufacturerYear'.
      * @return This builder.
      */
    public com.example.domain.AvroCar2.Builder setManufacturerYear(int value) {
      validate(fields()[1], value);
      this.manufacturerYear = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'manufacturerYear' field has been set.
      * @return True if the 'manufacturerYear' field has been set, false otherwise.
      */
    public boolean hasManufacturerYear() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'manufacturerYear' field.
      * @return This builder.
      */
    public com.example.domain.AvroCar2.Builder clearManufacturerYear() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'make' field.
      * @return The value.
      */
    public java.lang.String getMake() {
      return make;
    }

    /**
      * Sets the value of the 'make' field.
      * @param value The value of 'make'.
      * @return This builder.
      */
    public com.example.domain.AvroCar2.Builder setMake(java.lang.String value) {
      validate(fields()[2], value);
      this.make = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'make' field has been set.
      * @return True if the 'make' field has been set, false otherwise.
      */
    public boolean hasMake() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'make' field.
      * @return This builder.
      */
    public com.example.domain.AvroCar2.Builder clearMake() {
      make = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'model' field.
      * @return The value.
      */
    public java.lang.String getModel() {
      return model;
    }

    /**
      * Sets the value of the 'model' field.
      * @param value The value of 'model'.
      * @return This builder.
      */
    public com.example.domain.AvroCar2.Builder setModel(java.lang.String value) {
      validate(fields()[3], value);
      this.model = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'model' field has been set.
      * @return True if the 'model' field has been set, false otherwise.
      */
    public boolean hasModel() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'model' field.
      * @return This builder.
      */
    public com.example.domain.AvroCar2.Builder clearModel() {
      model = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'review' field.
      * @return The value.
      */
    public java.lang.String getReview() {
      return review;
    }

    /**
      * Sets the value of the 'review' field.
      * @param value The value of 'review'.
      * @return This builder.
      */
    public com.example.domain.AvroCar2.Builder setReview(java.lang.String value) {
      validate(fields()[4], value);
      this.review = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'review' field has been set.
      * @return True if the 'review' field has been set, false otherwise.
      */
    public boolean hasReview() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'review' field.
      * @return This builder.
      */
    public com.example.domain.AvroCar2.Builder clearReview() {
      review = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public AvroCar2 build() {
      try {
        AvroCar2 record = new AvroCar2();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.manufacturerYear = fieldSetFlags()[1] ? this.manufacturerYear : (java.lang.Integer) defaultValue(fields()[1]);
        record.make = fieldSetFlags()[2] ? this.make : (java.lang.String) defaultValue(fields()[2]);
        record.model = fieldSetFlags()[3] ? this.model : (java.lang.String) defaultValue(fields()[3]);
        record.review = fieldSetFlags()[4] ? this.review : (java.lang.String) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
