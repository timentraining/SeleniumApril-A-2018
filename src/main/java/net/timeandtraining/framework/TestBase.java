package net.timeandtraining.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
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

	

	

	@AfterSuite
	public static void closeBrowser() {
		driver.close();
		driver.quit();
	}
	



}
