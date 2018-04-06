package net.timeandtraining.webdriverwaits;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import net.timeandtraining.settings.TestBase;

public class ImplicitWait extends TestBase{
	

	@Test
	public static void testWebDriverImplicitWait() {
		
		driver.get("https://www.hotwire.com");
		driver.findElement(By.xpath("(//*[@id='destination'])[2]")).sendKeys("11001");			
		
		driver.findElement(By.xpath("(//*[@id='doSearch'])[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Destination'])[1]")).sendKeys("");
		
		//here NoSuchElement exception occurs
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Today's top deal\"]")));
		
		
		driver.quit();
		
		
	}

	

}
