package com.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UtilClass {
	WebDriver driver;
	public static Logger logger;
	public UtilClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//current url 
	public String getCurrentURL()
	{
		 String url = driver.getCurrentUrl();
		return url ;
	}
	public Logger getLogger()
	{
		logger = Logger.getLogger("BDD Framework");
		PropertyConfigurator.configure("Log4j.properties");
		return logger;
	}

}
