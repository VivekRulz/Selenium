package MavenNew.AmazonPageObjectModel;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Activities.RespectiveActivitides;

public class TestCase1 extends RespectiveActivitides{
	
	@Test(description="Finds if the AmazonHomePage is reachable")
	@Parameters({"cxEmailAddress","cxPassword"})
	public void testCase1(String emailentry,String passwordEntry)
	{
		LoginPage loginobj=new LoginPage(driver);
		loginobj.emailEnterMethod(emailentry);
		test.log(LogStatus.PASS,"Email is passed");
		loginobj.passwordEnterMethod(passwordEntry);
		test.log(LogStatus.PASS,"Password is passed");
		loginobj.LoginPressMethod();
		test.log(LogStatus.PASS,"LoginButton is passed");
		Assert.assertE
		
	}

	
	
	
	

}
