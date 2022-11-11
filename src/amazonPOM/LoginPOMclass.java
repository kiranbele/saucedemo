package amazonPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMclass {
	
	private WebDriver driver;
	
	//1.User Name
	@FindBy(xpath= "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]")
	WebElement uname;
	
	public void unameEnter()
	{
		uname.sendKeys("kiranbele72@gmail.com");
	}
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue1;
	
	public void continueClick()
	{
		continue1.click();
	}
	
	//2.Password
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	public void passwordEnter()
	{
		password.sendKeys("7276231236");
	}
	
	//3.Login
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement login;
	
	public void LoginClick()
	{
		login.click();
	}
	
	//Validation
	public void homePageTitle()
	{
		String ActialTitle=driver.getTitle();
	}
	
	public LoginPOMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
