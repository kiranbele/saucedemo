package collectionInSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
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

WebElement password = driver.findElement(By.id("password"));
password.sendKeys("secret_sauce");
Thread.sleep(1000);
System.out.println("Password is enterd:" +password);


WebElement login = driver.findElement(By.id("login-button"));
login.click();
Thread.sleep(2000);
System.out.println("Click on log in button");
System.out.println("Redirect on home page");
Thread.sleep(2000);

List <WebElement> addtocart = driver.findElements(By.xpath("//button[text()='Add to cart']"));
//addtocart.click(); //--> Not possible
Thread.sleep(2000);

//Here we use get() of List
//call with Index no

//WebElement prod1 = addtocart.get(0);
//prod1.click();
//
//WebElement prod2 = addtocart.get(1);
//prod2.click();
//
//WebElement prod3 = addtocart.get(2);
//prod3.click();
//
//WebElement prod4 = addtocart.get(3);
//prod4.click();
//
//WebElement prod5 = addtocart.get(4);
//prod5.click();
//
//WebElement prod6 = addtocart.get(5);
//prod6.click();

//Note--> Instead of that we use For Loop

for(int i=0; i<addtocart.size(); i++)
{
	addtocart.get(i).click();
	System.out.println("Add to cart");

}
	}

}
