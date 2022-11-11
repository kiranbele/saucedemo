package collectionInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBfindElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://www.facebook.com/");
System.out.println("Website is open");
Thread.sleep(2000);

WebElement cna = driver.findElement(By.xpath("//a[text()='Create New Account']"));
cna.click();
System.out.println("Click on Create new Account");
Thread.sleep(5000);

List <WebElement> dayselect = driver.findElements(By.xpath("//select[@id='day']//option"));
for(int i=0; i<dayselect.size(); i++)
{
	dayselect.get(i).click();
	System.out.println("Clickable Days:" +i);
}

List <WebElement> monthselect = driver.findElements(By.xpath("//select[@id='month']//option"));
for(int i=0; i<monthselect.size(); i++)
{
	monthselect.get(i).click();
	System.out.println("Clickable Months:" +i);

}

List <WebElement> yearselect = driver.findElements(By.xpath("//select[@id='year']//option"));
for(int i=0; i<yearselect.size(); i++)
{
	yearselect.get(i).click();
	System.out.println("Clickable Years:" +i);

}
	}
}
