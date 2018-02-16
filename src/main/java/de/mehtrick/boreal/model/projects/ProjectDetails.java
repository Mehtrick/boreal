
package de.mehtrick.boreal.model.projects;

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
@JsonPropertyOrder({
    "anon_permissions",
    "blocked_code",
    "created_date",
    "creation_template",
    "default_epic_status",
    "default_issue_status",
    "default_issue_type",
    "default_points",
    "default_priority",
    "default_severity",
    "default_task_status",
    "default_us_status",
    "description",
    "epic_custom_attributes",
    "epic_statuses",
    "epics_csv_uuid",
    "i_am_admin",
    "i_am_member",
    "i_am_owner",
    "id",
    "is_backlog_activated",
    "is_contact_activated",
    "is_epics_activated",
    "is_fan",
    "is_featured",
    "is_issues_activated",
    "is_kanban_activated",
    "is_looking_for_people",
    "is_out_of_owner_limits",
    "is_private",
    "is_private_extra_info",
    "is_watcher",
    "is_wiki_activated",
    "issue_custom_attributes",
    "issue_statuses",
    "issue_types",
    "issues_csv_uuid",
    "logo_big_url",
    "logo_small_url",
    "looking_for_people_note",
    "max_memberships",
    "members",
    "milestones",
    "modified_date",
    "my_permissions",
    "name",
    "notify_level",
    "owner",
    "points",
    "priorities",
    "public_permissions",
    "roles",
    "severities",
    "slug",
    "tags",
    "tags_colors",
    "task_custom_attributes",
    "task_statuses",
    "tasks_csv_uuid",
    "total_activity",
    "total_activity_last_month",
    "total_activity_last_week",
    "total_activity_last_year",
    "total_closed_milestones",
    "total_fans",
    "total_fans_last_month",
    "total_fans_last_week",
    "total_fans_last_year",
    "total_memberships",
    "total_milestones",
    "total_story_points",
    "total_watchers",
    "totals_updated_datetime",
    "transfer_token",
    "us_statuses",
    "userstories_csv_uuid",
    "userstory_custom_attributes",
    "videoconferences",
    "videoconferences_extra_data"
})
public class ProjectDetails {

