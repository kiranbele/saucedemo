package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NumericValueInExcelSheet {
	
	public static void main(String[] args) throws IOException {
		
	
	String address = "C:\\Users\\Admin\\Downloads\\Test data Excel Sheet.xlsx";
	
	//2.Read File
	FileInputStream file = new FileInputStream(address);
	
	//3.Workbook Read
	XSSFWorkbook book = new XSSFWorkbook(file);

   //4.Method chaining with casting
   //number1	
	double res1 = book.getSheet("Sauce Demo").getRow(3).getCell(0).getNumericCellValue();
	int num1 = (int)res1;
	System.out.println(num1);
	
	//number2
	double res2 = book.getSheet("Sauce Demo").getRow(4).getCell(0).getNumericCellValue();
	int num2 = (int)res2;
	System.out.println(num2);
}
}
