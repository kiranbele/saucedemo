package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SauceDemo {
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
username.sendKeys("problem_user");
Thread.sleep(1000);
System.out.println("Username entred:" +username);

WebElement password = driver.findElement(By.id("password"));
password.sendKeys("secret_sauce");
Thread.sleep(1000);
System.out.println("Password is enterd:" +password);


WebElement login = driver.findElement(By.id("login-button"));
login.click();
Thread.sleep(2000);
System.out.println("Click on log in button");
System.out.println("Redirect on home page");

WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
dropdown.click();
System.out.println("Clicked on Dropdown");
Thread.sleep(2000);

Select drop = new Select(dropdown);
//s.selectByIndex(3);
//s.selectByValue("hilo");
drop.selectByVisibleText("Price (high to low)"); //not done


	}
	

}
