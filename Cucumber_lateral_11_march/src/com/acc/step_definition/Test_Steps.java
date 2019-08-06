package com.acc.step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    
	   System.out.println("user is on home page");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	  
		 System.out.println("user navigated to login page");
	}

	@When("^User enters valid UserName and valid Password$")
	public void user_enters_valid_UserName_and_valid_Password() throws Throwable {
		 System.out.println("user enters valid UserName and valid Password ");
	   
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		 System.out.println("Message displayed Login Successfully");
	   
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		 System.out.println("user clicked on log out ");
	  
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		 System.out.println("user logout succesfully");
	  
	}

}
