
package com.levelup;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strictMode",
    "getters",
    "wasPopulated",
    "activePaths",
    "emitter"
})
public class Root {

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
    public Root() {
    }

    /**
     * 
     * @param activePaths
     * @param strictMode
     * @param emitter
     * @param getters
     * @param wasPopulated
     */
    public Root(boolean strictMode, Getters getters, boolean wasPopulated, ActivePaths activePaths, Emitter emitter) {
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

    public Root withStrictMode(boolean strictMode) {
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

    public Root withGetters(Getters getters) {
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

    public Root withWasPopulated(boolean wasPopulated) {
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

    public Root withActivePaths(ActivePaths activePaths) {
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

    public Root withEmitter(Emitter emitter) {
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

    public Root withAdditionalProperty(String name, Object value) {
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
        if ((other instanceof Root) == false) {
            return false;
        }
        Root rhs = ((Root) other);
        return new EqualsBuilder().append(strictMode, rhs.strictMode).append(getters, rhs.getters).append(wasPopulated, rhs.wasPopulated).append(activePaths, rhs.activePaths).append(emitter, rhs.emitter).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
