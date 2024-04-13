package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3DynamoDbTimetable;
import io.swagger.model.V3Status;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2024-04-14T03:35:42.906195700+10:00[Australia/Sydney]")
public class V3DynamoDbTimetablesReponse   {
  private List<V3DynamoDbTimetable> timetables = new ArrayList<V3DynamoDbTimetable>();
  private V3Status status = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("timetables")
  public List<V3DynamoDbTimetable> getTimetables() {
    return timetables;
  }
  public void setTimetables(List<V3DynamoDbTimetable> timetables) {
    this.timetables = timetables;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3DynamoDbTimetablesReponse v3DynamoDbTimetablesReponse = (V3DynamoDbTimetablesReponse) o;
    return Objects.equals(timetables, v3DynamoDbTimetablesReponse.timetables) &&
        Objects.equals(status, v3DynamoDbTimetablesReponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timetables, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3DynamoDbTimetablesReponse {\n");
    
    sb.append("    timetables: ").append(toIndentedString(timetables)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}