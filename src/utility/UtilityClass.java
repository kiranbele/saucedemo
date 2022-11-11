package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class UtilityClass {
			
	
	private WebDriver driver;
	
//1.ScreenShot
	
	public void getScreenShot(WebDriver driver, String name) throws IOException,FileNotFoundException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\Admin\\Downloads\\Screenshots\\"+name+ ".jpg");
		FileHandler.copy(srcFile, destFile);
	}
	
//2.Excel Sheet
	
	//Locate file
	String address = "C:\\Users\\Admin\\Downloads\\Test data Excel Sheet.xlsx";
	
	//Read File
	FileInputStream file = new FileInputStream(address);
	
	//Workbook Read
	
	XSSFWorkbook book = new XSSFWorkbook(file);
	
	//Read the sheet
	
	XSSFSheet sheet = book.getSheet("Sauce Demo");

		
		
public UtilityClass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	
	
}
	
