/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.appenders.rest.config.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class RestConfig extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RestConfig\",\"namespace\":\"org.kaaproject.kaa.server.appenders.rest.config.gen\",\"fields\":[{\"name\":\"host\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Host\",\"by_default\":\"localhost\"},{\"name\":\"port\",\"type\":\"int\",\"displayName\":\"Port\",\"by_default\":10000},{\"name\":\"ssl\",\"type\":\"boolean\",\"displayName\":\"Use SSL\",\"by_default\":\"false\"},{\"name\":\"verifySslCert\",\"type\":\"boolean\",\"displayName\":\"Validate SSL Certificate\",\"by_default\":\"false\"},{\"name\":\"username\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"displayName\":\"Username\"},{\"name\":\"password\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"displayName\":\"Password\",\"inputType\":\"password\"},{\"name\":\"connectionPoolSize\",\"type\":\"int\",\"displayName\":\"Thread/connection pool size\",\"by_default\":1},{\"name\":\"header\",\"type\":\"boolean\",\"displayName\":\"Include Kaa header\",\"by_default\":\"false\"},{\"name\":\"path\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Relative URI path\"},{\"name\":\"method\",\"type\":{\"type\":\"enum\",\"name\":\"MethodType\",\"symbols\":[\"PUT\",\"POST\"]},\"displayName\":\"Method\"},{\"name\":\"mimeType\",\"type\":{\"type\":\"enum\",\"name\":\"RequestType\",\"symbols\":[\"TEXT\",\"JSON\"]},\"displayName\":\"Request mime type\"}]}");
  private java.lang.String host;
  private int port;
  private boolean ssl;
  private boolean verifySslCert;
  private java.lang.String username;
  private java.lang.String password;
  private int connectionPoolSize;
  private boolean header;
  private java.lang.String path;
  private org.kaaproject.kaa.server.appenders.rest.config.gen.MethodType method;
  private org.kaaproject.kaa.server.appenders.rest.config.gen.RequestType mimeType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public RestConfig() {
  }

  /**
   * All-args constructor.
   */
  public RestConfig(java.lang.String host, java.lang.Integer port, java.lang.Boolean ssl, java.lang.Boolean verifySslCert, java.lang.String username, java.lang.String password, java.lang.Integer connectionPoolSize, java.lang.Boolean header, java.lang.String path, org.kaaproject.kaa.server.appenders.rest.config.gen.MethodType method, org.kaaproject.kaa.server.appenders.rest.config.gen.RequestType mimeType) {
    this.host = host;
    this.port = port;
    this.ssl = ssl;
    this.verifySslCert = verifySslCert;
    this.username = username;
    this.password = password;
    this.connectionPoolSize = connectionPoolSize;
    this.header = header;
    this.path = path;
    this.method = method;
    this.mimeType = mimeType;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /**
   * Creates a new RestConfig RecordBuilder
   */
  public static org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder newBuilder() {
    return new org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder();
  }

  /**
   * Creates a new RestConfig RecordBuilder by copying an existing Builder
   */
  public static org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder newBuilder(org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder other) {
    return new org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder(other);
  }

  /**
   * Creates a new RestConfig RecordBuilder by copying an existing RestConfig instance
   */
  public static org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder newBuilder(org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig other) {
    return new org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return host;
      case 1:
        return port;
      case 2:
        return ssl;
      case 3:
        return verifySslCert;
      case 4:
        return username;
      case 5:
        return password;
      case 6:
        return connectionPoolSize;
      case 7:
        return header;
      case 8:
        return path;
      case 9:
        return method;
      case 10:
        return mimeType;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        host = (java.lang.String) value$;
        break;
      case 1:
        port = (java.lang.Integer) value$;
        break;
      case 2:
        ssl = (java.lang.Boolean) value$;
        break;
      case 3:
        verifySslCert = (java.lang.Boolean) value$;
        break;
      case 4:
        username = (java.lang.String) value$;
        break;
      case 5:
        password = (java.lang.String) value$;
        break;
      case 6:
        connectionPoolSize = (java.lang.Integer) value$;
        break;
      case 7:
        header = (java.lang.Boolean) value$;
        break;
      case 8:
        path = (java.lang.String) value$;
        break;
      case 9:
        method = (org.kaaproject.kaa.server.appenders.rest.config.gen.MethodType) value$;
        break;
      case 10:
        mimeType = (org.kaaproject.kaa.server.appenders.rest.config.gen.RequestType) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'host' field.
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Sets the value of the 'host' field.
   *
   * @param value the value to set.
   */
  public void setHost(java.lang.String value) {
    this.host = value;
  }

  /**
   * Gets the value of the 'port' field.
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Sets the value of the 'port' field.
   *
   * @param value the value to set.
   */
  public void setPort(java.lang.Integer value) {
    this.port = value;
  }

  /**
   * Gets the value of the 'ssl' field.
   */
  public java.lang.Boolean getSsl() {
    return ssl;
  }

  /**
   * Sets the value of the 'ssl' field.
   *
   * @param value the value to set.
   */
  public void setSsl(java.lang.Boolean value) {
    this.ssl = value;
  }

  /**
   * Gets the value of the 'verifySslCert' field.
   */
  public java.lang.Boolean getVerifySslCert() {
    return verifySslCert;
  }

  /**
   * Sets the value of the 'verifySslCert' field.
   *
   * @param value the value to set.
   */
  public void setVerifySslCert(java.lang.Boolean value) {
    this.verifySslCert = value;
  }

  /**
   * Gets the value of the 'username' field.
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * Sets the value of the 'username' field.
   *
   * @param value the value to set.
   */
  public void setUsername(java.lang.String value) {
    this.username = value;
  }

  /**
   * Gets the value of the 'password' field.
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * Sets the value of the 'password' field.
   *
   * @param value the value to set.
   */
  public void setPassword(java.lang.String value) {
    this.password = value;
  }

  /**
   * Gets the value of the 'connectionPoolSize' field.
   */
  public java.lang.Integer getConnectionPoolSize() {
    return connectionPoolSize;
  }

  /**
   * Sets the value of the 'connectionPoolSize' field.
   *
   * @param value the value to set.
   */
  public void setConnectionPoolSize(java.lang.Integer value) {
    this.connectionPoolSize = value;
  }

  /**
   * Gets the value of the 'header' field.
   */
  public java.lang.Boolean getHeader() {
    return header;
  }

  /**
   * Sets the value of the 'header' field.
   *
   * @param value the value to set.
   */
  public void setHeader(java.lang.Boolean value) {
    this.header = value;
  }

  /**
   * Gets the value of the 'path' field.
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * Sets the value of the 'path' field.
   *
   * @param value the value to set.
   */
  public void setPath(java.lang.String value) {
    this.path = value;
  }

  /**
   * Gets the value of the 'method' field.
   */
  public org.kaaproject.kaa.server.appenders.rest.config.gen.MethodType getMethod() {
    return method;
  }

  /**
   * Sets the value of the 'method' field.
   *
   * @param value the value to set.
   */
  public void setMethod(org.kaaproject.kaa.server.appenders.rest.config.gen.MethodType value) {
    this.method = value;
  }

  /**
   * Gets the value of the 'mimeType' field.
   */
  public org.kaaproject.kaa.server.appenders.rest.config.gen.RequestType getMimeType() {
    return mimeType;
  }

  /**
   * Sets the value of the 'mimeType' field.
   *
   * @param value the value to set.
   */
  public void setMimeType(org.kaaproject.kaa.server.appenders.rest.config.gen.RequestType value) {
    this.mimeType = value;
  }

  /**
   * RecordBuilder for RestConfig instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RestConfig>
      implements org.apache.avro.data.RecordBuilder<RestConfig> {

    private java.lang.String host;
    private int port;
    private boolean ssl;
    private boolean verifySslCert;
    private java.lang.String username;
    private java.lang.String password;
    private int connectionPoolSize;
    private boolean header;
    private java.lang.String path;
    private org.kaaproject.kaa.server.appenders.rest.config.gen.MethodType method;
    private org.kaaproject.kaa.server.appenders.rest.config.gen.RequestType mimeType;

    /**
     * Creates a new Builder
     */
    private Builder() {
      super(org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder
     */
    private Builder(org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.host)) {
        this.host = data().deepCopy(fields()[0].schema(), other.host);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.port)) {
        this.port = data().deepCopy(fields()[1].schema(), other.port);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ssl)) {
        this.ssl = data().deepCopy(fields()[2].schema(), other.ssl);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.verifySslCert)) {
        this.verifySslCert = data().deepCopy(fields()[3].schema(), other.verifySslCert);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.username)) {
        this.username = data().deepCopy(fields()[4].schema(), other.username);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.password)) {
        this.password = data().deepCopy(fields()[5].schema(), other.password);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.connectionPoolSize)) {
        this.connectionPoolSize = data().deepCopy(fields()[6].schema(), other.connectionPoolSize);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.header)) {
        this.header = data().deepCopy(fields()[7].schema(), other.header);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.path)) {
        this.path = data().deepCopy(fields()[8].schema(), other.path);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.method)) {
        this.method = data().deepCopy(fields()[9].schema(), other.method);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.mimeType)) {
        this.mimeType = data().deepCopy(fields()[10].schema(), other.mimeType);
        fieldSetFlags()[10] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing RestConfig instance
     */
    private Builder(org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig other) {
      super(org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.SCHEMA$);
      if (isValidValue(fields()[0], other.host)) {
        this.host = data().deepCopy(fields()[0].schema(), other.host);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.port)) {
        this.port = data().deepCopy(fields()[1].schema(), other.port);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ssl)) {
        this.ssl = data().deepCopy(fields()[2].schema(), other.ssl);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.verifySslCert)) {
        this.verifySslCert = data().deepCopy(fields()[3].schema(), other.verifySslCert);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.username)) {
        this.username = data().deepCopy(fields()[4].schema(), other.username);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.password)) {
        this.password = data().deepCopy(fields()[5].schema(), other.password);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.connectionPoolSize)) {
        this.connectionPoolSize = data().deepCopy(fields()[6].schema(), other.connectionPoolSize);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.header)) {
        this.header = data().deepCopy(fields()[7].schema(), other.header);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.path)) {
        this.path = data().deepCopy(fields()[8].schema(), other.path);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.method)) {
        this.method = data().deepCopy(fields()[9].schema(), other.method);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.mimeType)) {
        this.mimeType = data().deepCopy(fields()[10].schema(), other.mimeType);
        fieldSetFlags()[10] = true;
      }
    }

    /**
     * Gets the value of the 'host' field
     */
    public java.lang.String getHost() {
      return host;
    }

    /**
     * Sets the value of the 'host' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder setHost(java.lang.String value) {
      validate(fields()[0], value);
      this.host = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'host' field has been set
     */
    public boolean hasHost() {
      return fieldSetFlags()[0];
    }

    /**
     * Clears the value of the 'host' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder clearHost() {
      host = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'port' field
     */
    public java.lang.Integer getPort() {
      return port;
    }

    /**
     * Sets the value of the 'port' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder setPort(int value) {
      validate(fields()[1], value);
      this.port = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'port' field has been set
     */
    public boolean hasPort() {
      return fieldSetFlags()[1];
    }

    /**
     * Clears the value of the 'port' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder clearPort() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
     * Gets the value of the 'ssl' field
     */
    public java.lang.Boolean getSsl() {
      return ssl;
    }

    /**
     * Sets the value of the 'ssl' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder setSsl(boolean value) {
      validate(fields()[2], value);
      this.ssl = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
     * Checks whether the 'ssl' field has been set
     */
    public boolean hasSsl() {
      return fieldSetFlags()[2];
    }

    /**
     * Clears the value of the 'ssl' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder clearSsl() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
     * Gets the value of the 'verifySslCert' field
     */
    public java.lang.Boolean getVerifySslCert() {
      return verifySslCert;
    }

    /**
     * Sets the value of the 'verifySslCert' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder setVerifySslCert(boolean value) {
      validate(fields()[3], value);
      this.verifySslCert = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
     * Checks whether the 'verifySslCert' field has been set
     */
    public boolean hasVerifySslCert() {
      return fieldSetFlags()[3];
    }

    /**
     * Clears the value of the 'verifySslCert' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder clearVerifySslCert() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
     * Gets the value of the 'username' field
     */
    public java.lang.String getUsername() {
      return username;
    }

    /**
     * Sets the value of the 'username' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder setUsername(java.lang.String value) {
      validate(fields()[4], value);
      this.username = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
     * Checks whether the 'username' field has been set
     */
    public boolean hasUsername() {
      return fieldSetFlags()[4];
    }

    /**
     * Clears the value of the 'username' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder clearUsername() {
      username = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
     * Gets the value of the 'password' field
     */
    public java.lang.String getPassword() {
      return password;
    }

    /**
     * Sets the value of the 'password' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder setPassword(java.lang.String value) {
      validate(fields()[5], value);
      this.password = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
     * Checks whether the 'password' field has been set
     */
    public boolean hasPassword() {
      return fieldSetFlags()[5];
    }

    /**
     * Clears the value of the 'password' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder clearPassword() {
      password = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
     * Gets the value of the 'connectionPoolSize' field
     */
    public java.lang.Integer getConnectionPoolSize() {
      return connectionPoolSize;
    }

    /**
     * Sets the value of the 'connectionPoolSize' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder setConnectionPoolSize(int value) {
      validate(fields()[6], value);
      this.connectionPoolSize = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
     * Checks whether the 'connectionPoolSize' field has been set
     */
    public boolean hasConnectionPoolSize() {
      return fieldSetFlags()[6];
    }

    /**
     * Clears the value of the 'connectionPoolSize' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder clearConnectionPoolSize() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
     * Gets the value of the 'header' field
     */
    public java.lang.Boolean getHeader() {
      return header;
    }

    /**
     * Sets the value of the 'header' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder setHeader(boolean value) {
      validate(fields()[7], value);
      this.header = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
     * Checks whether the 'header' field has been set
     */
    public boolean hasHeader() {
      return fieldSetFlags()[7];
    }

    /**
     * Clears the value of the 'header' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder clearHeader() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
     * Gets the value of the 'path' field
     */
    public java.lang.String getPath() {
      return path;
    }

    /**
     * Sets the value of the 'path' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder setPath(java.lang.String value) {
      validate(fields()[8], value);
      this.path = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
     * Checks whether the 'path' field has been set
     */
    public boolean hasPath() {
      return fieldSetFlags()[8];
    }

    /**
     * Clears the value of the 'path' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder clearPath() {
      path = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
     * Gets the value of the 'method' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.MethodType getMethod() {
      return method;
    }

    /**
     * Sets the value of the 'method' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder setMethod(org.kaaproject.kaa.server.appenders.rest.config.gen.MethodType value) {
      validate(fields()[9], value);
      this.method = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
     * Checks whether the 'method' field has been set
     */
    public boolean hasMethod() {
      return fieldSetFlags()[9];
    }

    /**
     * Clears the value of the 'method' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder clearMethod() {
      method = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
     * Gets the value of the 'mimeType' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RequestType getMimeType() {
      return mimeType;
    }

    /**
     * Sets the value of the 'mimeType' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder setMimeType(org.kaaproject.kaa.server.appenders.rest.config.gen.RequestType value) {
      validate(fields()[10], value);
      this.mimeType = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
     * Checks whether the 'mimeType' field has been set
     */
    public boolean hasMimeType() {
      return fieldSetFlags()[10];
    }

    /**
     * Clears the value of the 'mimeType' field
     */
    public org.kaaproject.kaa.server.appenders.rest.config.gen.RestConfig.Builder clearMimeType() {
      mimeType = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    public RestConfig build() {
      try {
        RestConfig record = new RestConfig();
        record.host = fieldSetFlags()[0] ? this.host : (java.lang.String) defaultValue(fields()[0]);
        record.port = fieldSetFlags()[1] ? this.port : (java.lang.Integer) defaultValue(fields()[1]);
        record.ssl = fieldSetFlags()[2] ? this.ssl : (java.lang.Boolean) defaultValue(fields()[2]);
        record.verifySslCert = fieldSetFlags()[3] ? this.verifySslCert : (java.lang.Boolean) defaultValue(fields()[3]);
        record.username = fieldSetFlags()[4] ? this.username : (java.lang.String) defaultValue(fields()[4]);
        record.password = fieldSetFlags()[5] ? this.password : (java.lang.String) defaultValue(fields()[5]);
        record.connectionPoolSize = fieldSetFlags()[6] ? this.connectionPoolSize : (java.lang.Integer) defaultValue(fields()[6]);
        record.header = fieldSetFlags()[7] ? this.header : (java.lang.Boolean) defaultValue(fields()[7]);
        record.path = fieldSetFlags()[8] ? this.path : (java.lang.String) defaultValue(fields()[8]);
        record.method = fieldSetFlags()[9] ? this.method : (org.kaaproject.kaa.server.appenders.rest.config.gen.MethodType) defaultValue(fields()[9]);
        record.mimeType = fieldSetFlags()[10] ? this.mimeType : (org.kaaproject.kaa.server.appenders.rest.config.gen.RequestType) defaultValue(fields()[10]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
