package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://demoqa.com/alerts");
System.out.println("Website is open");
Thread.sleep(2000);

//Normal Alert Handling
WebElement clickme1= driver.findElement(By.xpath("//button[@id='alertButton']"));
clickme1.click();
Thread.sleep(2000);

Alert alt1 = driver.switchTo().alert();
alt1.accept();
System.out.println("Normal alert handling TC pass");

//Time Alert Handling
WebElement clickme2= driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
clickme2.click();
Thread.sleep(6000);

Alert alt2 = driver.switchTo().alert();
System.out.println(alt2.getText());
alt2.accept();
System.out.println("Time alert handling TC pass");

//Confirm text box alert Handling

WebElement clickme3= driver.findElement(By.xpath("//button[@id='confirmButton']"));
clickme3.click();
Thread.sleep(2000);

Alert alt3 = driver.switchTo().alert();
System.out.println(alt3.getText());
alt3.dismiss();
Thread.sleep(3000);

WebElement confirmresult = driver.findElement(By.xpath("//span[@id='confirmResult']"));
String getresult = confirmresult.getText();
if(getresult.equals("You selected "))
{
	System.out.println("Accept");
}
else
	
{
	System.out.println("Dismiss");
}
System.out.println("Confirm text box alert handling TC pass");


//Prompt text box with send-keys
//Here first we need scrolling action
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,1000)");

WebElement clickme4= driver.findElement(By.xpath("//button[@id='promtButton']"));
clickme4.click();
Thread.sleep(1000);

Alert alt4 = driver.switchTo().alert();
alt4.sendKeys("Hi, How are you?");
Thread.sleep(2000);
System.out.println(alt4.getText());
Thread.sleep(2000);
alt4.accept();
System.out.println("Prompt text box alert handling TC pass");
System.out.println("End of program....");





	}

}
