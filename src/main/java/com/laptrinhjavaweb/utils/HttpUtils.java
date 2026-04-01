package com.laptrinhjavaweb.utils;

import java.io.BufferedReader;

import org.codehaus.jackson.map.ObjectMapper;

public class HttpUtils {
	

	private String value;
	public <T> T toModel(Class<T> tClass) {
		try {
			return new ObjectMapper().readValue(value, tClass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public HttpUtils(String value) {
		this.value = value;
	}
	public static HttpUtils of (BufferedReader reader) {
		StringBuilder sb = new StringBuilder();
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
				
		}
		
		
		return new HttpUtils(sb.toString());
	}
}
