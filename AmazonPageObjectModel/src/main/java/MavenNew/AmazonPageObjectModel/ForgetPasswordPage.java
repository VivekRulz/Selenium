package MavenNew.AmazonPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.LogStatus;

import Activities.RespectiveActivitides;

public class ForgetPasswordPage  {
RemoteWebDriver driver;
	
	String forgetPasswordTitle="Amazon Password Assistance";
	
	By forgetEmailElement=By.id("ap_email");
	
	public ForgetPasswordPage(RemoteWebDriver driver)
	{
		this.driver=driver;
		if(!verifyTitle())
		{
			throw new RuntimeException("Failure");
		}
		else
		{
			System.out.println("The ForgetPasswordPage is reached");
		}
	}
	
	public boolean verifyTitle()
	{
		String title=driver.getTitle();
		if(title.equals(forgetPasswordTitle))
		{
			return true;
		}
		return false;
	}
	
	
	public ForgetPasswordPage forgetPassword(String email)
	{
		driver.findElement(forgetEmailElement).sendKeys(email);
		System.out.println("The email is entered");
		return this;
	}

}
