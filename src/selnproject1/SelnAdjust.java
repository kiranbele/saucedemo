package selnproject1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelnAdjust
{
 public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Admin\\Downloads\\Firefox drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		//set size of window
    	//Dimension d = new Dimension(300,500);
		//driver.manage().window().setSize(d);
		
		//set position of window
		Point p = new Point(300,200);
		driver.manage().window().setPosition(p);
		
		driver.quit();
}
}
