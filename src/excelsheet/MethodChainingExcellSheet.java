package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MethodChainingExcellSheet {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//1.File locate address
		String address = "C:\\Users\\Admin\\Downloads\\Test data Excel Sheet.xlsx";
		
		//2.Read File
		FileInputStream file = new FileInputStream(address);
		
		//3.Workbook Read
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		//4 Use method chaining
		
		String uname = book.getSheet("Sauce Demo").getRow(0).getCell(0).getStringCellValue();
        System.out.println(uname);
        
        String pass = book.getSheet("Sauce Demo").getRow(1).getCell(0).getStringCellValue();
        System.out.println(pass);
}
}
