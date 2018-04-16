package net.timeandtraining.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UI extends TestBase{
	
		
	
	public static void openURL(String url) {
		driver.get(url);
	}
	
	//FINDING ELEMENTS
	public static WebElement findelementById(String id) {
		return driver.findElement(By.id(id));
	}
	public static WebElement findelementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	public static WebElement findelementByClassName(String className) {
		return driver.findElement(By.className(className));
	}	
	
	
	//ALL THE METHODS HERE FOR CLICKS
	
	public static void clickById(String id) {
		findelementById(id).click();
	}
	public static void clickByClassName(String className) {
		findelementByClassName(className).click();
	}
	public static void clickByName(String className) {
		findelementByClassName(className).click();
	}
	public static void clickByXpath(String xpath) {
		findelementByXpath(xpath).click();
	}

	//ALL THE METHODS HERE FOR SEND KEYS
	public static void enterTextById(String id, String text) {
		findelementById(id).sendKeys(text);
	}
	

	
	
	//ALL THE METHODS HERE FOR ACTIONS
	
	public static void mouseHover(WebElement e) {
		Actions actions  = new Actions(driver);
		actions.moveToElement(e).build().perform();
	}
	
	
	
	
	
	
	

}
