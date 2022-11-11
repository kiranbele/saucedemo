package amazonPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMclass {
	
	private WebDriver driver;
	
	//1.Search Product on Search text box
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchproduct;
	
	public void searchItems()
	{
		searchproduct.sendKeys("I Phone 12");
	}
	
	//2.Search Button
	@FindBy(xpath= "//input[@id='nav-search-submit-button']")
	WebElement searchButton;
	
	public void searchClick()
	{
		searchButton.click();
	}
	
	
	//3.Scrolling
	public void scrollDown()
	{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,700)");
	}
	
	public void scrollUp()
	{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,-700)");
	}

	//4.Select any I phone12
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")
	WebElement Iphone12;
	
	public void IphoneClick()
	{
		Iphone12.click();
	}
	
	//5.Clicked on Add To cart
	@FindBy (xpath="/html/body/div[4]/div[2]/div[3]/div[9]/div[7]/div/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[33]/div[1]/span/span/span/input")
    WebElement addtocart;
	
	public void addToCartClick()
	{
		addtocart.click();
	}
	
	//6.Cross Click
	@FindBy(xpath="//a[@id='attach-close_sideSheet-link']")
	WebElement cross;
	
	public void crossClick()
	{
		cross.click();
	}

	
	//7.Cart Button
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement cartbutton;
	
	public void cartButtonClick()
	{
		cartbutton.click();
	}
	
	//8.Validation Cart Product
	public String cartTextVarified()
	{
	String Actualtxt="Apple iPhone 12 (64GB) - White";
	return Actualtxt;
	}
	
	//Constructor
	
	public HomePOMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
