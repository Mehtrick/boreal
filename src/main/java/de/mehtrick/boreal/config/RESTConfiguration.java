package de.mehtrick.boreal.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RESTConfiguration {

	@Autowired
	AuthenticationInterceptor authinterceptor;

	@Bean(name = "AuthResttemplate")
	public RestTemplate authResttemplate() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setInterceptors(Arrays.asList(authinterceptor, new LoggingInterceptor()));
		return restTemplate;
	}

	@Bean
	@Primary
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setInterceptors(Arrays.asList(new LoggingInterceptor()));
		return restTemplate;
	}
}
