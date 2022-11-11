package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWebElementMethods {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://www.saucedemo.com/");
System.out.println("URL is open");

WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
//1.sendKeys()
username.sendKeys("problem_user");

//2.getTagName()
String tagName = username.getTagName();
System.out.println("TagName of user element is: " +tagName);

//3.getAttribute()
String idAV = username.getAttribute("id");
System.out.println("Attribute value of id: "+idAV);

//4.getText()
String htmltext = username.getText();
System.out.println("Username html text is: "+htmltext);

//5.click()
//6.clear()

//7. isDisplayed
boolean result = username.isDisplayed();
System.out.println("User name element is displayed?" +result);
if(result==true)
{
 System.out.println("Username is present");
 username.sendKeys("kiran01");

}

else
{
	 System.out.println("Username is not present");	

	}
		
	}

}