    @JsonProperty("anon_permissions")
    private List<Object> anonPermissions = null;
    @JsonProperty("blocked_code")
    private Object blockedCode;
    @JsonProperty("created_date")
    private String createdDate;
    @JsonProperty("creation_template")
    private Object creationTemplate;
    @JsonProperty("default_epic_status")
    private Object defaultEpicStatus;
    @JsonProperty("default_issue_status")
    private Object defaultIssueStatus;
    @JsonProperty("default_issue_type")
    private Object defaultIssueType;
    @JsonProperty("default_points")
    private Object defaultPoints;
    @JsonProperty("default_priority")
    private Object defaultPriority;
    @JsonProperty("default_severity")
    private Object defaultSeverity;
    @JsonProperty("default_task_status")
    private Object defaultTaskStatus;
    @JsonProperty("default_us_status")
    private Object defaultUsStatus;
    @JsonProperty("description")
    private String description;
    @JsonProperty("epic_custom_attributes")
    private List<EpicCustomAttribute> epicCustomAttributes = null;
    @JsonProperty("epic_statuses")
    private List<EpicStatus> epicStatuses = null;
    @JsonProperty("epics_csv_uuid")
    private Object epicsCsvUuid;
    @JsonProperty("i_am_admin")
    private Boolean iAmAdmin;
    @JsonProperty("i_am_member")
    private Boolean iAmMember;
    @JsonProperty("i_am_owner")
    private Boolean iAmOwner;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("is_backlog_activated")
    private Boolean isBacklogActivated;
    @JsonProperty("is_contact_activated")
    private Boolean isContactActivated;
    @JsonProperty("is_epics_activated")
    private Boolean isEpicsActivated;
    @JsonProperty("is_fan")
    private Boolean isFan;
    @JsonProperty("is_featured")
    private Boolean isFeatured;
    @JsonProperty("is_issues_activated")
    private Boolean isIssuesActivated;
    @JsonProperty("is_kanban_activated")
    private Boolean isKanbanActivated;
    @JsonProperty("is_looking_for_people")
    private Boolean isLookingForPeople;
    @JsonProperty("is_out_of_owner_limits")
    private Boolean isOutOfOwnerLimits;
    @JsonProperty("is_private")
    private Boolean isPrivate;
    @JsonProperty("is_private_extra_info")
    private IsPrivateExtraInfo isPrivateExtraInfo;
    @JsonProperty("is_watcher")
    private Boolean isWatcher;
    @JsonProperty("is_wiki_activated")
    private Boolean isWikiActivated;
    @JsonProperty("issue_custom_attributes")
    private List<IssueCustomAttribute> issueCustomAttributes = null;
    @JsonProperty("issue_statuses")
    private List<IssueStatus> issueStatuses = null;
    @JsonProperty("issue_types")
    private List<IssueType> issueTypes = null;
    @JsonProperty("issues_csv_uuid")
    private Object issuesCsvUuid;
    @JsonProperty("logo_big_url")
    private String logoBigUrl;
    @JsonProperty("logo_small_url")
    private String logoSmallUrl;
    @JsonProperty("looking_for_people_note")
    private String lookingForPeopleNote;
    @JsonProperty("max_memberships")
    private Object maxMemberships;
    @JsonProperty("members")
    private List<Member> members = null;
    @JsonProperty("milestones")
    private List<Milestone> milestones = null;
    @JsonProperty("modified_date")
    private String modifiedDate;
    @JsonProperty("my_permissions")
    private List<String> myPermissions = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("notify_level")
    private Integer notifyLevel;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("points")
    private List<Point> points = null;
    @JsonProperty("priorities")
    private List<Priority> priorities = null;
    @JsonProperty("public_permissions")
    private List<Object> publicPermissions = null;
    @JsonProperty("roles")
    private List<Role> roles = null;
    @JsonProperty("severities")
    private List<Severity> severities = null;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("tags_colors")
    private TagsColors tagsColors;
    @JsonProperty("task_custom_attributes")
    private List<TaskCustomAttribute> taskCustomAttributes = null;
    @JsonProperty("task_statuses")
    private List<TaskStatus> taskStatuses = null;
    @JsonProperty("tasks_csv_uuid")
    private Object tasksCsvUuid;
    @JsonProperty("total_activity")
    private Integer totalActivity;
    @JsonProperty("total_activity_last_month")
    private Integer totalActivityLastMonth;
    @JsonProperty("total_activity_last_week")
    private Integer totalActivityLastWeek;
    @JsonProperty("total_activity_last_year")
    private Integer totalActivityLastYear;
    @JsonProperty("total_closed_milestones")
    private Integer totalClosedMilestones;
    @JsonProperty("total_fans")
    private Integer totalFans;
    @JsonProperty("total_fans_last_month")
    private Integer totalFansLastMonth;
    @JsonProperty("total_fans_last_week")
    private Integer totalFansLastWeek;
    @JsonProperty("total_fans_last_year")
    private Integer totalFansLastYear;
    @JsonProperty("total_memberships")
    private Integer totalMemberships;
    @JsonProperty("total_milestones")
    private Integer totalMilestones;
    @JsonProperty("total_story_points")
    private Double totalStoryPoints;
    @JsonProperty("total_watchers")
    private Integer totalWatchers;
    @JsonProperty("totals_updated_datetime")
    private String totalsUpdatedDatetime;
    @JsonProperty("transfer_token")
    private String transferToken;
    @JsonProperty("us_statuses")
    private List<UsStatus> usStatuses = null;
    @JsonProperty("userstories_csv_uuid")
    private Object userstoriesCsvUuid;
    @JsonProperty("userstory_custom_attributes")
    private List<UserstoryCustomAttribute> userstoryCustomAttributes = null;
    @JsonProperty("videoconferences")
    private Object videoconferences;
    @JsonProperty("videoconferences_extra_data")
    private Object videoconferencesExtraData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("anon_permissions")
    public List<Object> getAnonPermissions() {
        return anonPermissions;
    }

