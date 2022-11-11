package selnproject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//driver.get("https://www.saucedemo.com/");
driver.navigate().to("https://www.saucedemo.com/");

		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("problem_user");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value='standard_user'",username);
//		Thread.sleep(2000);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");

		Thread.sleep(1000);

		
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		
	   WebElement addcart = driver.findElement(By.xpath("(//button[text()='Add to cart'])[5]"));
	   addcart.click();	
//		System.out.println(driver.getTitle());
//		
//		WebElement bagpack = driver.findElement(By.className("inventory_item_name"));
//		bagpack.click();
//		
//		WebElement menubtn = driver.findElement(By.id("react-burger-menu-btn"));
//		menubtn.click();
//		Thread.sleep(2000);
//		
//		WebElement Logout = driver.findElement(By.id("logout_sidebar_link"));
//		Logout.click();
//		
//		System.out.println(driver.getTitle());

		
		

		
		
		
	}

}
