package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps {
	@Given("^user navigates to testmeapp$")
	public void user_navigates_to_testmeapp() throws Throwable {
	 System.out.println("user navigates to testmeapp");
	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Username_as_and_Password_as(String arg1, String arg2) throws Throwable {
		 System.out.println("user entered username and password "); 
	}

	@Then("^login should be unsuccessful$")
	public void login_should_be_unsuccessful() throws Throwable {
		 System.out.println("logged in unsuccessful ");
	}

}
