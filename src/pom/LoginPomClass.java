package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomClass {
	//No need main method
	
	//1; Just declare web driver
	private WebDriver driver;
	private Actions act;

	//2.Use Annotation instead of findElement
	@FindBy(xpath ="//input[@id='user-name']")
	WebElement uname;
	
	//3.Use Encapsulation
	public void sendUname()
	{
		uname.sendKeys("standard_user");
	}
	
	@FindBy (xpath="//input[@id='password']")
	WebElement pass;
	
	public void sendpassword()
	{
		pass.sendKeys("secret_sauce");
	}
	
	@FindBy (xpath="//input[@id='login-button']")
	WebElement loginclick;
	
	public void login()
	{
		loginclick.click();
	}
	
	public void loginclick() //Mouse Action click method
	{
		act.click(loginclick).perform();
	}
	
public LoginPomClass(WebDriver driver)
	{
this.driver=driver;
act=new Actions(driver);
PageFactory.initElements(driver,this);//It is active/trigger your webelements(@FindBy)
	
	}
}
