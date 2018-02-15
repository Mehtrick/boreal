package de.mehtrick.boreal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.mehtrick.boreal.client.TaigaIssuesClient;
import de.mehtrick.boreal.model.issues.IssueDetail;
import de.mehtrick.boreal.model.issues.IssueRequest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BorealApplicationTests {

	@Autowired
	TaigaIssuesClient issueClient;

	@Test
	public void contextLoads() {
		IssueDetail createIssue = issueClient.createIssue(IssueRequest.builder().subject("test").build());
		System.out.println(createIssue.createdDate);
	}

}
