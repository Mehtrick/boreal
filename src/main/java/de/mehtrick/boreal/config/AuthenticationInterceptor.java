package de.mehtrick.boreal.config;

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

@Component
public class AuthenticationInterceptor implements ClientHttpRequestInterceptor {

	@Autowired
	TaigaAuthenticationClient authClient;

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
