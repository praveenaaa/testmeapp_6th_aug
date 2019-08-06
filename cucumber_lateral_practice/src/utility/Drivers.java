package utility;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {
public static WebDriver getDriver (String browser) {
	if (browser.equals("selenium2firefox"))
	{ 
		return new FirefoxDriver();
		}
	
	if (browser.equals("selenium3firefox"))
	{ 
		System.setProperty("webdriver.firefox.marionette", "C://geckodriver.exe");
		return new FirefoxDriver();
		}
	
	else if (browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		return new ChromeDriver();
	}
		
		else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
			return new InternetExplorerDriver();
	}
//		else if (browser.equals("edge")) {
//			System.setProperty("webdriver.edge.driver", "C://MicrosoftWebDriver.exe");
//			return new EdgeDriver(); }
	
		else return null;
	
	
	}}