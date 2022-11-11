package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://demoqa.com/buttons");
System.out.println("URL is open");
Thread.sleep(2000);


WebElement clk = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
Actions act = new Actions(driver);
act.click(clk).perform();

WebElement message = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
String gettext = "You have done a dynamic click";
String actualtext = message.getText();

if(actualtext.equals(gettext))
{
  System.out.println("Tc is pass--> "+actualtext);	
}
else
{
	System.out.println("TC is fail");
}

}
}
