package com.amazon.pages;

import com.amazon.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{

	public LoginPage getTitle() {
		System.out.println("Title of the Page: "+driver.getTitle());
		return this;
	}
	
	public LoginPage clickContinueButton() {
		driver.findElementById("continue").click();
		return this;
	}
	
	public LoginPage entertheErrorMessage() {
		System.out.println("Error Mesage: "+driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText());
		return this;
	}
	
}
