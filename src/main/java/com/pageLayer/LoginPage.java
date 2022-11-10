package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//---------------------- Object repo ----------------------
	private By username_txtbox= By.xpath("//input[@name='email']");
	private By password_txtbox= By.xpath("//input[@name='password']");
	private By login_btn = By.xpath("//button[text()='Log In']");

	//---------------------- Action methods ----------------------
	public void enterEmail(String email)
	{
		driver.findElement(username_txtbox).sendKeys(email);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(login_btn).click();
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(password_txtbox).sendKeys(pass);
	}
}
