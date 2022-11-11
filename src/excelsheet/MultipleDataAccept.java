package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleDataAccept {
	
	public static void main(String[] args) throws IOException {
		
		//1.File locate address
		String address = "C:\\Users\\Admin\\Downloads\\Test data Excel Sheet.xlsx";
		
		//2.Read File
		FileInputStream file = new FileInputStream(address);
		
		//3.Workbook Read
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		//4.Get sheet name
		XSSFSheet sheet = book.getSheet("Multiple Data");
		
		//5.Now use for loop bcz of multiple row and cells
		for(int i=0; i<=5 ; i++)
		{
			for(int j=0; j<=1; j++)
			{
			String data = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(data);
			}
		}

	}

}
