package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://demoqa.com/buttons");
System.out.println("URL is open");

WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
Actions act = new Actions(driver);
act.contextClick(rightclick).perform();

WebElement text = driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
String demotext = "You have done a right click";
String actualtext = text.getText();

if(actualtext.equals(demotext))
{
	System.out.println("TC is Pass");
}
else
{
	System.out.println("TC is fail");
}


}
}
