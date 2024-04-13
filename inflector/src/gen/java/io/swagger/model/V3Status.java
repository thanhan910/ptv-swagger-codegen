package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3Status   {
  @JsonProperty("version")
  private String version = null;
  /**
   * API system health status (0=offline, 1=online)
   */
  public enum HealthEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    HealthEnum(Integer value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HealthEnum fromValue(String text) {
      for (HealthEnum b : HealthEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("health")
  private HealthEnum health = null;
  /**
   * API Version number
   **/
  public V3Status version(String version) {
    this.version = version;
    return this;
  }

  
  @Schema(description = "API Version number")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * API system health status (0=offline, 1=online)
   **/
  public V3Status health(HealthEnum health) {
    this.health = health;
    return this;
  }

  
  @Schema(description = "API system health status (0=offline, 1=online)")
  @JsonProperty("health")
  public HealthEnum getHealth() {
    return health;
  }
  public void setHealth(HealthEnum health) {
    this.health = health;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3Status v3Status = (V3Status) o;
    return Objects.equals(version, v3Status.version) &&
        Objects.equals(health, v3Status.health);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, health);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3Status {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
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