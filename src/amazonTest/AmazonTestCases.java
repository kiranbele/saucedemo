package amazonTest;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amazonPOM.HomePOMclass;
import amazonPOM.LoginPOMclass;
import amazonPOM.LogoutPOMclass;
import utility.UtilityClass;

public class AmazonTestCases {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
System.out.println("Browser Maximize");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
Thread.sleep(1000);
System.out.println("URL enterd");

UtilityClass src = new UtilityClass(driver);
src.getScreenShot(driver,"Login page");

LoginPOMclass lg = new LoginPOMclass(driver);
lg.unameEnter();
System.out.println("User name enterd");

lg.continueClick();
System.out.println("Continue..");

lg.passwordEnter();
System.out.println("Password name enterd");

lg.LoginClick();
System.out.println("Successfully Login");

String ExpectedTitle= "Amazon Sign In";
String ActualTitle = driver.getTitle();	
if(ActualTitle.equals(ExpectedTitle))
{
	System.out.println("Redirect on Home page");
	System.out.println("TC Pass");

}
else
{
	System.out.println("TC fail");

}
src.getScreenShot(driver,"Home page");


HomePOMclass hp = new HomePOMclass(driver);
hp.searchItems();
System.out.println("Search Item-->Iphone12");
hp.searchClick();
System.out.println("Clicked on search button");
hp.scrollDown();
System.out.println("Scroll down");
hp.IphoneClick();
System.out.println("Clicked on Iphone12");
src.getScreenShot(driver,"I phone12 img ");

hp.scrollDown();
System.out.println("Scroll down");
List<String> ob = new ArrayList(driver.getWindowHandles());
driver.switchTo().window(ob.get(1));
hp.addToCartClick();
Thread.sleep(2000);
System.out.println("Clicked on Add to cart");
src.getScreenShot(driver,"Iphone Add to cart");

hp.crossClick();
System.out.println("Clicked on cross");
Thread.sleep(2000);
//hp.scrollUp();
//JavascriptExecutor js=(JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,-800)");
//System.out.println("Scroll Up");
hp.cartButtonClick();
System.out.println("Cart button displayed");
src.getScreenShot(driver,"My Add to cart");


LogoutPOMclass lp = new LogoutPOMclass(driver);
lp.menuButtonClick();
System.out.println("Menu Button is clickable");
hp.scrollDown();
Thread.sleep(2000);
lp.logoutClick();
System.out.println("Logout Successfully");
src.getScreenShot(driver,"Log in Page again");



	}

}
