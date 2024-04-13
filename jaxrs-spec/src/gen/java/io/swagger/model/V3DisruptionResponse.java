package io.swagger.model;

import io.swagger.model.V3Disruption;
import io.swagger.model.V3Status;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V3DisruptionResponse   {

  private @Valid V3Disruption disruption = null;

  private @Valid V3Status status = null;

  /**
   **/
  public V3DisruptionResponse disruption(V3Disruption disruption) {
    this.disruption = disruption;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("disruption")

  public V3Disruption getDisruption() {
    return disruption;
  }
  public void setDisruption(V3Disruption disruption) {
    this.disruption = disruption;
  }

  /**
   **/
  public V3DisruptionResponse status(V3Status status) {
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
    V3DisruptionResponse v3DisruptionResponse = (V3DisruptionResponse) o;
    return Objects.equals(disruption, v3DisruptionResponse.disruption) &&
        Objects.equals(status, v3DisruptionResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruption, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DisruptionResponse {\n");
    
    sb.append("    disruption: ").append(toIndentedString(disruption)).append("\n");
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