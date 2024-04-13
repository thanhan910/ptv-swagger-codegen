package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3RouteType
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3RouteType   {
  private String routeTypeName = null;

  private Integer routeType = null;

  public V3RouteType routeTypeName(String routeTypeName) {
    this.routeTypeName = routeTypeName;
    return this;
  }

  /**
   * Name of transport mode
   * @return routeTypeName
   **/
    public String getRouteTypeName() {
    return routeTypeName;
  }

  public void setRouteTypeName(String routeTypeName) {
    this.routeTypeName = routeTypeName;
  }

  public V3RouteType routeType(Integer routeType) {
    this.routeType = routeType;
    return this;
  }

  /**
   * Transport mode identifier
   * @return routeType
   **/
    public Integer getRouteType() {
    return routeType;
  }

  public void setRouteType(Integer routeType) {
    this.routeType = routeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3RouteType v3RouteType = (V3RouteType) o;
    return Objects.equals(this.routeTypeName, v3RouteType.routeTypeName) &&
        Objects.equals(this.routeType, v3RouteType.routeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeTypeName, routeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3RouteType {\n");
    
    sb.append("    routeTypeName: ").append(toIndentedString(routeTypeName)).append("\n");
    sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
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