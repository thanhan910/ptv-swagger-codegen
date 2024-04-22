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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.V3DisruptionRoute;
import org.openapitools.client.model.V3DisruptionStop;

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
 * V3Disruption
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T22:00:03.206044600+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3Disruption {
  public static final String SERIALIZED_NAME_DISRUPTION_ID = "disruption_id";
  @SerializedName(SERIALIZED_NAME_DISRUPTION_ID)
  private Long disruptionId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISRUPTION_STATUS = "disruption_status";
  @SerializedName(SERIALIZED_NAME_DISRUPTION_STATUS)
  private String disruptionStatus;

  public static final String SERIALIZED_NAME_DISRUPTION_TYPE = "disruption_type";
  @SerializedName(SERIALIZED_NAME_DISRUPTION_TYPE)
  private String disruptionType;

  public static final String SERIALIZED_NAME_PUBLISHED_ON = "published_on";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_ON)
  private OffsetDateTime publishedOn;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "last_updated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private OffsetDateTime lastUpdated;

  public static final String SERIALIZED_NAME_FROM_DATE = "from_date";
  @SerializedName(SERIALIZED_NAME_FROM_DATE)
  private OffsetDateTime fromDate;

  public static final String SERIALIZED_NAME_TO_DATE = "to_date";
  @SerializedName(SERIALIZED_NAME_TO_DATE)
  private OffsetDateTime toDate;

  public static final String SERIALIZED_NAME_ROUTES = "routes";
  @SerializedName(SERIALIZED_NAME_ROUTES)
  private List<V3DisruptionRoute> routes = new ArrayList<>();

  public static final String SERIALIZED_NAME_STOPS = "stops";
  @SerializedName(SERIALIZED_NAME_STOPS)
  private List<V3DisruptionStop> stops = new ArrayList<>();

  public static final String SERIALIZED_NAME_COLOUR = "colour";
  @SerializedName(SERIALIZED_NAME_COLOUR)
  private String colour;

  public static final String SERIALIZED_NAME_DISPLAY_ON_BOARD = "display_on_board";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ON_BOARD)
  private Boolean displayOnBoard;

  public static final String SERIALIZED_NAME_DISPLAY_STATUS = "display_status";
  @SerializedName(SERIALIZED_NAME_DISPLAY_STATUS)
  private Boolean displayStatus;

  public V3Disruption() {
  }

  public V3Disruption disruptionId(Long disruptionId) {
    this.disruptionId = disruptionId;
    return this;
  }

   /**
   * Disruption information identifier
   * @return disruptionId
  **/
  @javax.annotation.Nullable
  public Long getDisruptionId() {
    return disruptionId;
  }

  public void setDisruptionId(Long disruptionId) {
    this.disruptionId = disruptionId;
  }


  public V3Disruption title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Headline title summarising disruption information
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public V3Disruption url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of relevant article on PTV website
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public V3Disruption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the disruption
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public V3Disruption disruptionStatus(String disruptionStatus) {
    this.disruptionStatus = disruptionStatus;
    return this;
  }

   /**
   * Status of the disruption (e.g. \&quot;Planned\&quot;, \&quot;Current\&quot;)
   * @return disruptionStatus
  **/
  @javax.annotation.Nullable
  public String getDisruptionStatus() {
    return disruptionStatus;
  }

  public void setDisruptionStatus(String disruptionStatus) {
    this.disruptionStatus = disruptionStatus;
  }


  public V3Disruption disruptionType(String disruptionType) {
    this.disruptionType = disruptionType;
    return this;
  }

   /**
   * Type of disruption
   * @return disruptionType
  **/
  @javax.annotation.Nullable
  public String getDisruptionType() {
    return disruptionType;
  }

  public void setDisruptionType(String disruptionType) {
    this.disruptionType = disruptionType;
  }


  public V3Disruption publishedOn(OffsetDateTime publishedOn) {
    this.publishedOn = publishedOn;
    return this;
  }

   /**
   * Date and time disruption information is published on PTV website, in ISO 8601 UTC format
   * @return publishedOn
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getPublishedOn() {
    return publishedOn;
  }

  public void setPublishedOn(OffsetDateTime publishedOn) {
    this.publishedOn = publishedOn;
  }


  public V3Disruption lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Date and time disruption information was last updated by PTV, in ISO 8601 UTC format
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public V3Disruption fromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Date and time at which disruption begins, in ISO 8601 UTC format
   * @return fromDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getFromDate() {
    return fromDate;
  }

  public void setFromDate(OffsetDateTime fromDate) {
    this.fromDate = fromDate;
  }


  public V3Disruption toDate(OffsetDateTime toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)
   * @return toDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getToDate() {
    return toDate;
  }

  public void setToDate(OffsetDateTime toDate) {
    this.toDate = toDate;
  }


  public V3Disruption routes(List<V3DisruptionRoute> routes) {
    this.routes = routes;
    return this;
  }

  public V3Disruption addRoutesItem(V3DisruptionRoute routesItem) {
    if (this.routes == null) {
      this.routes = new ArrayList<>();
    }
    this.routes.add(routesItem);
    return this;
  }

   /**
   * Route relevant to a disruption (if applicable)
   * @return routes
  **/
  @javax.annotation.Nullable
  public List<V3DisruptionRoute> getRoutes() {
    return routes;
  }

  public void setRoutes(List<V3DisruptionRoute> routes) {
    this.routes = routes;
  }


  public V3Disruption stops(List<V3DisruptionStop> stops) {
    this.stops = stops;
    return this;
  }

  public V3Disruption addStopsItem(V3DisruptionStop stopsItem) {
    if (this.stops == null) {
      this.stops = new ArrayList<>();
    }
    this.stops.add(stopsItem);
    return this;
  }

   /**
   * Stop relevant to a disruption (if applicable)
   * @return stops
  **/
  @javax.annotation.Nullable
  public List<V3DisruptionStop> getStops() {
    return stops;
  }

  public void setStops(List<V3DisruptionStop> stops) {
    this.stops = stops;
  }


  public V3Disruption colour(String colour) {
    this.colour = colour;
    return this;
  }

   /**
   * Get colour
   * @return colour
  **/
  @javax.annotation.Nullable
  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }


  public V3Disruption displayOnBoard(Boolean displayOnBoard) {
    this.displayOnBoard = displayOnBoard;
    return this;
  }

   /**
   * Get displayOnBoard
   * @return displayOnBoard
  **/
  @javax.annotation.Nullable
  public Boolean getDisplayOnBoard() {
    return displayOnBoard;
  }

  public void setDisplayOnBoard(Boolean displayOnBoard) {
    this.displayOnBoard = displayOnBoard;
  }


  public V3Disruption displayStatus(Boolean displayStatus) {
    this.displayStatus = displayStatus;
    return this;
  }

   /**
   * Get displayStatus
   * @return displayStatus
  **/
  @javax.annotation.Nullable
  public Boolean getDisplayStatus() {
    return displayStatus;
  }

  public void setDisplayStatus(Boolean displayStatus) {
    this.displayStatus = displayStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3Disruption v3Disruption = (V3Disruption) o;
    return Objects.equals(this.disruptionId, v3Disruption.disruptionId) &&
        Objects.equals(this.title, v3Disruption.title) &&
        Objects.equals(this.url, v3Disruption.url) &&
        Objects.equals(this.description, v3Disruption.description) &&
        Objects.equals(this.disruptionStatus, v3Disruption.disruptionStatus) &&
        Objects.equals(this.disruptionType, v3Disruption.disruptionType) &&
        Objects.equals(this.publishedOn, v3Disruption.publishedOn) &&
        Objects.equals(this.lastUpdated, v3Disruption.lastUpdated) &&
        Objects.equals(this.fromDate, v3Disruption.fromDate) &&
        Objects.equals(this.toDate, v3Disruption.toDate) &&
        Objects.equals(this.routes, v3Disruption.routes) &&
        Objects.equals(this.stops, v3Disruption.stops) &&
        Objects.equals(this.colour, v3Disruption.colour) &&
        Objects.equals(this.displayOnBoard, v3Disruption.displayOnBoard) &&
        Objects.equals(this.displayStatus, v3Disruption.displayStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptionId, title, url, description, disruptionStatus, disruptionType, publishedOn, lastUpdated, fromDate, toDate, routes, stops, colour, displayOnBoard, displayStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3Disruption {\n");
    sb.append("    disruptionId: ").append(toIndentedString(disruptionId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disruptionStatus: ").append(toIndentedString(disruptionStatus)).append("\n");
    sb.append("    disruptionType: ").append(toIndentedString(disruptionType)).append("\n");
    sb.append("    publishedOn: ").append(toIndentedString(publishedOn)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    colour: ").append(toIndentedString(colour)).append("\n");
    sb.append("    displayOnBoard: ").append(toIndentedString(displayOnBoard)).append("\n");
    sb.append("    displayStatus: ").append(toIndentedString(displayStatus)).append("\n");
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
    openapiFields.add("disruption_id");
    openapiFields.add("title");
    openapiFields.add("url");
    openapiFields.add("description");
    openapiFields.add("disruption_status");
    openapiFields.add("disruption_type");
    openapiFields.add("published_on");
    openapiFields.add("last_updated");
    openapiFields.add("from_date");
    openapiFields.add("to_date");
    openapiFields.add("routes");
    openapiFields.add("stops");
    openapiFields.add("colour");
    openapiFields.add("display_on_board");
    openapiFields.add("display_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3Disruption
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3Disruption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3Disruption is not found in the empty JSON string", V3Disruption.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3Disruption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3Disruption` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("disruption_status") != null && !jsonObj.get("disruption_status").isJsonNull()) && !jsonObj.get("disruption_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disruption_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disruption_status").toString()));
      }
      if ((jsonObj.get("disruption_type") != null && !jsonObj.get("disruption_type").isJsonNull()) && !jsonObj.get("disruption_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disruption_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disruption_type").toString()));
      }
      if (jsonObj.get("routes") != null && !jsonObj.get("routes").isJsonNull()) {
        JsonArray jsonArrayroutes = jsonObj.getAsJsonArray("routes");
        if (jsonArrayroutes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("routes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `routes` to be an array in the JSON string but got `%s`", jsonObj.get("routes").toString()));
          }

          // validate the optional field `routes` (array)
          for (int i = 0; i < jsonArrayroutes.size(); i++) {
            V3DisruptionRoute.validateJsonElement(jsonArrayroutes.get(i));
          };
        }
      }
      if (jsonObj.get("stops") != null && !jsonObj.get("stops").isJsonNull()) {
        JsonArray jsonArraystops = jsonObj.getAsJsonArray("stops");
        if (jsonArraystops != null) {
          // ensure the json data is an array
          if (!jsonObj.get("stops").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `stops` to be an array in the JSON string but got `%s`", jsonObj.get("stops").toString()));
          }

          // validate the optional field `stops` (array)
          for (int i = 0; i < jsonArraystops.size(); i++) {
            V3DisruptionStop.validateJsonElement(jsonArraystops.get(i));
          };
        }
      }
      if ((jsonObj.get("colour") != null && !jsonObj.get("colour").isJsonNull()) && !jsonObj.get("colour").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `colour` to be a primitive type in the JSON string but got `%s`", jsonObj.get("colour").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3Disruption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3Disruption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3Disruption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3Disruption.class));

       return (TypeAdapter<T>) new TypeAdapter<V3Disruption>() {
           @Override
           public void write(JsonWriter out, V3Disruption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3Disruption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3Disruption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3Disruption
  * @throws IOException if the JSON string is invalid with respect to V3Disruption
  */
  public static V3Disruption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3Disruption.class);
  }

 /**
  * Convert an instance of V3Disruption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

