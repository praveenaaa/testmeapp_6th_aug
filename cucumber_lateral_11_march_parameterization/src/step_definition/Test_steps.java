package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps {
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		  System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver.exe");
		    driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.manage().window().maximize();
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		 driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		 driver.findElement(By.name("userName")).sendKeys(username);
		    driver.findElement(By.name("password")).sendKeys(password);
		    driver.findElement(By.name("Login")).click();
		    driver.findElement(By.linkText("SignOut")).click();
		   
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
		Thread.sleep(2000);
	}
	
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		// driver.findElement(By.linkText("SignOut")).click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("Logout Successfully");
	}

}
