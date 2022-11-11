package pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMclass {
	//Here we maintain all Web elements(annotations)
	
	private WebDriver driver;
	private Select s;
	private JavascriptExecutor js;
	
	//1.Menu Button
	@FindBy (xpath="//button[@id='react-burger-menu-btn']")
	WebElement menubutton;
	
	public void menubtnclick()
	{
		menubutton.click();
	}
	
	//2.About Us
	@FindBy (xpath="//a[@id='about_sidebar_link']")
	WebElement aboutbutton;
	
	public void aboutclick()
	{
		aboutbutton.click();
	}

	//3.Log Out
	@FindBy (xpath="//a[@id='logout_sidebar_link']")
	WebElement logout;
	
	public void logoutclick()
	{
		logout.click();
	}
	
	//4.Select Bag Element
	@FindBy (xpath= "//a[@id='item_4_img_link']")
	private WebElement bagselect;
	
	
	public void prodSelect()
	{
		bagselect.click();
	}
	
	//Validation
	//1st Stape
	@FindBy (xpath= "//div[text()='Sauce Labs Backpack']")
	private WebElement bagsel;

	//2nd Stape
	public String productSelectValidation()
	{
		String ActualProdText = bagsel.getText();
		return ActualProdText;
		
	}

	//5.Bag Add To cart
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addtocarttt;
	
	public void AddtoCart()
	{
		addtocarttt.click();
	}
	
	//6.All Products Add To cart
	@FindBy (xpath= "//button[text()='Add to cart']")
	List <WebElement> allProductSelect;
	
	public void allProductAddCartClick()
	{ //Note-Here need for each loop instead of for loop
		
		for(WebElement i : allProductSelect)
		{
			i.click();
		}
	}
	
	
	//7.Add To Cart Logo
	@FindBy (xpath= "//a[@class='shopping_cart_link']")
	WebElement cartbadge;
	
	public void cart()
	{
		cartbadge.click();
	}
	
	//Validation For AddToCart
	public String getTextForAddToCart()
	{
		String ActualCount = cartbadge.getText();
		return ActualCount;
	}
	
	//8.Buy Product
	@FindBy (xpath= "//button[text()='Continue Shopping']")
	WebElement shopping;
	
	public void shoppingclick()
	{
		shopping.click();
	}

	
	//9.Filter Drop-Down
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement filtercheck;
    
	public void filterclick()
	{
		
		filtercheck.click();
	    s = new Select(filtercheck);
        s.selectByValue("lohi");
        
	}
	//validation
     public void filterValidation()
     {
//    	 String ActualText = filtercheck.getText();
//    	 System.out.println(ActualText);
//    	 String ExpectedText = "Price (low to high)";
//    	 
//    	 if(ActualText.equals(ExpectedText))
//    	 {
//         	System.out.println("TC is Pass"); 
//
//    	 }	
//    	 else
//    	 {
//         	System.out.println("TC is Fail"); 
//
//    	 }
         boolean res = filtercheck.isDisplayed();
         System.out.println(res);
         
         if(res==true)
         {
        	System.out.println("TC is Pass"); 
         }
         else
         {
        	 System.out.println("TC is Fail");
         }
      }
	
	//10.Scrolling
	public void scroll()
	{
	js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	}
	

//**********//**************//********************************************

	public HomePOMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
