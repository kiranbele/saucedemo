package selnproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogInDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com/");
Thread.sleep(2000);
//driver.manage().deleteAllCookies();

JavascriptExecutor js = (JavascriptExecutor) driver;

WebElement Login = driver.findElement(By.id("email"));
//Login.sendKeys("7841021679");
js.executeScript("arguments[0].value='7841021679'", Login);

WebElement Password = driver.findElement(By.id("pass"));
Password.sendKeys("kiran@bele");

WebElement LoginButton = driver.findElement(By.name("login"));
LoginButton.click();

//WebElement msg = driver.findElement(By.xpath("//div[contains(@aria-label,'Messenger')]"));
//msg.click();

WebElement clickimg = driver.findElement(By.xpath("//div[@class='aglvbi8b om3e55n1 i8zpp7h3 g4tp4svg']"));
clickimg.click();
Thread.sleep(2000);

WebElement logout = driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
logout.click();

//WebElement forgotpass = driver.findElement(By.linkText("Forgotten password?"));
//forgotpass.click();
//
//WebElement mail = driver.findElement(By.id("identify_email"));
//mail.sendKeys("kiranbele88@gmail.com");
//
//WebElement clk = driver.findElement(By.id("did_submit"));
//clk.click();





	}

}
