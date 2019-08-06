package step_definition2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hookes_steps {
	@Given("^this is the first step$")
	public void this_is_the_first_step()  {
	  System.out.println("this is the first step");
	   
	}

	@When("^this is the second step$")
	public void this_is_the_second_step()  {
		  System.out.println("this is the 2nd step");
		   
	   
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step()  {
		  System.out.println("this is the 3rd step");
		   
	}
}
