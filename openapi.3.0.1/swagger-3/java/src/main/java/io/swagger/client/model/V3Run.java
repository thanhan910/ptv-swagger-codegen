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
import io.swagger.client.model.V3VehicleDescriptor;
import io.swagger.client.model.V3VehiclePosition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * V3Run
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-22T21:59:36.979641400+10:00[Australia/Sydney]")

public class V3Run {
  @SerializedName("run_id")
  private Integer runId = null;

  @SerializedName("run_ref")
  private String runRef = null;

  @SerializedName("route_id")
  private Integer routeId = null;

  @SerializedName("route_type")
  private Integer routeType = null;

  @SerializedName("final_stop_id")
  private Integer finalStopId = null;

  @SerializedName("destination_name")
  private String destinationName = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("direction_id")
  private Integer directionId = null;

  @SerializedName("run_sequence")
  private Integer runSequence = null;

  @SerializedName("express_stop_count")
  private Integer expressStopCount = null;

  @SerializedName("vehicle_position")
  private V3VehiclePosition vehiclePosition = null;

  @SerializedName("vehicle_descriptor")
  private V3VehicleDescriptor vehicleDescriptor = null;

  @SerializedName("geopath")
  private List<Object> geopath = null;

   /**
   * Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
   * @return runId
  **/
  @Schema(description = "Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric")
  public Integer getRunId() {
    return runId;
  }

  public V3Run runRef(String runRef) {
    this.runRef = runRef;
    return this;
  }

   /**
   * Alphanumeric trip/service run identifier
   * @return runRef
  **/
  @Schema(description = "Alphanumeric trip/service run identifier")
  public String getRunRef() {
    return runRef;
  }

  public void setRunRef(String runRef) {
    this.runRef = runRef;
  }

  public V3Run routeId(Integer routeId) {
    this.routeId = routeId;
    return this;
  }

   /**
   * Route identifier
   * @return routeId
  **/
  @Schema(description = "Route identifier")
  public Integer getRouteId() {
    return routeId;
  }

  public void setRouteId(Integer routeId) {
    this.routeId = routeId;
  }

  public V3Run routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

