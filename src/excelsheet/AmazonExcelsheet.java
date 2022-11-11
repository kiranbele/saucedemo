package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AmazonExcelsheet {
	public static void main(String[] args) throws IOException {
		
		String address="C:\\Users\\Admin\\Downloads\\Test data Excel Sheet.xlsx";
		
		FileInputStream file = new FileInputStream(address);
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		String result1 = book.getSheet("AMAZON").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(result1);
		
		double result2 = book.getSheet("AMAZON").getRow(1).getCell(0).getNumericCellValue();
		long res = (long) result2;
		System.out.println(res);
	}

}
