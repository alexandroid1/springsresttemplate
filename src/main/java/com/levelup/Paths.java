
package com.levelup;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "flagged",
    "hidden",
    "last_push",
    "date",
    "fields",
    "title",
    "tags",
    "alias",
    "location",
    "description",
    "__v",
    "_id"
})
public class Paths {

    @JsonProperty("flagged")
    private String flagged;
    @JsonProperty("hidden")
    private String hidden;
    @JsonProperty("last_push")
    private String lastPush;
    @JsonProperty("date")
    private String date;
    @JsonProperty("fields")
    private String fields;
    @JsonProperty("title")
    private String title;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("location")
    private String location;
    @JsonProperty("description")
    private String description;
    @JsonProperty("__v")
    private String v;
    @JsonProperty("_id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Paths() {
    }

    /**
     * 
     * @param id
     * @param tags
     * @param v
     * @param title
     * @param lastPush
     * @param location
     * @param alias
     * @param description
     * @param hidden
     * @param flagged
     * @param date
     * @param fields
     */
    public Paths(String flagged, String hidden, String lastPush, String date, String fields, String title, String tags, String alias, String location, String description, String v, String id) {
        super();
        this.flagged = flagged;
        this.hidden = hidden;
        this.lastPush = lastPush;
        this.date = date;
        this.fields = fields;
        this.title = title;
        this.tags = tags;
        this.alias = alias;
        this.location = location;
        this.description = description;
        this.v = v;
        this.id = id;
    }

    @JsonProperty("flagged")
    public String getFlagged() {
        return flagged;
    }

    @JsonProperty("flagged")
    public void setFlagged(String flagged) {
        this.flagged = flagged;
    }

    public Paths withFlagged(String flagged) {
        this.flagged = flagged;
        return this;
    }

    @JsonProperty("hidden")
    public String getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public Paths withHidden(String hidden) {
        this.hidden = hidden;
        return this;
    }

    @JsonProperty("last_push")
    public String getLastPush() {
        return lastPush;
    }

    @JsonProperty("last_push")
    public void setLastPush(String lastPush) {
        this.lastPush = lastPush;
    }

    public Paths withLastPush(String lastPush) {
        this.lastPush = lastPush;
        return this;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Paths withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("fields")
    public String getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(String fields) {
        this.fields = fields;
    }

    public Paths withFields(String fields) {
        this.fields = fields;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Paths withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    public Paths withTags(String tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Paths withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public Paths withLocation(String location) {
        this.location = location;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Paths withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("__v")
    public String getV() {
        return v;
    }

    @JsonProperty("__v")
    public void setV(String v) {
        this.v = v;
    }

    public Paths withV(String v) {
        this.v = v;
        return this;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    public Paths withId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Paths withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(flagged).append(hidden).append(lastPush).append(date).append(fields).append(title).append(tags).append(alias).append(location).append(description).append(v).append(id).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Paths) == false) {
            return false;
        }
        Paths rhs = ((Paths) other);
        return new EqualsBuilder().append(flagged, rhs.flagged).append(hidden, rhs.hidden).append(lastPush, rhs.lastPush).append(date, rhs.date).append(fields, rhs.fields).append(title, rhs.title).append(tags, rhs.tags).append(alias, rhs.alias).append(location, rhs.location).append(description, rhs.description).append(v, rhs.v).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
