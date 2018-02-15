package de.mehtrick.boreal.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "taiga")
@Data
public class TaigaConfiguration {

	private String url = "https://api.taiga.io";

	private String basepath = "/api/v1";

	private String username;

	private String password;

	private Integer projectid;

	public String getURLWithBasePath() {
		return url + basepath;
	}

}
