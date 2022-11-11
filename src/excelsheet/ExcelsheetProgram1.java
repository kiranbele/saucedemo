package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelsheetProgram1 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//1.File locate address
		String address = "C:\\Users\\Admin\\Downloads\\Test data Excel Sheet.xlsx";
		
		//2.Read File
		FileInputStream file = new FileInputStream(address);
		
		//3.Workbook Read
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		//4.Read the sheet
		
		XSSFSheet sheet = book.getSheet("Sauce Demo");
		
		//5.Read Rows
	    //For User-name
		XSSFRow row = sheet.getRow(0);
		
		//6.Read columns
		
		XSSFCell cell = row.getCell(0);
		
		//7.Get U-name
		
		String uname = cell.getStringCellValue();
		System.out.println(uname);
		
		
		//For Password
		XSSFRow row1= sheet.getRow(1);
		XSSFCell cell1 = row1.getCell(0);
		String Pw = cell1.getStringCellValue();
		System.out.println(Pw);

//*************************************************************************
		
System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Chrome Drivers\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
System.out.println("Browser is open");

driver.manage().window().maximize();
System.out.println("Browser is maximize");

driver.get("https://www.saucedemo.com/");
System.out.println("URL is open");

WebElement username = driver.findElement(By.id("user-name"));
username.sendKeys(uname);
Thread.sleep(1000);
System.out.println("Username entred:" +uname);

WebElement password = driver.findElement(By.id("password"));
password.sendKeys(Pw);
Thread.sleep(1000);
System.out.println("Password is enterd:" +Pw);


WebElement login = driver.findElement(By.id("login-button"));
login.click();

		
	}

}
