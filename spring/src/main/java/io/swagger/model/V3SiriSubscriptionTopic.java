package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * V3SiriSubscriptionTopic
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-14T03:36:08.023681800+10:00[Australia/Sydney]")


public class V3SiriSubscriptionTopic   {
  @JsonProperty("line_ref")
  private String lineRef = null;

  /**
   * Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
   */
  public enum DirectionRefEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_5(5),
    
    NUMBER_10(10),
    
    NUMBER_16(16),
    
    NUMBER_32(32),
    
    NUMBER_65(65),
    
    NUMBER_130(130);

    private Integer value;

    DirectionRefEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DirectionRefEnum fromValue(String text) {
      for (DirectionRefEnum b : DirectionRefEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("direction_ref")
  private DirectionRefEnum directionRef = null;

  /**
   * Route Type eg. 0 (Train) 1 (Tram) 2 (Bus) 3 (Vline) 4 (NightRider)
   */
  public enum RouteTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4);

    private Integer value;

    RouteTypeEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RouteTypeEnum fromValue(String text) {
      for (RouteTypeEnum b : RouteTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("route_type")
  private RouteTypeEnum routeType = null;

  public V3SiriSubscriptionTopic lineRef(String lineRef) {
    this.lineRef = lineRef;
    return this;
  }

  /**
   * Siri LineRef
   * @return lineRef
   **/
  @Schema(required = true, description = "Siri LineRef")
      @NotNull

    public String getLineRef() {
    return lineRef;
  }

  public void setLineRef(String lineRef) {
    this.lineRef = lineRef;
  }

  public V3SiriSubscriptionTopic directionRef(DirectionRefEnum directionRef) {
    this.directionRef = directionRef;
    return this;
  }

  /**
   * Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
   * @return directionRef
   **/
  @Schema(description = "Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)")
  
    public DirectionRefEnum getDirectionRef() {
    return directionRef;
  }

  public void setDirectionRef(DirectionRefEnum directionRef) {
    this.directionRef = directionRef;
  }

  public V3SiriSubscriptionTopic routeType(RouteTypeEnum routeType) {
    this.routeType = routeType;
    return this;
  }

  /**
   * Route Type eg. 0 (Train) 1 (Tram) 2 (Bus) 3 (Vline) 4 (NightRider)
   * @return routeType
   **/
  @Schema(required = true, description = "Route Type eg. 0 (Train) 1 (Tram) 2 (Bus) 3 (Vline) 4 (NightRider)")
      @NotNull

    public RouteTypeEnum getRouteType() {
    return routeType;
  }

  public void setRouteType(RouteTypeEnum routeType) {
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
    V3SiriSubscriptionTopic v3SiriSubscriptionTopic = (V3SiriSubscriptionTopic) o;
    return Objects.equals(this.lineRef, v3SiriSubscriptionTopic.lineRef) &&
        Objects.equals(this.directionRef, v3SiriSubscriptionTopic.directionRef) &&
        Objects.equals(this.routeType, v3SiriSubscriptionTopic.routeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineRef, directionRef, routeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriSubscriptionTopic {\n");
    
    sb.append("    lineRef: ").append(toIndentedString(lineRef)).append("\n");
    sb.append("    directionRef: ").append(toIndentedString(directionRef)).append("\n");
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