package de.mehtrick.boreal.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import de.mehtrick.boreal.config.TaigaConfiguration;
import de.mehtrick.boreal.model.login.UserAuthenticationDetail;
import de.mehtrick.boreal.model.login.UserInfo;

@Service
public class TaigaAuthenticationClient {

	private String endpint = "/auth";

	@Autowired
	private TaigaConfiguration taiga;

	@Autowired
	private RestTemplate resttemplate;

	public UserAuthenticationDetail login(String username, String password) {
		UserInfo userInfo = UserInfo.builder().username(username).password(password).build();
		return resttemplate
				.postForEntity(taiga.getUrl() + taiga.getBasepath() + endpint, userInfo, UserAuthenticationDetail.class)
				.getBody();
	}

}
