/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AvroCar extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6821159017445696334L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroCar\",\"namespace\":\"com.example\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"year\",\"type\":\"int\",\"default\":0},{\"name\":\"make\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"model\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"engine\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.String id;
  @Deprecated public int year;
  @Deprecated public java.lang.String make;
  @Deprecated public java.lang.String model;
  @Deprecated public java.lang.String engine;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroCar() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param year The new value for year
   * @param make The new value for make
   * @param model The new value for model
   * @param engine The new value for engine
   */
  public AvroCar(java.lang.String id, java.lang.Integer year, java.lang.String make, java.lang.String model, java.lang.String engine) {
    this.id = id;
    this.year = year;
    this.make = make;
    this.model = model;
    this.engine = engine;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return year;
    case 2: return make;
    case 3: return model;
    case 4: return engine;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: year = (java.lang.Integer)value$; break;
    case 2: make = (java.lang.String)value$; break;
    case 3: model = (java.lang.String)value$; break;
    case 4: engine = (java.lang.String)value$; break;
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
   * Gets the value of the 'year' field.
   * @return The value of the 'year' field.
   */
  public java.lang.Integer getYear() {
    return year;
  }

  /**
   * Sets the value of the 'year' field.
   * @param value the value to set.
   */
  public void setYear(java.lang.Integer value) {
    this.year = value;
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
   * Gets the value of the 'engine' field.
   * @return The value of the 'engine' field.
   */
  public java.lang.String getEngine() {
    return engine;
  }

  /**
   * Sets the value of the 'engine' field.
   * @param value the value to set.
   */
  public void setEngine(java.lang.String value) {
    this.engine = value;
  }

  /**
   * Creates a new Car RecordBuilder.
   * @return A new Car RecordBuilder
   */
  public static com.example.AvroCar.Builder newBuilder() {
    return new com.example.AvroCar.Builder();
  }

  /**
   * Creates a new Car RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Car RecordBuilder
   */
  public static com.example.AvroCar.Builder newBuilder(com.example.AvroCar.Builder other) {
    return new com.example.AvroCar.Builder(other);
  }

  /**
   * Creates a new Car RecordBuilder by copying an existing Car instance.
   * @param other The existing instance to copy.
   * @return A new Car RecordBuilder
   */
  public static com.example.AvroCar.Builder newBuilder(com.example.AvroCar other) {
    return new com.example.AvroCar.Builder(other);
  }

  /**
   * RecordBuilder for Car instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroCar>
    implements org.apache.avro.data.RecordBuilder<AvroCar> {

    private java.lang.String id;
    private int year;
    private java.lang.String make;
    private java.lang.String model;
    private java.lang.String engine;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.AvroCar.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.year)) {
        this.year = data().deepCopy(fields()[1].schema(), other.year);
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
      if (isValidValue(fields()[4], other.engine)) {
        this.engine = data().deepCopy(fields()[4].schema(), other.engine);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Car instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.AvroCar other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.year)) {
        this.year = data().deepCopy(fields()[1].schema(), other.year);
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
      if (isValidValue(fields()[4], other.engine)) {
        this.engine = data().deepCopy(fields()[4].schema(), other.engine);
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
    public com.example.AvroCar.Builder setId(java.lang.String value) {
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
    public com.example.AvroCar.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'year' field.
      * @return The value.
      */
    public java.lang.Integer getYear() {
      return year;
    }

    /**
      * Sets the value of the 'year' field.
      * @param value The value of 'year'.
      * @return This builder.
      */
    public com.example.AvroCar.Builder setYear(int value) {
      validate(fields()[1], value);
      this.year = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'year' field has been set.
      * @return True if the 'year' field has been set, false otherwise.
      */
    public boolean hasYear() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'year' field.
      * @return This builder.
      */
    public com.example.AvroCar.Builder clearYear() {
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
    public com.example.AvroCar.Builder setMake(java.lang.String value) {
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
    public com.example.AvroCar.Builder clearMake() {
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
    public com.example.AvroCar.Builder setModel(java.lang.String value) {
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
    public com.example.AvroCar.Builder clearModel() {
      model = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'engine' field.
      * @return The value.
      */
    public java.lang.String getEngine() {
      return engine;
    }

    /**
      * Sets the value of the 'engine' field.
      * @param value The value of 'engine'.
      * @return This builder.
      */
    public com.example.AvroCar.Builder setEngine(java.lang.String value) {
      validate(fields()[4], value);
      this.engine = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'engine' field has been set.
      * @return True if the 'engine' field has been set, false otherwise.
      */
    public boolean hasEngine() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'engine' field.
      * @return This builder.
      */
    public com.example.AvroCar.Builder clearEngine() {
      engine = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public AvroCar build() {
      try {
        AvroCar record = new AvroCar();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.year = fieldSetFlags()[1] ? this.year : (java.lang.Integer) defaultValue(fields()[1]);
        record.make = fieldSetFlags()[2] ? this.make : (java.lang.String) defaultValue(fields()[2]);
        record.model = fieldSetFlags()[3] ? this.model : (java.lang.String) defaultValue(fields()[3]);
        record.engine = fieldSetFlags()[4] ? this.engine : (java.lang.String) defaultValue(fields()[4]);
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