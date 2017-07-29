
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
    "ignore",
    "default",
    "init",
    "modify",
    "require"
})
public class States {

    @JsonProperty("ignore")
    private Ignore ignore;
    @JsonProperty("default")
    private Default _default;
    @JsonProperty("init")
    private Init init;
    @JsonProperty("modify")
    private Modify modify;
    @JsonProperty("require")
    private Require require;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public States() {
    }

    /**
     * 
     * @param _default
     * @param modify
     * @param init
     * @param require
     * @param ignore
     */
    public States(Ignore ignore, Default _default, Init init, Modify modify, Require require) {
        super();
        this.ignore = ignore;
        this._default = _default;
        this.init = init;
        this.modify = modify;
        this.require = require;
    }

    @JsonProperty("ignore")
    public Ignore getIgnore() {
        return ignore;
    }

    @JsonProperty("ignore")
    public void setIgnore(Ignore ignore) {
        this.ignore = ignore;
    }

    public States withIgnore(Ignore ignore) {
        this.ignore = ignore;
        return this;
    }

    @JsonProperty("default")
    public Default getDefault() {
        return _default;
    }

    @JsonProperty("default")
    public void setDefault(Default _default) {
        this._default = _default;
    }

    public States withDefault(Default _default) {
        this._default = _default;
        return this;
    }

    @JsonProperty("init")
    public Init getInit() {
        return init;
    }

    @JsonProperty("init")
    public void setInit(Init init) {
        this.init = init;
    }

    public States withInit(Init init) {
        this.init = init;
        return this;
    }

    @JsonProperty("modify")
    public Modify getModify() {
        return modify;
    }

    @JsonProperty("modify")
    public void setModify(Modify modify) {
        this.modify = modify;
    }

    public States withModify(Modify modify) {
        this.modify = modify;
        return this;
    }

    @JsonProperty("require")
    public Require getRequire() {
        return require;
    }

    @JsonProperty("require")
    public void setRequire(Require require) {
        this.require = require;
    }

    public States withRequire(Require require) {
        this.require = require;
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

    public States withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ignore).append(_default).append(init).append(modify).append(require).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof States) == false) {
            return false;
        }
        States rhs = ((States) other);
        return new EqualsBuilder().append(ignore, rhs.ignore).append(_default, rhs._default).append(init, rhs.init).append(modify, rhs.modify).append(require, rhs.require).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
