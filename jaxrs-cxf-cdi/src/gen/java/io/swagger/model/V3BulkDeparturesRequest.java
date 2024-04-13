package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3StopDepartureRequest;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3BulkDeparturesRequest   {
  private List<V3StopDepartureRequest> requests = new ArrayList<V3StopDepartureRequest>();
  private java.util.Date dateUtc = null;
  private Boolean lookBackwards = null;
  private Boolean includeCancelled = null;
  private Boolean includeGeopath = null;
@XmlType(name="ExpandEnum")
@XmlEnum(String.class)
public enum ExpandEnum {

    @XmlEnumValue("All") ALL(String.valueOf("All")), @XmlEnumValue("Stop") STOP(String.valueOf("Stop")), @XmlEnumValue("Route") ROUTE(String.valueOf("Route")), @XmlEnumValue("Run") RUN(String.valueOf("Run")), @XmlEnumValue("Direction") DIRECTION(String.valueOf("Direction")), @XmlEnumValue("Disruption") DISRUPTION(String.valueOf("Disruption")), @XmlEnumValue("VehicleDescriptor") VEHICLEDESCRIPTOR(String.valueOf("VehicleDescriptor")), @XmlEnumValue("VehiclePosition") VEHICLEPOSITION(String.valueOf("VehiclePosition")), @XmlEnumValue("None") NONE(String.valueOf("None"));


    private String value;

    ExpandEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ExpandEnum fromValue(String v) {
        for (ExpandEnum b : ExpandEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private List<ExpandEnum> expand = new ArrayList<ExpandEnum>();

  /**
   * Collection of departure requests
   **/
  public V3BulkDeparturesRequest requests(List<V3StopDepartureRequest> requests) {
    this.requests = requests;
    return this;
  }

  
  
  @Schema(required = true, description = "Collection of departure requests")
  @JsonProperty("requests")
  @NotNull
  @Valid
  public List<V3StopDepartureRequest> getRequests() {
    return requests;
  }
  public void setRequests(List<V3StopDepartureRequest> requests) {
    this.requests = requests;
  }

  /**
   * Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)
   **/
  public V3BulkDeparturesRequest dateUtc(java.util.Date dateUtc) {
    this.dateUtc = dateUtc;
    return this;
  }

  
  
  @Schema(description = "Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)")
  @JsonProperty("date_utc")
  @Valid
  public java.util.Date getDateUtc() {
    return dateUtc;
  }
  public void setDateUtc(java.util.Date dateUtc) {
    this.dateUtc = dateUtc;
  }

  /**
   * Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.
   **/
  public V3BulkDeparturesRequest lookBackwards(Boolean lookBackwards) {
    this.lookBackwards = lookBackwards;
    return this;
  }

  
  
  @Schema(description = "Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.")
  @JsonProperty("look_backwards")
  public Boolean isLookBackwards() {
    return lookBackwards;
  }
  public void setLookBackwards(Boolean lookBackwards) {
    this.lookBackwards = lookBackwards;
  }

  /**
   * Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only
   **/
  public V3BulkDeparturesRequest includeCancelled(Boolean includeCancelled) {
    this.includeCancelled = includeCancelled;
    return this;
  }

  
  
  @Schema(description = "Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only")
  @JsonProperty("include_cancelled")
  public Boolean isIncludeCancelled() {
    return includeCancelled;
  }
  public void setIncludeCancelled(Boolean includeCancelled) {
    this.includeCancelled = includeCancelled;
  }

  /**
   * Indicates if the route geopath should be returned
   **/
  public V3BulkDeparturesRequest includeGeopath(Boolean includeGeopath) {
    this.includeGeopath = includeGeopath;
    return this;
  }

  
  
  @Schema(description = "Indicates if the route geopath should be returned")
  @JsonProperty("include_geopath")
  public Boolean isIncludeGeopath() {
    return includeGeopath;
  }
  public void setIncludeGeopath(Boolean includeGeopath) {
    this.includeGeopath = includeGeopath;
  }

  /**
   * List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none
   **/
  public V3BulkDeparturesRequest expand(List<ExpandEnum> expand) {
    this.expand = expand;
    return this;
  }

  
  
  @Schema(description = "List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none")
  @JsonProperty("expand")
  public List<ExpandEnum> getExpand() {
    return expand;
  }
  public void setExpand(List<ExpandEnum> expand) {
    this.expand = expand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3BulkDeparturesRequest v3BulkDeparturesRequest = (V3BulkDeparturesRequest) o;
    return Objects.equals(requests, v3BulkDeparturesRequest.requests) &&
        Objects.equals(dateUtc, v3BulkDeparturesRequest.dateUtc) &&
        Objects.equals(lookBackwards, v3BulkDeparturesRequest.lookBackwards) &&
        Objects.equals(includeCancelled, v3BulkDeparturesRequest.includeCancelled) &&
        Objects.equals(includeGeopath, v3BulkDeparturesRequest.includeGeopath) &&
        Objects.equals(expand, v3BulkDeparturesRequest.expand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests, dateUtc, lookBackwards, includeCancelled, includeGeopath, expand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3BulkDeparturesRequest {\n");
    
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    dateUtc: ").append(toIndentedString(dateUtc)).append("\n");
    sb.append("    lookBackwards: ").append(toIndentedString(lookBackwards)).append("\n");
    sb.append("    includeCancelled: ").append(toIndentedString(includeCancelled)).append("\n");
    sb.append("    includeGeopath: ").append(toIndentedString(includeGeopath)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
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