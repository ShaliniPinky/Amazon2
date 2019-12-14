package com.amazon.pages;

import com.amazon.base.ProjectSpecificMethod;

public class ProductListPage extends ProjectSpecificMethod{
	
	public ProductListPage findPriceOfFirstResulting() {
		System.out.println("Price of First Search: "+driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText());
		return this;
	}
	
	public SingleProductPage clickOnFirstResulting() {
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		return new SingleProductPage();
	}
	
	

}
