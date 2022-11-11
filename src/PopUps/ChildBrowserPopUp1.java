package PopUps;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://vctcpune.com/");
System.out.println("Website is open");
Thread.sleep(2000);

WebElement startselpract = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
startselpract.click();

//Handle child window
List<String> allelementclick = new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(allelementclick.get(1));
Thread.sleep(2000);

WebElement textbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
textbox.sendKeys("India");


	}

}
