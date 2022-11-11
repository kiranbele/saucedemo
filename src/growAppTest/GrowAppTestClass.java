package growAppTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import growAppPOM.GrowHomePOM;
import growAppPOM.GrowLoginPOM;

public class GrowAppTestClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
System.out.println("Browser Maximize");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://groww.in/");
Thread.sleep(1000);
System.out.println("URL enterd");

//Login Process

GrowLoginPOM gl = new GrowLoginPOM(driver);
gl.login1Click();
System.out.println("Login Window open");
gl.enterEmail();
System.out.println("Email entered");
gl.continueClick();
System.out.println("Click on continue");

gl.enterPassword();
System.out.println("Password Entered");
gl.submitClick();
System.out.println("Clicked on submit button");
Thread.sleep(20000);
//Enter OTP and pin manually
System.out.println("Redirect on Home Page");

//Home Page
GrowHomePOM gh = new GrowHomePOM(driver);
gh.searchTextBox();
System.out.println("Pass value-->Zomato");
gh.searchClick();
System.out.println("Product Search");
gh.BSEclick();
System.out.println("Shares convert from NSE to BSE");
gh.marketClick();
System.out.println("Price limit convert to Market limit");

	}
	

}
