package selnproject1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginDemo {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	Thread.sleep(1000);
	
	WebElement emailid = driver.findElement(By.id("ap_email"));
	emailid.sendKeys("kiranbele72@gmail.com");
	
	WebElement cont = driver.findElement(By.id("continue"));
	cont.click();
	
	WebElement pass = driver.findElement(By.id("ap_password"));
	pass.sendKeys("7276231236");
	Thread.sleep(1000);

	WebElement signin = driver.findElement(By.id("signInSubmit"));
	signin.click();
	
//	WebElement buyagain = driver.findElement(By.linkText("Buy Again"));
//	buyagain.click();
//	
	WebElement searchelement = driver.findElement(By.id("twotabsearchtextbox"));
	searchelement.sendKeys("I phone 12");
	
	WebElement search = driver.findElement(By.id("nav-search-submit-button"));
	search.click();

    WebElement clk = driver.findElement(By.linkText("Apple iPhone 12 (64GB) - White"));
	clk.click();
	
	List<String>nextpage = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(nextpage.get(1));
	////X path by attribute....	
    
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	System.out.println("Scrolled down");

    WebElement clickaddcart = driver.findElement(By.xpath("//input[contains(@id,'add-to-cart-button')]"));
    clickaddcart.click();
    Thread.sleep(3000);
    
    WebElement crossclick = driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']"));
    crossclick.click();
    Thread.sleep(3000);

    WebElement so = driver.findElement(By.id("nav-hamburger-menu"));
	so.click();
	Thread.sleep(3000);
	
    WebElement signout = driver.findElement(By.linkText("Sign Out"));
    signout.click();

 
    

	
//	WebElement whey = driver.findElement(By.partialLinkText("Currently unavailable."));
//	whey.click();
//
//	
//	WebElement clik = driver.findElement(By.className("nav-line-2 "));
//	clik.click();
	



	

	}

}
