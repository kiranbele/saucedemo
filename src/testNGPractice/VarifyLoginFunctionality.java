package testNGPractice;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class VarifyLoginFunctionality extends TestBaseClass
{
	@Test
	public void VarifyLogin()
	{
		String ExpectedTitle = "Swag Labs";
		
		String actualtitle = driver.getTitle();

        Assert.assertEquals(actualtitle, ExpectedTitle, "Login Activity Fail");
	}
	
	
}
