
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
    "strictMode",
    "getters",
    "wasPopulated",
    "activePaths",
    "emitter"
})
public class $ {

    @JsonProperty("strictMode")
    private boolean strictMode;
    @JsonProperty("getters")
    private Getters getters;
    @JsonProperty("wasPopulated")
    private boolean wasPopulated;
    @JsonProperty("activePaths")
    private ActivePaths activePaths;
    @JsonProperty("emitter")
    private Emitter emitter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public $() {
    }

    /**
     * 
     * @param activePaths
     * @param strictMode
     * @param emitter
     * @param getters
     * @param wasPopulated
     */
    public $(boolean strictMode, Getters getters, boolean wasPopulated, ActivePaths activePaths, Emitter emitter) {
        super();
        this.strictMode = strictMode;
        this.getters = getters;
        this.wasPopulated = wasPopulated;
        this.activePaths = activePaths;
        this.emitter = emitter;
    }

    @JsonProperty("strictMode")
    public boolean isStrictMode() {
        return strictMode;
    }

    @JsonProperty("strictMode")
    public void setStrictMode(boolean strictMode) {
        this.strictMode = strictMode;
    }

    public $ withStrictMode(boolean strictMode) {
        this.strictMode = strictMode;
        return this;
    }

    @JsonProperty("getters")
    public Getters getGetters() {
        return getters;
    }

    @JsonProperty("getters")
    public void setGetters(Getters getters) {
        this.getters = getters;
    }

    public $ withGetters(Getters getters) {
        this.getters = getters;
        return this;
    }

    @JsonProperty("wasPopulated")
    public boolean isWasPopulated() {
        return wasPopulated;
    }

    @JsonProperty("wasPopulated")
    public void setWasPopulated(boolean wasPopulated) {
        this.wasPopulated = wasPopulated;
    }

    public $ withWasPopulated(boolean wasPopulated) {
        this.wasPopulated = wasPopulated;
        return this;
    }

    @JsonProperty("activePaths")
    public ActivePaths getActivePaths() {
        return activePaths;
    }

    @JsonProperty("activePaths")
    public void setActivePaths(ActivePaths activePaths) {
        this.activePaths = activePaths;
    }

    public $ withActivePaths(ActivePaths activePaths) {
        this.activePaths = activePaths;
        return this;
    }

    @JsonProperty("emitter")
    public Emitter getEmitter() {
        return emitter;
    }

    @JsonProperty("emitter")
    public void setEmitter(Emitter emitter) {
        this.emitter = emitter;
    }

    public $ withEmitter(Emitter emitter) {
        this.emitter = emitter;
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

    public $ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(strictMode).append(getters).append(wasPopulated).append(activePaths).append(emitter).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof $) == false) {
            return false;
        }
        $ rhs = (($) other);
        return new EqualsBuilder().append(strictMode, rhs.strictMode).append(getters, rhs.getters).append(wasPopulated, rhs.wasPopulated).append(activePaths, rhs.activePaths).append(emitter, rhs.emitter).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
