package de.mehtrick.boreal.endpoints.issues.client;

import org.springframework.stereotype.Service;

import de.mehtrick.boreal.endpoints.AbstractTaigaClient;
import de.mehtrick.boreal.endpoints.issues.model.IssueDetail;
import de.mehtrick.boreal.endpoints.issues.model.IssueRequest;

@Service
public class TaigaIssuesClient extends AbstractTaigaClient {

	private String endpoint = "/issues";

	/**
	 * Implementation of <a href="https://taigaio.github.io/taiga-doc/dist/api.html#issues-create">https://taigaio.github.io/taiga-doc/dist/api.html#issues-create</a>
	 * @param issue
	 * @see <a href="https://taigaio.github.io/taiga-doc/dist/api.html#issues-create">https://taigaio.github.io/taiga-doc/dist/api.html#issues-create</a>
	 * @return Details of the newly created Issue
	 */
	public IssueDetail createIssue(IssueRequest issue) {
		issue.setProject(taigaconfig.getProjectid());
		return resttemplate.postForEntity(taigaconfig.getURLWithBasePath() + endpoint, issue, IssueDetail.class)
				.getBody();

	}
}
