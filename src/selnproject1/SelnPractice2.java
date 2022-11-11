package selnproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelnPractice2 
{
	public static void main(String[] args) throws InterruptedException
	{
		
//check title and url with actual 		
		
		System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		String geturl = "https://www.amazon.in/";
		String actualurl = driver.getCurrentUrl();
		
		if(geturl.equals(actualurl))
		{
			System.out.println("Passing url is correct..");
		}
		
		else
		{
			System.out.println("Passing url is incorrect..");
		}
		
		String gettitle = "Amazon";
		String actualtitle = driver.getTitle();
		
		if(gettitle.equals(actualtitle))
		{
			System.out.println("Title is correct..");
		}
		else
		{
			System.out.println("Incorrect title..");
		}
		
		driver.quit();
		
		}

}