    @JsonProperty("anon_permissions")
    public void setAnonPermissions(List<Object> anonPermissions) {
        this.anonPermissions = anonPermissions;
    }

    @JsonProperty("blocked_code")
    public Object getBlockedCode() {
        return blockedCode;
    }

    @JsonProperty("blocked_code")
    public void setBlockedCode(Object blockedCode) {
        this.blockedCode = blockedCode;
    }

    @JsonProperty("created_date")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("created_date")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("creation_template")
    public Object getCreationTemplate() {
        return creationTemplate;
    }

    @JsonProperty("creation_template")
    public void setCreationTemplate(Object creationTemplate) {
        this.creationTemplate = creationTemplate;
    }

    @JsonProperty("default_epic_status")
    public Object getDefaultEpicStatus() {
        return defaultEpicStatus;
    }

    @JsonProperty("default_epic_status")
    public void setDefaultEpicStatus(Object defaultEpicStatus) {
        this.defaultEpicStatus = defaultEpicStatus;
    }

    @JsonProperty("default_issue_status")
    public Object getDefaultIssueStatus() {
        return defaultIssueStatus;
    }

    @JsonProperty("default_issue_status")
    public void setDefaultIssueStatus(Object defaultIssueStatus) {
        this.defaultIssueStatus = defaultIssueStatus;
    }

    @JsonProperty("default_issue_type")
    public Object getDefaultIssueType() {
        return defaultIssueType;
    }

    @JsonProperty("default_issue_type")
    public void setDefaultIssueType(Object defaultIssueType) {
        this.defaultIssueType = defaultIssueType;
    }

    @JsonProperty("default_points")
    public Object getDefaultPoints() {
        return defaultPoints;
    }

    @JsonProperty("default_points")
    public void setDefaultPoints(Object defaultPoints) {
        this.defaultPoints = defaultPoints;
    }

    @JsonProperty("default_priority")
    public Object getDefaultPriority() {
        return defaultPriority;
    }

    @JsonProperty("default_priority")
    public void setDefaultPriority(Object defaultPriority) {
        this.defaultPriority = defaultPriority;
    }

    @JsonProperty("default_severity")
    public Object getDefaultSeverity() {
        return defaultSeverity;
    }

    @JsonProperty("default_severity")
    public void setDefaultSeverity(Object defaultSeverity) {
        this.defaultSeverity = defaultSeverity;
    }

    @JsonProperty("default_task_status")
    public Object getDefaultTaskStatus() {
        return defaultTaskStatus;
    }

    @JsonProperty("default_task_status")
    public void setDefaultTaskStatus(Object defaultTaskStatus) {
        this.defaultTaskStatus = defaultTaskStatus;
    }

    @JsonProperty("default_us_status")
    public Object getDefaultUsStatus() {
        return defaultUsStatus;
    }

