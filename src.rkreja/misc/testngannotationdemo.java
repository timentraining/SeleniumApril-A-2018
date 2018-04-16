package misc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.timeandtraining.framework.TestBase;
import net.timeandtraining.framework.UI;

public class testngannotationdemo extends TestBase {

	
	@Test
	public void test1() {
		UI.openURL("http:/www.google.com");
	}
	
	
	@Test
	public void test2() {
		UI.openURL("http:/www.google.com");
		
		
	}
	
	
	@Test
	public void test3() {
		UI.openURL("http:/www.google.com");
	}
	
	@Test
	@BeforeClass	
	public void test4() {
		UI.openURL("http:/www.google.com");
	}
	
	
	@Test
	@AfterClass
	public void test5() {
		UI.openURL("http:/www.google.com");
	}
	
	


}
