package exceptionHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleException {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://www.saucedemo.com/");

		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");

		Thread.sleep(1000);

		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		
		WebElement bag = driver.findElement(By.xpath("//div[@class='inventory_item_name'][1]"));
		bag.click();
		Thread.sleep(2000);

		driver.navigate().back();
		
		//bag.click();

		
	}

}
