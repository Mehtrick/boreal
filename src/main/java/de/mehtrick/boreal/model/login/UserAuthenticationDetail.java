package de.mehtrick.boreal.model.login;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "auth_token", "big_photo", "bio", "color", "email", "full_name", "full_name_display",
		"gravatar_id", "id", "is_active", "lang", "max_memberships_private_projects", "max_memberships_public_projects",
		"max_private_projects", "max_public_projects", "photo", "roles", "theme", "timezone", "total_private_projects",
		"total_public_projects", "username" })
public class UserAuthenticationDetail implements Serializable {

	@JsonProperty("auth_token")
	public String authToken;
	@JsonProperty("big_photo")
	public Object bigPhoto;
	@JsonProperty("bio")
	public String bio;
	@JsonProperty("color")
	public String color;
	@JsonProperty("email")
	public String email;
	@JsonProperty("full_name")
	public String fullName;
	@JsonProperty("full_name_display")
	public String fullNameDisplay;
	@JsonProperty("gravatar_id")
	public String gravatarId;
	@JsonProperty("id")
	public Integer id;
	@JsonProperty("is_active")
	public Boolean isActive;
	@JsonProperty("lang")
	public String lang;
	@JsonProperty("max_memberships_private_projects")
	public Object maxMembershipsPrivateProjects;
	@JsonProperty("max_memberships_public_projects")
	public Object maxMembershipsPublicProjects;
	@JsonProperty("max_private_projects")
	public Object maxPrivateProjects;
	@JsonProperty("max_public_projects")
	public Object maxPublicProjects;
	@JsonProperty("photo")
	public Object photo;
	@JsonProperty("roles")
	public List<String> roles = null;
	@JsonProperty("theme")
	public String theme;
	@JsonProperty("timezone")
	public String timezone;
	@JsonProperty("total_private_projects")
	public Integer totalPrivateProjects;
	@JsonProperty("total_public_projects")
	public Integer totalPublicProjects;
	@JsonProperty("username")
	public String username;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 5561564051504287965L;

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
