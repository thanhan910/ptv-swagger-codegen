/*
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * V3SearchParameters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T17:23:48.737568700+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3SearchParameters {
  /**
   * Gets or Sets routeTypes
   */
  @JsonAdapter(RouteTypesEnum.Adapter.class)
  public enum RouteTypesEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4);

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

    public static RouteTypesEnum fromValue(Integer value) {
      for (RouteTypesEnum b : RouteTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RouteTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RouteTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RouteTypesEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return RouteTypesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      RouteTypesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ROUTE_TYPES = "route_types";
  @SerializedName(SERIALIZED_NAME_ROUTE_TYPES)
  private List<RouteTypesEnum> routeTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Float latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Float longitude;

  public static final String SERIALIZED_NAME_MAX_DISTANCE = "max_distance";
  @SerializedName(SERIALIZED_NAME_MAX_DISTANCE)
  private Float maxDistance;

  public static final String SERIALIZED_NAME_INCLUDE_ADDRESSES = "include_addresses";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ADDRESSES)
  private Boolean includeAddresses;

  public static final String SERIALIZED_NAME_INCLUDE_OUTLETS = "include_outlets";
  @SerializedName(SERIALIZED_NAME_INCLUDE_OUTLETS)
  private Boolean includeOutlets;

  public static final String SERIALIZED_NAME_MATCH_STOP_BY_SUBURB = "match_stop_by_suburb";
  @SerializedName(SERIALIZED_NAME_MATCH_STOP_BY_SUBURB)
  private Boolean matchStopBySuburb;

  public static final String SERIALIZED_NAME_MATCH_ROUTE_BY_SUBURB = "match_route_by_suburb";
  @SerializedName(SERIALIZED_NAME_MATCH_ROUTE_BY_SUBURB)
  private Boolean matchRouteBySuburb;

  public static final String SERIALIZED_NAME_MATCH_STOP_BY_GTFS_STOP_ID = "match_stop_by_gtfs_stop_id";
  @SerializedName(SERIALIZED_NAME_MATCH_STOP_BY_GTFS_STOP_ID)
  private Boolean matchStopByGtfsStopId;

  public V3SearchParameters() {
  }

  public V3SearchParameters routeTypes(List<RouteTypesEnum> routeTypes) {
    this.routeTypes = routeTypes;
    return this;
  }

  public V3SearchParameters addRouteTypesItem(RouteTypesEnum routeTypesItem) {
    if (this.routeTypes == null) {
      this.routeTypes = new ArrayList<>();
    }
    this.routeTypes.add(routeTypesItem);
    return this;
  }

   /**
   * Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
   * @return routeTypes
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  public Boolean getIncludeAddresses() {
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
  @javax.annotation.Nullable
  public Boolean getIncludeOutlets() {
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
  @javax.annotation.Nullable
  public Boolean getMatchStopBySuburb() {
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
  @javax.annotation.Nullable
  public Boolean getMatchRouteBySuburb() {
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
  @javax.annotation.Nullable
  public Boolean getMatchStopByGtfsStopId() {
    return matchStopByGtfsStopId;
  }

  public void setMatchStopByGtfsStopId(Boolean matchStopByGtfsStopId) {
    this.matchStopByGtfsStopId = matchStopByGtfsStopId;
  }



  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("route_types");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("max_distance");
    openapiFields.add("include_addresses");
    openapiFields.add("include_outlets");
    openapiFields.add("match_stop_by_suburb");
    openapiFields.add("match_route_by_suburb");
    openapiFields.add("match_stop_by_gtfs_stop_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3SearchParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3SearchParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3SearchParameters is not found in the empty JSON string", V3SearchParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3SearchParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3SearchParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("route_types") != null && !jsonObj.get("route_types").isJsonNull() && !jsonObj.get("route_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `route_types` to be an array in the JSON string but got `%s`", jsonObj.get("route_types").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3SearchParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3SearchParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3SearchParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3SearchParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<V3SearchParameters>() {
           @Override
           public void write(JsonWriter out, V3SearchParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3SearchParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3SearchParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3SearchParameters
  * @throws IOException if the JSON string is invalid with respect to V3SearchParameters
  */
  public static V3SearchParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3SearchParameters.class);
  }

 /**
  * Convert an instance of V3SearchParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
