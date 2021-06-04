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
import com.openshift.cloud.api.kas.models.Topic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A list of topics.
 */
@ApiModel(description = "A list of topics.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-08T16:31:07.584987183-04:00[America/New_York]")
public class TopicsList {
  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Topic> items = new ArrayList<>();


  public TopicsList offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The page offset
   * @return offset
  **/
  @ApiModelProperty(required = true, value = "The page offset")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public TopicsList limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * number of entries per page
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "number of entries per page")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public TopicsList count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Total number of topics
   * @return count
  **/
  @ApiModelProperty(required = true, value = "Total number of topics")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public TopicsList items(List<Topic> items) {
    
    this.items = items;
    return this;
  }

  public TopicsList addItemsItem(Topic itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of topics
   * @return items
  **/
  @ApiModelProperty(required = true, value = "List of topics")

  public List<Topic> getItems() {
    return items;
  }


  public void setItems(List<Topic> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicsList topicsList = (TopicsList) o;
    return Objects.equals(this.offset, topicsList.offset) &&
        Objects.equals(this.limit, topicsList.limit) &&
        Objects.equals(this.count, topicsList.count) &&
        Objects.equals(this.items, topicsList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, count, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicsList {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

