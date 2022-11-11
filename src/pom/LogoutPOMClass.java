package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOMClass {
	
	WebDriver driver;
	
	@FindBy (xpath="//button[@id='react-burger-menu-btn']")
	WebElement menubutton;
	
	public void menubtnclick()
	{
		menubutton.click();
	}
	
	@FindBy (xpath="//a[@id='logout_sidebar_link']")
	WebElement logout;
	
	public void logoutclick()
	{
		logout.click();
	}
	
	public LogoutPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	

}
