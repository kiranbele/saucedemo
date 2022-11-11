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

public class FBmultipleScreenshot {
	
	static WebDriver driver;
	
	public static void getScreenshotmethod(String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\Admin\\Downloads\\Screenshots"+name+ ".jpg");
		FileHandler.copy(srcfile, destfile);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://www.facebook.com/");
getScreenshotmethod("LoginFB");

WebElement Login = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
Login.sendKeys("7841021679");

WebElement Password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
Password.sendKeys("kiran@bele");

WebElement LoginButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
LoginButton.click();
getScreenshotmethod("HomeFB");

WebElement clickimg = driver.findElement(By.xpath("//circle[@class='xbh8q5q x1pwv2dq xvlca1e']"));
clickimg.click();
getScreenshotmethod("logoutFB");
//WebElement Logout = driver.findElement(By.xpath("(//html//body//div[1]//div//div//div//div//div[1]//div[2]//div//div[5]//div//div[1])[7]"));
//Logout.click();

WebElement logout = driver.findElement(By.xpath("//span[text()='Log Out']"));
logout.click();



}
}
