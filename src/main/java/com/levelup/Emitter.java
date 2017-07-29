
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
    "domain",
    "_events",
    "_maxListeners"
})
public class Emitter {

    @JsonProperty("domain")
    private Object domain;
    @JsonProperty("_events")
    private Events events;
    @JsonProperty("_maxListeners")
    private long maxListeners;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Emitter() {
    }

    /**
     * 
     * @param maxListeners
     * @param events
     * @param domain
     */
    public Emitter(Object domain, Events events, long maxListeners) {
        super();
        this.domain = domain;
        this.events = events;
        this.maxListeners = maxListeners;
    }

    @JsonProperty("domain")
    public Object getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(Object domain) {
        this.domain = domain;
    }

    public Emitter withDomain(Object domain) {
        this.domain = domain;
        return this;
    }

    @JsonProperty("_events")
    public Events getEvents() {
        return events;
    }

    @JsonProperty("_events")
    public void setEvents(Events events) {
        this.events = events;
    }

    public Emitter withEvents(Events events) {
        this.events = events;
        return this;
    }

    @JsonProperty("_maxListeners")
    public long getMaxListeners() {
        return maxListeners;
    }

    @JsonProperty("_maxListeners")
    public void setMaxListeners(long maxListeners) {
        this.maxListeners = maxListeners;
    }

    public Emitter withMaxListeners(long maxListeners) {
        this.maxListeners = maxListeners;
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

    public Emitter withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(domain).append(events).append(maxListeners).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Emitter) == false) {
            return false;
        }
        Emitter rhs = ((Emitter) other);
        return new EqualsBuilder().append(domain, rhs.domain).append(events, rhs.events).append(maxListeners, rhs.maxListeners).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
