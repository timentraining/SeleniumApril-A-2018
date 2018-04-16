package net.timeandtraining.framework;

import org.testng.annotations.Test;

public class UITest extends TestBase{
	

	
	@Test
	public void login() {
		
		
//		Go to http://www.automationpractice.com
		UI.openURL("http://www.automationpractice.com");		
//		Click Sign in button from top right corner of the page		
		UI.clickByClassName("login");		
//		Enter invalid email address 'myunknowxaad@mailinator.com' in email address text field of right side
		UI.enterTextById("email", "myunknowxaad@mailinator.com");
		
//		Click Sign in button
//		Verify error message displayed 'There is 1 error'
//		Verify error message displayed 'Authentication failed.'

		
		
		
	}
	

}
