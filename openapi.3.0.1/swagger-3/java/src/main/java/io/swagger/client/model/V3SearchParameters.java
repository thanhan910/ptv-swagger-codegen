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
 * V3SearchParameters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-22T21:59:36.979641400+10:00[Australia/Sydney]")

public class V3SearchParameters {
  /**
   * Gets or Sets routeTypes
   */
  @JsonAdapter(RouteTypesEnum.Adapter.class)
  public enum RouteTypesEnum {
    @SerializedName("0")
    _0("0"),
    @SerializedName("1")
    _1("1"),
    @SerializedName("2")
    _2("2"),
    @SerializedName("3")
    _3("3"),
    @SerializedName("4")
    _4("4");

    private Integer value;

    RouteTypesEnum(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RouteTypesEnum fromValue(Integer input) {
      for (RouteTypesEnum b : RouteTypesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RouteTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RouteTypesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RouteTypesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextInt();
        return RouteTypesEnum.fromValue((Integer)(value));
      }
    }
  }  @SerializedName("route_types")
  private List<RouteTypesEnum> routeTypes = null;

  @SerializedName("latitude")
  private Float latitude = null;

  @SerializedName("longitude")
  private Float longitude = null;

  @SerializedName("max_distance")
  private Float maxDistance = null;

  @SerializedName("include_addresses")
  private Boolean includeAddresses = null;

  @SerializedName("include_outlets")
  private Boolean includeOutlets = null;

  @SerializedName("match_stop_by_suburb")
  private Boolean matchStopBySuburb = null;

  @SerializedName("match_route_by_suburb")
  private Boolean matchRouteBySuburb = null;

  @SerializedName("match_stop_by_gtfs_stop_id")
  private Boolean matchStopByGtfsStopId = null;

  public V3SearchParameters routeTypes(List<RouteTypesEnum> routeTypes) {
    this.routeTypes = routeTypes;
    return this;
  }

  public V3SearchParameters addRouteTypesItem(RouteTypesEnum routeTypesItem) {
    if (this.routeTypes == null) {
      this.routeTypes = new ArrayList<RouteTypesEnum>();
    }
    this.routeTypes.add(routeTypesItem);
    return this;
  }

   /**
   * Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
   * @return routeTypes
  **/
  @Schema(description = "Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)")
  public List<RouteTypesEnum> getRouteTypes() {
    return routeTypes;
  }

  public void setRouteTypes(List<RouteTypesEnum> routeTypes) {
    this.routeTypes = routeTypes;
  }

  public V3SearchParameters latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Filter by geographic coordinate of latitude
   * @return latitude
  **/
  @Schema(description = "Filter by geographic coordinate of latitude")
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public V3SearchParameters longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Filter by geographic coordinate of longitude
   * @return longitude
  **/
  @Schema(description = "Filter by geographic coordinate of longitude")
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public V3SearchParameters maxDistance(Float maxDistance) {
    this.maxDistance = maxDistance;
    return this;
  }

   /**
   * Filter by maximum distance (in metres) from location specified via latitude and longitude parameters
   * @return maxDistance
  **/
  @Schema(description = "Filter by maximum distance (in metres) from location specified via latitude and longitude parameters")
  public Float getMaxDistance() {
    return maxDistance;
  }

  public void setMaxDistance(Float maxDistance) {
    this.maxDistance = maxDistance;
  }

  public V3SearchParameters includeAddresses(Boolean includeAddresses) {
    this.includeAddresses = includeAddresses;
    return this;
  }

   /**
   * Placeholder for future development; currently unavailable
   * @return includeAddresses
  **/
  @Schema(description = "Placeholder for future development; currently unavailable")
  public Boolean isIncludeAddresses() {
    return includeAddresses;
  }

  public void setIncludeAddresses(Boolean includeAddresses) {
    this.includeAddresses = includeAddresses;
  }

  public V3SearchParameters includeOutlets(Boolean includeOutlets) {
    this.includeOutlets = includeOutlets;
    return this;
  }

