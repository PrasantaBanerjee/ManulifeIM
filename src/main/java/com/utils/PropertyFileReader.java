package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	
	private FileInputStream fis;
	private Properties prop;
	private String configFilePath = ".\\src\\main\\resources\\config.properties";
	
	public PropertyFileReader() {
		try {
			fis = new FileInputStream(configFilePath);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.err.println("File not found at path: " + configFilePath);
		} catch (IOException e) {
			System.err.println("Problem occured while reading file: " + e.getMessage());
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public String getProperty(String key) {
		return prop.getProperty(key);
	}

}
