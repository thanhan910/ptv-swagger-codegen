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
import org.openapitools.client.model.V3Disruption;

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
 * V3Disruptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T22:17:14.003555400+10:00[Australia/Sydney]", comments = "Generator version: 7.5.0")
public class V3Disruptions {
  public static final String SERIALIZED_NAME_GENERAL = "general";
  @SerializedName(SERIALIZED_NAME_GENERAL)
  private List<V3Disruption> general = new ArrayList<>();

  public static final String SERIALIZED_NAME_METRO_TRAIN = "metro_train";
  @SerializedName(SERIALIZED_NAME_METRO_TRAIN)
  private List<V3Disruption> metroTrain = new ArrayList<>();

  public static final String SERIALIZED_NAME_METRO_TRAM = "metro_tram";
  @SerializedName(SERIALIZED_NAME_METRO_TRAM)
  private List<V3Disruption> metroTram = new ArrayList<>();

  public static final String SERIALIZED_NAME_METRO_BUS = "metro_bus";
  @SerializedName(SERIALIZED_NAME_METRO_BUS)
  private List<V3Disruption> metroBus = new ArrayList<>();

  public static final String SERIALIZED_NAME_REGIONAL_TRAIN = "regional_train";
  @SerializedName(SERIALIZED_NAME_REGIONAL_TRAIN)
  private List<V3Disruption> regionalTrain = new ArrayList<>();

  public static final String SERIALIZED_NAME_REGIONAL_COACH = "regional_coach";
  @SerializedName(SERIALIZED_NAME_REGIONAL_COACH)
  private List<V3Disruption> regionalCoach = new ArrayList<>();

  public static final String SERIALIZED_NAME_REGIONAL_BUS = "regional_bus";
  @SerializedName(SERIALIZED_NAME_REGIONAL_BUS)
  private List<V3Disruption> regionalBus = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCHOOL_BUS = "school_bus";
  @SerializedName(SERIALIZED_NAME_SCHOOL_BUS)
  private List<V3Disruption> schoolBus = new ArrayList<>();

  public static final String SERIALIZED_NAME_TELEBUS = "telebus";
  @SerializedName(SERIALIZED_NAME_TELEBUS)
  private List<V3Disruption> telebus = new ArrayList<>();

  public static final String SERIALIZED_NAME_NIGHT_BUS = "night_bus";
  @SerializedName(SERIALIZED_NAME_NIGHT_BUS)
  private List<V3Disruption> nightBus = new ArrayList<>();

  public static final String SERIALIZED_NAME_FERRY = "ferry";
  @SerializedName(SERIALIZED_NAME_FERRY)
  private List<V3Disruption> ferry = new ArrayList<>();

  public static final String SERIALIZED_NAME_INTERSTATE_TRAIN = "interstate_train";
  @SerializedName(SERIALIZED_NAME_INTERSTATE_TRAIN)
  private List<V3Disruption> interstateTrain = new ArrayList<>();

  public static final String SERIALIZED_NAME_SKYBUS = "skybus";
  @SerializedName(SERIALIZED_NAME_SKYBUS)
  private List<V3Disruption> skybus = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAXI = "taxi";
  @SerializedName(SERIALIZED_NAME_TAXI)
  private List<V3Disruption> taxi = new ArrayList<>();

  public V3Disruptions() {
  }

  public V3Disruptions general(List<V3Disruption> general) {
    this.general = general;
    return this;
  }

