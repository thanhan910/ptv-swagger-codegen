package io.swagger.model;

import io.swagger.model.V3Disruption;
import io.swagger.model.V3Status;
import io.swagger.model.V3StopOnRoute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3StopsOnRouteResponse   {

  private @Valid List<V3StopOnRoute> stops = new ArrayList<V3StopOnRoute>();

  private @Valid Map<String, V3Disruption> disruptions = new HashMap<String, V3Disruption>();

  private @Valid List<Object> geopath = new ArrayList<Object>();

  private @Valid V3Status status = null;

  /**
   * Train stations, tram stops, bus stops, regional coach stops or Night Bus stops
   **/
  public V3StopsOnRouteResponse stops(List<V3StopOnRoute> stops) {
    this.stops = stops;
    return this;
  }

  
  @ApiModelProperty(value = "Train stations, tram stops, bus stops, regional coach stops or Night Bus stops")
  @JsonProperty("stops")

  public List<V3StopOnRoute> getStops() {
    return stops;
  }
  public void setStops(List<V3StopOnRoute> stops) {
    this.stops = stops;
  }

  /**
   * Disruption information applicable to relevant routes or stops
   **/
  public V3StopsOnRouteResponse disruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  
  @ApiModelProperty(value = "Disruption information applicable to relevant routes or stops")
  @JsonProperty("disruptions")

  public Map<String, V3Disruption> getDisruptions() {
    return disruptions;
  }
  public void setDisruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
  }

  /**
   * GeoPath for the route
   **/
  public V3StopsOnRouteResponse geopath(List<Object> geopath) {
    this.geopath = geopath;
    return this;
  }

  
  @ApiModelProperty(value = "GeoPath for the route")
  @JsonProperty("geopath")

  public List<Object> getGeopath() {
    return geopath;
  }
  public void setGeopath(List<Object> geopath) {
    this.geopath = geopath;
  }

  /**
   **/
  public V3StopsOnRouteResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")

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
    V3StopsOnRouteResponse v3StopsOnRouteResponse = (V3StopsOnRouteResponse) o;
    return Objects.equals(stops, v3StopsOnRouteResponse.stops) &&
        Objects.equals(disruptions, v3StopsOnRouteResponse.disruptions) &&
        Objects.equals(geopath, v3StopsOnRouteResponse.geopath) &&
        Objects.equals(status, v3StopsOnRouteResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stops, disruptions, geopath, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3StopsOnRouteResponse {\n");
    
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    geopath: ").append(toIndentedString(geopath)).append("\n");
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