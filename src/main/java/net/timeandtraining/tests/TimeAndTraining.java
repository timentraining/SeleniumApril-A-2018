package net.timeandtraining.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.timeandtraining.settings.TestBase;

public class TimeAndTraining extends TestBase{

	
	@Test
	public static void time_and_training_homepage_visit() {
		
		driver.get("http://timeandtraining.net");
		Assert.assertEquals(driver.findElement(By.xpath("(//td)[2]")).getText().equals("Selenium WebDriver With Basic Java"), true,"Verify Time and Training Home Page displayed");
		driver.close();
		driver.quit();
	}
	
}
