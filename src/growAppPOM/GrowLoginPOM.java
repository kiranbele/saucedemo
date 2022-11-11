package growAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowLoginPOM {
	
	private WebDriver driver; 
	
	@FindBy (xpath="//span[text()='Login/Register'] ")
	private WebElement login1;
	
	public void login1Click()
	{
		login1.click();
	}
	
	@FindBy (xpath="//input[@id='login_email1']")
	private WebElement email;
	
	public void enterEmail()
	{
		email.sendKeys("kiranbele72@gmail.com");
	}
	
	@FindBy (xpath="//span[text()='Continue']")
	private WebElement contn;
	
	public void continueClick()
	{
		contn.click();
	}

	
	@FindBy (xpath="//input[@id='login_password1']")
	private WebElement password;
	
	public void enterPassword()
	{
		password.sendKeys("zara1679");
	}
	
	@FindBy (xpath="//span[text()='Submit']")
	private WebElement submit;

    public void submitClick()
    {
    	submit.click();
    }
    
    public GrowLoginPOM(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    }

}
