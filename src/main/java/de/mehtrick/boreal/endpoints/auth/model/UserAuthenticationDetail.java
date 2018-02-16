package de.mehtrick.boreal.endpoints.auth.model;

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

import lombok.Builder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "auth_token", "big_photo", "bio", "color", "email", "full_name", "full_name_display",
		"gravatar_id", "id", "is_active", "lang", "max_memberships_private_projects", "max_memberships_public_projects",
		"max_private_projects", "max_public_projects", "photo", "roles", "theme", "timezone", "total_private_projects",
		"total_public_projects", "username" })
@Data
@Builder
public class UserAuthenticationDetail implements Serializable {

	@JsonProperty("auth_token")
	private String authToken;
	@JsonProperty("big_photo")
	private Object bigPhoto;
	@JsonProperty("bio")
	private String bio;
	@JsonProperty("color")
	private String color;
	@JsonProperty("email")
	private String email;
	@JsonProperty("full_name")
	private String fullName;
	@JsonProperty("full_name_display")
	private String fullNameDisplay;
	@JsonProperty("gravatar_id")
	private String gravatarId;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("is_active")
	private Boolean isActive;
	@JsonProperty("lang")
	private String lang;
	@JsonProperty("max_memberships_private_projects")
	private Object maxMembershipsPrivateProjects;
	@JsonProperty("max_memberships_public_projects")
	private Object maxMembershipsPublicProjects;
	@JsonProperty("max_private_projects")
	private Object maxPrivateProjects;
	@JsonProperty("max_public_projects")
	private Object maxPublicProjects;
	@JsonProperty("photo")
	private Object photo;
	@JsonProperty("roles")
	private List<String> roles = null;
	@JsonProperty("theme")
	private String theme;
	@JsonProperty("timezone")
	private String timezone;
	@JsonProperty("total_private_projects")
	private Integer totalPrivateProjects;
	@JsonProperty("total_public_projects")
	private Integer totalPublicProjects;
	@JsonProperty("username")
	private String username;
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
