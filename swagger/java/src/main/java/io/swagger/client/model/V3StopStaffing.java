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
 * V3StopStaffing
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-22T17:01:39.159+10:00")
public class V3StopStaffing {
  @SerializedName("fri_am_from")
  private String friAmFrom = null;

  @SerializedName("fri_am_to")
  private String friAmTo = null;

  @SerializedName("fri_pm_from")
  private String friPmFrom = null;

  @SerializedName("fri_pm_to")
  private String friPmTo = null;

  @SerializedName("mon_am_from")
  private String monAmFrom = null;

  @SerializedName("mon_am_to")
  private String monAmTo = null;

  @SerializedName("mon_pm_from")
  private String monPmFrom = null;

  @SerializedName("mon_pm_to")
  private String monPmTo = null;

  @SerializedName("ph_additional_text")
  private String phAdditionalText = null;

  @SerializedName("ph_from")
  private String phFrom = null;

  @SerializedName("ph_to")
  private String phTo = null;

  @SerializedName("sat_am_from")
  private String satAmFrom = null;

  @SerializedName("sat_am_to")
  private String satAmTo = null;

  @SerializedName("sat_pm_from")
  private String satPmFrom = null;

  @SerializedName("sat_pm_to")
  private String satPmTo = null;

  @SerializedName("sun_am_from")
  private String sunAmFrom = null;

  @SerializedName("sun_am_to")
  private String sunAmTo = null;

  @SerializedName("sun_pm_from")
  private String sunPmFrom = null;

  @SerializedName("sun_pm_to")
  private String sunPmTo = null;

  @SerializedName("thu_am_from")
  private String thuAmFrom = null;

  @SerializedName("thu_am_to")
  private String thuAmTo = null;

  @SerializedName("thu_pm_from")
  private String thuPmFrom = null;

  @SerializedName("thu_pm_to")
  private String thuPmTo = null;

  @SerializedName("tue_am_from")
  private String tueAmFrom = null;

  @SerializedName("tue_am_to")
  private String tueAmTo = null;

  @SerializedName("tue_pm_from")
  private String tuePmFrom = null;

  @SerializedName("tue_pm_to")
  private String tuePmTo = null;

  @SerializedName("wed_am_from")
  private String wedAmFrom = null;

  @SerializedName("wed_am_to")
  private String wedAmTo = null;

  @SerializedName("wed_pm_from")
  private String wedPmFrom = null;

  @SerializedName("wed_pm_To")
  private String wedPmTo = null;

