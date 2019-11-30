package com.allair.allairapi.utils;
import java.util.Base64;

public class AllAirUtils {
	public static String encode64(final String mot) {
		return Base64.getEncoder().encodeToString(mot.getBytes());
	}
	
	public static String decode64(final String mot) {
		return new String(Base64.getDecoder().decode(mot));
	}
}
