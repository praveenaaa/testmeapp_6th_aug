package com.accenture.selenium_with_new_jars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class newtours {
 //static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		  ChromeDriver   driver = new ChromeDriver();
		
			//System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
			//InternetExplorerDriver	driver = new InternetExplorerDriver();
//			System.setProperty("webdriver.firefox.marionette", "C://geckodriver.exe");
//			FirefoxDriver driver = new FirefoxDriver();
		    driver.get("http://localhost:8083/TestMeApp");
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("SignUp")).click();
		    Thread.sleep(2000);
		  driver.findElement(By.name("userName")).sendKeys("pravinsingh");
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

}
