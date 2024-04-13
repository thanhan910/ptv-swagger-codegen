package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3StopAccessibility;
import io.swagger.model.V3StopAmenityDetails;
import io.swagger.model.V3StopLocation;
import io.swagger.model.V3StopStaffing;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3StopDetails   {
  private List<Long> disruptionIds = new ArrayList<Long>();  private String stationType = null;  private String stationDescription = null;  private Integer routeType = null;  private V3StopLocation stopLocation = null;  private V3StopAmenityDetails stopAmenities = null;  private V3StopAccessibility stopAccessibility = null;  private V3StopStaffing stopStaffing = null;  private List<Object> routes = new ArrayList<Object>();  private Integer stopId = null;  private String stopName = null;  private String stopLandmark = null;

  /**
   * Disruption information identifier(s)
   **/
  
  @Schema(description = "Disruption information identifier(s)")
  @JsonProperty("disruption_ids")
  public List<Long> getDisruptionIds() {
    return disruptionIds;
  }
  public void setDisruptionIds(List<Long> disruptionIds) {
    this.disruptionIds = disruptionIds;
  }

  /**
   * Type of metropolitan train station (i.e. \&quot;Premium\&quot;, \&quot;Host\&quot; or \&quot;Unstaffed\&quot; station); returns null for V/Line train
   **/
  
  @Schema(description = "Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train")
  @JsonProperty("station_type")
  public String getStationType() {
    return stationType;
  }
  public void setStationType(String stationType) {
    this.stationType = stationType;
  }

  /**
   * The definition applicable to the station_type; returns null for V/Line train
   **/
  
  @Schema(description = "The definition applicable to the station_type; returns null for V/Line train")
  @JsonProperty("station_description")
  public String getStationDescription() {
    return stationDescription;
  }
  public void setStationDescription(String stationDescription) {
    this.stationDescription = stationDescription;
  }

  /**
   * Transport mode identifier
   **/
  
  @Schema(description = "Transport mode identifier")
  @JsonProperty("route_type")
  public Integer getRouteType() {
    return routeType;
  }
  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("stop_location")
  public V3StopLocation getStopLocation() {
    return stopLocation;
  }
  public void setStopLocation(V3StopLocation stopLocation) {
    this.stopLocation = stopLocation;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("stop_amenities")
  public V3StopAmenityDetails getStopAmenities() {
    return stopAmenities;
  }
  public void setStopAmenities(V3StopAmenityDetails stopAmenities) {
    this.stopAmenities = stopAmenities;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("stop_accessibility")
  public V3StopAccessibility getStopAccessibility() {
    return stopAccessibility;
  }
  public void setStopAccessibility(V3StopAccessibility stopAccessibility) {
    this.stopAccessibility = stopAccessibility;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("stop_staffing")
  public V3StopStaffing getStopStaffing() {
    return stopStaffing;
  }
  public void setStopStaffing(V3StopStaffing stopStaffing) {
    this.stopStaffing = stopStaffing;
  }

  /**
   * Routes travelling through the stop
   **/
  
  @Schema(description = "Routes travelling through the stop")
  @JsonProperty("routes")
  public List<Object> getRoutes() {
    return routes;
  }
  public void setRoutes(List<Object> routes) {
    this.routes = routes;
  }

  /**
   * Stop identifier
   **/
  
  @Schema(description = "Stop identifier")
  @JsonProperty("stop_id")
  public Integer getStopId() {
    return stopId;
  }
  public void setStopId(Integer stopId) {
    this.stopId = stopId;
  }

  /**
   * Name of stop
   **/
  
  @Schema(description = "Name of stop")
  @JsonProperty("stop_name")
  public String getStopName() {
    return stopName;
  }
  public void setStopName(String stopName) {
    this.stopName = stopName;
  }

  /**
   * Landmark in proximity of stop
   **/
  
  @Schema(description = "Landmark in proximity of stop")
  @JsonProperty("stop_landmark")
  public String getStopLandmark() {
    return stopLandmark;
  }
  public void setStopLandmark(String stopLandmark) {
    this.stopLandmark = stopLandmark;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3StopDetails v3StopDetails = (V3StopDetails) o;
    return Objects.equals(disruptionIds, v3StopDetails.disruptionIds) &&
        Objects.equals(stationType, v3StopDetails.stationType) &&
        Objects.equals(stationDescription, v3StopDetails.stationDescription) &&
        Objects.equals(routeType, v3StopDetails.routeType) &&
        Objects.equals(stopLocation, v3StopDetails.stopLocation) &&
        Objects.equals(stopAmenities, v3StopDetails.stopAmenities) &&
        Objects.equals(stopAccessibility, v3StopDetails.stopAccessibility) &&
        Objects.equals(stopStaffing, v3StopDetails.stopStaffing) &&
        Objects.equals(routes, v3StopDetails.routes) &&
        Objects.equals(stopId, v3StopDetails.stopId) &&
        Objects.equals(stopName, v3StopDetails.stopName) &&
        Objects.equals(stopLandmark, v3StopDetails.stopLandmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptionIds, stationType, stationDescription, routeType, stopLocation, stopAmenities, stopAccessibility, stopStaffing, routes, stopId, stopName, stopLandmark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopDetails {\n");
    
    sb.append("    disruptionIds: ").append(toIndentedString(disruptionIds)).append("\n");
    sb.append("    stationType: ").append(toIndentedString(stationType)).append("\n");
    sb.append("    stationDescription: ").append(toIndentedString(stationDescription)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    stopLocation: ").append(toIndentedString(stopLocation)).append("\n");
    sb.append("    stopAmenities: ").append(toIndentedString(stopAmenities)).append("\n");
    sb.append("    stopAccessibility: ").append(toIndentedString(stopAccessibility)).append("\n");
    sb.append("    stopStaffing: ").append(toIndentedString(stopStaffing)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    stopName: ").append(toIndentedString(stopName)).append("\n");
    sb.append("    stopLandmark: ").append(toIndentedString(stopLandmark)).append("\n");
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