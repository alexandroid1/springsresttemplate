
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
    "paths",
    "states",
    "stateNames"
})
public class ActivePaths {

    @JsonProperty("paths")
    private Paths paths;
    @JsonProperty("states")
    private States states;
    @JsonProperty("stateNames")
    private List<String> stateNames = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ActivePaths() {
    }

    /**
     * 
     * @param paths
     * @param states
     * @param stateNames
     */
    public ActivePaths(Paths paths, States states, List<String> stateNames) {
        super();
        this.paths = paths;
        this.states = states;
        this.stateNames = stateNames;
    }

    @JsonProperty("paths")
    public Paths getPaths() {
        return paths;
    }

    @JsonProperty("paths")
    public void setPaths(Paths paths) {
        this.paths = paths;
    }

    public ActivePaths withPaths(Paths paths) {
        this.paths = paths;
        return this;
    }

    @JsonProperty("states")
    public States getStates() {
        return states;
    }

    @JsonProperty("states")
    public void setStates(States states) {
        this.states = states;
    }

    public ActivePaths withStates(States states) {
        this.states = states;
        return this;
    }

    @JsonProperty("stateNames")
    public List<String> getStateNames() {
        return stateNames;
    }

    @JsonProperty("stateNames")
    public void setStateNames(List<String> stateNames) {
        this.stateNames = stateNames;
    }

    public ActivePaths withStateNames(List<String> stateNames) {
        this.stateNames = stateNames;
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

    public ActivePaths withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(paths).append(states).append(stateNames).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActivePaths) == false) {
            return false;
        }
        ActivePaths rhs = ((ActivePaths) other);
        return new EqualsBuilder().append(paths, rhs.paths).append(states, rhs.states).append(stateNames, rhs.stateNames).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
