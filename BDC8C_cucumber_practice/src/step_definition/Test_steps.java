package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps {
public static WebDriver driver ; 
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
		driver = new InternetExplorerDriver();
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
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(2000);
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}

	@When("^User Logout from the Application$")
	public void user_Logout_from_the_Application() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.linkText("SignOut")).click();
	}

	@Then("^Message displayed Logout Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable {
		System.out.println("LogOut Successfully");
	}	
}
