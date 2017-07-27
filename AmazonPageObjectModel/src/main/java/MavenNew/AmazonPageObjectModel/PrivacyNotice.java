package MavenNew.AmazonPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.LogStatus;

import Activities.RespectiveActivitides;

public class PrivacyNotice {
	RemoteWebDriver driver;
	
	String PrivacyNoticePageTitle="Amazon.in";
	
	By PrivacyHeadingElement=By.xpath("//h1[text()='Amazon.in Privacy Notice']");
	
	public PrivacyNotice(RemoteWebDriver driver)
	{
		this.driver=driver;
		if(!verifyTitle())
		{
			throw new RuntimeException("Failure");
		}
		else
		{
			
			System.out.println("The PrivacyNotice is reached");
		}
	}
	
	public boolean verifyTitle()
	{
		String title=driver.getTitle();
		if(title.contains(PrivacyNoticePageTitle))
		{
			return true;
		}
		return false;
	}
	
	
	public PrivacyNotice PrivacyHeading()
	{
		String text=driver.findElement(PrivacyHeadingElement).getText();
		System.out.println(text);
		return this;
	}
}
