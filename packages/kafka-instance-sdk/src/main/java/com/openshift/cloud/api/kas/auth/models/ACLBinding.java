/*
 * Kafka Admin REST API
 * An API to provide REST endpoints for query Kafka for admin operations
 *
 * The version of the OpenAPI document: 0.11.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.auth.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.kas.auth.models.AclOperation;
import com.openshift.cloud.api.kas.auth.models.AclPatternType;
import com.openshift.cloud.api.kas.auth.models.AclPermissionType;
import com.openshift.cloud.api.kas.auth.models.AclResourceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a binding between a resource pattern and an access control entry
 */
@ApiModel(description = "Represents a binding between a resource pattern and an access control entry")
@JsonPropertyOrder({
  ACLBinding.JSON_PROPERTY_RESOURCE_TYPE,
  ACLBinding.JSON_PROPERTY_RESOURCE_NAME,
  ACLBinding.JSON_PROPERTY_PATTERN_TYPE,
  ACLBinding.JSON_PROPERTY_PRINCIPAL,
  ACLBinding.JSON_PROPERTY_OPERATION,
  ACLBinding.JSON_PROPERTY_PERMISSION
})
@JsonTypeName("ACL_Binding")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ACLBinding {
  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  private AclResourceType resourceType;

  public static final String JSON_PROPERTY_RESOURCE_NAME = "resourceName";
  private String resourceName;

  public static final String JSON_PROPERTY_PATTERN_TYPE = "patternType";
  private AclPatternType patternType;

  public static final String JSON_PROPERTY_PRINCIPAL = "principal";
  private String principal;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private AclOperation operation;

  public static final String JSON_PROPERTY_PERMISSION = "permission";
  private AclPermissionType permission;

  public ACLBinding() { 
  }

  public ACLBinding resourceType(AclResourceType resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AclResourceType getResourceType() {
    return resourceType;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResourceType(AclResourceType resourceType) {
    this.resourceType = resourceType;
  }


  public ACLBinding resourceName(String resourceName) {
    
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Get resourceName
   * @return resourceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResourceName() {
    return resourceName;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  public ACLBinding patternType(AclPatternType patternType) {
    
    this.patternType = patternType;
    return this;
  }

   /**
   * Get patternType
   * @return patternType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PATTERN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AclPatternType getPatternType() {
    return patternType;
  }


  @JsonProperty(JSON_PROPERTY_PATTERN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPatternType(AclPatternType patternType) {
    this.patternType = patternType;
  }


  public ACLBinding principal(String principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * Identifies the user or service account to which an ACL entry is bound. The literal prefix value of &#x60;User:&#x60; is required. May be used to specify all users with value &#x60;User:*&#x60;.
   * @return principal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "User:user-123-abc", required = true, value = "Identifies the user or service account to which an ACL entry is bound. The literal prefix value of `User:` is required. May be used to specify all users with value `User:*`.")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrincipal() {
    return principal;
  }


  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrincipal(String principal) {
    this.principal = principal;
  }


  public ACLBinding operation(AclOperation operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AclOperation getOperation() {
    return operation;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperation(AclOperation operation) {
    this.operation = operation;
  }


  public ACLBinding permission(AclPermissionType permission) {
    
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AclPermissionType getPermission() {
    return permission;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPermission(AclPermissionType permission) {
    this.permission = permission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ACLBinding acLBinding = (ACLBinding) o;
    return Objects.equals(this.resourceType, acLBinding.resourceType) &&
        Objects.equals(this.resourceName, acLBinding.resourceName) &&
        Objects.equals(this.patternType, acLBinding.patternType) &&
        Objects.equals(this.principal, acLBinding.principal) &&
        Objects.equals(this.operation, acLBinding.operation) &&
        Objects.equals(this.permission, acLBinding.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, resourceName, patternType, principal, operation, permission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ACLBinding {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    patternType: ").append(toIndentedString(patternType)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

