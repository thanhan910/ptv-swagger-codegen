package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.V3StopDepartureRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3BulkDeparturesRequest   {
  @JsonProperty("requests")
  private List<V3StopDepartureRequest> requests = new ArrayList<V3StopDepartureRequest>();
  @JsonProperty("date_utc")
  private Date dateUtc = null;
  @JsonProperty("look_backwards")
  private Boolean lookBackwards = null;
  @JsonProperty("include_cancelled")
  private Boolean includeCancelled = null;
  @JsonProperty("include_geopath")
  private Boolean includeGeopath = null;
  /**
   * Gets or Sets expand
   */
  public enum ExpandEnum {
    ALL("All"),
    
    STOP("Stop"),
    
    ROUTE("Route"),
    
    RUN("Run"),
    
    DIRECTION("Direction"),
    
    DISRUPTION("Disruption"),
    
    VEHICLEDESCRIPTOR("VehicleDescriptor"),
    
    VEHICLEPOSITION("VehiclePosition"),
    
    NONE("None");

    private String value;

    ExpandEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExpandEnum fromValue(String text) {
      for (ExpandEnum b : ExpandEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("expand")
  private List<ExpandEnum> expand = null;
  /**
   * Collection of departure requests
   **/
  public V3BulkDeparturesRequest requests(List<V3StopDepartureRequest> requests) {
    this.requests = requests;
    return this;
  }

  
  @Schema(required = true, description = "Collection of departure requests")
  @JsonProperty("requests")
  public List<V3StopDepartureRequest> getRequests() {
    return requests;
  }
  public void setRequests(List<V3StopDepartureRequest> requests) {
    this.requests = requests;
  }

  /**
   * Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
   **/
  public V3BulkDeparturesRequest dateUtc(Date dateUtc) {
    this.dateUtc = dateUtc;
    return this;
  }

  
  @Schema(description = "Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)")
  @JsonProperty("date_utc")
  public Date getDateUtc() {
    return dateUtc;
  }
  public void setDateUtc(Date dateUtc) {
    this.dateUtc = dateUtc;
  }

  /**
   * Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
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
   * Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
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