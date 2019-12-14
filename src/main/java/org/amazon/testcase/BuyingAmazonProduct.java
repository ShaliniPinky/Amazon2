package org.amazon.testcase;

import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.base.ProjectSpecificMethod;
import com.amazon.pages.HomePage;

public class BuyingAmazonProduct extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setData() {
		ExcelFilePath="SearchProduct";
		sheetname="SearchProduct";
		
	}
	
	@Test(dataProvider = "sendData")
	public void buyProduct(String productName) {
		
		new HomePage()
		.searchTheProduct(productName)
		.clickSearchButton()
		.findPriceOfFirstResulting()
		.clickOnFirstResulting()
		.printTheDeliveryDate()
		.clickAddToCartButton()
		.printTheCartMessage()
		.clickProceedButton()
		.getTitle()
		.clickContinueButton()
		.entertheErrorMessage();
		
	}

}
