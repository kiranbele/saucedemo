package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameConcept {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
System.out.println("Website is open");
System.out.println(driver.getTitle());

//Now use Frame concept to switch
//First we need to find Iframe element

WebElement iframeelement = driver.findElement(By.xpath("//iframe[@id='frame2']"));
driver.switchTo().frame(iframeelement);

//Now perform next operation
WebElement animalsselect = driver.findElement(By.xpath("//select[@id='animals']"));
animalsselect.click();

Select s = new Select(animalsselect);

s.selectByValue("babycat");
System.out.println("Baby cat is selected");
Thread.sleep(2000);

s.selectByValue("big baby cat");
System.out.println("Big baby cat is selected");


}
}
