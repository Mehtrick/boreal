
package de.mehtrick.boreal.client;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import de.mehtrick.boreal.config.TaigaConfiguration;
import de.mehtrick.boreal.config.interceptor.LoggingInterceptor;
import de.mehtrick.boreal.config.security.TaigaTokenStore;
import de.mehtrick.boreal.model.login.LoginRequest;
import de.mehtrick.boreal.model.login.UserAuthenticationDetail;

@Service
public class TaigaAuthenticationClient {

	private String endpint = "/auth";

	@Autowired
	private TaigaConfiguration taigaconfig;

	/**
	 * Performs a login with the {@link TaigaConfiguration#getUsername()} and
	 * {@link TaigaConfiguration#getPassword()}. </br>
	 * </br>
	 * Implementation of <a href=
	 * "https://taigaio.github.io/taiga-doc/dist/api.html#auth-normal-login">https://taigaio.github.io/taiga-doc/dist/api.html#auth-normal-login</a>
	 * 
	 * @param issue
	 * @see <a href=
	 *      "https://taigaio.github.io/taiga-doc/dist/api.html#auth-normal-login">https://taigaio.github.io/taiga-doc/dist/api.html#auth-normal-login</a>
	 * @return Details of the User including the authorization token
	 */
	public UserAuthenticationDetail login() {
		return login(taigaconfig.getUsername(), taigaconfig.getPassword());
	}

	/**
	 * Implementation of <a href=
	 * "https://taigaio.github.io/taiga-doc/dist/api.html#auth-normal-login">https://taigaio.github.io/taiga-doc/dist/api.html#auth-normal-login</a>
	 * 
	 * @param
	 * @see <a href=
	 *      "https://taigaio.github.io/taiga-doc/dist/api.html#auth-normal-login">https://taigaio.github.io/taiga-doc/dist/api.html#auth-normal-login</a>
	 * @return Details of the User including the authorization token
	 */
	public UserAuthenticationDetail login(String username, String password) {

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setInterceptors(Arrays.asList(new LoggingInterceptor()));
		LoginRequest userInfo = LoginRequest.builder().username(username).password(password).build();
		return restTemplate
				.postForEntity(taigaconfig.getURLWithBasePath() + endpint, userInfo, UserAuthenticationDetail.class)
				.getBody();
	}

	public void loginAndStoreToken() {
		TaigaTokenStore.token = login().getAuthToken();
	}

}
