package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookes {
	WebDriver driver;
	@Before(order=0)
	public void beforeScenarioStart(){
		System.out.println("-----------------Start of Scenario-----------------");
}	
	@Before(order=1)
	public void beforeScenario(){
		System.out.println("This will run before the every Scenario");

	}	
    @After(order=1)
	public void afterScenario(){
		System.out.println("This will run after the every Scenario");

	}	
	@After(order=0)
	public void afterScenarioFinish(){
		System.out.println("-----------------End of Scenario-----------------");

	}	
}
