package net.timeandtraining.framework;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestBase {
	
	public static WebDriver driver;
	
	
	private static ExtentReports extent;
    private static ThreadLocal parentTest = new ThreadLocal();
    private static ThreadLocal test = new ThreadLocal();
    
    public static ExtentTest reporter;
	
//a
	
	@BeforeSuite
	public static void init() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\lib\\IEDriverServer.exe");
//		driver = new InternetExplorerDriver();	
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\lib\\IEDriverServer.exe");
//		driver = new FirefoxDriver();
				
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.MINUTES);
		
		
		
		extent = ExtentManager.createInstance("extent.html");
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		extent.attachReporter(htmlReporter);

	}

	 @BeforeClass
	    public synchronized void beforeClass() {
	        ExtentTest parent = extent.createTest(getClass().getName());
	        parentTest.set(parent);
	  }

	

	@AfterSuite
	public static void closeBrowser() {
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

	
	
   

    @BeforeMethod
    public synchronized void beforeMethod(Method method) {
    	ExtentTest child = ((ExtentTest) parentTest.get()).createNode(method.getName());
        test.set(child);
        reporter=child;
    }

    @AfterMethod
    public synchronized void afterMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE)
            ((ExtentTest) test.get()).fail(result.getThrowable());
        else if (result.getStatus() == ITestResult.SKIP)
            ((ExtentTest) test.get()).skip(result.getThrowable());
        else
            ((ExtentTest) test.get()).pass("Test passed");

        extent.flush();
    }
	
	



}
