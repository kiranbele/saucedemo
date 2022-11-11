package testNGPractice;

import org.testng.annotations.Test;

import pom.HomePOMclass;

public class VarifyFilterFunctionality extends TestBaseClass {
	
	@Test
	public void varifyFilter()
	{
		HomePOMclass hm = new HomePOMclass(driver);
		hm.filterclick();
		System.out.println("Clicked on Filter");
		System.out.println("Price Low to High Selected");
		hm.filterValidation();

}

}
