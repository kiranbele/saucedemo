package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MultipleScreenshot {
	
	static WebDriver driver;
	public static void getscreenshot(String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\Admin\\Downloads\\Screenshots\\"+name+".jpg");
	    FileHandler.copy(sourcefile, destfile);
	}

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://www.saucedemo.com/");
System.out.println("URL is open");
getscreenshot("LoginPagepp1");

WebElement username = driver.findElement(By.id("user-name"));
username.sendKeys("standard_user");
Thread.sleep(1000);
System.out.println("Username entred:" +username);

WebElement password = driver.findElement(By.id("password"));
password.sendKeys("secret_sauce");
Thread.sleep(1000);
System.out.println("Password is enterd:" +password);


WebElement login = driver.findElement(By.id("login-button"));
login.click();
Thread.sleep(2000);
System.out.println("Click on log in button");
System.out.println("Redirect on home page");
getscreenshot("HomepagePP1");
//take screenshot


	}

}
