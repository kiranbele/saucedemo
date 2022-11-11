package webElementMethods;

//Here We use isSelected() method

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton2 {
	
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

boolean result1 = radiobutton1.isSelected();
System.out.println(result1);

if(result1=true)
{
	System.out.println("First radio Button is clickable");
	System.out.println("TC Pass");
}
else
{
	System.out.println("First radio Button is not clickable");
    System.out.println("TC is fail");
}

WebElement radiobutton2 = driver.findElement(By.xpath("//input[@value='Radio2']"));
radiobutton2.click();
Thread.sleep(2000);

boolean result2 = radiobutton2.isSelected();
System.out.println(result2);

if(result2=true)
{
	System.out.println("Second radio Button is clickable");
	System.out.println("TC Pass");
}
else
{
	System.out.println("Second radio Button is not clickable");
    System.out.println("TC is fail");
}

WebElement radiobutton3 = driver.findElement(By.xpath("//input[@value='Radio3']"));
radiobutton3.click();
Thread.sleep(2000);

boolean result3 = radiobutton3.isSelected();
System.out.println(result3);

if(result3=true)
{
	System.out.println("Third radio Button is clickable");
	System.out.println("TC Pass");
}
else
{
	System.out.println("Third radio Button is not clickable");
    System.out.println("TC is fail");
}


WebElement radiobutton4 = driver.findElement(By.xpath("//input[@value='Radio4']"));
radiobutton4.click();
Thread.sleep(2000);

boolean result4 = radiobutton4.isSelected();

if(result4==true)
{
	System.out.println("Fourth radio Button is also clickable");
	System.out.println("TC Pass");

}

else
{
	System.out.println("Fourth radio Button is not clickable");
    System.out.println("TC is fail");
}



}
}
