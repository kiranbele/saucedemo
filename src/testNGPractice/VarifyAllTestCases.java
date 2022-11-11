package testNGPractice;

import org.testng.annotations.Test;

import pom.HomePOMclass;
import pom.LogoutPOMClass;

public class VarifyAllTestCases extends TestBaseClass {
	
	@Test (priority=0, invocationCount=1)
	public void VarifyLogin()
	{
		String ExpectedTitle = "Swag Labs";
		
		String actualtitle = driver.getTitle();

		if(actualtitle.equals(ExpectedTitle))
		{
			System.out.println("TC pass");
		}	

		else
		{
			System.out.println("TC Fail");
		}

	}		
		@Test(priority=1)
		
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

		   String ExpectedText="6";
		   String result= hm.getTextForAddToCart();
		   if(ExpectedText.equals(result))
		   {
			   System.out.println("All Product add in cart");
		   }
		   else
		   {
			   System.out.println("All product not add in cart");
		   }
		}
		
		@Test
		
		public void varifyLogOut() throws InterruptedException
		{
			LogoutPOMClass ob2 = new LogoutPOMClass(driver);
			ob2.menubtnclick();
			Thread.sleep(2000);

			System.out.println("Click on menu button");
			ob2.logoutclick();
			Thread.sleep(1000);

			System.out.println("Click on logout button");
			System.out.println("Logout Succesfull");

			//Validation
			String ExpectedTitle = "Swag Labs";

			String actualtitle = driver.getTitle();

			if(actualtitle.equals(ExpectedTitle))
			{
				System.out.println("TC pass");
			}	

			else
			{
				System.out.println("TC Fail");
			}

		}


}

