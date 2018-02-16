package de.mehtrick.boreal.config.security;

import lombok.Data;

@Data
public class TaigaTokenStore {

	public static String token;

	public static void invalidate() {
		token = null;
	}
}
