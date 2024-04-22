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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V3StopAmenityDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-22T17:01:39.159+10:00")
public class V3StopAmenityDetails {
  @SerializedName("toilet")
  private Boolean toilet = null;

  @SerializedName("taxi_rank")
  private Boolean taxiRank = null;

  @SerializedName("car_parking")
  private String carParking = null;

  @SerializedName("cctv")
  private Boolean cctv = null;

  public V3StopAmenityDetails toilet(Boolean toilet) {
    this.toilet = toilet;
    return this;
  }

   /**
   * Indicates if there is a public toilet at or near the stop
   * @return toilet
  **/
  @ApiModelProperty(value = "Indicates if there is a public toilet at or near the stop")
  public Boolean isToilet() {
    return toilet;
  }

  public void setToilet(Boolean toilet) {
    this.toilet = toilet;
  }

  public V3StopAmenityDetails taxiRank(Boolean taxiRank) {
    this.taxiRank = taxiRank;
    return this;
  }

   /**
   * Indicates if there is a taxi rank at or near the stop
   * @return taxiRank
  **/
  @ApiModelProperty(value = "Indicates if there is a taxi rank at or near the stop")
  public Boolean isTaxiRank() {
    return taxiRank;
  }

  public void setTaxiRank(Boolean taxiRank) {
    this.taxiRank = taxiRank;
  }

  public V3StopAmenityDetails carParking(String carParking) {
    this.carParking = carParking;
    return this;
  }

   /**
   * The number of free car parking spots at the stop
   * @return carParking
  **/
  @ApiModelProperty(value = "The number of free car parking spots at the stop")
  public String getCarParking() {
    return carParking;
  }

  public void setCarParking(String carParking) {
    this.carParking = carParking;
  }

  public V3StopAmenityDetails cctv(Boolean cctv) {
    this.cctv = cctv;
    return this;
  }

   /**
   * Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop
   * @return cctv
  **/
  @ApiModelProperty(value = "Indicates if there are CCTV (i.e. closed circuit television) cameras at the stop")
  public Boolean isCctv() {
    return cctv;
  }

  public void setCctv(Boolean cctv) {
    this.cctv = cctv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopAmenityDetails v3StopAmenityDetails = (V3StopAmenityDetails) o;
    return Objects.equals(this.toilet, v3StopAmenityDetails.toilet) &&
        Objects.equals(this.taxiRank, v3StopAmenityDetails.taxiRank) &&
        Objects.equals(this.carParking, v3StopAmenityDetails.carParking) &&
        Objects.equals(this.cctv, v3StopAmenityDetails.cctv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toilet, taxiRank, carParking, cctv);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopAmenityDetails {\n");
    
    sb.append("    toilet: ").append(toIndentedString(toilet)).append("\n");
    sb.append("    taxiRank: ").append(toIndentedString(taxiRank)).append("\n");
    sb.append("    carParking: ").append(toIndentedString(carParking)).append("\n");
    sb.append("    cctv: ").append(toIndentedString(cctv)).append("\n");
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

