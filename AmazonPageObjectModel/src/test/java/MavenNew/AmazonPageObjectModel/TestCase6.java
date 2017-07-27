package MavenNew.AmazonPageObjectModel;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Activities.RespectiveActivitides;

public class TestCase6 extends RespectiveActivitides{
	
	
	@Test(description="Finds of the HelpPage page is reachable")
	public void testCase6()
	{
		LoginPage obj6=new LoginPage(driver);
		
		obj6.conditionMethod();
		test.log(LogStatus.PASS,"The help link is clicked");
		
	}
	

}
