package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vcity {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
System.out.println("Website is open");

WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
dropdown.click();

Select s = new Select(dropdown);
//s.selectByIndex(2);

//s.selectByValue("option3");

s.selectByVisibleText("Option2");

	}

}