  public V3Disruptions addGeneralItem(V3Disruption generalItem) {
    if (this.general == null) {
      this.general = new ArrayList<>();
    }
    this.general.add(generalItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to multiple route_types
   * @return general
  **/
  @javax.annotation.Nullable
  public List<V3Disruption> getGeneral() {
    return general;
  }

  public void setGeneral(List<V3Disruption> general) {
    this.general = general;
  }


  public V3Disruptions metroTrain(List<V3Disruption> metroTrain) {
    this.metroTrain = metroTrain;
    return this;
  }

  public V3Disruptions addMetroTrainItem(V3Disruption metroTrainItem) {
    if (this.metroTrain == null) {
      this.metroTrain = new ArrayList<>();
    }
    this.metroTrain.add(metroTrainItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to metropolitan train
   * @return metroTrain
  **/
  @javax.annotation.Nullable
  public List<V3Disruption> getMetroTrain() {
    return metroTrain;
  }

  public void setMetroTrain(List<V3Disruption> metroTrain) {
    this.metroTrain = metroTrain;
  }


  public V3Disruptions metroTram(List<V3Disruption> metroTram) {
    this.metroTram = metroTram;
    return this;
  }

  public V3Disruptions addMetroTramItem(V3Disruption metroTramItem) {
    if (this.metroTram == null) {
      this.metroTram = new ArrayList<>();
    }
    this.metroTram.add(metroTramItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to metropolitan tram
   * @return metroTram
  **/
  @javax.annotation.Nullable
  public List<V3Disruption> getMetroTram() {
    return metroTram;
  }

  public void setMetroTram(List<V3Disruption> metroTram) {
    this.metroTram = metroTram;
  }


  public V3Disruptions metroBus(List<V3Disruption> metroBus) {
    this.metroBus = metroBus;
    return this;
  }

  public V3Disruptions addMetroBusItem(V3Disruption metroBusItem) {
    if (this.metroBus == null) {
      this.metroBus = new ArrayList<>();
    }
    this.metroBus.add(metroBusItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to metropolitan bus
   * @return metroBus
  **/
  @javax.annotation.Nullable
  public List<V3Disruption> getMetroBus() {
    return metroBus;
  }

  public void setMetroBus(List<V3Disruption> metroBus) {
    this.metroBus = metroBus;
  }


  public V3Disruptions regionalTrain(List<V3Disruption> regionalTrain) {
    this.regionalTrain = regionalTrain;
    return this;
  }

  public V3Disruptions addRegionalTrainItem(V3Disruption regionalTrainItem) {
    if (this.regionalTrain == null) {
      this.regionalTrain = new ArrayList<>();
    }
    this.regionalTrain.add(regionalTrainItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to V/Line train
   * @return regionalTrain
  **/
  @javax.annotation.Nullable
  public List<V3Disruption> getRegionalTrain() {
    return regionalTrain;
  }

  public void setRegionalTrain(List<V3Disruption> regionalTrain) {
    this.regionalTrain = regionalTrain;
  }


  public V3Disruptions regionalCoach(List<V3Disruption> regionalCoach) {
    this.regionalCoach = regionalCoach;
    return this;
  }

  public V3Disruptions addRegionalCoachItem(V3Disruption regionalCoachItem) {
    if (this.regionalCoach == null) {
      this.regionalCoach = new ArrayList<>();
    }
    this.regionalCoach.add(regionalCoachItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to V/Line coach
   * @return regionalCoach
  **/
  @javax.annotation.Nullable
  public List<V3Disruption> getRegionalCoach() {
    return regionalCoach;
  }

  public void setRegionalCoach(List<V3Disruption> regionalCoach) {
    this.regionalCoach = regionalCoach;
  }


  public V3Disruptions regionalBus(List<V3Disruption> regionalBus) {
    this.regionalBus = regionalBus;
    return this;
  }

  public V3Disruptions addRegionalBusItem(V3Disruption regionalBusItem) {
    if (this.regionalBus == null) {
      this.regionalBus = new ArrayList<>();
    }
    this.regionalBus.add(regionalBusItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to regional bus
   * @return regionalBus
  **/
  @javax.annotation.Nullable
  public List<V3Disruption> getRegionalBus() {
    return regionalBus;
  }

  public void setRegionalBus(List<V3Disruption> regionalBus) {
    this.regionalBus = regionalBus;
  }


  public V3Disruptions schoolBus(List<V3Disruption> schoolBus) {
    this.schoolBus = schoolBus;
    return this;
  }

  public V3Disruptions addSchoolBusItem(V3Disruption schoolBusItem) {
    if (this.schoolBus == null) {
      this.schoolBus = new ArrayList<>();
    }
    this.schoolBus.add(schoolBusItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to school bus
   * @return schoolBus
  **/
  @javax.annotation.Nullable
  public List<V3Disruption> getSchoolBus() {
    return schoolBus;
  }

  public void setSchoolBus(List<V3Disruption> schoolBus) {
    this.schoolBus = schoolBus;
  }


  public V3Disruptions telebus(List<V3Disruption> telebus) {
    this.telebus = telebus;
    return this;
  }

  public V3Disruptions addTelebusItem(V3Disruption telebusItem) {
    if (this.telebus == null) {
      this.telebus = new ArrayList<>();
    }
    this.telebus.add(telebusItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to telebus services
   * @return telebus
  **/
  @javax.annotation.Nullable
  public List<V3Disruption> getTelebus() {
    return telebus;
  }

  public void setTelebus(List<V3Disruption> telebus) {
    this.telebus = telebus;
  }


  public V3Disruptions nightBus(List<V3Disruption> nightBus) {
    this.nightBus = nightBus;
    return this;
  }

  public V3Disruptions addNightBusItem(V3Disruption nightBusItem) {
    if (this.nightBus == null) {
      this.nightBus = new ArrayList<>();
    }
    this.nightBus.add(nightBusItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to night bus
   * @return nightBus
  **/
  @javax.annotation.Nullable
  public List<V3Disruption> getNightBus() {
    return nightBus;
  }

  public void setNightBus(List<V3Disruption> nightBus) {
    this.nightBus = nightBus;
  }


  public V3Disruptions ferry(List<V3Disruption> ferry) {
    this.ferry = ferry;
    return this;
  }

  public V3Disruptions addFerryItem(V3Disruption ferryItem) {
    if (this.ferry == null) {
      this.ferry = new ArrayList<>();
    }
    this.ferry.add(ferryItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to ferry
   * @return ferry
  **/
  @javax.annotation.Nullable
  public List<V3Disruption> getFerry() {
    return ferry;
  }

  public void setFerry(List<V3Disruption> ferry) {
    this.ferry = ferry;
  }


  public V3Disruptions interstateTrain(List<V3Disruption> interstateTrain) {
    this.interstateTrain = interstateTrain;
    return this;
  }

  public V3Disruptions addInterstateTrainItem(V3Disruption interstateTrainItem) {
    if (this.interstateTrain == null) {
      this.interstateTrain = new ArrayList<>();
    }
    this.interstateTrain.add(interstateTrainItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to interstate train
   * @return interstateTrain
  **/
  @javax.annotation.Nullable
  public List<V3Disruption> getInterstateTrain() {
    return interstateTrain;
  }

  public void setInterstateTrain(List<V3Disruption> interstateTrain) {
    this.interstateTrain = interstateTrain;
  }


  public V3Disruptions skybus(List<V3Disruption> skybus) {
    this.skybus = skybus;
    return this;
  }

  public V3Disruptions addSkybusItem(V3Disruption skybusItem) {
    if (this.skybus == null) {
      this.skybus = new ArrayList<>();
    }
    this.skybus.add(skybusItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to skybus
   * @return skybus
  **/
  @javax.annotation.Nullable
  public List<V3Disruption> getSkybus() {
    return skybus;
  }

  public void setSkybus(List<V3Disruption> skybus) {
    this.skybus = skybus;
  }


  public V3Disruptions taxi(List<V3Disruption> taxi) {
    this.taxi = taxi;
    return this;
  }

  public V3Disruptions addTaxiItem(V3Disruption taxiItem) {
    if (this.taxi == null) {
      this.taxi = new ArrayList<>();
    }
    this.taxi.add(taxiItem);
    return this;
  }

   /**
   * Subset of disruption information applicable to taxi
   * @return taxi
  **/
  @javax.annotation.Nullable
  public List<V3Disruption> getTaxi() {
    return taxi;
  }

  public void setTaxi(List<V3Disruption> taxi) {
    this.taxi = taxi;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3Disruptions v3Disruptions = (V3Disruptions) o;
    return Objects.equals(this.general, v3Disruptions.general) &&
        Objects.equals(this.metroTrain, v3Disruptions.metroTrain) &&
        Objects.equals(this.metroTram, v3Disruptions.metroTram) &&
        Objects.equals(this.metroBus, v3Disruptions.metroBus) &&
        Objects.equals(this.regionalTrain, v3Disruptions.regionalTrain) &&
        Objects.equals(this.regionalCoach, v3Disruptions.regionalCoach) &&
        Objects.equals(this.regionalBus, v3Disruptions.regionalBus) &&
        Objects.equals(this.schoolBus, v3Disruptions.schoolBus) &&
        Objects.equals(this.telebus, v3Disruptions.telebus) &&
        Objects.equals(this.nightBus, v3Disruptions.nightBus) &&
        Objects.equals(this.ferry, v3Disruptions.ferry) &&
        Objects.equals(this.interstateTrain, v3Disruptions.interstateTrain) &&
        Objects.equals(this.skybus, v3Disruptions.skybus) &&
        Objects.equals(this.taxi, v3Disruptions.taxi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(general, metroTrain, metroTram, metroBus, regionalTrain, regionalCoach, regionalBus, schoolBus, telebus, nightBus, ferry, interstateTrain, skybus, taxi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3Disruptions {\n");
    sb.append("    general: ").append(toIndentedString(general)).append("\n");
    sb.append("    metroTrain: ").append(toIndentedString(metroTrain)).append("\n");
    sb.append("    metroTram: ").append(toIndentedString(metroTram)).append("\n");
    sb.append("    metroBus: ").append(toIndentedString(metroBus)).append("\n");
    sb.append("    regionalTrain: ").append(toIndentedString(regionalTrain)).append("\n");
    sb.append("    regionalCoach: ").append(toIndentedString(regionalCoach)).append("\n");
    sb.append("    regionalBus: ").append(toIndentedString(regionalBus)).append("\n");
    sb.append("    schoolBus: ").append(toIndentedString(schoolBus)).append("\n");
    sb.append("    telebus: ").append(toIndentedString(telebus)).append("\n");
    sb.append("    nightBus: ").append(toIndentedString(nightBus)).append("\n");
    sb.append("    ferry: ").append(toIndentedString(ferry)).append("\n");
    sb.append("    interstateTrain: ").append(toIndentedString(interstateTrain)).append("\n");
    sb.append("    skybus: ").append(toIndentedString(skybus)).append("\n");
    sb.append("    taxi: ").append(toIndentedString(taxi)).append("\n");
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
    openapiFields.add("general");
    openapiFields.add("metro_train");
    openapiFields.add("metro_tram");
    openapiFields.add("metro_bus");
    openapiFields.add("regional_train");
    openapiFields.add("regional_coach");
    openapiFields.add("regional_bus");
    openapiFields.add("school_bus");
    openapiFields.add("telebus");
    openapiFields.add("night_bus");
    openapiFields.add("ferry");
    openapiFields.add("interstate_train");
    openapiFields.add("skybus");
    openapiFields.add("taxi");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V3Disruptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V3Disruptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V3Disruptions is not found in the empty JSON string", V3Disruptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V3Disruptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V3Disruptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("general") != null && !jsonObj.get("general").isJsonNull()) {
        JsonArray jsonArraygeneral = jsonObj.getAsJsonArray("general");
        if (jsonArraygeneral != null) {
          // ensure the json data is an array
          if (!jsonObj.get("general").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `general` to be an array in the JSON string but got `%s`", jsonObj.get("general").toString()));
          }

          // validate the optional field `general` (array)
          for (int i = 0; i < jsonArraygeneral.size(); i++) {
            V3Disruption.validateJsonElement(jsonArraygeneral.get(i));
          };
        }
      }
      if (jsonObj.get("metro_train") != null && !jsonObj.get("metro_train").isJsonNull()) {
        JsonArray jsonArraymetroTrain = jsonObj.getAsJsonArray("metro_train");
        if (jsonArraymetroTrain != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metro_train").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metro_train` to be an array in the JSON string but got `%s`", jsonObj.get("metro_train").toString()));
          }

          // validate the optional field `metro_train` (array)
          for (int i = 0; i < jsonArraymetroTrain.size(); i++) {
            V3Disruption.validateJsonElement(jsonArraymetroTrain.get(i));
          };
        }
      }
      if (jsonObj.get("metro_tram") != null && !jsonObj.get("metro_tram").isJsonNull()) {
        JsonArray jsonArraymetroTram = jsonObj.getAsJsonArray("metro_tram");
        if (jsonArraymetroTram != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metro_tram").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metro_tram` to be an array in the JSON string but got `%s`", jsonObj.get("metro_tram").toString()));
          }

          // validate the optional field `metro_tram` (array)
          for (int i = 0; i < jsonArraymetroTram.size(); i++) {
            V3Disruption.validateJsonElement(jsonArraymetroTram.get(i));
          };
        }
      }
      if (jsonObj.get("metro_bus") != null && !jsonObj.get("metro_bus").isJsonNull()) {
        JsonArray jsonArraymetroBus = jsonObj.getAsJsonArray("metro_bus");
        if (jsonArraymetroBus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metro_bus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metro_bus` to be an array in the JSON string but got `%s`", jsonObj.get("metro_bus").toString()));
          }

          // validate the optional field `metro_bus` (array)
          for (int i = 0; i < jsonArraymetroBus.size(); i++) {
            V3Disruption.validateJsonElement(jsonArraymetroBus.get(i));
          };
        }
      }
      if (jsonObj.get("regional_train") != null && !jsonObj.get("regional_train").isJsonNull()) {
        JsonArray jsonArrayregionalTrain = jsonObj.getAsJsonArray("regional_train");
        if (jsonArrayregionalTrain != null) {
          // ensure the json data is an array
          if (!jsonObj.get("regional_train").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `regional_train` to be an array in the JSON string but got `%s`", jsonObj.get("regional_train").toString()));
          }

          // validate the optional field `regional_train` (array)
          for (int i = 0; i < jsonArrayregionalTrain.size(); i++) {
            V3Disruption.validateJsonElement(jsonArrayregionalTrain.get(i));
          };
        }
      }
      if (jsonObj.get("regional_coach") != null && !jsonObj.get("regional_coach").isJsonNull()) {
        JsonArray jsonArrayregionalCoach = jsonObj.getAsJsonArray("regional_coach");
        if (jsonArrayregionalCoach != null) {
          // ensure the json data is an array
          if (!jsonObj.get("regional_coach").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `regional_coach` to be an array in the JSON string but got `%s`", jsonObj.get("regional_coach").toString()));
          }

          // validate the optional field `regional_coach` (array)
          for (int i = 0; i < jsonArrayregionalCoach.size(); i++) {
            V3Disruption.validateJsonElement(jsonArrayregionalCoach.get(i));
          };
        }
      }
      if (jsonObj.get("regional_bus") != null && !jsonObj.get("regional_bus").isJsonNull()) {
        JsonArray jsonArrayregionalBus = jsonObj.getAsJsonArray("regional_bus");
        if (jsonArrayregionalBus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("regional_bus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `regional_bus` to be an array in the JSON string but got `%s`", jsonObj.get("regional_bus").toString()));
          }

          // validate the optional field `regional_bus` (array)
          for (int i = 0; i < jsonArrayregionalBus.size(); i++) {
            V3Disruption.validateJsonElement(jsonArrayregionalBus.get(i));
          };
        }
      }
      if (jsonObj.get("school_bus") != null && !jsonObj.get("school_bus").isJsonNull()) {
        JsonArray jsonArrayschoolBus = jsonObj.getAsJsonArray("school_bus");
        if (jsonArrayschoolBus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("school_bus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `school_bus` to be an array in the JSON string but got `%s`", jsonObj.get("school_bus").toString()));
          }

          // validate the optional field `school_bus` (array)
          for (int i = 0; i < jsonArrayschoolBus.size(); i++) {
            V3Disruption.validateJsonElement(jsonArrayschoolBus.get(i));
          };
        }
      }
      if (jsonObj.get("telebus") != null && !jsonObj.get("telebus").isJsonNull()) {
        JsonArray jsonArraytelebus = jsonObj.getAsJsonArray("telebus");
        if (jsonArraytelebus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("telebus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `telebus` to be an array in the JSON string but got `%s`", jsonObj.get("telebus").toString()));
          }

          // validate the optional field `telebus` (array)
          for (int i = 0; i < jsonArraytelebus.size(); i++) {
            V3Disruption.validateJsonElement(jsonArraytelebus.get(i));
          };
        }
      }
      if (jsonObj.get("night_bus") != null && !jsonObj.get("night_bus").isJsonNull()) {
        JsonArray jsonArraynightBus = jsonObj.getAsJsonArray("night_bus");
        if (jsonArraynightBus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("night_bus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `night_bus` to be an array in the JSON string but got `%s`", jsonObj.get("night_bus").toString()));
          }

          // validate the optional field `night_bus` (array)
          for (int i = 0; i < jsonArraynightBus.size(); i++) {
            V3Disruption.validateJsonElement(jsonArraynightBus.get(i));
          };
        }
      }
      if (jsonObj.get("ferry") != null && !jsonObj.get("ferry").isJsonNull()) {
        JsonArray jsonArrayferry = jsonObj.getAsJsonArray("ferry");
        if (jsonArrayferry != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ferry").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ferry` to be an array in the JSON string but got `%s`", jsonObj.get("ferry").toString()));
          }

          // validate the optional field `ferry` (array)
          for (int i = 0; i < jsonArrayferry.size(); i++) {
            V3Disruption.validateJsonElement(jsonArrayferry.get(i));
          };
        }
      }
      if (jsonObj.get("interstate_train") != null && !jsonObj.get("interstate_train").isJsonNull()) {
        JsonArray jsonArrayinterstateTrain = jsonObj.getAsJsonArray("interstate_train");
        if (jsonArrayinterstateTrain != null) {
          // ensure the json data is an array
          if (!jsonObj.get("interstate_train").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `interstate_train` to be an array in the JSON string but got `%s`", jsonObj.get("interstate_train").toString()));
          }

          // validate the optional field `interstate_train` (array)
          for (int i = 0; i < jsonArrayinterstateTrain.size(); i++) {
            V3Disruption.validateJsonElement(jsonArrayinterstateTrain.get(i));
          };
        }
      }
      if (jsonObj.get("skybus") != null && !jsonObj.get("skybus").isJsonNull()) {
        JsonArray jsonArrayskybus = jsonObj.getAsJsonArray("skybus");
        if (jsonArrayskybus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("skybus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `skybus` to be an array in the JSON string but got `%s`", jsonObj.get("skybus").toString()));
          }

          // validate the optional field `skybus` (array)
          for (int i = 0; i < jsonArrayskybus.size(); i++) {
            V3Disruption.validateJsonElement(jsonArrayskybus.get(i));
          };
        }
      }
      if (jsonObj.get("taxi") != null && !jsonObj.get("taxi").isJsonNull()) {
        JsonArray jsonArraytaxi = jsonObj.getAsJsonArray("taxi");
        if (jsonArraytaxi != null) {
          // ensure the json data is an array
          if (!jsonObj.get("taxi").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `taxi` to be an array in the JSON string but got `%s`", jsonObj.get("taxi").toString()));
          }

          // validate the optional field `taxi` (array)
          for (int i = 0; i < jsonArraytaxi.size(); i++) {
            V3Disruption.validateJsonElement(jsonArraytaxi.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V3Disruptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V3Disruptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V3Disruptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V3Disruptions.class));

       return (TypeAdapter<T>) new TypeAdapter<V3Disruptions>() {
           @Override
           public void write(JsonWriter out, V3Disruptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V3Disruptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V3Disruptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V3Disruptions
  * @throws IOException if the JSON string is invalid with respect to V3Disruptions
  */
  public static V3Disruptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V3Disruptions.class);
  }

 /**
  * Convert an instance of V3Disruptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

