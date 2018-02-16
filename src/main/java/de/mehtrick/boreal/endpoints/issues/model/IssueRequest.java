
package de.mehtrick.boreal.endpoints.issues.model;

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
@JsonPropertyOrder({ "assigned_to", "blocked_note", "description", "is_blocked", "is_closed", "milestone", "priority",
		"project", "severity", "status", "subject", "tags", "type", "watchers" })
@Builder
@Data
public class IssueRequest implements Serializable {

	@JsonProperty("assigned_to")
	private Object assignedTo;
	@JsonProperty("blocked_note")
	private String blockedNote;
	@JsonProperty("description")
	private String description;
	@JsonProperty("is_blocked")
	private Boolean isBlocked;
	@JsonProperty("is_closed")
	private Boolean isClosed;
	@JsonProperty("milestone")
	private Object milestone;
	@JsonProperty("priority")
	private Integer priority;
	@JsonProperty("project")
	private Integer project;
	@JsonProperty("severity")
	private Integer severity;
	@JsonProperty("status")
	private Integer status;
	@JsonProperty("subject")
	private String subject;
	@JsonProperty("tags")
	@Builder.Default
	private List<String> tags = null;
	@JsonProperty("type")
	private Integer type;
	@JsonProperty("watchers")
	@Builder.Default
	private List<Object> watchers = null;
	@JsonIgnore
	@Builder.Default
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 7358790239376656957L;

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
