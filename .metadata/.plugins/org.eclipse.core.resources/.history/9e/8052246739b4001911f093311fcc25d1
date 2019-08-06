package step_definition98;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testmeapp {
	WebDriver driver;
	@Given("^user navigates to testmeapp$")
	public void user_navigates_to_testmeapp() throws Throwable {
		System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://localhost:8083/TestMeApp");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Username_as_and_Password_as(String username, String password) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
	}

	@Then("^login should be unsuccessful$")
	public void validateRelogin() { 
		
		System.out.println(" password is wrong "); 
		driver.close();  
				} 

				}




