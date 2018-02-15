package de.mehtrick.boreal.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RESTConfiguration {

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setInterceptors(Arrays.asList(new AuthenticationInterceptor(), new LoggingRequestInterceptor()));
		return restTemplate;
	}
}
