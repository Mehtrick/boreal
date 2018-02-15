package de.mehtrick.boreal.model.login;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfo {

	private String password;
	private String username;
	private final String type = "normal";

}
