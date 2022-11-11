package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://www.facebook.com/");
System.out.println("Website is open");
Thread.sleep(2000);

WebElement cna = driver.findElement(By.xpath("//a[text()='Create New Account']"));
cna.click();
System.out.println("Click on Create new Account");
Thread.sleep(5000);


//Select Date......
WebElement dayselect = driver.findElement(By.xpath("//select[@id='day']"));
dayselect.click();
System.out.println("Click on days dropdown button");


Select d = new Select(dayselect);
d.getOptions();
////d.selectByIndex(2);
d.selectByValue("5");
System.out.println("Select on 5 August");
Thread.sleep(2000);



//Select Month......
WebElement monthclick = driver.findElement(By.xpath("//select[@id='month']"));
monthclick.click();
System.out.println("Click on month dropdown button");

Select m = new Select(monthclick);
//m.getOptions();
//m.selectByIndex(11);
//System.out.println("Select Dec month");

//m.selectByValue("12");
//System.out.println("Select Dec month");

m.selectByVisibleText("Aug");
System.out.println("Select August month");
Thread.sleep(2000);



//Select Year
WebElement yearclick = driver.findElement(By.xpath("//select[@id='year']"));
yearclick.click();
System.out.println("Click on year dropdown button");

Select y = new Select(yearclick);
//y.selectByIndex(5);
y.selectByVisibleText("2011");
System.out.println("Select Year 2011");


	}

}
