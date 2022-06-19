package Cucumber.Automation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	@Given("User is on landing page") 
	public void User_is_on_landing_page()throws Throwable {
		System.out.print("Navigate to login url. ");
	}

	@When("^User logs into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void User_logs_into_application_with_username_and_password(String username, String password)throws Throwable {
		System.out.print("User: "+username);
		System.out.print(" Password: "+password+". ");
	}

	@Then("^Home page is populated$")
	public void Home_page_is_populated()throws Throwable {
		System.out.print("Validated home page. ");	
		}
	
	@And("^Cards displayed are \"([^\"]*)\"$")
	public void Cards_displayed_are(String arg1)throws Throwable {
		System.out.print("Cards displayed are " +arg1+". ");	
		}
}