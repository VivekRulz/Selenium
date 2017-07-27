package MavenNew.AmazonPageObjectModel;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Activities.RespectiveActivitides;

public class TestCase3 extends RespectiveActivitides{
	
	@Test(description="Finds if the CreateAccount Page is reachable")
	public void testCase3()
	{
		LoginPage obj3=new LoginPage(driver);
		obj3.createAccountMethod();
		test.log(LogStatus.PASS,"The createAccount link is clicked");
		
	}
	

}
