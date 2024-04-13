package io.swagger.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3DeparturesBroadParameters   {

  private @Valid List<Integer> platformNumbers = new ArrayList<Integer>();

  private @Valid Integer directionId = null;

  private @Valid Boolean gtfs = null;

  private @Valid Date dateUtc = null;

  private @Valid Integer maxResults = null;

  private @Valid Boolean includeCancelled = null;

  private @Valid Boolean lookBackwards = null;

public enum ExpandEnum {

    ALL(String.valueOf("All")), STOP(String.valueOf("Stop")), ROUTE(String.valueOf("Route")), RUN(String.valueOf("Run")), DIRECTION(String.valueOf("Direction")), DISRUPTION(String.valueOf("Disruption")), VEHICLEDESCRIPTOR(String.valueOf("VehicleDescriptor")), VEHICLEPOSITION(String.valueOf("VehiclePosition")), NONE(String.valueOf("None"));


    private String value;

    ExpandEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ExpandEnum fromValue(String v) {
        for (ExpandEnum b : ExpandEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private @Valid List<ExpandEnum> expand = new ArrayList<ExpandEnum>();

  private @Valid Boolean includeGeopath = null;

  /**
   * Filter by platform number at stop
   **/
  public V3DeparturesBroadParameters platformNumbers(List<Integer> platformNumbers) {
    this.platformNumbers = platformNumbers;
    return this;
  }

  
  @ApiModelProperty(value = "Filter by platform number at stop")
  @JsonProperty("platform_numbers")

  public List<Integer> getPlatformNumbers() {
    return platformNumbers;
  }
  public void setPlatformNumbers(List<Integer> platformNumbers) {
    this.platformNumbers = platformNumbers;
  }

  /**
   * Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
   **/
  public V3DeparturesBroadParameters directionId(Integer directionId) {
    this.directionId = directionId;
    return this;
  }

  
  @ApiModelProperty(value = "Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}")
  @JsonProperty("direction_id")

  public Integer getDirectionId() {
    return directionId;
  }
  public void setDirectionId(Integer directionId) {
    this.directionId = directionId;
  }

  /**
   * Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data
   **/
  public V3DeparturesBroadParameters gtfs(Boolean gtfs) {
    this.gtfs = gtfs;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates that stop_id parameter will accept \"GTFS stop_id\" data")
  @JsonProperty("gtfs")

  public Boolean isGtfs() {
    return gtfs;
  }
  public void setGtfs(Boolean gtfs) {
    this.gtfs = gtfs;
  }

  /**
   * Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)
   **/
  public V3DeparturesBroadParameters dateUtc(Date dateUtc) {
    this.dateUtc = dateUtc;
    return this;
  }

  
  @ApiModelProperty(value = "Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)")
  @JsonProperty("date_utc")

  public Date getDateUtc() {
    return dateUtc;
  }
  public void setDateUtc(Date dateUtc) {
    this.dateUtc = dateUtc;
  }

  /**
   * Maximum number of results returned
   **/
  public V3DeparturesBroadParameters maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  
  @ApiModelProperty(value = "Maximum number of results returned")
  @JsonProperty("max_results")

  public Integer getMaxResults() {
    return maxResults;
  }
  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  /**
   * Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only
   **/
  public V3DeparturesBroadParameters includeCancelled(Boolean includeCancelled) {
    this.includeCancelled = includeCancelled;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only")
  @JsonProperty("include_cancelled")

  public Boolean isIncludeCancelled() {
    return includeCancelled;
  }
  public void setIncludeCancelled(Boolean includeCancelled) {
    this.includeCancelled = includeCancelled;
  }

  /**
   * Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.
   **/
  public V3DeparturesBroadParameters lookBackwards(Boolean lookBackwards) {
    this.lookBackwards = lookBackwards;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.")
  @JsonProperty("look_backwards")

  public Boolean isLookBackwards() {
    return lookBackwards;
  }
  public void setLookBackwards(Boolean lookBackwards) {
    this.lookBackwards = lookBackwards;
  }

  /**
   * List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
   **/
  public V3DeparturesBroadParameters expand(List<ExpandEnum> expand) {
    this.expand = expand;
    return this;
  }

  
  @ApiModelProperty(value = "List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.")
  @JsonProperty("expand")

  public List<ExpandEnum> getExpand() {
    return expand;
  }
  public void setExpand(List<ExpandEnum> expand) {
    this.expand = expand;
  }

  /**
   * Indicates if the route geopath should be returned
   **/
  public V3DeparturesBroadParameters includeGeopath(Boolean includeGeopath) {
    this.includeGeopath = includeGeopath;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates if the route geopath should be returned")
  @JsonProperty("include_geopath")

  public Boolean isIncludeGeopath() {
    return includeGeopath;
  }
  public void setIncludeGeopath(Boolean includeGeopath) {
    this.includeGeopath = includeGeopath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3DeparturesBroadParameters v3DeparturesBroadParameters = (V3DeparturesBroadParameters) o;
    return Objects.equals(platformNumbers, v3DeparturesBroadParameters.platformNumbers) &&
        Objects.equals(directionId, v3DeparturesBroadParameters.directionId) &&
        Objects.equals(gtfs, v3DeparturesBroadParameters.gtfs) &&
        Objects.equals(dateUtc, v3DeparturesBroadParameters.dateUtc) &&
        Objects.equals(maxResults, v3DeparturesBroadParameters.maxResults) &&
        Objects.equals(includeCancelled, v3DeparturesBroadParameters.includeCancelled) &&
        Objects.equals(lookBackwards, v3DeparturesBroadParameters.lookBackwards) &&
        Objects.equals(expand, v3DeparturesBroadParameters.expand) &&
        Objects.equals(includeGeopath, v3DeparturesBroadParameters.includeGeopath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platformNumbers, directionId, gtfs, dateUtc, maxResults, includeCancelled, lookBackwards, expand, includeGeopath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DeparturesBroadParameters {\n");
    
    sb.append("    platformNumbers: ").append(toIndentedString(platformNumbers)).append("\n");
    sb.append("    directionId: ").append(toIndentedString(directionId)).append("\n");
    sb.append("    gtfs: ").append(toIndentedString(gtfs)).append("\n");
    sb.append("    dateUtc: ").append(toIndentedString(dateUtc)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    includeCancelled: ").append(toIndentedString(includeCancelled)).append("\n");
    sb.append("    lookBackwards: ").append(toIndentedString(lookBackwards)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    includeGeopath: ").append(toIndentedString(includeGeopath)).append("\n");
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