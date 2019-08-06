package step_definition4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hookes_steps {
	WebDriver driver;
	@Given("^this is the first step$")
	public void This_Is_The_First_Step(){
		System.out.println("This is the first step11111");
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	     driver = new ChromeDriver();
		 driver.get("http://localhost:8083/TestMeApp");
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("SignIn")).click();
		 driver.findElement(By.name("userName")).sendKeys("lalitha");
		   
		   
	}	
	@When("^this is the second step$")
	public void This_Is_The_Second_Step(){
		System.out.println("This is the second step22222");
		 driver.findElement(By.name("password")).sendKeys("password123");
	}	
	@Then("^this is the third step$")
	public void This_Is_The_Third_Step(){
		System.out.println("This is the third step333333");
		 driver.findElement(By.name("Login")).click();
		 driver.findElement(By.linkText("SignOut")).click();
		 driver.close();
	}
}
