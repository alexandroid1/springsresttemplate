
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
    "_posts",
    "_pres",
    "_doc",
    "isNew",
    "$__"
})
public class Stream {

    @JsonProperty("_posts")
    private Posts posts;
    @JsonProperty("_pres")
    private Pres pres;
    @JsonProperty("_doc")
    private Doc doc;
    @JsonProperty("isNew")
    private boolean isNew;
    @JsonProperty("$__")
    private com.levelup.$ $;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Stream() {
    }

    /**
     * 
     * @param $
     * @param isNew
     * @param doc
     * @param posts
     * @param pres
     */
    public Stream(Posts posts, Pres pres, Doc doc, boolean isNew, com.levelup.$ $) {
        super();
        this.posts = posts;
        this.pres = pres;
        this.doc = doc;
        this.isNew = isNew;
        this.$ = $;
    }

    @JsonProperty("_posts")
    public Posts getPosts() {
        return posts;
    }

    @JsonProperty("_posts")
    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public Stream withPosts(Posts posts) {
        this.posts = posts;
        return this;
    }

    @JsonProperty("_pres")
    public Pres getPres() {
        return pres;
    }

    @JsonProperty("_pres")
    public void setPres(Pres pres) {
        this.pres = pres;
    }

    public Stream withPres(Pres pres) {
        this.pres = pres;
        return this;
    }

    @JsonProperty("_doc")
    public Doc getDoc() {
        return doc;
    }

    @JsonProperty("_doc")
    public void setDoc(Doc doc) {
        this.doc = doc;
    }

    public Stream withDoc(Doc doc) {
        this.doc = doc;
        return this;
    }

    @JsonProperty("isNew")
    public boolean isIsNew() {
        return isNew;
    }

    @JsonProperty("isNew")
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public Stream withIsNew(boolean isNew) {
        this.isNew = isNew;
        return this;
    }

    @JsonProperty("$__")
    public com.levelup.$ get$() {
        return $;
    }

    @JsonProperty("$__")
    public void set$(com.levelup.$ $) {
        this.$ = $;
    }

    public Stream with$(com.levelup.$ $) {
        this.$ = $;
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

    public Stream withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(posts).append(pres).append(doc).append(isNew).append($).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stream) == false) {
            return false;
        }
        Stream rhs = ((Stream) other);
        return new EqualsBuilder().append(posts, rhs.posts).append(pres, rhs.pres).append(doc, rhs.doc).append(isNew, rhs.isNew).append($, rhs.$).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
