package MavenNew.AmazonPageObjectModel;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Activities.RespectiveActivitides;

public class TestCase5 extends RespectiveActivitides {
	@Test(description="Finds of the PrivacyNotice page is reachable")
	public void testCase5()
	{
		LoginPage obj5=new LoginPage(driver);
		
		obj5.privacyNoticeMethod();
		test.log(LogStatus.PASS,"The PrivacyNotice link is clicked");
	}
	
}
