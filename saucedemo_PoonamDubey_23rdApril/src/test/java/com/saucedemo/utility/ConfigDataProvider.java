package com.saucedemo.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
Properties pro;
	public ConfigDataProvider() {
		
		File file= new File("./configuration/config.properties");
		
		try {
		
			FileInputStream src;
			src = new FileInputStream(file);
		
		pro= new Properties();
	
			pro.load(src);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Not able to load the file" +e.getMessage());
		
	}
}
	
	public String getDataFromConfig(String searhKey) {
		
		return pro.getProperty(searhKey);
	}
	
	public String getBrowser() {
		
		return pro.getProperty("Browser");
	}
	
	public String getURL() {
		return pro.getProperty("URL");
		
	}
}