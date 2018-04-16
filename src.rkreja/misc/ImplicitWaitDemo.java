package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ImplicitWaitDemo {
	
	
	@Test
	public static void simple_search_in_hotwire() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hotwire.com");
		driver.findElement(By.xpath("(//*[@id='destination'])[2]")).sendKeys("11001");
		
		WebElement e=driver.findElement(By.xpath("(//*[@id='doSearch'])[2]"));
		new Actions(driver).moveToElement(e).build().perform();
		e.click();
				
		//here it throws NoSuchElement Exception since no implicit wait time was not defined
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Today's top deal\"]")));
				
		driver.quit();
		
		
	}
	
	
	

}
