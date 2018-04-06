package net.timeandtraining.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UsingAllBrowsers {
	
	
	
	
	public static void main(String[] args) {
		
		//EDGE
		//FIREFOX
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rkreja\\git\\SeleniumApril-A-2018\\lib\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.google.com");
//		
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\rkreja\\git\\SeleniumApril-A-2018\\lib\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
	
		
		
		
		
	}
	
	

}
