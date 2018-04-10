package misc;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import net.timeandtraining.settings.TestBase;



public class DriverSwitchDemo extends TestBase{


	
	@Test
	public static void setCustomWindowsSize() {
		driver.get("http://www.automationpractice.com");		
		
	}
	
	@Test
	public static void switchToAlert() {	
		
		
		
		
		driver.get("http://www.automationpractice.com");
		
		
		driver.switchTo().alert().accept();
		
		
		
	}

	@Test
	public static void switchBetweenWindows() {	
		
		
		driver.get("http://www.automationpractice.com");
		//get first window handle
		String old_window_handle=driver.getWindowHandle();
		
		//click facebook icon to open another windows
		driver.findElement(By.xpath("//a[contains(@href,'facebook.com')]")).click();
				
		
		//now collect all windows handle*S*
		Set<String> handles=driver.getWindowHandles();
		
		//now before you move to the new handle, check if its already exist, if not then move		
			
		for(String s:handles) {
			
			if (s.equals(old_window_handle)){
			//do nothing
			}else {
			driver.switchTo().window(s);
			}
		}
		
		
		//click on sign up button from faqcebook
		driver.findElement(By.xpath("(//a[@role='button' and contains(text(),'Sign Up')])[1]")).click();
		
		//if we want to switch back to old window thn , use below line
		driver.switchTo().window(old_window_handle);
		
	}
	@Test
	public static void switchBetweenFrames() {
				
		
	}
	
	
	

}
