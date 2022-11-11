package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://www.saucedemo.com/");
System.out.println("URL is open");

WebElement username = driver.findElement(By.id("user-name"));
username.sendKeys("standard_user");
Thread.sleep(1000);
System.out.println("Username entred:" +username);

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
wait.until(ExpectedConditions.visibilityOf(username));

WebElement password = driver.findElement(By.id("password"));
password.sendKeys("secret_sauce");
Thread.sleep(1000);
System.out.println("Password is enterd:" +password);


WebElement login = driver.findElement(By.id("login-button"));
login.click();
Thread.sleep(2000);
System.out.println("Click on log in button");
System.out.println("Redirect on home page");

	}

}
