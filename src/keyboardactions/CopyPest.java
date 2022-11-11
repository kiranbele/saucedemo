package keyboardactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPest {
	
	 public static void main(String[] args) throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");

		driver.manage().window().maximize();
		System.out.println("Browser is maximize");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://text-compare.com/");
		System.out.println("URL is open");
//		Thread.sleep(5000);
		
		WebElement text1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		text1.sendKeys("Hi I am Kiran Bele");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Actions act = new Actions(driver);
		
		//select all (cntrl+A)
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		System.out.println("All data selected");
		
		//select all (cntrl+c)

        act.keyDown(Keys.CONTROL);
        act.sendKeys("c");
        act.keyUp(Keys.CONTROL);
        act.perform();
        System.out.println("All data copied");
        
		WebElement text2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		text2.click();
		System.out.println("Clicked on 2nd text box");
		
		//Pest data in text box2
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		System.out.println("All data pest in text box 2");
		
		//click on compare button
		
		WebElement compare = driver.findElement(By.xpath("//div[text()='Compare!']"));
		compare.click();
		
		WebElement msg = driver.findElement(By.xpath("//span[text()='The two texts are identical!']"));
		
		boolean res=msg.isDisplayed();
		if(res==true)
		{
			System.out.println("TC pass");
		}
		
		else
		{
			System.out.println("TC fail");
		}
		
//		String getmsg="The two texts are identical!";
//		
//		String actualmsg = msg.getText();
//		System.out.println(actualmsg);
//		
//		if(actualmsg.equals(getmsg))
//		{
//			System.out.println("TC is pass");
//		}
//		else
//		{
//			System.out.println("TC is fail");
//		}
		
}
}

