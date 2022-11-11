package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {
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
Thread.sleep(3000);

//Hidden Division Pop-up
//Here we find element
WebElement close = driver.findElement(By.xpath("//img[@class='_8idr img']"));
close.click();

	}

}
