package com.acc.selenium_12th_april_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Helo_selenium {

	public static void main(String[] args) {
		System.out.println("hello everyone ");
		// System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		  //ChromeDriver   driver = new ChromeDriver();
		System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
			InternetExplorerDriver	driver = new InternetExplorerDriver();
			//System.setProperty("webdriver.firefox.marionette", "C://geckodriver.exe");
			//FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://newtours.demoaut.com/");
		  driver.findElement(By.linkText("REGISTER")).click();
		  driver.findElement(By.name("firstName")).sendKeys("pravin");
		  Select s2 = new Select(driver.findElement(By.xpath("//select[@name='country']")));
	s2.selectByVisibleText("INDIA");
	}

}
