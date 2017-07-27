package MavenNew.AmazonPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.LogStatus;

import Activities.RespectiveActivitides;

public class Help {
	RemoteWebDriver driver;
	
	String HelpPageTitle="Amazon.in";
	
	By helpSearchElement=By.id("helpsearch");
	
	public Help(RemoteWebDriver driver)
	{
		this.driver=driver;
		if(!verifyTitle())
		{
			throw new RuntimeException("Failure");
		}
		else
		{
			System.out.println("The Help is reached");
			
		}
	}
	
	public boolean verifyTitle()
	{
		String title=driver.getTitle();
		if(title.contains(HelpPageTitle))
		{
			return true;
		}
		return false;
	}
	
	
	public Help helpItem(String help)
	{
		driver.findElement(helpSearchElement).sendKeys(help);
		System.out.println("The help is entered");
		return this;
	}

}
