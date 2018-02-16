package de.mehtrick.boreal.endpoints.projects.client;

import org.springframework.stereotype.Service;

import de.mehtrick.boreal.endpoints.AbstractTaigaClient;
import de.mehtrick.boreal.endpoints.projects.model.ProjectDetails;

@Service
public class TaigaProjectsClient extends AbstractTaigaClient {

	private String endpoint = "/projects/by_slug";

	/**
	 * 
	 * Implementation of <a href=
	 * "https://taigaio.github.io/taiga-doc/dist/api.html#projects-get-by-slug">https://taigaio.github.io/taiga-doc/dist/api.html#projects-get-by-slug</a>
	 * 
	 * @see <a href=
	 *      "https://taigaio.github.io/taiga-doc/dist/api.html#projects-get-by-slug">https://taigaio.github.io/taiga-doc/dist/api.html#projects-get-by-slug</a>
	 * @param slug
	 * @return Details of the Project including the ProjectId
	 */
	public ProjectDetails getProjectDetailsBySlug(String slug) {
		return resttemplate
				.getForEntity(taigaconfig.getURL() + endpoint + "?slug=" + slug, ProjectDetails.class)
				.getBody();
	}
}
