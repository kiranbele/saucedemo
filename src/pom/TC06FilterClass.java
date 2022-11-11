package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC06FilterClass {
	public static void main(String[] args) throws InterruptedException {
	
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

HomePOMclass hm = new HomePOMclass(driver);
//hm.prodSelect();
//System.out.println("Bag is selected");
//
////AddToCartPOMclass addcart = new AddToCartPOMclass(driver);
//hm.AddtoCart();
//hm.cart();
//System.out.println("Add to Cart is succesfull");
//
////BuyProductPOMclass buy = new BuyProductPOMclass(driver);
//hm.shoppingclick();
//System.out.println("Successful Product buy");
//Thread.sleep(2000);

//FilterPOMclass filt = new FilterPOMclass(driver);
hm.filterclick();
System.out.println("Clicked on Filter");
System.out.println("Price Low to High Selected");



	}

}
