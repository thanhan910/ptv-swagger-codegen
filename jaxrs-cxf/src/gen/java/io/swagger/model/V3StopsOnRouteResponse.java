package io.swagger.model;

import io.swagger.model.V3Disruption;
import io.swagger.model.V3Status;
import io.swagger.model.V3StopOnRoute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class V3StopsOnRouteResponse   {
  
  @Schema(description = "Train stations, tram stops, bus stops, regional coach stops or Night Bus stops")
 /**
   * Train stations, tram stops, bus stops, regional coach stops or Night Bus stops  
  **/
  private List<V3StopOnRoute> stops = null;
  
  @Schema(description = "Disruption information applicable to relevant routes or stops")
 /**
   * Disruption information applicable to relevant routes or stops  
  **/
  private Map<String, V3Disruption> disruptions = null;
  
  @Schema(description = "GeoPath for the route")
 /**
   * GeoPath for the route  
  **/
  private List<Object> geopath = null;
  
  @Schema(description = "")
  private V3Status status = null;
 /**
   * Train stations, tram stops, bus stops, regional coach stops or Night Bus stops
   * @return stops
  **/
  @JsonProperty("stops")
  public List<V3StopOnRoute> getStops() {
    return stops;
  }

  public void setStops(List<V3StopOnRoute> stops) {
    this.stops = stops;
  }

  public V3StopsOnRouteResponse stops(List<V3StopOnRoute> stops) {
    this.stops = stops;
    return this;
  }

  public V3StopsOnRouteResponse addStopsItem(V3StopOnRoute stopsItem) {
    this.stops.add(stopsItem);
    return this;
  }

 /**
   * Disruption information applicable to relevant routes or stops
   * @return disruptions
  **/
  @JsonProperty("disruptions")
  public Map<String, V3Disruption> getDisruptions() {
    return disruptions;
  }

  public void setDisruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
  }

  public V3StopsOnRouteResponse disruptions(Map<String, V3Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public V3StopsOnRouteResponse putDisruptionsItem(String key, V3Disruption disruptionsItem) {
    this.disruptions.put(key, disruptionsItem);
    return this;
  }

 /**
   * GeoPath for the route
   * @return geopath
  **/
  @JsonProperty("geopath")
  public List<Object> getGeopath() {
    return geopath;
  }

  public void setGeopath(List<Object> geopath) {
    this.geopath = geopath;
  }

  public V3StopsOnRouteResponse geopath(List<Object> geopath) {
    this.geopath = geopath;
    return this;
  }

  public V3StopsOnRouteResponse addGeopathItem(Object geopathItem) {
    this.geopath.add(geopathItem);
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public V3Status getStatus() {
    return status;
  }

  public void setStatus(V3Status status) {
    this.status = status;
  }

  public V3StopsOnRouteResponse status(V3Status status) {
    this.status = status;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}