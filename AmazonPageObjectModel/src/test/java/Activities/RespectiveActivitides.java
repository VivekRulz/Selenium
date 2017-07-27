package Activities;

import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class RespectiveActivitides {
	public RemoteWebDriver driver;
	
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void report()
	{
		extent=new ExtentReports("./src/Reports/AmazonReports.html",true);
        extent.loadConfig(new File(".Reports/config-file.xml"));
        
	}
	@BeforeMethod
	public void beforeEveryTestCase(Method method)
	{
	
	System.setProperty("webdriver.chrome.driver","E:\\Studies\\Selenium\\TestLeaf\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	test=extent.startTest(this.getClass().getSimpleName()+"::"+method.getName(),method.getName());	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	test.log(LogStatus.PASS,"The browser is opened successfully");
	Actions action=new Actions(driver);
	WebElement signInElement=driver.findElementByXPath("//span[text()='Hello. Sign in']");
	action.moveToElement(signInElement).build().perform();
	driver.findElementByXPath("(//a[@class='nav-action-button'])[1]").click();
	test.log(LogStatus.PASS,"The sign-In button is clicked successfully");
}

	@AfterMethod
	public void afterEveryTestCase(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(LogStatus.FAIL,"The case has failed"+result.getThrowable());
		}
		driver.close();
		test.log(LogStatus.PASS,"The browser was closed successfully");
		extent.endTest(test);
	
}
	@AfterTest
	public void finishReport()
	{
		extent.flush();
		extent.close();
	}
	
}