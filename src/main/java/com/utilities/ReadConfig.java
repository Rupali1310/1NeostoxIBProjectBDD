package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	private Properties pro;
	
	public ReadConfig()
	{
		File src = new File("D:\\AUTOMATION TESTING\\DAILY NOTES SELENIUM\\BDD framework notes\\1NeostoxIBProjectBDD (2)\\1NeostoxIBProjectBDD\\src\\main\\java\\propertyFiles\\config.properties");
		try 
		{
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (IOException e) 
		{
			System.out.println("File path is not correct");
			e.printStackTrace();
		}
	}
	
	public String getBrowserName()
	{
		String browserName = pro.getProperty("browser");
		return browserName;
	}
	
	public String getUrl()
	{
		String url = pro.getProperty("url");
		return url;
	}
}
