package de.mehtrick.boreal.config;

import java.io.IOException;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingRequestInterceptor implements ClientHttpRequestInterceptor {

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {
		traceRequest(request, body);
		ClientHttpResponse response = execution.execute(request, body);
		traceResponse(response);
		return response;
	}

	private void traceRequest(HttpRequest request, byte[] body) throws IOException {
		log.debug("===========================request begin================================================");
		log.debug("URI         : {}", request.getURI());
		log.debug("Method      : {}", request.getMethod());
		log.debug("Headers     : {}", request.getHeaders());
		log.debug("Request body: {}", new String(body, "UTF-8"));
		log.debug("==========================request end================================================");
	}

	private void traceResponse(ClientHttpResponse response) throws IOException {
		log.debug("============================response begin==========================================");
		log.debug("Status code  : {}", response.getStatusCode());
		log.debug("Status text  : {}", response.getStatusText());
		log.debug("Headers      : {}", response.getHeaders());
		log.debug("=======================response end=================================================");
	}

}
