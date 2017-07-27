package MavenNew.AmazonPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ConditionsOfUse  {
	RemoteWebDriver driver;
	
	String conditionsOfUseTitle="Amazon.in Help";
	
	By help=By.id("helpsearch");
	
	public ConditionsOfUse(RemoteWebDriver driver)
	{
		this.driver=driver;
		if(!verifyTitle())
		{
			throw new RuntimeException("Failed");
		}
		else
		{
			System.out.println("The ConditionsOfUsePage is reached");
			driver.close();
		}
	}
	
	public boolean verifyTitle()
	{
		String title=driver.getTitle();
		if(title.contains(conditionsOfUseTitle))
		{
			return true;
		}
		return false;
	}
	
	public  ConditionsOfUse helpSearch(String search)
	{
		driver.findElement(help).sendKeys(search);
		System.out.println("The searchItem is entered");
		return this;
	}
	
	
	
}
