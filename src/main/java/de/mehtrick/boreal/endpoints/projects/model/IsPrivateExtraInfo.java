
package de.mehtrick.boreal.endpoints.projects.model;

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
    "can_be_updated",
    "reason"
})
public class IsPrivateExtraInfo {

    @JsonProperty("can_be_updated")
    private Boolean canBeUpdated;
    @JsonProperty("reason")
    private Object reason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("can_be_updated")
    public Boolean getCanBeUpdated() {
        return canBeUpdated;
    }

    @JsonProperty("can_be_updated")
    public void setCanBeUpdated(Boolean canBeUpdated) {
        this.canBeUpdated = canBeUpdated;
    }

    @JsonProperty("reason")
    public Object getReason() {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(Object reason) {
        this.reason = reason;
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
