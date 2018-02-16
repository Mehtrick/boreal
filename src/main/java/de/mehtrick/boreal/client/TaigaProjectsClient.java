package de.mehtrick.boreal.client;

import org.springframework.stereotype.Service;

import de.mehtrick.boreal.model.projects.ProjectDetails;

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
				.getForEntity(taigaconfig.getURLWithBasePath() + endpoint + "?slug=" + slug, ProjectDetails.class)
				.getBody();
	}
}
