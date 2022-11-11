package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTestCaseRun {
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
	System.out.println("Redirect on Home Page");
	Thread.sleep(2000);
	
	HomePOMclass hm = new HomePOMclass(driver);
	hm.filterclick();
	System.out.println("Apply Filter=(Name A to Z)");
	Thread.sleep(1000);

//	hm.prodSelect();
//	System.out.println("Prod select");
//	Thread.sleep(1000);
//
//    hm.AddtoCart();
//	System.out.println("Add to cart");
//	Thread.sleep(1000);
	
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
	Thread.sleep(2000);

	
    hm.shoppingclick();
	System.out.println("Prod buy");
	Thread.sleep(1000);


	LogoutPOMClass lout = new LogoutPOMClass(driver);
	lout.menubtnclick();
	System.out.println("Clicked on Menu button");
	Thread.sleep(1000);
	
    lout.logoutclick();
    System.out.println("Logout Successfully");
	System.out.println("We are on Login page again");


	}

}
