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
import java.util.ArrayList;
import java.util.List;
/**
 * V3ZoneInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-22T21:59:36.979641400+10:00[Australia/Sydney]")

public class V3ZoneInfo {
  @SerializedName("MinZone")
  private Integer minZone = null;

  @SerializedName("MaxZone")
  private Integer maxZone = null;

  @SerializedName("UniqueZones")
  private List<Integer> uniqueZones = null;

  public V3ZoneInfo minZone(Integer minZone) {
    this.minZone = minZone;
    return this;
  }

   /**
   * Get minZone
   * @return minZone
  **/
  @Schema(description = "")
  public Integer getMinZone() {
    return minZone;
  }

  public void setMinZone(Integer minZone) {
    this.minZone = minZone;
  }

  public V3ZoneInfo maxZone(Integer maxZone) {
    this.maxZone = maxZone;
    return this;
  }

   /**
   * Get maxZone
   * @return maxZone
  **/
  @Schema(description = "")
  public Integer getMaxZone() {
    return maxZone;
  }

  public void setMaxZone(Integer maxZone) {
    this.maxZone = maxZone;
  }

  public V3ZoneInfo uniqueZones(List<Integer> uniqueZones) {
    this.uniqueZones = uniqueZones;
    return this;
  }

  public V3ZoneInfo addUniqueZonesItem(Integer uniqueZonesItem) {
    if (this.uniqueZones == null) {
      this.uniqueZones = new ArrayList<Integer>();
    }
    this.uniqueZones.add(uniqueZonesItem);
    return this;
  }

   /**
   * Get uniqueZones
   * @return uniqueZones
  **/
  @Schema(description = "")
  public List<Integer> getUniqueZones() {
    return uniqueZones;
  }

  public void setUniqueZones(List<Integer> uniqueZones) {
    this.uniqueZones = uniqueZones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3ZoneInfo v3ZoneInfo = (V3ZoneInfo) o;
    return Objects.equals(this.minZone, v3ZoneInfo.minZone) &&
        Objects.equals(this.maxZone, v3ZoneInfo.maxZone) &&
        Objects.equals(this.uniqueZones, v3ZoneInfo.uniqueZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minZone, maxZone, uniqueZones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3ZoneInfo {\n");
    
    sb.append("    minZone: ").append(toIndentedString(minZone)).append("\n");
    sb.append("    maxZone: ").append(toIndentedString(maxZone)).append("\n");
    sb.append("    uniqueZones: ").append(toIndentedString(uniqueZones)).append("\n");
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
