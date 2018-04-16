package net.timeandtraining.tests.flights;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import net.timeandtraining.framework.TestBase;

public class SearchFlighInKayak extends TestBase{
	
	@Test
	public static void test() {
		driver.get("https://www.kayak.com/");
        
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[contains(@id,'-origin-airport-display-inner')]"))).click().perform();
		
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[contains(@id,'-origin-airport')]"))).sendKeys("JFK").perform();
		
		
		
        driver.findElement(By.xpath("//li[@id='V8NW-switch-option-2']")).click();
        driver.findElement(By.xpath("//div[@id='zP8R-origin-airport-display-inner']")).clear();
        driver.findElement(By.xpath("(//div[contains(text(), 'From?')])[1]")).sendKeys("ATL");
	}

}
