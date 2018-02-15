package de.mehtrick.boreal.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.mehtrick.boreal.config.TaigaConfiguration;
import de.mehtrick.boreal.model.issues.IssueDetail;
import de.mehtrick.boreal.model.issues.IssueRequest;

@Service
public class TaigaIssuesClient extends AbstractAuthClient {

	private String endpoint = "/issues";

	@Autowired
	TaigaConfiguration taigaconfig;

	public IssueDetail createIssue(IssueRequest issue) {
		issue.setProject(taigaconfig.getProjectid());
		return resttemplate.postForEntity(taigaconfig.getURLWithBasePath() + endpoint, issue, IssueDetail.class)
				.getBody();

	}
}
