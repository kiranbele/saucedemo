package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.HomePOMclass;


public class VarifyAddtocartAllProducts extends TestBaseClass {
	
	@Test
	
	public void addToCartallProducts() throws InterruptedException
	{
		HomePOMclass hm = new HomePOMclass(driver);
		hm.allProductAddCartClick();
		System.out.println("All prod add to cart");
		Thread.sleep(2000);
		
		hm.scroll();
		System.out.println("Scrolling down");
		
		hm.cart();
		System.out.println("Check in Add to cart gallery");
		Thread.sleep(2000);

	   String ExpectedText="5";
	   String result= hm.getTextForAddToCart();
	   
	   Assert.assertEquals(result, ExpectedText);
  
	}

}
