package MavenNew.AmazonPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CreateNewAccountPage {
		
RemoteWebDriver driver;
	
	String createAccountTitle="Amazon Registration";
	
	By nameElement=By.id("ap_customer_name");
	
	public CreateNewAccountPage(RemoteWebDriver driver)
	{
		this.driver=driver;
		if(!verifyTitle())
		{
			throw new RuntimeException("Failed");
		}
		else
		{
			System.out.println("The createAccountPage is reached");
		}
	}

	public boolean verifyTitle()
	{
		String title=driver.getTitle();
		if(title.equals(createAccountTitle))
		{
			return true;
		}
		return false;
	}
	public CreateNewAccountPage nameEntry(String name)
	{
		driver.findElement(nameElement).sendKeys(name);
		System.out.println("The name is entered");
		return this;
		
	}

}
