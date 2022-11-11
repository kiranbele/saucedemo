package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Here we check Radio Button is selected and diselected 
public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
System.out.println("URL is open");

WebElement radiobutton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
radiobutton1.click();
Thread.sleep(2000);

WebElement radiobutton2 = driver.findElement(By.xpath("//input[@value='Radio2']"));
radiobutton2.click();
Thread.sleep(2000);

WebElement radiobutton3 = driver.findElement(By.xpath("//input[@value='Radio3']"));
radiobutton3.click();
Thread.sleep(2000);

WebElement radiobutton4 = driver.findElement(By.xpath("//input[@value='Radio4']"));
radiobutton4.click();
Thread.sleep(2000);



	}

}
