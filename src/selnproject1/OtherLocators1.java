package selnproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherLocators1
{
 public static void main(String[] args) throws InterruptedException 
 {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.saucedemo.com/");
Thread.sleep(5000);

WebElement uname = driver.findElement(By.tagName("input"));
uname.sendKeys("standard_user");

WebElement pw = driver.findElement(By.id("password"));
pw.sendKeys("secret_sauce");

WebElement logn = driver.findElement(By.name("login-button"));
logn.click();

System.out.println(driver.getTitle());

}
}
