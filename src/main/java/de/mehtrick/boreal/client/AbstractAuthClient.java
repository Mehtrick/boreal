package de.mehtrick.boreal.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.client.RestTemplate;

public abstract class AbstractAuthClient {

	@Autowired
	@Qualifier("AuthResttemplate")
	protected RestTemplate resttemplate;
}
