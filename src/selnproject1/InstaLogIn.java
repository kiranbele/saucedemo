package selnproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogIn
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.instagram.com/accounts/login/");
Thread.sleep(1000);

WebElement uname = driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']"));
uname.sendKeys("kiranbele706");

WebElement pass = driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']"));
pass.sendKeys("kiran@bele");

WebElement Login = driver.findElement(By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm                                                                                                              ']"));
Login.click();
Thread.sleep(3000);

WebElement img = driver.findElement(By.xpath("//span[@class='_aa8h _aa8i']"));
img.click();

WebElement logout = driver.findElement(By.xpath("//div[text()='']"));
logout.click();



	}

}
