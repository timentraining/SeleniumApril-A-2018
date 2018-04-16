package net.timeandtraining.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	public static WebDriver driver;
	
	

	
	@BeforeSuite
	public static void init() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\lib\\IEDriverServer.exe");
//		driver = new InternetExplorerDriver();	
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\lib\\IEDriverServer.exe");
//		driver = new FirefoxDriver();
				
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.MINUTES);

	}

	
	@BeforeMethod
	public void testDataPrep() {
//		Go to http://www.automationpractice.com
		UI.openURL("http://www.automationpractice.com");
//		Click 'DRESSES' button
		UI.clickByXpath("(//a[contains(text(), 'Dresses')])[5]");	
	}
	
	
	@AfterSuite
	public static void closeBrowser() {
		driver.close();
		driver.quit();
	}
	
	



}
