package stepDefinitions;

import org.testng.Assert;

import com.pageLayer.LoginPage;
import com.utilities.DriverFactory;
import com.utilities.UtilClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps{
	
	private LoginPage login = new LoginPage(DriverFactory.getDriver());
	private UtilClass util = new UtilClass(DriverFactory.getDriver());
	
	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
		String expected_url = "https://www.apps.dalalstreet.ai/login";
		String actual_url = util.getCurrentURL();
		Assert.assertEquals(actual_url, expected_url);
	    
	}
	@When("user enters mobile number as {string}")
	public void user_enters_mobile_number_as(String email) {
		login.enterEmail(email);
	}
	
	@When("user enters digit password as {string}")
	public void user_enters_digit_password_as(String password) {
		login.enterPassword(password);
	}
	@When("clicks on login button")
	public void clicks_on_login_button() {
		login.clickOnLoginButton();
	}
}
