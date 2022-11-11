package selnproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://mail.google.com/mail/");
Thread.sleep(1000);

WebElement email = driver.findElement(By.id("identifierId"));
email.sendKeys("kiranbele70@gmail.com");

WebElement next = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
next.click();



	}

}
