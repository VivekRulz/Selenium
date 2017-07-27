package MavenNew.AmazonPageObjectModel;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Activities.RespectiveActivitides;

public class TestCase4 extends RespectiveActivitides{
	
	@Test(description="Finds of the ConditionsOfUse page is reachable")
	public void testCase4()
	{
		LoginPage obj4=new LoginPage(driver);
		obj4.conditionMethod();
		test.log(LogStatus.PASS,"The conditions link is clicked");
		
	}
	

}
