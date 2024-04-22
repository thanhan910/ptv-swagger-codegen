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
import org.threeten.bp.OffsetDateTime;
/**
 * V3VehiclePosition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-22T17:04:13.135709+10:00[Australia/Sydney]")

public class V3VehiclePosition {
  @SerializedName("latitude")
  private Double latitude = null;

  @SerializedName("longitude")
  private Double longitude = null;

  @SerializedName("easting")
  private Double easting = null;

  @SerializedName("northing")
  private Double northing = null;

  @SerializedName("direction")
  private String direction = null;

  @SerializedName("bearing")
  private Double bearing = null;

  @SerializedName("supplier")
  private String supplier = null;

  @SerializedName("datetime_utc")
  private OffsetDateTime datetimeUtc = null;

  @SerializedName("expiry_time")
  private OffsetDateTime expiryTime = null;

  public V3VehiclePosition latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs.
   * @return latitude
  **/
  @Schema(description = "Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs.")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public V3VehiclePosition longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs.
   * @return longitude
  **/
  @Schema(description = "Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs.")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public V3VehiclePosition easting(Double easting) {
    this.easting = easting;
    return this;
  }

   /**
   * CIS - Metro Train Vehicle Location Easting coordinate
   * @return easting
  **/
  @Schema(description = "CIS - Metro Train Vehicle Location Easting coordinate")
  public Double getEasting() {
    return easting;
  }

  public void setEasting(Double easting) {
    this.easting = easting;
  }

  public V3VehiclePosition northing(Double northing) {
    this.northing = northing;
    return this;
  }

   /**
   * CIS - Metro Train Vehicle Location Northing coordinate
   * @return northing
  **/
  @Schema(description = "CIS - Metro Train Vehicle Location Northing coordinate")
  public Double getNorthing() {
    return northing;
  }

  public void setNorthing(Double northing) {
    this.northing = northing;
  }

  public V3VehiclePosition direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * CIS - Metro Train Vehicle Location Direction
   * @return direction
  **/
  @Schema(description = "CIS - Metro Train Vehicle Location Direction")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public V3VehiclePosition bearing(Double bearing) {
    this.bearing = bearing;
    return this;
  }

   /**
   * Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs.
   * @return bearing
  **/
  @Schema(description = "Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs.")
  public Double getBearing() {
    return bearing;
  }

  public void setBearing(Double bearing) {
    this.bearing = bearing;
  }

  public V3VehiclePosition supplier(String supplier) {
    this.supplier = supplier;
    return this;
  }

   /**
   * Supplier of vehicle position data.
   * @return supplier
  **/
  @Schema(description = "Supplier of vehicle position data.")
  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }

  public V3VehiclePosition datetimeUtc(OffsetDateTime datetimeUtc) {
    this.datetimeUtc = datetimeUtc;
    return this;
  }

   /**
   * Date and time that the vehicle position data was supplied.
   * @return datetimeUtc
  **/
  @Schema(description = "Date and time that the vehicle position data was supplied.")
  public OffsetDateTime getDatetimeUtc() {
    return datetimeUtc;
  }

  public void setDatetimeUtc(OffsetDateTime datetimeUtc) {
    this.datetimeUtc = datetimeUtc;
  }

  public V3VehiclePosition expiryTime(OffsetDateTime expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

   /**
   * CIS - Metro Train Vehicle Location data expiry time
   * @return expiryTime
  **/
  @Schema(description = "CIS - Metro Train Vehicle Location data expiry time")
  public OffsetDateTime getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(OffsetDateTime expiryTime) {
    this.expiryTime = expiryTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3VehiclePosition v3VehiclePosition = (V3VehiclePosition) o;
    return Objects.equals(this.latitude, v3VehiclePosition.latitude) &&
        Objects.equals(this.longitude, v3VehiclePosition.longitude) &&
        Objects.equals(this.easting, v3VehiclePosition.easting) &&
        Objects.equals(this.northing, v3VehiclePosition.northing) &&
        Objects.equals(this.direction, v3VehiclePosition.direction) &&
        Objects.equals(this.bearing, v3VehiclePosition.bearing) &&
        Objects.equals(this.supplier, v3VehiclePosition.supplier) &&
        Objects.equals(this.datetimeUtc, v3VehiclePosition.datetimeUtc) &&
        Objects.equals(this.expiryTime, v3VehiclePosition.expiryTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, easting, northing, direction, bearing, supplier, datetimeUtc, expiryTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3VehiclePosition {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    easting: ").append(toIndentedString(easting)).append("\n");
    sb.append("    northing: ").append(toIndentedString(northing)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    bearing: ").append(toIndentedString(bearing)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    datetimeUtc: ").append(toIndentedString(datetimeUtc)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
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
