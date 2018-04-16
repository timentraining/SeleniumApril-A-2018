package net.timeandtraining.tests.flights;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.timeandtraining.framework.TestBase;
public class FlightTests extends TestBase{

	
	
	@Test
	//TC: Flight Search in Delta
	public static void flight_search_in_delta_website() {
		
	//Step 1: go to delta.com
	driver.get("https://www.delta.com");
		
	//Step 2: Choose Oneway option	
	driver.findElement(By.xpath("//span[text()='One Way']")).click();
		
	//Step 3: Enter JFK in From text box
	driver.findElement(By.id("originCity")).clear();
	driver.findElement(By.id("originCity")).sendKeys("JFK");
	
	//Step 4: Enter ATL in To text box
	driver.findElement(By.id("destinationCity")).clear();
	driver.findElement(By.id("destinationCity")).sendKeys("ATL");
	
	//Step 5: Enter Tomorrow's date
	driver.findElement(By.id("depDateCalIcon")).click();
	driver.findElement(By.xpath("(//a[text()='20'])[1]")).click();
	
	//Step 6: Click FIND FLIGHTS button
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("findFlightsSubmit")).click();
	
	//Step 7: Verify Search returned some result 
	
	int total_result_box=driver.findElements(By.xpath("//div[@class='mainContentCard p0-md-up']")).size();
	Assert.assertEquals(total_result_box>5 , true);
	
	
	//Step 8: Print out all economy prices
	
	List<WebElement> price_list=driver.findElements(By.xpath("//span[@class='priceBfrDec' and ancestor::div[following-sibling::*[@dialogtitle='Basic Economy Modal']and @class='priceHolder']]"));
	
	for(WebElement e:price_list) {
		System.out.println(e.getText());
	}
	
	
	
		
	}
	
	
	
	
}
