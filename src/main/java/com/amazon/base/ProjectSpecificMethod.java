package com.amazon.base;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.amazon.utlis.ReadExcel;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecificMethod {
	
	public static ChromeDriver driver;
	public static Set<String> allwindows;
	public static List<String> windows;
	public String ExcelFilePath;
	public String sheetname;
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
		return new ReadExcel().readExcel(ExcelFilePath, sheetname);
	}
	

}
