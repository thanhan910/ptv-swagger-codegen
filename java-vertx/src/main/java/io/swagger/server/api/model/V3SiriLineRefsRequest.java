package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.V3SiriLineRef;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * V3SiriLineRefsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2024-04-14T03:35:56.953023300+10:00[Australia/Sydney]")



public class V3SiriLineRefsRequest   {
  
  private List<V3SiriLineRef> lineRefs = null;

  private String mappingVersion = null;

  public V3SiriLineRefsRequest lineRefs(List<V3SiriLineRef> lineRefs) {
    this.lineRefs = lineRefs;
    return this;
  }

  public V3SiriLineRefsRequest addLineRefsItem(V3SiriLineRef lineRefsItem) {
    if (this.lineRefs == null) {
      this.lineRefs = new ArrayList<V3SiriLineRef>();
    }
    this.lineRefs.add(lineRefsItem);
    return this;
  }

  /**
   * Get lineRefs
   * @return lineRefs
   **/
    public List<V3SiriLineRef> getLineRefs() {
    return lineRefs;
  }

  public void setLineRefs(List<V3SiriLineRef> lineRefs) {
    this.lineRefs = lineRefs;
  }

  public V3SiriLineRefsRequest mappingVersion(String mappingVersion) {
    this.mappingVersion = mappingVersion;
    return this;
  }

  /**
   * DIVA mapping version generated by Chronos during a Parser or RealtimeBusConfig load
   * @return mappingVersion
   **/
    public String getMappingVersion() {
    return mappingVersion;
  }

  public void setMappingVersion(String mappingVersion) {
    this.mappingVersion = mappingVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SiriLineRefsRequest v3SiriLineRefsRequest = (V3SiriLineRefsRequest) o;
    return Objects.equals(this.lineRefs, v3SiriLineRefsRequest.lineRefs) &&
        Objects.equals(this.mappingVersion, v3SiriLineRefsRequest.mappingVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineRefs, mappingVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SiriLineRefsRequest {\n");
    
    sb.append("    lineRefs: ").append(toIndentedString(lineRefs)).append("\n");
    sb.append("    mappingVersion: ").append(toIndentedString(mappingVersion)).append("\n");
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