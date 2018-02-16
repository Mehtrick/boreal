package de.mehtrick.boreal.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import de.mehtrick.boreal.config.TaigaConfiguration;

/**
 * Abstract Client for every Taigaclient which needs an Authorization to execute
 * their requests
 * 
 * @author lauh001
 *
 */
public abstract class AbstractTaigaClient {

	@Autowired
	protected RestTemplate resttemplate;

	@Autowired
	protected TaigaConfiguration taigaconfig;
}
