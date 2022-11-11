package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.LogoutPOMClass;

public class VarifyLogoutFunctionality extends TestBaseClass {
	
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
        
		Assert.assertEquals(actualtitle, ExpectedTitle);

	}

}
