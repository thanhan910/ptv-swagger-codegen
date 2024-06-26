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
import java.math.BigDecimal;
/**
 * V3PassengerFare
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-22T22:16:54.146562100+10:00[Australia/Sydney]")

public class V3PassengerFare {
  @SerializedName("PassengerType")
  private String passengerType = null;

  @SerializedName("Fare2HourPeak")
  private BigDecimal fare2HourPeak = null;

  @SerializedName("Fare2HourOffPeak")
  private BigDecimal fare2HourOffPeak = null;

  @SerializedName("FareDailyPeak")
  private BigDecimal fareDailyPeak = null;

  @SerializedName("FareDailyOffPeak")
  private BigDecimal fareDailyOffPeak = null;

  @SerializedName("Pass7Days")
  private BigDecimal pass7Days = null;

  @SerializedName("Pass28To69DayPerDay")
  private BigDecimal pass28To69DayPerDay = null;

  @SerializedName("Pass70PlusDayPerDay")
  private BigDecimal pass70PlusDayPerDay = null;

  @SerializedName("WeekendCap")
  private BigDecimal weekendCap = null;

  @SerializedName("HolidayCap")
  private BigDecimal holidayCap = null;

  public V3PassengerFare passengerType(String passengerType) {
    this.passengerType = passengerType;
    return this;
  }

   /**
   * Get passengerType
   * @return passengerType
  **/
  @Schema(description = "")
  public String getPassengerType() {
    return passengerType;
  }

  public void setPassengerType(String passengerType) {
    this.passengerType = passengerType;
  }

  public V3PassengerFare fare2HourPeak(BigDecimal fare2HourPeak) {
    this.fare2HourPeak = fare2HourPeak;
    return this;
  }

   /**
   * Get fare2HourPeak
   * @return fare2HourPeak
  **/
  @Schema(description = "")
  public BigDecimal getFare2HourPeak() {
    return fare2HourPeak;
  }

  public void setFare2HourPeak(BigDecimal fare2HourPeak) {
    this.fare2HourPeak = fare2HourPeak;
  }

  public V3PassengerFare fare2HourOffPeak(BigDecimal fare2HourOffPeak) {
    this.fare2HourOffPeak = fare2HourOffPeak;
    return this;
  }

   /**
   * Get fare2HourOffPeak
   * @return fare2HourOffPeak
  **/
  @Schema(description = "")
  public BigDecimal getFare2HourOffPeak() {
    return fare2HourOffPeak;
  }

  public void setFare2HourOffPeak(BigDecimal fare2HourOffPeak) {
    this.fare2HourOffPeak = fare2HourOffPeak;
  }

  public V3PassengerFare fareDailyPeak(BigDecimal fareDailyPeak) {
    this.fareDailyPeak = fareDailyPeak;
    return this;
  }

   /**
   * Get fareDailyPeak
   * @return fareDailyPeak
  **/
  @Schema(description = "")
  public BigDecimal getFareDailyPeak() {
    return fareDailyPeak;
  }

  public void setFareDailyPeak(BigDecimal fareDailyPeak) {
    this.fareDailyPeak = fareDailyPeak;
  }

  public V3PassengerFare fareDailyOffPeak(BigDecimal fareDailyOffPeak) {
    this.fareDailyOffPeak = fareDailyOffPeak;
    return this;
  }

   /**
   * Get fareDailyOffPeak
   * @return fareDailyOffPeak
  **/
  @Schema(description = "")
  public BigDecimal getFareDailyOffPeak() {
    return fareDailyOffPeak;
  }

  public void setFareDailyOffPeak(BigDecimal fareDailyOffPeak) {
    this.fareDailyOffPeak = fareDailyOffPeak;
  }

  public V3PassengerFare pass7Days(BigDecimal pass7Days) {
    this.pass7Days = pass7Days;
    return this;
  }

   /**
   * Get pass7Days
   * @return pass7Days
  **/
  @Schema(description = "")
  public BigDecimal getPass7Days() {
    return pass7Days;
  }

  public void setPass7Days(BigDecimal pass7Days) {
    this.pass7Days = pass7Days;
  }

  public V3PassengerFare pass28To69DayPerDay(BigDecimal pass28To69DayPerDay) {
    this.pass28To69DayPerDay = pass28To69DayPerDay;
    return this;
  }

   /**
   * Get pass28To69DayPerDay
   * @return pass28To69DayPerDay
  **/
  @Schema(description = "")
  public BigDecimal getPass28To69DayPerDay() {
    return pass28To69DayPerDay;
  }

  public void setPass28To69DayPerDay(BigDecimal pass28To69DayPerDay) {
    this.pass28To69DayPerDay = pass28To69DayPerDay;
  }

  public V3PassengerFare pass70PlusDayPerDay(BigDecimal pass70PlusDayPerDay) {
    this.pass70PlusDayPerDay = pass70PlusDayPerDay;
    return this;
  }

   /**
   * Get pass70PlusDayPerDay
   * @return pass70PlusDayPerDay
  **/
  @Schema(description = "")
  public BigDecimal getPass70PlusDayPerDay() {
    return pass70PlusDayPerDay;
  }

  public void setPass70PlusDayPerDay(BigDecimal pass70PlusDayPerDay) {
    this.pass70PlusDayPerDay = pass70PlusDayPerDay;
  }

  public V3PassengerFare weekendCap(BigDecimal weekendCap) {
    this.weekendCap = weekendCap;
    return this;
  }

   /**
   * Get weekendCap
   * @return weekendCap
  **/
  @Schema(description = "")
  public BigDecimal getWeekendCap() {
    return weekendCap;
  }

  public void setWeekendCap(BigDecimal weekendCap) {
    this.weekendCap = weekendCap;
  }

  public V3PassengerFare holidayCap(BigDecimal holidayCap) {
    this.holidayCap = holidayCap;
    return this;
  }

   /**
   * Get holidayCap
   * @return holidayCap
  **/
  @Schema(description = "")
  public BigDecimal getHolidayCap() {
    return holidayCap;
  }

  public void setHolidayCap(BigDecimal holidayCap) {
    this.holidayCap = holidayCap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3PassengerFare v3PassengerFare = (V3PassengerFare) o;
    return Objects.equals(this.passengerType, v3PassengerFare.passengerType) &&
        Objects.equals(this.fare2HourPeak, v3PassengerFare.fare2HourPeak) &&
        Objects.equals(this.fare2HourOffPeak, v3PassengerFare.fare2HourOffPeak) &&
        Objects.equals(this.fareDailyPeak, v3PassengerFare.fareDailyPeak) &&
        Objects.equals(this.fareDailyOffPeak, v3PassengerFare.fareDailyOffPeak) &&
        Objects.equals(this.pass7Days, v3PassengerFare.pass7Days) &&
        Objects.equals(this.pass28To69DayPerDay, v3PassengerFare.pass28To69DayPerDay) &&
        Objects.equals(this.pass70PlusDayPerDay, v3PassengerFare.pass70PlusDayPerDay) &&
        Objects.equals(this.weekendCap, v3PassengerFare.weekendCap) &&
        Objects.equals(this.holidayCap, v3PassengerFare.holidayCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passengerType, fare2HourPeak, fare2HourOffPeak, fareDailyPeak, fareDailyOffPeak, pass7Days, pass28To69DayPerDay, pass70PlusDayPerDay, weekendCap, holidayCap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3PassengerFare {\n");
    
    sb.append("    passengerType: ").append(toIndentedString(passengerType)).append("\n");
    sb.append("    fare2HourPeak: ").append(toIndentedString(fare2HourPeak)).append("\n");
    sb.append("    fare2HourOffPeak: ").append(toIndentedString(fare2HourOffPeak)).append("\n");
    sb.append("    fareDailyPeak: ").append(toIndentedString(fareDailyPeak)).append("\n");
    sb.append("    fareDailyOffPeak: ").append(toIndentedString(fareDailyOffPeak)).append("\n");
    sb.append("    pass7Days: ").append(toIndentedString(pass7Days)).append("\n");
    sb.append("    pass28To69DayPerDay: ").append(toIndentedString(pass28To69DayPerDay)).append("\n");
    sb.append("    pass70PlusDayPerDay: ").append(toIndentedString(pass70PlusDayPerDay)).append("\n");
    sb.append("    weekendCap: ").append(toIndentedString(weekendCap)).append("\n");
    sb.append("    holidayCap: ").append(toIndentedString(holidayCap)).append("\n");
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
