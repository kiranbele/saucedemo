package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckAboutPOMclass {
	WebDriver driver;
	
	@FindBy (xpath="//button[@id='react-burger-menu-btn']")
	WebElement menubutton;
	
	public void menusclick()
	{
		menubutton.click();
	}
	
	@FindBy (xpath="//a[@id='about_sidebar_link']")
	WebElement aboutbutton;
	
	public void aboutclick()
	{
		aboutbutton.click();
	}

public CheckAboutPOMclass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	

}
