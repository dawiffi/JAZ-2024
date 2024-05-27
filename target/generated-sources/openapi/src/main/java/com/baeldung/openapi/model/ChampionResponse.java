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
 * ChampionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-27T15:51:15.584749800+02:00[Europe/Warsaw]", comments = "Generator version: 7.5.0")
public class ChampionResponse {

  private Long id;

  private String name;

  private String role;

  private String region;

  private String damageType;

  public ChampionResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ChampionResponse name(String name) {
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

  public ChampionResponse role(String role) {
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

  public ChampionResponse region(String region) {
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

  public ChampionResponse damageType(String damageType) {
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
    ChampionResponse championResponse = (ChampionResponse) o;
    return Objects.equals(this.id, championResponse.id) &&
        Objects.equals(this.name, championResponse.name) &&
        Objects.equals(this.role, championResponse.role) &&
        Objects.equals(this.region, championResponse.region) &&
        Objects.equals(this.damageType, championResponse.damageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, role, region, damageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChampionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

