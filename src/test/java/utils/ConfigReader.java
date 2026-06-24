package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	 Properties p ;
	  
	public  ConfigReader() {
		
		  p = new Properties();
		  try {
			  FileInputStream   file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\AutomationPlaywritght-01\\src\\test\\java\\utils\\config.properties");
			   p.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	
	public String getProperty(String key) {

        return p.getProperty(key);
}}
	

