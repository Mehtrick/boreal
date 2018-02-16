
package de.mehtrick.boreal.model.projects;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "big_photo",
    "full_name_display",
    "gravatar_id",
    "id",
    "is_active",
    "photo",
    "username"
})
public class Owner {

    @JsonProperty("big_photo")
    private Object bigPhoto;
    @JsonProperty("full_name_display")
    private String fullNameDisplay;
    @JsonProperty("gravatar_id")
    private String gravatarId;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("is_active")
    private Boolean isActive;
    @JsonProperty("photo")
    private Object photo;
    @JsonProperty("username")
    private String username;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("big_photo")
    public Object getBigPhoto() {
        return bigPhoto;
    }

    @JsonProperty("big_photo")
    public void setBigPhoto(Object bigPhoto) {
        this.bigPhoto = bigPhoto;
    }

    @JsonProperty("full_name_display")
    public String getFullNameDisplay() {
        return fullNameDisplay;
    }

    @JsonProperty("full_name_display")
    public void setFullNameDisplay(String fullNameDisplay) {
        this.fullNameDisplay = fullNameDisplay;
    }

    @JsonProperty("gravatar_id")
    public String getGravatarId() {
        return gravatarId;
    }

    @JsonProperty("gravatar_id")
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("is_active")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("photo")
    public Object getPhoto() {
        return photo;
    }

    @JsonProperty("photo")
    public void setPhoto(Object photo) {
        this.photo = photo;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
