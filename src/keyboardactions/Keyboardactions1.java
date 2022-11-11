package keyboardactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions1 {
	 public static void main(String[] args) throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");

		driver.manage().window().maximize();
		System.out.println("Browser is maximize");

		driver.get("https://the-internet.herokuapp.com/key_presses");
		System.out.println("URL is open");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.sendKeys("G").perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);

        act.sendKeys(Keys.CONTROL).perform();
		Thread.sleep(1000);

        act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(1000);

}
}
