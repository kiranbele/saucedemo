package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC08AboutCheckclass {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://www.saucedemo.com/");
System.out.println("URL is open");

//Login Activity
LoginPomClass ob1 = new LoginPomClass(driver);
ob1.sendUname();
System.out.println("Username Entered");
ob1.sendpassword();
System.out.println("Password Entered");
ob1.login();
System.out.println("Click on Login button");
System.out.println("Login Succesfull");

System.out.println("Redirect on Home Page:"+driver.getTitle());
Thread.sleep(2000);

//About Activity

LogoutPOMClass ob2 = new LogoutPOMClass(driver);
ob2.menubtnclick();
Thread.sleep(2000);

CheckAboutPOMclass about = new CheckAboutPOMclass(driver);
about.aboutclick();
System.out.println("Redirect on About sauce Demo page");

		
	}

}
