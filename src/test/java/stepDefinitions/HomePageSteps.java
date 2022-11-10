package stepDefinitions;

import org.testng.Assert;

import com.pageLayer.HomePage;
import com.utilities.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	private HomePage home = new HomePage(DriverFactory.getDriver());
	
	@Then("user logged into application and showing username as {string} on homepage")
	public void user_logged_into_application_and_showing_username_as_on_homepage(String text) {
	    String username = home.getUserName();
	    String expected_name = text;
	    boolean status = false;
	    if(username.contains(expected_name))
	    {
	    	status = true;
	    }
	    Assert.assertEquals(status, true);
	}
	
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
	    
	}
	@When("user search company name as <{string}>")
	public void user_search_company_name_as(String string) {
	   
	}
	@When("select company from listed options")
	public void select_company_from_listed_options() {
	    
	}
}
