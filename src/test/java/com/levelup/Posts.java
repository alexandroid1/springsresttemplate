
package com.levelup;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$__original_validate"
})
public class Posts {

    @JsonProperty("$__original_validate")
    private List<Object> $OriginalValidate = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Posts() {
    }

    /**
     * 
     * @param $OriginalValidate
     */
    public Posts(List<Object> $OriginalValidate) {
        super();
        this.$OriginalValidate = $OriginalValidate;
    }

    @JsonProperty("$__original_validate")
    public List<Object> get$OriginalValidate() {
        return $OriginalValidate;
    }

    @JsonProperty("$__original_validate")
    public void set$OriginalValidate(List<Object> $OriginalValidate) {
        this.$OriginalValidate = $OriginalValidate;
    }

    public Posts with$OriginalValidate(List<Object> $OriginalValidate) {
        this.$OriginalValidate = $OriginalValidate;
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

    public Posts withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append($OriginalValidate).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Posts) == false) {
            return false;
        }
        Posts rhs = ((Posts) other);
        return new EqualsBuilder().append($OriginalValidate, rhs.$OriginalValidate).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
