package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3Outlet;
import io.swagger.model.V3Status;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class V3OutletResponse   {
  private List<V3Outlet> outlets = new ArrayList<V3Outlet>();
  private V3Status status = null;

  /**
   * myki ticket outlets
   **/
  public V3OutletResponse outlets(List<V3Outlet> outlets) {
    this.outlets = outlets;
    return this;
  }

  
  
  @Schema(description = "myki ticket outlets")
  @JsonProperty("outlets")
  @Valid
  public List<V3Outlet> getOutlets() {
    return outlets;
  }
  public void setOutlets(List<V3Outlet> outlets) {
    this.outlets = outlets;
  }

  /**
   **/
  public V3OutletResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("status")
  @Valid
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
    V3OutletResponse v3OutletResponse = (V3OutletResponse) o;
    return Objects.equals(outlets, v3OutletResponse.outlets) &&
        Objects.equals(status, v3OutletResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outlets, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3OutletResponse {\n");
    
    sb.append("    outlets: ").append(toIndentedString(outlets)).append("\n");
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