package de.mehtrick.boreal.config;

import javax.annotation.PostConstruct;
import javax.naming.ConfigurationException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import de.mehtrick.boreal.endpoints.projects.client.TaigaProjectsClient;
import de.mehtrick.boreal.endpoints.projects.model.ProjectDetails;
import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "taiga")
@Data
public class TaigaConfiguration {

	@Autowired
	TaigaProjectsClient projectsClient;

	private String url = "https://api.taiga.io";

	private String basepath = "/api/v1";

	private String username;

	private String password;

	private Integer projectid;

	/**
	 * Used for getting the projectid
	 */
	private String projectslug;

	public String getURLWithBasePath() {
		return url + basepath;
	}

	/**
	 * Returns the Projectid. If the id is not configured it will be searched by
	 * slug.
	 * 
	 * @return ProjectId
	 */
	public Integer getProjectid() {
		if (projectid == null) {
			ProjectDetails projectDetails = projectsClient.getProjectDetailsBySlug(getProjectslug());
			projectid = projectDetails.getId();
		}
		return projectid;
	}

	@PostConstruct
	private void checkProjectConfig() throws ConfigurationException {
		if (StringUtils.isBlank(projectslug) && projectid == null) {
			throw new ConfigurationException(
					"Projectid and Projectslug are empty. Please configure one of them in your application.yml");
		}
	}

}
