package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static ThreadLocal<WebDriver> tl = new ThreadLocal<WebDriver>();
	private WebDriver driver;
	
	public WebDriver browserInit(String br)
	{
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			tl.set(driver);
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			tl.set(driver);
		}
		else
		{
			System.out.println("provide valid browser name");
		}
		
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver()
	{
		return tl.get();
	}
}
