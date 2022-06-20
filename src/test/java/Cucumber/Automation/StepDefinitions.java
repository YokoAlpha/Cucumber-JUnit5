package Cucumber.Automation;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	@Given("User is on landing page") 
	public void User_is_on_landing_page()throws Throwable {
		System.out.println("Navigate to login url.");
	}

	@When("^User logs into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void User_logs_into_application_with_username_and_password(String username, String password)throws Throwable {
		System.out.println("User: "+username);
		System.out.println("Password: "+password);
	}

	@Then("^Home page is populated$")
	public void Home_page_is_populated()throws Throwable {
		System.out.println("Validated home page.");	
		}
	
	@And("^Cards displayed are \"([^\"]*)\"$")
	public void Cards_displayed_are(String arg1)throws Throwable {
		System.out.println("Cards displayed are "+arg1+".");	
		}
	@When("^User sign up with following details$")
	public void User_sign_up_with_following_details(DataTable data)throws Throwable {
		List<List<String>> obj = data.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));
	}
}