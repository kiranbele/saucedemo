package testNGPractice;

import org.testng.annotations.Test;

import pom.HomePOMclass;

public class VarifyProductSelect extends TestBaseClass {
	
	@Test
	
	public void varifyProduct()
	{
		HomePOMclass hm = new HomePOMclass(driver);
		hm.prodSelect();
		System.out.println(driver.getCurrentUrl());
		System.out.println("Bag is selected");

		//Validation
		String res = hm.productSelectValidation();
		System.out.println("Bagpack Text" +res);
		String ExpectedProdText="Sauce Labs Backpack";

		if(res.equals(ExpectedProdText))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Fail");
		}

	}

}
