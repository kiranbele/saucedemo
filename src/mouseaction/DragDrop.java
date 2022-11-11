package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
System.out.println("URL is open");

WebElement washington = driver.findElement(By.xpath("//div[@id='box3']"));
System.out.println("Wahington");

WebElement USA = driver.findElement(By.xpath("//div[@id='box103']"));
System.out.println("United States");

Actions act = new Actions(driver);
act.dragAndDrop(washington, USA).perform();

String getresult= "United States";
String actualresult = USA.getText();

if(actualresult.equals(getresult))
{
	System.out.println("Washington is a capital of USA");
	System.out.println("TC is pass");
}
else
{
	System.out.println("Washington is not capital of USA");

	System.out.println("TC is fail");
}

}
}
