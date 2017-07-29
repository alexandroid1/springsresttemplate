
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
    "success",
    "publicKey",
    "stream"
})
public class Weather {

    @JsonProperty("success")
    private boolean success;
    @JsonProperty("publicKey")
    private String publicKey;
    @JsonProperty("stream")
    private Stream stream;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Weather() {
    }

    /**
     * 
     * @param publicKey
     * @param stream
     * @param success
     */
    public Weather(boolean success, String publicKey, Stream stream) {
        super();
        this.success = success;
        this.publicKey = publicKey;
        this.stream = stream;
    }

    @JsonProperty("success")
    public boolean isSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Weather withSuccess(boolean success) {
        this.success = success;
        return this;
    }

    @JsonProperty("publicKey")
    public String getPublicKey() {
        return publicKey;
    }

    @JsonProperty("publicKey")
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public Weather withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    @JsonProperty("stream")
    public Stream getStream() {
        return stream;
    }

    @JsonProperty("stream")
    public void setStream(Stream stream) {
        this.stream = stream;
    }

    public Weather withStream(Stream stream) {
        this.stream = stream;
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

    public Weather withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(success).append(publicKey).append(stream).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Weather) == false) {
            return false;
        }
        Weather rhs = ((Weather) other);
        return new EqualsBuilder().append(success, rhs.success).append(publicKey, rhs.publicKey).append(stream, rhs.stream).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
