package selnproject1;

import javax.annotation.concurrent.ThreadSafe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelinPractice
{

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver",
		//		"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Admin\\Downloads\\Firefox drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		String weburl = driver.getCurrentUrl();
		System.out.println("Website URL is: " +weburl);
		
		String title = driver.getTitle();
		System.out.println("Webpage Title is:"+title);
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		//driver.close();  //close current window
		//driver.quit();     //close browser
		
	}
}
