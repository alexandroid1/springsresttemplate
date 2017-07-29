
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
    "alias",
    "location",
    "flagged",
    "hidden",
    "title",
    "tags",
    "last_push",
    "fields",
    "description",
    "date",
    "__v",
    "_id"
})
public class Init {

    @JsonProperty("alias")
    private boolean alias;
    @JsonProperty("location")
    private boolean location;
    @JsonProperty("flagged")
    private boolean flagged;
    @JsonProperty("hidden")
    private boolean hidden;
    @JsonProperty("title")
    private boolean title;
    @JsonProperty("tags")
    private boolean tags;
    @JsonProperty("last_push")
    private boolean lastPush;
    @JsonProperty("fields")
    private boolean fields;
    @JsonProperty("description")
    private boolean description;
    @JsonProperty("date")
    private boolean date;
    @JsonProperty("__v")
    private boolean v;
    @JsonProperty("_id")
    private boolean id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Init() {
    }

    /**
     * 
     * @param id
     * @param tags
     * @param v
     * @param lastPush
     * @param title
     * @param location
     * @param alias
     * @param description
     * @param hidden
     * @param flagged
     * @param date
     * @param fields
     */
    public Init(boolean alias, boolean location, boolean flagged, boolean hidden, boolean title, boolean tags, boolean lastPush, boolean fields, boolean description, boolean date, boolean v, boolean id) {
        super();
        this.alias = alias;
        this.location = location;
        this.flagged = flagged;
        this.hidden = hidden;
        this.title = title;
        this.tags = tags;
        this.lastPush = lastPush;
        this.fields = fields;
        this.description = description;
        this.date = date;
        this.v = v;
        this.id = id;
    }

    @JsonProperty("alias")
    public boolean isAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(boolean alias) {
        this.alias = alias;
    }

    public Init withAlias(boolean alias) {
        this.alias = alias;
        return this;
    }

    @JsonProperty("location")
    public boolean isLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(boolean location) {
        this.location = location;
    }

    public Init withLocation(boolean location) {
        this.location = location;
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

    public Init withFlagged(boolean flagged) {
        this.flagged = flagged;
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

    public Init withHidden(boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    @JsonProperty("title")
    public boolean isTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(boolean title) {
        this.title = title;
    }

    public Init withTitle(boolean title) {
        this.title = title;
        return this;
    }

    @JsonProperty("tags")
    public boolean isTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(boolean tags) {
        this.tags = tags;
    }

    public Init withTags(boolean tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("last_push")
    public boolean isLastPush() {
        return lastPush;
    }

    @JsonProperty("last_push")
    public void setLastPush(boolean lastPush) {
        this.lastPush = lastPush;
    }

    public Init withLastPush(boolean lastPush) {
        this.lastPush = lastPush;
        return this;
    }

    @JsonProperty("fields")
    public boolean isFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(boolean fields) {
        this.fields = fields;
    }

    public Init withFields(boolean fields) {
        this.fields = fields;
        return this;
    }

    @JsonProperty("description")
    public boolean isDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(boolean description) {
        this.description = description;
    }

    public Init withDescription(boolean description) {
        this.description = description;
        return this;
    }

    @JsonProperty("date")
    public boolean isDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(boolean date) {
        this.date = date;
    }

    public Init withDate(boolean date) {
        this.date = date;
        return this;
    }

    @JsonProperty("__v")
    public boolean isV() {
        return v;
    }

    @JsonProperty("__v")
    public void setV(boolean v) {
        this.v = v;
    }

    public Init withV(boolean v) {
        this.v = v;
        return this;
    }

    @JsonProperty("_id")
    public boolean isId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(boolean id) {
        this.id = id;
    }

    public Init withId(boolean id) {
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

    public Init withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(alias).append(location).append(flagged).append(hidden).append(title).append(tags).append(lastPush).append(fields).append(description).append(date).append(v).append(id).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Init) == false) {
            return false;
        }
        Init rhs = ((Init) other);
        return new EqualsBuilder().append(alias, rhs.alias).append(location, rhs.location).append(flagged, rhs.flagged).append(hidden, rhs.hidden).append(title, rhs.title).append(tags, rhs.tags).append(lastPush, rhs.lastPush).append(fields, rhs.fields).append(description, rhs.description).append(date, rhs.date).append(v, rhs.v).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
