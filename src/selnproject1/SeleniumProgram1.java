package selnproject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumProgram1 {

	
	
public static void main(String[] args) throws InterruptedException 
		{
					
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

	//System.setProperty("webdriver.gecko.driver",
		//	"C:\\Users\\Admin\\Downloads\\Firefox drivers\\geckodriver.exe");	
	
	WebDriver driver =  new ChromeDriver();

	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com");
	Thread.sleep(5000);

	//driver.manage().window().minimize();
	
	driver.navigate().to("https://www.selenium.dev/");
	Thread.sleep(5000);

	driver.manage().window().minimize();
	driver.manage().window().maximize();

	Thread.sleep(5000);


	
	driver.navigate().back();
	Thread.sleep(5000);

	
	driver.navigate().forward();
	Thread.sleep(5000);

	
	driver.navigate().refresh();
	Thread.sleep(5000); 
	
	driver.close();

	
	System.out.println("End of program");
	
		
}

			


}





