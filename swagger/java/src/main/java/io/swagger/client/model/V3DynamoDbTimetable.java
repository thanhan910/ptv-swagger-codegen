/*
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * V3DynamoDbTimetable
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-22T17:04:13.135709+10:00[Australia/Sydney]")

public class V3DynamoDbTimetable {
  @SerializedName("table_name")
  private String tableName = null;

  @SerializedName("parser_version")
  private Long parserVersion = null;

  @SerializedName("parser_mapping_version")
  private String parserMappingVersion = null;

  @SerializedName("pt_version")
  private Long ptVersion = null;

  @SerializedName("pt_mapping_version")
  private String ptMappingVersion = null;

  /**
   * A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)
   */
  @JsonAdapter(TransportTypeEnum.Adapter.class)
  public enum TransportTypeEnum {
    @SerializedName("0")
    NUMBER_0(0),
    @SerializedName("1")
    NUMBER_1(1),
    @SerializedName("2")
    NUMBER_2(2),
    @SerializedName("3")
    NUMBER_3(3),
    @SerializedName("4")
    NUMBER_4(4);

    private Integer value;

    TransportTypeEnum(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TransportTypeEnum fromValue(Integer input) {
      for (TransportTypeEnum b : TransportTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TransportTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransportTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TransportTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextInt();
        return TransportTypeEnum.fromValue((Integer)(value));
      }
    }
  }  @SerializedName("transport_type")
  private TransportTypeEnum transportType = null;

  @SerializedName("applicable_local_date")
  private String applicableLocalDate = null;

  @SerializedName("exists")
  private Boolean exists = null;

  public V3DynamoDbTimetable tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Name of corresponding table in DynamoDB.
   * @return tableName
  **/
  @Schema(description = "Name of corresponding table in DynamoDB.")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public V3DynamoDbTimetable parserVersion(Long parserVersion) {
    this.parserVersion = parserVersion;
    return this;
  }

   /**
   * Parser verison
   * @return parserVersion
  **/
  @Schema(description = "Parser verison")
  public Long getParserVersion() {
    return parserVersion;
  }

  public void setParserVersion(Long parserVersion) {
    this.parserVersion = parserVersion;
  }

  public V3DynamoDbTimetable parserMappingVersion(String parserMappingVersion) {
    this.parserMappingVersion = parserMappingVersion;
    return this;
  }

   /**
   * Diva Mapping Version used to load Parser into DynamoDB
   * @return parserMappingVersion
  **/
  @Schema(description = "Diva Mapping Version used to load Parser into DynamoDB")
  public String getParserMappingVersion() {
    return parserMappingVersion;
  }

  public void setParserMappingVersion(String parserMappingVersion) {
    this.parserMappingVersion = parserMappingVersion;
  }

  public V3DynamoDbTimetable ptVersion(Long ptVersion) {
    this.ptVersion = ptVersion;
    return this;
  }

   /**
   * PT version
   * @return ptVersion
  **/
  @Schema(description = "PT version")
  public Long getPtVersion() {
    return ptVersion;
  }

  public void setPtVersion(Long ptVersion) {
    this.ptVersion = ptVersion;
  }

  public V3DynamoDbTimetable ptMappingVersion(String ptMappingVersion) {
    this.ptMappingVersion = ptMappingVersion;
    return this;
  }

   /**
   * Diva Mapping Version used to load PT into DynamoDB
   * @return ptMappingVersion
  **/
  @Schema(description = "Diva Mapping Version used to load PT into DynamoDB")
  public String getPtMappingVersion() {
    return ptMappingVersion;
  }

  public void setPtMappingVersion(String ptMappingVersion) {
    this.ptMappingVersion = ptMappingVersion;
  }

  public V3DynamoDbTimetable transportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
    return this;
  }

   /**
   * A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)
   * @return transportType
  **/
  @Schema(description = "A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)")
  public TransportTypeEnum getTransportType() {
    return transportType;
  }

  public void setTransportType(TransportTypeEnum transportType) {
    this.transportType = transportType;
  }

   /**
   * Formated date string of applicable date
   * @return applicableLocalDate
  **/
  @Schema(description = "Formated date string of applicable date")
  public String getApplicableLocalDate() {
    return applicableLocalDate;
  }

  public V3DynamoDbTimetable exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

   /**
   * True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.
   * @return exists
  **/
  @Schema(description = "True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.")
  public Boolean isExists() {
    return exists;
  }

  public void setExists(Boolean exists) {
    this.exists = exists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3DynamoDbTimetable v3DynamoDbTimetable = (V3DynamoDbTimetable) o;
    return Objects.equals(this.tableName, v3DynamoDbTimetable.tableName) &&
        Objects.equals(this.parserVersion, v3DynamoDbTimetable.parserVersion) &&
        Objects.equals(this.parserMappingVersion, v3DynamoDbTimetable.parserMappingVersion) &&
        Objects.equals(this.ptVersion, v3DynamoDbTimetable.ptVersion) &&
        Objects.equals(this.ptMappingVersion, v3DynamoDbTimetable.ptMappingVersion) &&
        Objects.equals(this.transportType, v3DynamoDbTimetable.transportType) &&
        Objects.equals(this.applicableLocalDate, v3DynamoDbTimetable.applicableLocalDate) &&
        Objects.equals(this.exists, v3DynamoDbTimetable.exists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableName, parserVersion, parserMappingVersion, ptVersion, ptMappingVersion, transportType, applicableLocalDate, exists);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DynamoDbTimetable {\n");
    
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    parserVersion: ").append(toIndentedString(parserVersion)).append("\n");
    sb.append("    parserMappingVersion: ").append(toIndentedString(parserMappingVersion)).append("\n");
    sb.append("    ptVersion: ").append(toIndentedString(ptVersion)).append("\n");
    sb.append("    ptMappingVersion: ").append(toIndentedString(ptMappingVersion)).append("\n");
    sb.append("    transportType: ").append(toIndentedString(transportType)).append("\n");
    sb.append("    applicableLocalDate: ").append(toIndentedString(applicableLocalDate)).append("\n");
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
