package growAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowHomePOM {
	private WebDriver driver;
	
	//1.Search share
	@FindBy (xpath="//input[@id='globalSearch23']")
	WebElement searchtext;
	
	public void searchTextBox()
	{
		searchtext.sendKeys("Zomato");
	}
	
   //2.Click on search box
	
	@FindBy (xpath="//span[text()='Zomato']")
	WebElement searchProduct;
	
	public void searchClick()
	{
		searchProduct.click();

     }
	
	//3.Convert NSE to BSE
	
	@FindBy (xpath="//div[@class='bso21Exchange']")
	WebElement BSE;
	
	public void BSEclick()
	{
		BSE.click();
    }
	
	//4.Convert Limit order to Market Order
	
	@FindBy (xpath="//div[@class='bso21OrderTypeSwitcher']")
	WebElement Market;
	
	public void marketClick()
	{
		Market.click();
	}


public GrowHomePOM(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
}
