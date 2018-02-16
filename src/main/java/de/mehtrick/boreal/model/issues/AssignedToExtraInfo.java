
package de.mehtrick.boreal.model.issues;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "big_photo", "full_name_display", "gravatar_id", "id", "is_active", "photo", "username" })
public class AssignedToExtraInfo implements Serializable {

	@JsonProperty("big_photo")
	public Object bigPhoto;
	@JsonProperty("full_name_display")
	public String fullNameDisplay;
	@JsonProperty("gravatar_id")
	public String gravatarId;
	@JsonProperty("id")
	public Integer id;
	@JsonProperty("is_active")
	public Boolean isActive;
	@JsonProperty("photo")
	public Object photo;
	@JsonProperty("username")
	public String username;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 930987858137940815L;

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
