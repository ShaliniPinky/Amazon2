package poc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BuyProduct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Enter the text in serach field
		driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30");
		//Click search
		driver.findElementByClassName("nav-input").click();
		//Print the price of first search
		System.out.println("Price of First Search: "+driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText());
		//click the First mobile
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		Set<String> allwindows=driver.getWindowHandles();		
		List<String> windows=new ArrayList();
		windows.addAll(allwindows);
		driver.switchTo().window(windows.get(1));
		//Print Delivery date
		System.out.println("Delivery Date: "+driver.findElementByXPath("(//span[@class='a-text-bold'])[4]").getText());
		//Click the button Add to Cart
		driver.findElementByXPath("//input[@id='add-to-cart-button']").click();
		//Print it is added to cart
		System.out.println("Cart Message :"+driver.findElementByXPath("//h1[@class='a-size-medium a-text-bold']").getText());
		//click Proceed
		driver.findElementById("hlb-ptc-btn-native").click();
		//Get Title
		driver.getTitle();
		//Click Continue
		driver.findElementById("continue").click();
		//Enter Alert message
		System.out.println("Error Mesage: "+driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText());
		
		
		

	}

}
