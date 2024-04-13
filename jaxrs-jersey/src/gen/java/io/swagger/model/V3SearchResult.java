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

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3ResultOutlet;
import io.swagger.model.V3ResultRoute;
import io.swagger.model.V3ResultStop;
import io.swagger.model.V3Status;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * V3SearchResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2024-04-14T03:35:25.635146900+10:00[Australia/Sydney]")
public class V3SearchResult   {
  @JsonProperty("stops")
  private List<V3ResultStop> stops = null;

  @JsonProperty("routes")
  private List<V3ResultRoute> routes = null;

  @JsonProperty("outlets")
  private List<V3ResultOutlet> outlets = null;

  @JsonProperty("status")
  private V3Status status = null;

  public V3SearchResult stops(List<V3ResultStop> stops) {
    this.stops = stops;
    return this;
  }

  public V3SearchResult addStopsItem(V3ResultStop stopsItem) {
    if (this.stops == null) {
      this.stops = new ArrayList<V3ResultStop>();
    }
    this.stops.add(stopsItem);
    return this;
  }

  /**
   * Train stations, tram stops, bus stops, regional coach stops or Night Bus stops
   * @return stops
   **/
  @JsonProperty("stops")
  @Schema(description = "Train stations, tram stops, bus stops, regional coach stops or Night Bus stops")
  @Valid
  public List<V3ResultStop> getStops() {
    return stops;
  }

  public void setStops(List<V3ResultStop> stops) {
    this.stops = stops;
  }

  public V3SearchResult routes(List<V3ResultRoute> routes) {
    this.routes = routes;
    return this;
  }

  public V3SearchResult addRoutesItem(V3ResultRoute routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<V3ResultRoute>();
    }
    this.routes.add(routesItem);
    return this;
  }

  /**
   * Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
   * @return routes
   **/
  @JsonProperty("routes")
  @Schema(description = "Train lines, tram routes, bus routes, regional coach routes, Night Bus routes")
  @Valid
  public List<V3ResultRoute> getRoutes() {
    return routes;
  }

  public void setRoutes(List<V3ResultRoute> routes) {
    this.routes = routes;
  }

  public V3SearchResult outlets(List<V3ResultOutlet> outlets) {
    this.outlets = outlets;
    return this;
  }

  public V3SearchResult addOutletsItem(V3ResultOutlet outletsItem) {
    if (this.outlets == null) {
      this.outlets = new ArrayList<V3ResultOutlet>();
    }
    this.outlets.add(outletsItem);
    return this;
  }

  /**
   * myki ticket outlets
   * @return outlets
   **/
  @JsonProperty("outlets")
  @Schema(description = "myki ticket outlets")
  @Valid
  public List<V3ResultOutlet> getOutlets() {
    return outlets;
  }

  public void setOutlets(List<V3ResultOutlet> outlets) {
    this.outlets = outlets;
  }

  public V3SearchResult status(V3Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @JsonProperty("status")
  @Schema(description = "")
  @Valid
  public V3Status getStatus() {
    return status;
  }

  public void setStatus(V3Status status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SearchResult v3SearchResult = (V3SearchResult) o;
    return Objects.equals(this.stops, v3SearchResult.stops) &&
        Objects.equals(this.routes, v3SearchResult.routes) &&
        Objects.equals(this.outlets, v3SearchResult.outlets) &&
        Objects.equals(this.status, v3SearchResult.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stops, routes, outlets, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SearchResult {\n");
    
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    outlets: ").append(toIndentedString(outlets)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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