package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//---------------------- Object repo ----------------------
	private By text_username = By.xpath("//span[contains(@class,'inline-block')]");
		
		
	//---------------------- Action methods ----------------------
	public String getUserName()
	{
		String un= driver.findElement(text_username).getText();
		return un;
	}
}
