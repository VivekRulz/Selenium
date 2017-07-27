package MavenNew.AmazonPageObjectModel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;


public class LoginPage {
	
	RemoteWebDriver driver;
	
	
	String loginTitle="Amazon Sign In";
	
	By emailElement=By.name("email");
	
	By passwordElement=By.name("password");
	
	By LoginButtonElement=By.xpath("//input[@type='submit']");
	
	By forgotPasswordElement=By.xpath("//a[contains(text(),'Forgot Password')]");
	
	By createAccountElement=By.id("createAccountSubmit");
	
	By conditionsOfUseElement=By.xpath("//a[contains(text(),' Conditions of Use')]");
	
	By PrivacyNoticeElement=By.xpath("//a[contains(text(),' Privacy Notice')]");
	
    By helpElement=By.xpath("//a[contains(text(),' Help')]") ;
    
	public LoginPage(RemoteWebDriver driver)
	{
	this.driver=driver;
	
	if(!verifyTitle())
	{
		throw new RuntimeException("FAILED");
		
	}
	else
	{
		System.out.println("The AmazonPageLogin is reached");
	}
	}
	public boolean verifyTitle()
	{
		String title=driver.getTitle();
		if(title.equals(loginTitle))
		{
			return true;
		}
		return false;
	}
	public LoginPage emailEnterMethod(String emailadd)
	{
		driver.findElement(emailElement).sendKeys(emailadd);
		System.out.println("The email is entered");
		return this;
	}
	public LoginPage passwordEnterMethod(String passwordadd)
	{
		driver.findElement(passwordElement).sendKeys(passwordadd);
		System.out.println("The password is entered");
		return this;
	}

	public AmazonHomePage LoginPressMethod()
	{
		driver.findElement(LoginButtonElement).click();
		System.out.println("The loginButton is pressed");
		return new AmazonHomePage(driver);
	}
	
	public ForgetPasswordPage forgetMethod()
	{
	driver.findElement(forgotPasswordElement).click();
	System.out.println("The forgotButton is clicked");
	return new ForgetPasswordPage(driver);
	}
	
	public CreateNewAccountPage createAccountMethod()
	{
		driver.findElement(createAccountElement).click();
		System.out.println("The createNewAccount link is clicked");
		return new CreateNewAccountPage(driver);
	}
	
	public ConditionsOfUse conditionMethod()
	{
		driver.findElement(conditionsOfUseElement).click();
		switchWindow();
		System.out.println("The ConditionsOfUSe link is clicked");
		return new ConditionsOfUse(driver);
	}
	
	public PrivacyNotice privacyNoticeMethod()
	{
		driver.findElement(PrivacyNoticeElement).click();
		System.out.println("The PrivacyNotice link is clicked");
		switchWindow();
		return new PrivacyNotice(driver);
	}
	
	public Help helpMethod()
	{
		driver.findElement(PrivacyNoticeElement).click();
		System.out.println("The help link is clicked");
		switchWindow();
		return new Help(driver);
		
	}
	public void switchWindow()
	{
		Set<String> window=driver.getWindowHandles();
		
		for(String item:window)
		{
			driver.switchTo().window(item);
		}
		
	}
	
}
