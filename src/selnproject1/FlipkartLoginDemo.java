package selnproject1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.flipkart.com/");
//driver.navigate().refresh();

WebElement enteremail = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
enteremail.sendKeys("7841021679");
Thread.sleep(1000);

WebElement enterpass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
enterpass.sendKeys("kiran@bele");

WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
login.click();
Thread.sleep(3000);

WebElement searchbox = driver.findElement(By.xpath("//input[@class='_3704LK']"));
searchbox.sendKeys("iphone13");
Thread.sleep(3000);

WebElement searchclick = driver.findElement(By.xpath("//button[@type='submit']"));
searchclick.click();
Thread.sleep(1500);

WebElement iphone13 = driver.findElement(By.xpath("//img[@alt='APPLE iPhone 13 (Midnight, 128 GB)']"));
iphone13.click();
Thread.sleep(3000);

List<String> addct = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(addct.get(1));
Thread.sleep(3000);


WebElement addcart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
addcart.click();
//WebElement otp = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3NgS1a']"));
//otp.click();


//WebElement forgotpw = driver.findElement(By.partialLinkText("Forgot?"));
//forgotpw.click();


//WebElement email = driver.findElement(By.className("_2IX_2- VJZDxU"));
//email.sendKeys("kiranbele72@gmail.com");

//WebElement pass = driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU"));
//pass.sendKeys("gsgab86");



}
}