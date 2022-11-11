package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPOMclass {
	WebDriver driver;
	
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addtocart;
	
	public void AddtoCart()
	{
		addtocart.click();
	}
	
	@FindBy (xpath= "//span[@class='shopping_cart_badge']")
	WebElement cartbadge;
	
	public void cart()
	{
		cartbadge.click();
	}
	
	public AddToCartPOMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
