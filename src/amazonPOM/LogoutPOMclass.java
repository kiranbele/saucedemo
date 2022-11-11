package amazonPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOMclass {
	private WebDriver driver;
	
	//1.Clicked on menu button
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	WebElement menubutton;
	
	public void menuButtonClick()
	{
		menubutton.click();
	}
	
	//2.Logout
	@FindBy(xpath="/html/body/div[3]/div[2]/div/ul[1]/li[30]/a")
	WebElement Logout;
	
	public void logoutClick()
	{
		Logout.click();
	}

	public LogoutPOMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
