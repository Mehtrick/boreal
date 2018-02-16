
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "assigned_to", "assigned_to_extra_info", "blocked_note", "blocked_note_html", "comment",
		"created_date", "description", "description_html", "external_reference", "finished_date",
		"generated_user_stories", "id", "is_blocked", "is_closed", "is_voter", "is_watcher", "milestone",
		"modified_date", "neighbors", "owner", "owner_extra_info", "priority", "project", "project_extra_info", "ref",
		"severity", "status", "status_extra_info", "subject", "tags", "total_voters", "total_watchers", "type",
		"version", "watchers" })
public class IssueDetail implements Serializable {

	@JsonProperty("assigned_to")
	public Integer assignedTo;
	@JsonProperty("assigned_to_extra_info")
	public AssignedToExtraInfo assignedToExtraInfo;
	@JsonProperty("blocked_note")
	public String blockedNote;
	@JsonProperty("blocked_note_html")
	public String blockedNoteHtml;
	@JsonProperty("comment")
	public String comment;
	@JsonProperty("created_date")
	public String createdDate;
	@JsonProperty("description")
	public String description;
	@JsonProperty("description_html")
	public String descriptionHtml;
	@JsonProperty("external_reference")
	public Object externalReference;
	@JsonProperty("finished_date")
	public Object finishedDate;
	@JsonProperty("generated_user_stories")
	public Object generatedUserStories;
	@JsonProperty("id")
	public Integer id;
	@JsonProperty("is_blocked")
	public Boolean isBlocked;
	@JsonProperty("is_closed")
	public Boolean isClosed;
	@JsonProperty("is_voter")
	public Boolean isVoter;
	@JsonProperty("is_watcher")
	public Boolean isWatcher;
	@JsonProperty("milestone")
	public Object milestone;
	@JsonProperty("modified_date")
	public String modifiedDate;
	@JsonProperty("neighbors")
	public Neighbors neighbors;
	@JsonProperty("owner")
	public Integer owner;
	@JsonProperty("owner_extra_info")
	public OwnerExtraInfo ownerExtraInfo;
	@JsonProperty("priority")
	public Integer priority;
	@JsonProperty("project")
	public Integer project;
	@JsonProperty("project_extra_info")
	public ProjectExtraInfo projectExtraInfo;
	@JsonProperty("ref")
	public Integer ref;
	@JsonProperty("severity")
	public Integer severity;
	@JsonProperty("status")
	public Integer status;
	@JsonProperty("status_extra_info")
	public StatusExtraInfo statusExtraInfo;
	@JsonProperty("subject")
	public String subject;
	@JsonProperty("tags")
	public List<List<String>> tags = null;
	@JsonProperty("total_voters")
	public Integer totalVoters;
	@JsonProperty("total_watchers")
	public Integer totalWatchers;
	@JsonProperty("type")
	public Integer type;
	@JsonProperty("version")
	public Integer version;
	@JsonProperty("watchers")
	public List<Integer> watchers = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -7680467559548881688L;

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
