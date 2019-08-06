package utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookes {
	@Before(order=0)
	public void beforeScenarioStart(){
		System.out.println("-----------------Start of Scenario-----------------");
	}	
	@Before(order=1)
	public void beforeScenario(){
		System.out.println("Start the browser and Clear the cookies");
	}	




	@After(order=1)
	public void afterScenario(){
		System.out.println("Log out the user and close the browser");
	}
	@After(order=0)
	public void afterScenarioFinish(){
		System.out.println("-----------------End of Scenario-----------------");
	}	


}
