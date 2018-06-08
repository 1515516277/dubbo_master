package com.ming.until;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUntil {

	public static Properties read() {
		Properties properties = new Properties();
		try {
			InputStream in = PropertiesUntil.class.getClassLoader().getResourceAsStream("dbconfig.properties");
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    //properties.getProperty(String key)
		return properties;
	}
	
}
