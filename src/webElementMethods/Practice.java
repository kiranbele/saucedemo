package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://practice.automationtesting.in/");
System.out.println("URL is open");

WebElement shop = driver.findElement(By.xpath("//li[@id='menu-item-40']"));
shop.click();
System.out.println("Open shop menu");
Thread.sleep(2000);

WebElement home = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/nav/a"));
home.click();
System.out.println("Move on 1st slide");
Thread.sleep(2000);


WebElement ruby = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div[1]/div[1]/img"));
boolean res1 = ruby.isDisplayed();
System.out.println(res1);

if(res1==true)
{
	System.out.println("TC is pass");
}
else
{
	System.out.println("TC is failed");
}
Thread.sleep(1000);

WebElement click1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[3]/img"));
click1.click();
System.out.println("Move on 2nd slide");


WebElement html = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div[2]/div[1]/img"));
boolean res2 = html.isDisplayed();
System.out.println(res2);
if(res2==true)
{
	System.out.println("TC is pass");
}
else
{
	System.out.println("TC is failed");
}
Thread.sleep(1000);

WebElement click2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[3]/img"));
click2.click();
Thread.sleep(1000);
System.out.println("Move on 3rd slide");


WebElement java = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div[3]/div[1]/img"));
boolean res3 = java.isDisplayed();
System.out.println(res3);

if(res3==true)
{
	System.out.println("TC is pass");
}
else
{
	System.out.println("TC is failed");
}

WebElement click4 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[3]/img"));
click4.click();
System.out.println("Move again on 1st slide");

//Now check home page only contain 3 Slides

WebElement img1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/ul/li/a[1]/img"));
boolean pres1 = img1.isDisplayed();
System.out.println(pres1);

if(pres1==true)
{
	System.out.println("First slide present");
	System.out.println("TC is pass");
}
else
{
	System.out.println("TC is failed");
}

WebElement img2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/ul/li/a[1]/img"));
boolean pres2 = img2.isDisplayed();
System.out.println(pres2);

if(pres2==true)
{
	System.out.println("Second slide present");
	System.out.println("TC is pass");
}
else
{
	System.out.println("TC is failed");
}

WebElement img3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/div/div/ul/li/a[1]/img"));
boolean pres3 = img1.isDisplayed();
System.out.println(pres3);

if(pres3==true)
{
	System.out.println("Third slide present");
	System.out.println("TC is pass");
}
else
{
	System.out.println("TC is failed");
}

	}

}
