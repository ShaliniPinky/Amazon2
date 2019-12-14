package com.amazon.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.amazon.base.ProjectSpecificMethod;

public class SingleProductPage extends ProjectSpecificMethod {

	/*
	 * public SingleProductPage windowsHandles() {
	 * allwindows=driver.getWindowHandles(); windows=new ArrayList(allwindows);
	 * driver.switchTo().window(windows.get(1)); return this; }
	 */
	
	public SingleProductPage printTheDeliveryDate() {
		allwindows=driver.getWindowHandles();		
		windows=new ArrayList(allwindows);
		driver.switchTo().window(windows.get(1));
		System.out.println("Delivery Date: "+driver.findElementByXPath("(//span[@class='a-text-bold'])[4]").getText());
		return this;
	}
	
	public BuyingPage clickAddToCartButton() {
		driver.findElementByXPath("//input[@id='add-to-cart-button']").click();
		return new BuyingPage();
	}
	
	
	
	
}
