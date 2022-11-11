package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
System.out.println("URL is open");

WebElement textbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
boolean res1 = textbox.isEnabled();
System.out.println(res1);

if(res1==true)
{
	System.out.println("Test Case is pass");
	textbox.sendKeys("India");
}

else
{
System.out.println("Test case is failed");	
}



	}

}
