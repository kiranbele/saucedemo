package webTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesConcept {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");

		driver.manage().window().maximize();
		System.out.println("Browser is maximize");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("URL is open");
		
		WebElement webtable = driver.findElement(By.xpath("//table[@id='product']"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView()", webtable);
		System.out.println("Scroll down till the Web Table");
		
		//Use findelements with List concept
		//Headings
		List <WebElement> headers = driver.findElements(By.xpath("//table//tbody//tr//th"));
        for(int i=0; i<headers.size(); i++)
        {
        	String Titles = headers.get(i).getText();
        	System.out.println(Titles);
        }
        
        //Data
        List <WebElement> celldata = driver.findElements(By.xpath("//table//tbody//tr//td"));
	    for(int i=0; i<celldata.size(); i++)
	    {
	    	String allcelldata = celldata.get(i).getText();
	    	System.out.println(allcelldata);
	    }
	}

}
