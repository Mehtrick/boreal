package de.mehtrick.boreal.endpoints.auth.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginRequest {

	private String password;
	private String username;
	private final String type = "normal";

}