  public V3StopStaffing friAmFrom(String friAmFrom) {
    this.friAmFrom = friAmFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return friAmFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getFriAmFrom() {
    return friAmFrom;
  }

  public void setFriAmFrom(String friAmFrom) {
    this.friAmFrom = friAmFrom;
  }

  public V3StopStaffing friAmTo(String friAmTo) {
    this.friAmTo = friAmTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return friAmTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getFriAmTo() {
    return friAmTo;
  }

  public void setFriAmTo(String friAmTo) {
    this.friAmTo = friAmTo;
  }

  public V3StopStaffing friPmFrom(String friPmFrom) {
    this.friPmFrom = friPmFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return friPmFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getFriPmFrom() {
    return friPmFrom;
  }

  public void setFriPmFrom(String friPmFrom) {
    this.friPmFrom = friPmFrom;
  }

  public V3StopStaffing friPmTo(String friPmTo) {
    this.friPmTo = friPmTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return friPmTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getFriPmTo() {
    return friPmTo;
  }

  public void setFriPmTo(String friPmTo) {
    this.friPmTo = friPmTo;
  }

  public V3StopStaffing monAmFrom(String monAmFrom) {
    this.monAmFrom = monAmFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return monAmFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getMonAmFrom() {
    return monAmFrom;
  }

  public void setMonAmFrom(String monAmFrom) {
    this.monAmFrom = monAmFrom;
  }

  public V3StopStaffing monAmTo(String monAmTo) {
    this.monAmTo = monAmTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return monAmTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getMonAmTo() {
    return monAmTo;
  }

  public void setMonAmTo(String monAmTo) {
    this.monAmTo = monAmTo;
  }

  public V3StopStaffing monPmFrom(String monPmFrom) {
    this.monPmFrom = monPmFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return monPmFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getMonPmFrom() {
    return monPmFrom;
  }

  public void setMonPmFrom(String monPmFrom) {
    this.monPmFrom = monPmFrom;
  }

  public V3StopStaffing monPmTo(String monPmTo) {
    this.monPmTo = monPmTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return monPmTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getMonPmTo() {
    return monPmTo;
  }

  public void setMonPmTo(String monPmTo) {
    this.monPmTo = monPmTo;
  }

  public V3StopStaffing phAdditionalText(String phAdditionalText) {
    this.phAdditionalText = phAdditionalText;
    return this;
  }

   /**
   * Stop staffing hours
   * @return phAdditionalText
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getPhAdditionalText() {
    return phAdditionalText;
  }

  public void setPhAdditionalText(String phAdditionalText) {
    this.phAdditionalText = phAdditionalText;
  }

  public V3StopStaffing phFrom(String phFrom) {
    this.phFrom = phFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return phFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getPhFrom() {
    return phFrom;
  }

  public void setPhFrom(String phFrom) {
    this.phFrom = phFrom;
  }

  public V3StopStaffing phTo(String phTo) {
    this.phTo = phTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return phTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getPhTo() {
    return phTo;
  }

  public void setPhTo(String phTo) {
    this.phTo = phTo;
  }

  public V3StopStaffing satAmFrom(String satAmFrom) {
    this.satAmFrom = satAmFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return satAmFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getSatAmFrom() {
    return satAmFrom;
  }

  public void setSatAmFrom(String satAmFrom) {
    this.satAmFrom = satAmFrom;
  }

  public V3StopStaffing satAmTo(String satAmTo) {
    this.satAmTo = satAmTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return satAmTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getSatAmTo() {
    return satAmTo;
  }

  public void setSatAmTo(String satAmTo) {
    this.satAmTo = satAmTo;
  }

  public V3StopStaffing satPmFrom(String satPmFrom) {
    this.satPmFrom = satPmFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return satPmFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getSatPmFrom() {
    return satPmFrom;
  }

  public void setSatPmFrom(String satPmFrom) {
    this.satPmFrom = satPmFrom;
  }

  public V3StopStaffing satPmTo(String satPmTo) {
    this.satPmTo = satPmTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return satPmTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getSatPmTo() {
    return satPmTo;
  }

  public void setSatPmTo(String satPmTo) {
    this.satPmTo = satPmTo;
  }

  public V3StopStaffing sunAmFrom(String sunAmFrom) {
    this.sunAmFrom = sunAmFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return sunAmFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getSunAmFrom() {
    return sunAmFrom;
  }

  public void setSunAmFrom(String sunAmFrom) {
    this.sunAmFrom = sunAmFrom;
  }

  public V3StopStaffing sunAmTo(String sunAmTo) {
    this.sunAmTo = sunAmTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return sunAmTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getSunAmTo() {
    return sunAmTo;
  }

  public void setSunAmTo(String sunAmTo) {
    this.sunAmTo = sunAmTo;
  }

  public V3StopStaffing sunPmFrom(String sunPmFrom) {
    this.sunPmFrom = sunPmFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return sunPmFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getSunPmFrom() {
    return sunPmFrom;
  }

  public void setSunPmFrom(String sunPmFrom) {
    this.sunPmFrom = sunPmFrom;
  }

  public V3StopStaffing sunPmTo(String sunPmTo) {
    this.sunPmTo = sunPmTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return sunPmTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getSunPmTo() {
    return sunPmTo;
  }

  public void setSunPmTo(String sunPmTo) {
    this.sunPmTo = sunPmTo;
  }

  public V3StopStaffing thuAmFrom(String thuAmFrom) {
    this.thuAmFrom = thuAmFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return thuAmFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getThuAmFrom() {
    return thuAmFrom;
  }

  public void setThuAmFrom(String thuAmFrom) {
    this.thuAmFrom = thuAmFrom;
  }

  public V3StopStaffing thuAmTo(String thuAmTo) {
    this.thuAmTo = thuAmTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return thuAmTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getThuAmTo() {
    return thuAmTo;
  }

  public void setThuAmTo(String thuAmTo) {
    this.thuAmTo = thuAmTo;
  }

  public V3StopStaffing thuPmFrom(String thuPmFrom) {
    this.thuPmFrom = thuPmFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return thuPmFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getThuPmFrom() {
    return thuPmFrom;
  }

  public void setThuPmFrom(String thuPmFrom) {
    this.thuPmFrom = thuPmFrom;
  }

  public V3StopStaffing thuPmTo(String thuPmTo) {
    this.thuPmTo = thuPmTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return thuPmTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getThuPmTo() {
    return thuPmTo;
  }

  public void setThuPmTo(String thuPmTo) {
    this.thuPmTo = thuPmTo;
  }

  public V3StopStaffing tueAmFrom(String tueAmFrom) {
    this.tueAmFrom = tueAmFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return tueAmFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getTueAmFrom() {
    return tueAmFrom;
  }

  public void setTueAmFrom(String tueAmFrom) {
    this.tueAmFrom = tueAmFrom;
  }

  public V3StopStaffing tueAmTo(String tueAmTo) {
    this.tueAmTo = tueAmTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return tueAmTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getTueAmTo() {
    return tueAmTo;
  }

  public void setTueAmTo(String tueAmTo) {
    this.tueAmTo = tueAmTo;
  }

  public V3StopStaffing tuePmFrom(String tuePmFrom) {
    this.tuePmFrom = tuePmFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return tuePmFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getTuePmFrom() {
    return tuePmFrom;
  }

  public void setTuePmFrom(String tuePmFrom) {
    this.tuePmFrom = tuePmFrom;
  }

  public V3StopStaffing tuePmTo(String tuePmTo) {
    this.tuePmTo = tuePmTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return tuePmTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getTuePmTo() {
    return tuePmTo;
  }

  public void setTuePmTo(String tuePmTo) {
    this.tuePmTo = tuePmTo;
  }

  public V3StopStaffing wedAmFrom(String wedAmFrom) {
    this.wedAmFrom = wedAmFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return wedAmFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getWedAmFrom() {
    return wedAmFrom;
  }

  public void setWedAmFrom(String wedAmFrom) {
    this.wedAmFrom = wedAmFrom;
  }

  public V3StopStaffing wedAmTo(String wedAmTo) {
    this.wedAmTo = wedAmTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return wedAmTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getWedAmTo() {
    return wedAmTo;
  }

  public void setWedAmTo(String wedAmTo) {
    this.wedAmTo = wedAmTo;
  }

  public V3StopStaffing wedPmFrom(String wedPmFrom) {
    this.wedPmFrom = wedPmFrom;
    return this;
  }

   /**
   * Stop staffing hours
   * @return wedPmFrom
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getWedPmFrom() {
    return wedPmFrom;
  }

  public void setWedPmFrom(String wedPmFrom) {
    this.wedPmFrom = wedPmFrom;
  }

  public V3StopStaffing wedPmTo(String wedPmTo) {
    this.wedPmTo = wedPmTo;
    return this;
  }

   /**
   * Stop staffing hours
   * @return wedPmTo
  **/
  @ApiModelProperty(value = "Stop staffing hours")
  public String getWedPmTo() {
    return wedPmTo;
  }

  public void setWedPmTo(String wedPmTo) {
    this.wedPmTo = wedPmTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopStaffing v3StopStaffing = (V3StopStaffing) o;
    return Objects.equals(this.friAmFrom, v3StopStaffing.friAmFrom) &&
        Objects.equals(this.friAmTo, v3StopStaffing.friAmTo) &&
        Objects.equals(this.friPmFrom, v3StopStaffing.friPmFrom) &&
        Objects.equals(this.friPmTo, v3StopStaffing.friPmTo) &&
        Objects.equals(this.monAmFrom, v3StopStaffing.monAmFrom) &&
        Objects.equals(this.monAmTo, v3StopStaffing.monAmTo) &&
        Objects.equals(this.monPmFrom, v3StopStaffing.monPmFrom) &&
        Objects.equals(this.monPmTo, v3StopStaffing.monPmTo) &&
        Objects.equals(this.phAdditionalText, v3StopStaffing.phAdditionalText) &&
        Objects.equals(this.phFrom, v3StopStaffing.phFrom) &&
        Objects.equals(this.phTo, v3StopStaffing.phTo) &&
        Objects.equals(this.satAmFrom, v3StopStaffing.satAmFrom) &&
        Objects.equals(this.satAmTo, v3StopStaffing.satAmTo) &&
        Objects.equals(this.satPmFrom, v3StopStaffing.satPmFrom) &&
        Objects.equals(this.satPmTo, v3StopStaffing.satPmTo) &&
        Objects.equals(this.sunAmFrom, v3StopStaffing.sunAmFrom) &&
        Objects.equals(this.sunAmTo, v3StopStaffing.sunAmTo) &&
        Objects.equals(this.sunPmFrom, v3StopStaffing.sunPmFrom) &&
        Objects.equals(this.sunPmTo, v3StopStaffing.sunPmTo) &&
        Objects.equals(this.thuAmFrom, v3StopStaffing.thuAmFrom) &&
        Objects.equals(this.thuAmTo, v3StopStaffing.thuAmTo) &&
        Objects.equals(this.thuPmFrom, v3StopStaffing.thuPmFrom) &&
        Objects.equals(this.thuPmTo, v3StopStaffing.thuPmTo) &&
        Objects.equals(this.tueAmFrom, v3StopStaffing.tueAmFrom) &&
        Objects.equals(this.tueAmTo, v3StopStaffing.tueAmTo) &&
        Objects.equals(this.tuePmFrom, v3StopStaffing.tuePmFrom) &&
        Objects.equals(this.tuePmTo, v3StopStaffing.tuePmTo) &&
        Objects.equals(this.wedAmFrom, v3StopStaffing.wedAmFrom) &&
        Objects.equals(this.wedAmTo, v3StopStaffing.wedAmTo) &&
        Objects.equals(this.wedPmFrom, v3StopStaffing.wedPmFrom) &&
        Objects.equals(this.wedPmTo, v3StopStaffing.wedPmTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(friAmFrom, friAmTo, friPmFrom, friPmTo, monAmFrom, monAmTo, monPmFrom, monPmTo, phAdditionalText, phFrom, phTo, satAmFrom, satAmTo, satPmFrom, satPmTo, sunAmFrom, sunAmTo, sunPmFrom, sunPmTo, thuAmFrom, thuAmTo, thuPmFrom, thuPmTo, tueAmFrom, tueAmTo, tuePmFrom, tuePmTo, wedAmFrom, wedAmTo, wedPmFrom, wedPmTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopStaffing {\n");
    
    sb.append("    friAmFrom: ").append(toIndentedString(friAmFrom)).append("\n");
    sb.append("    friAmTo: ").append(toIndentedString(friAmTo)).append("\n");
    sb.append("    friPmFrom: ").append(toIndentedString(friPmFrom)).append("\n");
    sb.append("    friPmTo: ").append(toIndentedString(friPmTo)).append("\n");
    sb.append("    monAmFrom: ").append(toIndentedString(monAmFrom)).append("\n");
    sb.append("    monAmTo: ").append(toIndentedString(monAmTo)).append("\n");
    sb.append("    monPmFrom: ").append(toIndentedString(monPmFrom)).append("\n");
    sb.append("    monPmTo: ").append(toIndentedString(monPmTo)).append("\n");
    sb.append("    phAdditionalText: ").append(toIndentedString(phAdditionalText)).append("\n");
    sb.append("    phFrom: ").append(toIndentedString(phFrom)).append("\n");
    sb.append("    phTo: ").append(toIndentedString(phTo)).append("\n");
    sb.append("    satAmFrom: ").append(toIndentedString(satAmFrom)).append("\n");
    sb.append("    satAmTo: ").append(toIndentedString(satAmTo)).append("\n");
    sb.append("    satPmFrom: ").append(toIndentedString(satPmFrom)).append("\n");
    sb.append("    satPmTo: ").append(toIndentedString(satPmTo)).append("\n");
    sb.append("    sunAmFrom: ").append(toIndentedString(sunAmFrom)).append("\n");
    sb.append("    sunAmTo: ").append(toIndentedString(sunAmTo)).append("\n");
    sb.append("    sunPmFrom: ").append(toIndentedString(sunPmFrom)).append("\n");
    sb.append("    sunPmTo: ").append(toIndentedString(sunPmTo)).append("\n");
    sb.append("    thuAmFrom: ").append(toIndentedString(thuAmFrom)).append("\n");
    sb.append("    thuAmTo: ").append(toIndentedString(thuAmTo)).append("\n");
    sb.append("    thuPmFrom: ").append(toIndentedString(thuPmFrom)).append("\n");
    sb.append("    thuPmTo: ").append(toIndentedString(thuPmTo)).append("\n");
    sb.append("    tueAmFrom: ").append(toIndentedString(tueAmFrom)).append("\n");
    sb.append("    tueAmTo: ").append(toIndentedString(tueAmTo)).append("\n");
    sb.append("    tuePmFrom: ").append(toIndentedString(tuePmFrom)).append("\n");
    sb.append("    tuePmTo: ").append(toIndentedString(tuePmTo)).append("\n");
    sb.append("    wedAmFrom: ").append(toIndentedString(wedAmFrom)).append("\n");
    sb.append("    wedAmTo: ").append(toIndentedString(wedAmTo)).append("\n");
    sb.append("    wedPmFrom: ").append(toIndentedString(wedPmFrom)).append("\n");
    sb.append("    wedPmTo: ").append(toIndentedString(wedPmTo)).append("\n");
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
