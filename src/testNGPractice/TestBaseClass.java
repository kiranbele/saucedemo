package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pom.LoginPomClass;

public class TestBaseClass {
WebDriver driver;

@Parameters("browserName")
@BeforeMethod
public void setUp(String browserName)
{
	if(browserName.equals("chrome"))
	{	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");
	
	driver = new ChromeDriver();

	}
	
	else
	{
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\Admin\\Downloads\\Firefox drivers\\geckodriver.exe");
	
	driver = new FirefoxDriver();

	}
	
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://www.saucedemo.com/");
System.out.println("URL is open");

//LogIn Activity
LoginPomClass ob1 = new LoginPomClass(driver);
ob1.sendUname();
System.out.println("Username Entered");
ob1.sendpassword();
System.out.println("Password Entered");
ob1.login();
System.out.println("Click on Login button");
System.out.println("Redirect on Home Page");

}
@AfterMethod
	public void tearDown()
	{	
		driver.quit();
		System.out.println("browser is closed");
	}


}
