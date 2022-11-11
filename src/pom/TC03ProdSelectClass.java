package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03ProdSelectClass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://www.saucedemo.com/");
System.out.println("URL is open");

//LogIn Activity
LoginPomClass ob1 = new LoginPomClass(driver);
ob1.sendUname();
System.out.println("Username Entered");
ob1.sendpassword();
System.out.println("Password Entered");
ob1.login();
System.out.println("Click on Login button");

HomePOMclass hm = new HomePOMclass(driver);
hm.prodSelect();
System.out.println(driver.getCurrentUrl());
System.out.println("Bag is selected");

//Validation
String res = hm.productSelectValidation();
System.out.println(res);
String ExpectedProdText="Sauce Labs Backpack";

if(res.equals(ExpectedProdText))
{
	System.out.println("TC Pass");
}
else
{
	System.out.println("TC Fail");
}

	}

}