   /**
   * Transport mode identifier
   * @return routeType
  **/
  @Schema(description = "Transport mode identifier")
  public Integer getRouteType() {
    return routeType;
  }

  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }

  public V3Run finalStopId(Integer finalStopId) {
    this.finalStopId = finalStopId;
    return this;
  }

   /**
   * stop_id of final stop of run
   * @return finalStopId
  **/
  @Schema(description = "stop_id of final stop of run")
  public Integer getFinalStopId() {
    return finalStopId;
  }

  public void setFinalStopId(Integer finalStopId) {
    this.finalStopId = finalStopId;
  }

  public V3Run destinationName(String destinationName) {
    this.destinationName = destinationName;
    return this;
  }

   /**
   * Name of destination of run
   * @return destinationName
  **/
  @Schema(description = "Name of destination of run")
  public String getDestinationName() {
    return destinationName;
  }

  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

  public V3Run status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of metropolitan train run; returns \&quot;scheduled\&quot; for other modes
   * @return status
  **/
  @Schema(description = "Status of metropolitan train run; returns \"scheduled\" for other modes")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V3Run directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

   /**
   * Direction of travel identifier
   * @return directionId
  **/
  @Schema(description = "Direction of travel identifier")
  public Integer getDirectionId() {
    return directionId;
  }

  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  public V3Run runSequence(Integer runSequence) {
    this.runSequence = runSequence;
    return this;
  }

   /**
   * Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.
   * @return runSequence
  **/
  @Schema(description = "Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.")
  public Integer getRunSequence() {
    return runSequence;
  }

  public void setRunSequence(Integer runSequence) {
    this.runSequence = runSequence;
  }

  public V3Run expressStopCount(Integer expressStopCount) {
    this.expressStopCount = expressStopCount;
    return this;
  }

   /**
   * The number of remaining skipped/express stations for the run/service from a stop
   * @return expressStopCount
  **/
  @Schema(description = "The number of remaining skipped/express stations for the run/service from a stop")
  public Integer getExpressStopCount() {
    return expressStopCount;
  }

  public void setExpressStopCount(Integer expressStopCount) {
    this.expressStopCount = expressStopCount;
  }

  public V3Run vehiclePosition(V3VehiclePosition vehiclePosition) {
    this.vehiclePosition = vehiclePosition;
    return this;
  }

   /**
   * Get vehiclePosition
   * @return vehiclePosition
  **/
  @Schema(description = "")
  public V3VehiclePosition getVehiclePosition() {
    return vehiclePosition;
  }

  public void setVehiclePosition(V3VehiclePosition vehiclePosition) {
    this.vehiclePosition = vehiclePosition;
  }

  public V3Run vehicleDescriptor(V3VehicleDescriptor vehicleDescriptor) {
    this.vehicleDescriptor = vehicleDescriptor;
    return this;
  }

   /**
   * Get vehicleDescriptor
   * @return vehicleDescriptor
  **/
  @Schema(description = "")
  public V3VehicleDescriptor getVehicleDescriptor() {
    return vehicleDescriptor;
  }

  public void setVehicleDescriptor(V3VehicleDescriptor vehicleDescriptor) {
    this.vehicleDescriptor = vehicleDescriptor;
  }

  public V3Run geopath(List<Object> geopath) {
    this.geopath = geopath;
    return this;
  }

  public V3Run addGeopathItem(Object geopathItem) {
    if (this.geopath == null) {
      this.geopath = new ArrayList<Object>();
    }
    this.geopath.add(geopathItem);
    return this;
  }

   /**
   * Geopath of the route
   * @return geopath
  **/
  @Schema(description = "Geopath of the route")
  public List<Object> getGeopath() {
    return geopath;
  }

  public void setGeopath(List<Object> geopath) {
    this.geopath = geopath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3Run v3Run = (V3Run) o;
    return Objects.equals(this.runId, v3Run.runId) &&
        Objects.equals(this.runRef, v3Run.runRef) &&
        Objects.equals(this.routeId, v3Run.routeId) &&
        Objects.equals(this.routeType, v3Run.routeType) &&
        Objects.equals(this.finalStopId, v3Run.finalStopId) &&
        Objects.equals(this.destinationName, v3Run.destinationName) &&
        Objects.equals(this.status, v3Run.status) &&
        Objects.equals(this.directionId, v3Run.directionId) &&
        Objects.equals(this.runSequence, v3Run.runSequence) &&
        Objects.equals(this.expressStopCount, v3Run.expressStopCount) &&
        Objects.equals(this.vehiclePosition, v3Run.vehiclePosition) &&
        Objects.equals(this.vehicleDescriptor, v3Run.vehicleDescriptor) &&
        Objects.equals(this.geopath, v3Run.geopath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, runRef, routeId, routeType, finalStopId, destinationName, status, directionId, runSequence, expressStopCount, vehiclePosition, vehicleDescriptor, geopath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3Run {\n");
    
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    runRef: ").append(toIndentedString(runRef)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
    sb.append("    finalStopId: ").append(toIndentedString(finalStopId)).append("\n");
    sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    directionId: ").append(toIndentedString(directionId)).append("\n");
    sb.append("    runSequence: ").append(toIndentedString(runSequence)).append("\n");
    sb.append("    expressStopCount: ").append(toIndentedString(expressStopCount)).append("\n");
    sb.append("    vehiclePosition: ").append(toIndentedString(vehiclePosition)).append("\n");
    sb.append("    vehicleDescriptor: ").append(toIndentedString(vehicleDescriptor)).append("\n");
    sb.append("    geopath: ").append(toIndentedString(geopath)).append("\n");
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
