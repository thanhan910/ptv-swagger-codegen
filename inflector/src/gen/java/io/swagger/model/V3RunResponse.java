package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.V3Run;
import io.swagger.model.V3Status;
import io.swagger.v3.oas.annotations.media.Schema;



@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2024-04-14T03:35:08.956135700+10:00[Australia/Sydney]")

public class V3RunResponse   {
  @JsonProperty("run")
  private V3Run run = null;
  @JsonProperty("status")
  private V3Status status = null;
  /**
   **/
  public V3RunResponse run(V3Run run) {
    this.run = run;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("run")
  public V3Run getRun() {
    return run;
  }
  public void setRun(V3Run run) {
    this.run = run;
  }

  /**
   **/
  public V3RunResponse status(V3Status status) {
    this.status = status;
    return this;
  }

  
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
    V3RunResponse v3RunResponse = (V3RunResponse) o;
    return Objects.equals(run, v3RunResponse.run) &&
        Objects.equals(status, v3RunResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(run, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3RunResponse {\n");
    sb.append("    run: ").append(toIndentedString(run)).append("\n");
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