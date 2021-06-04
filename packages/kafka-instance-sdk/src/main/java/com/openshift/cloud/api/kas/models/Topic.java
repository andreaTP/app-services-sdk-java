/*
 * Kafka Admin REST API
 * An API to provide REST endpoints for query Kafka for admin operations
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.openshift.cloud.api.kas.models.ConfigEntry;
import com.openshift.cloud.api.kas.models.Partition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Kafka Topic (A feed where records are stored and published)
 */
@ApiModel(description = "Kafka Topic (A feed where records are stored and published)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-08T16:31:07.584987183-04:00[America/New_York]")
public class Topic {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private List<ConfigEntry> config = null;

  public static final String SERIALIZED_NAME_PARTITIONS = "partitions";
  @SerializedName(SERIALIZED_NAME_PARTITIONS)
  private List<Partition> partitions = null;


  public Topic name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the topic.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the topic.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Topic config(List<ConfigEntry> config) {
    
    this.config = config;
    return this;
  }

  public Topic addConfigItem(ConfigEntry configItem) {
    if (this.config == null) {
      this.config = new ArrayList<>();
    }
    this.config.add(configItem);
    return this;
  }

   /**
   * Topic configuration entry.
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Topic configuration entry.")

  public List<ConfigEntry> getConfig() {
    return config;
  }


  public void setConfig(List<ConfigEntry> config) {
    this.config = config;
  }


  public Topic partitions(List<Partition> partitions) {
    
    this.partitions = partitions;
    return this;
  }

  public Topic addPartitionsItem(Partition partitionsItem) {
    if (this.partitions == null) {
      this.partitions = new ArrayList<>();
    }
    this.partitions.add(partitionsItem);
    return this;
  }

   /**
   * Partitions for this topic.
   * @return partitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Partitions for this topic.")

  public List<Partition> getPartitions() {
    return partitions;
  }


  public void setPartitions(List<Partition> partitions) {
    this.partitions = partitions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Topic topic = (Topic) o;
    return Objects.equals(this.name, topic.name) &&
        Objects.equals(this.config, topic.config) &&
        Objects.equals(this.partitions, topic.partitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, config, partitions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Topic {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
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

