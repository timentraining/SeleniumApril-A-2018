package misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitDemo {
	
	//TO DEMONSTRATE IMPLICIT WAIT
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hotwire.com");
		driver.findElement(By.xpath("(//*[@id='destination'])[2]")).sendKeys("11001");
				
		//here NoSuchElement exception occurs
		driver.findElement(By.xpath("(//*[@id='doSearch'])[2]")).click();		
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Today's top deal\"]")));
		
		
		driver.quit();
		
		
	}
	
	
	

}
