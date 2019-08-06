package cucumber_lateral_practice_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SeleniumTest {

	
	WebDriver driver;
	@Test(priority=1,enabled=true)
	public void signup() {
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
	@Test(priority=2, enabled=true)
	public void login() {
		driver.get("http://localhost:8083/TestMeApp");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
		//driver.findElement(By.linkText("SignOut")).click();
	}
	@Test(priority=3, enabled=true)
	public void cart() throws InterruptedException {
		WebElement allcategories= driver.findElement(By.xpath("//span[contains(.,'All Categories')]"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(allcategories).build().perform();
		driver.findElement(By.xpath("//span[contains(.,'Electronics')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(.,'Head Phone')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,' Add to cart')]")).click();
		driver.findElement(By.xpath("//a[contains(.,' Cart')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Checkout ')]")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Proceed to Pay')]")).click();

	}

	@BeforeTest
	public void beforeTest() {
		// driver=Drivers.getDriver("chrome");
driver=utility.Drivers.getDriver("chrome");
		//driver=Drivers.getDriver("selenium3firefox");

		//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		//driver = new ChromeDriver();
		// System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}





