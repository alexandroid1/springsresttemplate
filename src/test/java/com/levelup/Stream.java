
package com.levelup;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

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
    private Root Root;
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
     * @param Root
     * @param isNew
     * @param doc
     * @param posts
     * @param pres
     */
    public Stream(Posts posts, Pres pres, Doc doc, boolean isNew, Root Root) {
        super();
        this.posts = posts;
        this.pres = pres;
        this.doc = doc;
        this.isNew = isNew;
        this.Root = Root;
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
    public Root getRoot() {
        return Root;
    }

    @JsonProperty("$__")
    public void setRoot(Root root) {
        this.Root = root;
    }

    public Stream with$(Root Root) {
        this.Root = Root;
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
        return new HashCodeBuilder().append(posts).append(pres).append(doc).append(isNew).append(Root).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(posts, rhs.posts).append(pres, rhs.pres).append(doc, rhs.doc).append(isNew, rhs.isNew).append(Root, rhs.Root).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
