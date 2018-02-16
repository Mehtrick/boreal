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
	private TaigaIssuesClient issueClient;

	@Test
	public void contextLoads() {
		IssueDetail createIssue = issueClient.createIssue(IssueRequest.builder().subject("Ich heiﬂe Marvin").build());
		 issueClient.createIssue(IssueRequest.builder().subject("Ich heiﬂe Marvin").build());

		System.out.println(createIssue.createdDate);
	}

}
