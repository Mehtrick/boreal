package de.mehtrick.boreal.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import de.mehtrick.boreal.config.interceptor.AuthenticationInterceptor;
import de.mehtrick.boreal.config.interceptor.LoggingInterceptor;

@Configuration
public class RESTConfiguration {

	@Autowired
	private AuthenticationInterceptor authinterceptor;

	@Bean
	public RestTemplate authResttemplate() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setInterceptors(Arrays.asList(authinterceptor, new LoggingInterceptor()));
		return restTemplate;
	}

}
