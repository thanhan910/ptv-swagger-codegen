package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3DisruptionMode;
import io.swagger.model.V3Status;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2024-04-14T03:35:50.739078900+10:00[Australia/Sydney]")
public class V3DisruptionModesResponse   {
  private List<V3DisruptionMode> disruptionModes = new ArrayList<V3DisruptionMode>();  private V3Status status = null;

  /**
   * Transport mode identifiers
   **/
  
  @Schema(description = "Transport mode identifiers")
  @JsonProperty("disruption_modes")
  public List<V3DisruptionMode> getDisruptionModes() {
    return disruptionModes;
  }
  public void setDisruptionModes(List<V3DisruptionMode> disruptionModes) {
    this.disruptionModes = disruptionModes;
  }

  /**
   **/
  
  @Schema(description = "")
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
    V3DisruptionModesResponse v3DisruptionModesResponse = (V3DisruptionModesResponse) o;
    return Objects.equals(disruptionModes, v3DisruptionModesResponse.disruptionModes) &&
        Objects.equals(status, v3DisruptionModesResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptionModes, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DisruptionModesResponse {\n");
    
    sb.append("    disruptionModes: ").append(toIndentedString(disruptionModes)).append("\n");
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