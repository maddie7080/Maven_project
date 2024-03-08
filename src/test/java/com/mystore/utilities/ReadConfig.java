package com.mystore.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
	String path = "C:\\Users\\Admin\\eclipse-workspace\\BA.qa\\Configuration\\config. properties";
	//constructor
	public ReadConfig() {
		properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream(path);
			
				properties.load(fis);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getBaseUrl() {
	String value=properties.getProperty("baseUrl");
		
		if(value!=null)
			return value;
		else 
			throw new RuntimeException("Url not specified in confog file.");
	}
	public String getBrowser() {
		String value=properties.getProperty("browser");
			
			if(value!=null)
				return value;
			else 
				throw new RuntimeException("Browser not specified in confog file.");
		}
	
	

}
