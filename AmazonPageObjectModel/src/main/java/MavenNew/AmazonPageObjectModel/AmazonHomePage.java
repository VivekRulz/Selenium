package MavenNew.AmazonPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AmazonHomePage {
	
	public RemoteWebDriver driver;
	
	String AmazonTitle="Online Shopping: Shop Online";
	
	By search=By.id("twotabsearchtextbox");
	
	public AmazonHomePage(RemoteWebDriver driver)
	{
		this.driver=driver;
		if(!verifyTitle())
		{
			throw new RuntimeException("Failure");
		}
		else
		{
			System.out.println("The amazonHomepage is reached");
			
		}
	}
	
	public boolean verifyTitle()
	{
		String title=driver.getTitle();
		if(title.contains(AmazonTitle))
		{
			return true;
		}
		return false;
	}
	
	
	public AmazonHomePage searchItem(String item)
	{
		driver.findElement(search).sendKeys(item);
		System.out.println("The search item is enetered");
		return this;
	}
	
	
	
	
}
