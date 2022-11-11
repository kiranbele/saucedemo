package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
System.out.println("URL is open");

WebElement hidebutton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
hidebutton.click();
Thread.sleep(3000);


WebElement showbutton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
showbutton.click();
boolean result2 = showbutton.isDisplayed();
System.out.println("Text box presence after click on show button");
Thread.sleep(3000);

WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
boolean result1 = textbox.isDisplayed();
System.out.println("Text box presence after clicked on hide button" +result1);
Thread.sleep(3000);



if(result2==true)
{
	textbox.sendKeys("kiranbele");
	System.out.println("Test case pass");
}

else
{
	System.out.println("Test case is failed");
}

	}
}
