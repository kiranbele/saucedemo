package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://demoqa.com/buttons");
System.out.println("URL is open");

WebElement dclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
Actions act = new Actions(driver);
act.doubleClick(dclick).perform();

WebElement msg = driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
String giventext = "You have done a double click";

String gettext = msg.getText();
if(giventext.equals(gettext))
{
	System.out.println("TC pass");
}
else
{
	System.out.println("TC Fail");
}


	}

}



