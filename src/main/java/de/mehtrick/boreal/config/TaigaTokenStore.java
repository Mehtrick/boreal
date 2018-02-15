package de.mehtrick.boreal.config;

import lombok.Data;

@Data
public class TaigaTokenStore {

	public static String token;

	public static void invalidate() {
		token = null;
	}
}
