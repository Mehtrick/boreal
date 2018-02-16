package de.mehtrick.boreal.client;

import org.springframework.stereotype.Service;

import de.mehtrick.boreal.model.issues.IssueDetail;
import de.mehtrick.boreal.model.issues.IssueRequest;

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