    @JsonProperty("default_us_status")
    public void setDefaultUsStatus(Object defaultUsStatus) {
        this.defaultUsStatus = defaultUsStatus;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("epic_custom_attributes")
    public List<EpicCustomAttribute> getEpicCustomAttributes() {
        return epicCustomAttributes;
    }

    @JsonProperty("epic_custom_attributes")
    public void setEpicCustomAttributes(List<EpicCustomAttribute> epicCustomAttributes) {
        this.epicCustomAttributes = epicCustomAttributes;
    }

    @JsonProperty("epic_statuses")
    public List<EpicStatus> getEpicStatuses() {
        return epicStatuses;
    }

    @JsonProperty("epic_statuses")
    public void setEpicStatuses(List<EpicStatus> epicStatuses) {
        this.epicStatuses = epicStatuses;
    }

    @JsonProperty("epics_csv_uuid")
    public Object getEpicsCsvUuid() {
        return epicsCsvUuid;
    }

    @JsonProperty("epics_csv_uuid")
    public void setEpicsCsvUuid(Object epicsCsvUuid) {
        this.epicsCsvUuid = epicsCsvUuid;
    }

    @JsonProperty("i_am_admin")
    public Boolean getIAmAdmin() {
        return iAmAdmin;
    }

    @JsonProperty("i_am_admin")
    public void setIAmAdmin(Boolean iAmAdmin) {
        this.iAmAdmin = iAmAdmin;
    }

    @JsonProperty("i_am_member")
    public Boolean getIAmMember() {
        return iAmMember;
    }

    @JsonProperty("i_am_member")
    public void setIAmMember(Boolean iAmMember) {
        this.iAmMember = iAmMember;
    }

    @JsonProperty("i_am_owner")
    public Boolean getIAmOwner() {
        return iAmOwner;
    }

    @JsonProperty("i_am_owner")
    public void setIAmOwner(Boolean iAmOwner) {
        this.iAmOwner = iAmOwner;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("is_backlog_activated")
    public Boolean getIsBacklogActivated() {
        return isBacklogActivated;
    }

    @JsonProperty("is_backlog_activated")
    public void setIsBacklogActivated(Boolean isBacklogActivated) {
        this.isBacklogActivated = isBacklogActivated;
    }

    @JsonProperty("is_contact_activated")
    public Boolean getIsContactActivated() {
        return isContactActivated;
    }

    @JsonProperty("is_contact_activated")
    public void setIsContactActivated(Boolean isContactActivated) {
        this.isContactActivated = isContactActivated;
    }

    @JsonProperty("is_epics_activated")
    public Boolean getIsEpicsActivated() {
        return isEpicsActivated;
    }

    @JsonProperty("is_epics_activated")
    public void setIsEpicsActivated(Boolean isEpicsActivated) {
        this.isEpicsActivated = isEpicsActivated;
    }

    @JsonProperty("is_fan")
    public Boolean getIsFan() {
        return isFan;
    }

    @JsonProperty("is_fan")
    public void setIsFan(Boolean isFan) {
        this.isFan = isFan;
    }

    @JsonProperty("is_featured")
    public Boolean getIsFeatured() {
        return isFeatured;
    }

    @JsonProperty("is_featured")
    public void setIsFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    @JsonProperty("is_issues_activated")
    public Boolean getIsIssuesActivated() {
        return isIssuesActivated;
    }

    @JsonProperty("is_issues_activated")
    public void setIsIssuesActivated(Boolean isIssuesActivated) {
        this.isIssuesActivated = isIssuesActivated;
    }

    @JsonProperty("is_kanban_activated")
    public Boolean getIsKanbanActivated() {
        return isKanbanActivated;
    }

    @JsonProperty("is_kanban_activated")
    public void setIsKanbanActivated(Boolean isKanbanActivated) {
        this.isKanbanActivated = isKanbanActivated;
    }

    @JsonProperty("is_looking_for_people")
    public Boolean getIsLookingForPeople() {
        return isLookingForPeople;
    }

    @JsonProperty("is_looking_for_people")
    public void setIsLookingForPeople(Boolean isLookingForPeople) {
        this.isLookingForPeople = isLookingForPeople;
    }

    @JsonProperty("is_out_of_owner_limits")
    public Boolean getIsOutOfOwnerLimits() {
        return isOutOfOwnerLimits;
    }

    @JsonProperty("is_out_of_owner_limits")
    public void setIsOutOfOwnerLimits(Boolean isOutOfOwnerLimits) {
        this.isOutOfOwnerLimits = isOutOfOwnerLimits;
    }

    @JsonProperty("is_private")
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    @JsonProperty("is_private")
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    @JsonProperty("is_private_extra_info")
    public IsPrivateExtraInfo getIsPrivateExtraInfo() {
        return isPrivateExtraInfo;
    }

    @JsonProperty("is_private_extra_info")
    public void setIsPrivateExtraInfo(IsPrivateExtraInfo isPrivateExtraInfo) {
        this.isPrivateExtraInfo = isPrivateExtraInfo;
    }

    @JsonProperty("is_watcher")
    public Boolean getIsWatcher() {
        return isWatcher;
    }

    @JsonProperty("is_watcher")
    public void setIsWatcher(Boolean isWatcher) {
        this.isWatcher = isWatcher;
    }

    @JsonProperty("is_wiki_activated")
    public Boolean getIsWikiActivated() {
        return isWikiActivated;
    }

    @JsonProperty("is_wiki_activated")
    public void setIsWikiActivated(Boolean isWikiActivated) {
        this.isWikiActivated = isWikiActivated;
    }

    @JsonProperty("issue_custom_attributes")
    public List<IssueCustomAttribute> getIssueCustomAttributes() {
        return issueCustomAttributes;
    }

    @JsonProperty("issue_custom_attributes")
    public void setIssueCustomAttributes(List<IssueCustomAttribute> issueCustomAttributes) {
        this.issueCustomAttributes = issueCustomAttributes;
    }

    @JsonProperty("issue_statuses")
    public List<IssueStatus> getIssueStatuses() {
        return issueStatuses;
    }

    @JsonProperty("issue_statuses")
    public void setIssueStatuses(List<IssueStatus> issueStatuses) {
        this.issueStatuses = issueStatuses;
    }

    @JsonProperty("issue_types")
    public List<IssueType> getIssueTypes() {
        return issueTypes;
    }

    @JsonProperty("issue_types")
    public void setIssueTypes(List<IssueType> issueTypes) {
        this.issueTypes = issueTypes;
    }

    @JsonProperty("issues_csv_uuid")
    public Object getIssuesCsvUuid() {
        return issuesCsvUuid;
    }

    @JsonProperty("issues_csv_uuid")
    public void setIssuesCsvUuid(Object issuesCsvUuid) {
        this.issuesCsvUuid = issuesCsvUuid;
    }

    @JsonProperty("logo_big_url")
    public String getLogoBigUrl() {
        return logoBigUrl;
    }

    @JsonProperty("logo_big_url")
    public void setLogoBigUrl(String logoBigUrl) {
        this.logoBigUrl = logoBigUrl;
    }

    @JsonProperty("logo_small_url")
    public String getLogoSmallUrl() {
        return logoSmallUrl;
    }

    @JsonProperty("logo_small_url")
    public void setLogoSmallUrl(String logoSmallUrl) {
        this.logoSmallUrl = logoSmallUrl;
    }

    @JsonProperty("looking_for_people_note")
    public String getLookingForPeopleNote() {
        return lookingForPeopleNote;
    }

    @JsonProperty("looking_for_people_note")
    public void setLookingForPeopleNote(String lookingForPeopleNote) {
        this.lookingForPeopleNote = lookingForPeopleNote;
    }

    @JsonProperty("max_memberships")
    public Object getMaxMemberships() {
        return maxMemberships;
    }

    @JsonProperty("max_memberships")
    public void setMaxMemberships(Object maxMemberships) {
        this.maxMemberships = maxMemberships;
    }

    @JsonProperty("members")
    public List<Member> getMembers() {
        return members;
    }

    @JsonProperty("members")
    public void setMembers(List<Member> members) {
        this.members = members;
    }

    @JsonProperty("milestones")
    public List<Milestone> getMilestones() {
        return milestones;
    }

    @JsonProperty("milestones")
    public void setMilestones(List<Milestone> milestones) {
        this.milestones = milestones;
    }

    @JsonProperty("modified_date")
    public String getModifiedDate() {
        return modifiedDate;
    }

    @JsonProperty("modified_date")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @JsonProperty("my_permissions")
    public List<String> getMyPermissions() {
        return myPermissions;
    }

    @JsonProperty("my_permissions")
    public void setMyPermissions(List<String> myPermissions) {
        this.myPermissions = myPermissions;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("notify_level")
    public Integer getNotifyLevel() {
        return notifyLevel;
    }

    @JsonProperty("notify_level")
    public void setNotifyLevel(Integer notifyLevel) {
        this.notifyLevel = notifyLevel;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @JsonProperty("points")
    public List<Point> getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @JsonProperty("priorities")
    public List<Priority> getPriorities() {
        return priorities;
    }

    @JsonProperty("priorities")
    public void setPriorities(List<Priority> priorities) {
        this.priorities = priorities;
    }

    @JsonProperty("public_permissions")
    public List<Object> getPublicPermissions() {
        return publicPermissions;
    }

    @JsonProperty("public_permissions")
    public void setPublicPermissions(List<Object> publicPermissions) {
        this.publicPermissions = publicPermissions;
    }

    @JsonProperty("roles")
    public List<Role> getRoles() {
        return roles;
    }

    @JsonProperty("roles")
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @JsonProperty("severities")
    public List<Severity> getSeverities() {
        return severities;
    }

    @JsonProperty("severities")
    public void setSeverities(List<Severity> severities) {
        this.severities = severities;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("tags_colors")
    public TagsColors getTagsColors() {
        return tagsColors;
    }

    @JsonProperty("tags_colors")
    public void setTagsColors(TagsColors tagsColors) {
        this.tagsColors = tagsColors;
    }

    @JsonProperty("task_custom_attributes")
    public List<TaskCustomAttribute> getTaskCustomAttributes() {
        return taskCustomAttributes;
    }

    @JsonProperty("task_custom_attributes")
    public void setTaskCustomAttributes(List<TaskCustomAttribute> taskCustomAttributes) {
        this.taskCustomAttributes = taskCustomAttributes;
    }

    @JsonProperty("task_statuses")
    public List<TaskStatus> getTaskStatuses() {
        return taskStatuses;
    }

    @JsonProperty("task_statuses")
    public void setTaskStatuses(List<TaskStatus> taskStatuses) {
        this.taskStatuses = taskStatuses;
    }

    @JsonProperty("tasks_csv_uuid")
    public Object getTasksCsvUuid() {
        return tasksCsvUuid;
    }

    @JsonProperty("tasks_csv_uuid")
    public void setTasksCsvUuid(Object tasksCsvUuid) {
        this.tasksCsvUuid = tasksCsvUuid;
    }

    @JsonProperty("total_activity")
    public Integer getTotalActivity() {
        return totalActivity;
    }

    @JsonProperty("total_activity")
    public void setTotalActivity(Integer totalActivity) {
        this.totalActivity = totalActivity;
    }

    @JsonProperty("total_activity_last_month")
    public Integer getTotalActivityLastMonth() {
        return totalActivityLastMonth;
    }

    @JsonProperty("total_activity_last_month")
    public void setTotalActivityLastMonth(Integer totalActivityLastMonth) {
        this.totalActivityLastMonth = totalActivityLastMonth;
    }

    @JsonProperty("total_activity_last_week")
    public Integer getTotalActivityLastWeek() {
        return totalActivityLastWeek;
    }

    @JsonProperty("total_activity_last_week")
    public void setTotalActivityLastWeek(Integer totalActivityLastWeek) {
        this.totalActivityLastWeek = totalActivityLastWeek;
    }

    @JsonProperty("total_activity_last_year")
    public Integer getTotalActivityLastYear() {
        return totalActivityLastYear;
    }

    @JsonProperty("total_activity_last_year")
    public void setTotalActivityLastYear(Integer totalActivityLastYear) {
        this.totalActivityLastYear = totalActivityLastYear;
    }

    @JsonProperty("total_closed_milestones")
    public Integer getTotalClosedMilestones() {
        return totalClosedMilestones;
    }

    @JsonProperty("total_closed_milestones")
    public void setTotalClosedMilestones(Integer totalClosedMilestones) {
        this.totalClosedMilestones = totalClosedMilestones;
    }

    @JsonProperty("total_fans")
    public Integer getTotalFans() {
        return totalFans;
    }

    @JsonProperty("total_fans")
    public void setTotalFans(Integer totalFans) {
        this.totalFans = totalFans;
    }

    @JsonProperty("total_fans_last_month")
    public Integer getTotalFansLastMonth() {
        return totalFansLastMonth;
    }

    @JsonProperty("total_fans_last_month")
    public void setTotalFansLastMonth(Integer totalFansLastMonth) {
        this.totalFansLastMonth = totalFansLastMonth;
    }

    @JsonProperty("total_fans_last_week")
    public Integer getTotalFansLastWeek() {
        return totalFansLastWeek;
    }

    @JsonProperty("total_fans_last_week")
    public void setTotalFansLastWeek(Integer totalFansLastWeek) {
        this.totalFansLastWeek = totalFansLastWeek;
    }

    @JsonProperty("total_fans_last_year")
    public Integer getTotalFansLastYear() {
        return totalFansLastYear;
    }

    @JsonProperty("total_fans_last_year")
    public void setTotalFansLastYear(Integer totalFansLastYear) {
        this.totalFansLastYear = totalFansLastYear;
    }

    @JsonProperty("total_memberships")
    public Integer getTotalMemberships() {
        return totalMemberships;
    }

    @JsonProperty("total_memberships")
    public void setTotalMemberships(Integer totalMemberships) {
        this.totalMemberships = totalMemberships;
    }

    @JsonProperty("total_milestones")
    public Integer getTotalMilestones() {
        return totalMilestones;
    }

    @JsonProperty("total_milestones")
    public void setTotalMilestones(Integer totalMilestones) {
        this.totalMilestones = totalMilestones;
    }

    @JsonProperty("total_story_points")
    public Double getTotalStoryPoints() {
        return totalStoryPoints;
    }

    @JsonProperty("total_story_points")
    public void setTotalStoryPoints(Double totalStoryPoints) {
        this.totalStoryPoints = totalStoryPoints;
    }

    @JsonProperty("total_watchers")
    public Integer getTotalWatchers() {
        return totalWatchers;
    }

    @JsonProperty("total_watchers")
    public void setTotalWatchers(Integer totalWatchers) {
        this.totalWatchers = totalWatchers;
    }

    @JsonProperty("totals_updated_datetime")
    public String getTotalsUpdatedDatetime() {
        return totalsUpdatedDatetime;
    }

    @JsonProperty("totals_updated_datetime")
    public void setTotalsUpdatedDatetime(String totalsUpdatedDatetime) {
        this.totalsUpdatedDatetime = totalsUpdatedDatetime;
    }

    @JsonProperty("transfer_token")
    public String getTransferToken() {
        return transferToken;
    }

    @JsonProperty("transfer_token")
    public void setTransferToken(String transferToken) {
        this.transferToken = transferToken;
    }

    @JsonProperty("us_statuses")
    public List<UsStatus> getUsStatuses() {
        return usStatuses;
    }

    @JsonProperty("us_statuses")
    public void setUsStatuses(List<UsStatus> usStatuses) {
        this.usStatuses = usStatuses;
    }

    @JsonProperty("userstories_csv_uuid")
    public Object getUserstoriesCsvUuid() {
        return userstoriesCsvUuid;
    }

    @JsonProperty("userstories_csv_uuid")
    public void setUserstoriesCsvUuid(Object userstoriesCsvUuid) {
        this.userstoriesCsvUuid = userstoriesCsvUuid;
    }

    @JsonProperty("userstory_custom_attributes")
    public List<UserstoryCustomAttribute> getUserstoryCustomAttributes() {
        return userstoryCustomAttributes;
    }

    @JsonProperty("userstory_custom_attributes")
    public void setUserstoryCustomAttributes(List<UserstoryCustomAttribute> userstoryCustomAttributes) {
        this.userstoryCustomAttributes = userstoryCustomAttributes;
    }

    @JsonProperty("videoconferences")
    public Object getVideoconferences() {
        return videoconferences;
    }

    @JsonProperty("videoconferences")
    public void setVideoconferences(Object videoconferences) {
        this.videoconferences = videoconferences;
    }

    @JsonProperty("videoconferences_extra_data")
    public Object getVideoconferencesExtraData() {
        return videoconferencesExtraData;
    }

    @JsonProperty("videoconferences_extra_data")
    public void setVideoconferencesExtraData(Object videoconferencesExtraData) {
        this.videoconferencesExtraData = videoconferencesExtraData;
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
