package absolutexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com/");
Thread.sleep(2000);

WebElement Login = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
Login.sendKeys("7841021679");

WebElement Password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
Password.sendKeys("kiran@bele");

WebElement LoginButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
LoginButton.click();
Thread.sleep(2000);

//WebElement msg = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/div[2]/span/span/div/div[1]/svg/path"));
//msg.click();

WebElement clickimg = driver.findElement(By.xpath("//div[@class='aglvbi8b om3e55n1 i8zpp7h3 g4tp4svg']"));
clickimg.click();
Thread.sleep(2000);

//WebElement Logout = driver.findElement(By.xpath("(//html//body//div[1]//div//div//div//div//div[1]//div[2]//div//div[5]//div//div[1])[7]"));
//Logout.click();

WebElement logout = driver.findElement(By.xpath("//span[text()='Log Out']"));
logout.click();





	}

}
