/*
 * Kafka Service Fleet Manager
 * Kafka Service Fleet Manager is a Rest API to manage Kafka instances.
 *
 * The version of the OpenAPI document: 1.8.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.kas.models.ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VersionMetadataAllOf
 */
@JsonPropertyOrder({
  VersionMetadataAllOf.JSON_PROPERTY_COLLECTIONS
})
@JsonTypeName("VersionMetadata_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VersionMetadataAllOf {
  public static final String JSON_PROPERTY_COLLECTIONS = "collections";
  private List<ObjectReference> collections = null;

  public VersionMetadataAllOf() { 
  }

  public VersionMetadataAllOf collections(List<ObjectReference> collections) {
    
    this.collections = collections;
    return this;
  }

  public VersionMetadataAllOf addCollectionsItem(ObjectReference collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

   /**
   * Get collections
   * @return collections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObjectReference> getCollections() {
    return collections;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollections(List<ObjectReference> collections) {
    this.collections = collections;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionMetadataAllOf versionMetadataAllOf = (VersionMetadataAllOf) o;
    return Objects.equals(this.collections, versionMetadataAllOf.collections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionMetadataAllOf {\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
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

