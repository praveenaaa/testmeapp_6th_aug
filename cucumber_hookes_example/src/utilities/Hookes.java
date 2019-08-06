package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookes {
	WebDriver driver;
	@Before(order= 0)
    public void Sign_up(){
        
    	//System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
			//driver = new InternetExplorerDriver();
       System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
   driver = new ChromeDriver();
   
			System.out.println("-----Sign_up scenario started ------------");
	    driver.get("http://localhost:8083/TestMeApp");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignUp")).click();
	    driver.findElement(By.name("userName")).sendKeys("praveen123");
	    driver.findElement(By.name("firstName")).sendKeys("praveen");
	    driver.findElement(By.name("lastName")).sendKeys("singh");
	    driver.findElement(By.name("password")).sendKeys("samar918");
	    driver.findElement(By.name("confirmPassword")).sendKeys("samar918");
	    driver.findElement(By.xpath("//input[@value='Male']")).click();
	    driver.findElement(By.name("emailAddress")).sendKeys("pravinsingh918@gmail.com");
	    driver.findElement(By.name("mobileNumber")).sendKeys("9986111370");
	    driver.findElement(By.name("dob")).click();
	    driver.findElement(By.xpath("//img[@alt='Ch']")).click();
	    Select s2 = new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
	    s2.selectByVisibleText("Feb");
	    Select s3 = new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
	    s3.selectByVisibleText("1995");
	    driver.findElement(By.xpath("//a[contains(.,'28')]")).click();
	    driver.findElement(By.id("address")).sendKeys("Marathahalli, Spice Garden");
	    Select s1 = new Select(driver.findElement(By.name("securityQuestion")));
	    s1.selectByVisibleText("What is your favour color?");
	    driver.findElement(By.name("answer")).sendKeys("Red");
	    driver.findElement(By.name("Submit")).click();
    }	
	@Before (order=1)
	
		public void login() throws Exception {
		System.out.println("----sign_in  scenario Started------");
		    driver.get("http://localhost:8083/TestMeApp");
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("SignIn")).click();
		    driver.findElement(By.name("userName")).sendKeys("lalitha");
		    driver.findElement(By.name("password")).sendKeys("password123");
		    driver.findElement(By.name("Login")).click();
		    Thread.sleep(2000);
		    
	}
	
	@After(order=1)
    public void Sign_out(){
		driver.findElement(By.linkText("SignOut")).click();
        System.out.println("clicked done on sign_out link");}
	
        @After(order=0)
        public void close_browser() {
        driver.close();
        System.out.println("browser opened by driver is  closed");
}
}
