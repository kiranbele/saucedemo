package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetProgram2 {
	
	public static void main(String[] args) throws IOException {
		
		String address = "C:\\Users\\Admin\\Downloads\\Test data Excel Sheet.xlsx";
		
		//1.Read file
		FileInputStream file = new FileInputStream(address);
		
		//2.Workbook
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		//3.Sheet
		XSSFSheet sheet = book.getSheet("Facebook");
		
		//4.Rows
		XSSFRow row1 = sheet.getRow(0);
		
		//5.Cells
		XSSFCell cells1 = row1.getCell(0);
		
		//6.User name
		//If we need long number then use long data type with casting
		double uname = cells1.getNumericCellValue();
		long numuname = (long)uname;
		System.out.println(numuname);
		
		
		//Password
		
		XSSFRow row2 = sheet.getRow(1);
		XSSFCell cell2 = row2.getCell(0);
		String password = cell2.getStringCellValue();
		System.out.println(password);
		
		
	}

}
