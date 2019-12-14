package com.amazon.pages;

import com.amazon.base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{

	public HomePage searchTheProduct(String prodName) {
		driver.findElementById("twotabsearchtextbox").sendKeys(prodName);
		return this;
	}
	
	public ProductListPage clickSearchButton() {
		driver.findElementByClassName("nav-input").click();
		return new ProductListPage();
	}
	
	
}
