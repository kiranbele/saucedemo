package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAction {
	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://vctcpune.com/");
System.out.println("URL is open");

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,5000)");
Thread.sleep(2000);

js.executeScript("window.scrollBy(0,-2000)");
Thread.sleep(1000);

//Scroll down to the particular element
WebElement practice = driver.findElement(By.xpath("//a[text()='Click to Start Selenium Practice Now']"));
js.executeScript("arguments[0].scrollIntoView()", practice);


}
}
