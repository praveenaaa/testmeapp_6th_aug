package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps {
	WebDriver   driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
				   driver = new ChromeDriver();

				//System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
				//driver = new InternetExplorerDriver();
				//			System.setProperty("webdriver.firefox.marionette", "C://geckodriver.exe");
				//			FirefoxDriver driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("http://localhost:8083/TestMeApp");
	  
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.linkText("SignIn")).click();
		
		
	   
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		
	   
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	   
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	   
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    
	}
	
}
