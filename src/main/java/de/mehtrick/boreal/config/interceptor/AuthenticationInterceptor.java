package de.mehtrick.boreal.config.interceptor;

import java.io.IOException;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import de.mehtrick.boreal.client.TaigaAuthenticationClient;
import de.mehtrick.boreal.config.security.TaigaTokenStore;

@Component
public class AuthenticationInterceptor implements ClientHttpRequestInterceptor {

	@Autowired
	private TaigaAuthenticationClient authClient;

	/**
	 * This Interceptor is needed to set the correct Headers before every Request It
	 * also tries to receive a new token if the current one is invalid
	 * 
	 * @see <a href=
	 *      "https://taigaio.github.io/taiga-doc/dist/api.html#_authentication">https://taigaio.github.io/taiga-doc/dist/api.html#_authentication</a>
	 */
	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		setHeader(request);
		ClientHttpResponse response = execution.execute(request, body);
		if (response.getStatusCode().equals(HttpStatus.UNAUTHORIZED)) {
			TaigaTokenStore.invalidate();
			setHeader(request);
			response = execution.execute(request, body);
		}
		return response;
	}

	/**
	 * Sets the Authorization Header and Content type of the Request. The
	 * Authorization will be loaded from the tokenstore. If not set the login will
	 * be executed
	 * 
	 * @param request
	 * @see <a href=
	 *      "https://taigaio.github.io/taiga-doc/dist/api.html#auth-normal-login">https://taigaio.github.io/taiga-doc/dist/api.html#auth-normal-login</a>
	 * @see <a href=
	 *      "https://taigaio.github.io/taiga-doc/dist/api.html#_authentication">https://taigaio.github.io/taiga-doc/dist/api.html#_authentication</a>
	 */
	private HttpHeaders setHeader(HttpRequest request) {
		HttpHeaders headers = request.getHeaders();
		headers.add("Content-Type", "application/json");
		if (Objects.isNull(TaigaTokenStore.token)) {
			authClient.loginAndStoreToken();
		}
		headers.add("Authorization", "Bearer " + TaigaTokenStore.token);
		return headers;
	}

}
