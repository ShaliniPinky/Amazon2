package com.amazon.pages;

import com.amazon.base.ProjectSpecificMethod;

public class BuyingPage extends ProjectSpecificMethod{

	public BuyingPage printTheCartMessage() {
		System.out.println("Cart Message :"+driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText());
		return this;
	}
	
	public LoginPage clickProceedButton() {
		driver.findElementById("hlb-ptc-btn-native").click();
		return new LoginPage();
	}
	
}
