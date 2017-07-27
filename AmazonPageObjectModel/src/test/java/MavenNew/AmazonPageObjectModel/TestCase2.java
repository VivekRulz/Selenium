package MavenNew.AmazonPageObjectModel;


import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Activities.RespectiveActivitides;

public class TestCase2 extends RespectiveActivitides{
	
	@Test(description="Finds if the ForgotPassword page is reachable")
	public void testCase2()
	{
	LoginPage obj2=new LoginPage(driver);
	
	obj2.forgetMethod();
	System.out.println("Hello");
	
	}
}