   /**
   * Indicates if outlets will be returned in response (default &#x3D; true)
   * @return includeOutlets
  **/
  @Schema(description = "Indicates if outlets will be returned in response (default = true)")
  public Boolean isIncludeOutlets() {
    return includeOutlets;
  }

  public void setIncludeOutlets(Boolean includeOutlets) {
    this.includeOutlets = includeOutlets;
  }

  public V3SearchParameters matchStopBySuburb(Boolean matchStopBySuburb) {
    this.matchStopBySuburb = matchStopBySuburb;
    return this;
  }

   /**
   * Indicates whether to find stops by suburbs in the search term (default &#x3D; true)
   * @return matchStopBySuburb
  **/
  @Schema(description = "Indicates whether to find stops by suburbs in the search term (default = true)")
  public Boolean isMatchStopBySuburb() {
    return matchStopBySuburb;
  }

  public void setMatchStopBySuburb(Boolean matchStopBySuburb) {
    this.matchStopBySuburb = matchStopBySuburb;
  }

  public V3SearchParameters matchRouteBySuburb(Boolean matchRouteBySuburb) {
    this.matchRouteBySuburb = matchRouteBySuburb;
    return this;
  }

   /**
   * Indicates whether to find routes by suburbs in the search term (default &#x3D; true)
   * @return matchRouteBySuburb
  **/
  @Schema(description = "Indicates whether to find routes by suburbs in the search term (default = true)")
  public Boolean isMatchRouteBySuburb() {
    return matchRouteBySuburb;
  }

  public void setMatchRouteBySuburb(Boolean matchRouteBySuburb) {
    this.matchRouteBySuburb = matchRouteBySuburb;
  }

  public V3SearchParameters matchStopByGtfsStopId(Boolean matchStopByGtfsStopId) {
    this.matchStopByGtfsStopId = matchStopByGtfsStopId;
    return this;
  }

   /**
   * Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false)
   * @return matchStopByGtfsStopId
  **/
  @Schema(description = "Indicates whether to search for stops according to a metlink stop ID (default = false)")
  public Boolean isMatchStopByGtfsStopId() {
    return matchStopByGtfsStopId;
  }

  public void setMatchStopByGtfsStopId(Boolean matchStopByGtfsStopId) {
    this.matchStopByGtfsStopId = matchStopByGtfsStopId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SearchParameters v3SearchParameters = (V3SearchParameters) o;
    return Objects.equals(this.routeTypes, v3SearchParameters.routeTypes) &&
        Objects.equals(this.latitude, v3SearchParameters.latitude) &&
        Objects.equals(this.longitude, v3SearchParameters.longitude) &&
        Objects.equals(this.maxDistance, v3SearchParameters.maxDistance) &&
        Objects.equals(this.includeAddresses, v3SearchParameters.includeAddresses) &&
        Objects.equals(this.includeOutlets, v3SearchParameters.includeOutlets) &&
        Objects.equals(this.matchStopBySuburb, v3SearchParameters.matchStopBySuburb) &&
        Objects.equals(this.matchRouteBySuburb, v3SearchParameters.matchRouteBySuburb) &&
        Objects.equals(this.matchStopByGtfsStopId, v3SearchParameters.matchStopByGtfsStopId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeTypes, latitude, longitude, maxDistance, includeAddresses, includeOutlets, matchStopBySuburb, matchRouteBySuburb, matchStopByGtfsStopId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SearchParameters {\n");
    
    sb.append("    routeTypes: ").append(toIndentedString(routeTypes)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    maxDistance: ").append(toIndentedString(maxDistance)).append("\n");
    sb.append("    includeAddresses: ").append(toIndentedString(includeAddresses)).append("\n");
    sb.append("    includeOutlets: ").append(toIndentedString(includeOutlets)).append("\n");
    sb.append("    matchStopBySuburb: ").append(toIndentedString(matchStopBySuburb)).append("\n");
    sb.append("    matchRouteBySuburb: ").append(toIndentedString(matchRouteBySuburb)).append("\n");
    sb.append("    matchStopByGtfsStopId: ").append(toIndentedString(matchStopByGtfsStopId)).append("\n");
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
