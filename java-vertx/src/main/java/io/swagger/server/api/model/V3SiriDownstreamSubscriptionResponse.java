package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.threeten.bp.OffsetDateTime;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3SiriDownstreamSubscriptionResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3SiriDownstreamSubscriptionResponse   {
  private OffsetDateTime validUntil = null;

  public V3SiriDownstreamSubscriptionResponse validUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  /**
   * The Data Horizon of Chronos
   * @return validUntil
   **/
    public OffsetDateTime getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriDownstreamSubscriptionResponse v3SiriDownstreamSubscriptionResponse = (V3SiriDownstreamSubscriptionResponse) o;
    return Objects.equals(this.validUntil, v3SiriDownstreamSubscriptionResponse.validUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validUntil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriDownstreamSubscriptionResponse {\n");
    
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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