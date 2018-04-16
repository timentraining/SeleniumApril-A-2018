package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.timeandtraining.framework.TestBase;


public class SelectObjectDemo extends TestBase{
	
	
	
	@Test
	public static void usingDropDownBySelectObject() {
		
		driver.get("http://automationpractice.com/index.php?controller=contact");
		
		
		Select subject_heading_dropdown = new Select(driver.findElement(By.id("id_contact")));
		subject_heading_dropdown.selectByIndex(1);
		//System.err.println(subject_heading_dropdown.getAllSelectedOptions().get(0).getText());

		
		
		
	}

}
