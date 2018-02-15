package de.mehtrick.boreal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.mehtrick.boreal.client.TaigaAuthenticationClient;
import de.mehtrick.boreal.model.login.UserAuthenticationDetail;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BorealApplicationTests {

	@Autowired
	private TaigaAuthenticationClient authClient;

	@Test
	public void contextLoads() {
	}

}
