package com.ates.training.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import java.util.Map;

public class ReturnInfo {

  public String status;

  private Map<String, String> properties;

  @JsonAnyGetter
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
