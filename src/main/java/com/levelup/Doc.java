
package com.levelup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "tags",
    "fields",
    "date",
    "last_push",
    "hidden",
    "flagged",
    "alias",
    "location",
    "title",
    "description",
    "__v",
    "_id"
})
public class Doc {

    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("fields")
    private List<String> fields = new ArrayList<String>();
    @JsonProperty("date")
    private String date;
    @JsonProperty("last_push")
    private String lastPush;
    @JsonProperty("hidden")
    private boolean hidden;
    @JsonProperty("flagged")
    private boolean flagged;
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("__v")
    private long v;
    @JsonProperty("_id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Doc() {
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
    public Doc(List<String> tags, List<String> fields, String date, String lastPush, boolean hidden, boolean flagged, String alias, Location location, String title, String description, long v, String id) {
        super();
        this.tags = tags;
        this.fields = fields;
        this.date = date;
        this.lastPush = lastPush;
        this.hidden = hidden;
        this.flagged = flagged;
        this.alias = alias;
        this.location = location;
        this.title = title;
        this.description = description;
        this.v = v;
        this.id = id;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Doc withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("fields")
    public List<String> getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public Doc withFields(List<String> fields) {
        this.fields = fields;
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

    public Doc withDate(String date) {
        this.date = date;
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

    public Doc withLastPush(String lastPush) {
        this.lastPush = lastPush;
        return this;
    }

    @JsonProperty("hidden")
    public boolean isHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public Doc withHidden(boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    @JsonProperty("flagged")
    public boolean isFlagged() {
        return flagged;
    }

    @JsonProperty("flagged")
    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }

    public Doc withFlagged(boolean flagged) {
        this.flagged = flagged;
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

    public Doc withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    public Doc withLocation(Location location) {
        this.location = location;
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

    public Doc withTitle(String title) {
        this.title = title;
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

    public Doc withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("__v")
    public long getV() {
        return v;
    }

    @JsonProperty("__v")
    public void setV(long v) {
        this.v = v;
    }

    public Doc withV(long v) {
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

    public Doc withId(String id) {
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

    public Doc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tags).append(fields).append(date).append(lastPush).append(hidden).append(flagged).append(alias).append(location).append(title).append(description).append(v).append(id).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Doc) == false) {
            return false;
        }
        Doc rhs = ((Doc) other);
        return new EqualsBuilder().append(tags, rhs.tags).append(fields, rhs.fields).append(date, rhs.date).append(lastPush, rhs.lastPush).append(hidden, rhs.hidden).append(flagged, rhs.flagged).append(alias, rhs.alias).append(location, rhs.location).append(title, rhs.title).append(description, rhs.description).append(v, rhs.v).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
