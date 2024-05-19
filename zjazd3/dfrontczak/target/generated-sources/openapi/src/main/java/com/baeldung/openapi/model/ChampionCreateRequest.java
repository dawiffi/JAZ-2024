package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ChampionCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-19T12:27:40.463677800+02:00[Europe/Warsaw]")
public class ChampionCreateRequest {

  private String name;

  private String role;

  private String region;

  private String type;

  private String damageType;

  public ChampionCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChampionCreateRequest role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  
  @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public ChampionCreateRequest region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
  */
  
  @Schema(name = "region", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public ChampionCreateRequest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ChampionCreateRequest damageType(String damageType) {
    this.damageType = damageType;
    return this;
  }

  /**
   * Get damageType
   * @return damageType
  */
  
  @Schema(name = "damage_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("damage_type")
  public String getDamageType() {
    return damageType;
  }

  public void setDamageType(String damageType) {
    this.damageType = damageType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChampionCreateRequest championCreateRequest = (ChampionCreateRequest) o;
    return Objects.equals(this.name, championCreateRequest.name) &&
        Objects.equals(this.role, championCreateRequest.role) &&
        Objects.equals(this.region, championCreateRequest.region) &&
        Objects.equals(this.type, championCreateRequest.type) &&
        Objects.equals(this.damageType, championCreateRequest.damageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, role, region, type, damageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChampionCreateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    damageType: ").append(toIndentedString(damageType)).append("\n");
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

