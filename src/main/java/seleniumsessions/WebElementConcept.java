package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	 static WebDriver driver;

	public static void main(String[] args) {
		
	    driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// create a webelement (FE) +  perform action(click,sendkeys, idDisplayed, Text...)
		
		//approachs:
		
		//1.
//		driver.findElement(By.id("input-email")).sendKeys("tester123@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("tester123");
	
		
		//2. 
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement pswd = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("tester123@gmail.com");
//		pswd.sendKeys("tester123");
//	
		
		//3. By locator:
//		By emailField = By.id("input-email");
//		By pswdField = By.id("input-password");
//		
//		WebElement email = driver.findElement(emailField);
//		WebElement pswd = driver.findElement(pswdField);
//		
//		email.sendKeys("tester123@gmail.com");
//		pswd.sendKeys("tester123");
//		
		
		//4.By locator + generic function to get the element.
//		By emailField = By.id("input-email");
//		By pswdField = By.id("input-password");
//		
//        getElement(emailField).sendKeys("tester123@gmail.com");
//        getElement(pswdField).sendKeys("tester123");

		
		//5. By locator + generic function to get the element and perform action.
		
//		By emailField = By.id("input-email");
//		By pswdField = By.id("input-password");
//		
//		doSendKeys(emailField, "tester123@gmail.com");
//		doSendKeys(pswdField, "tester123");

		//6. By locator + generic function to get the element and perform action - ElementUtil class
		
//		By emailField = By.id("input-email");
//		By pswdField = By.id("input-password");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(emailField, "tester123@gmail.com");
//		eleUtil.doSendKeys(pswdField,  "tester123");
		
		//7. brUtil + eleUtil --> webelement + action
		
	}
	
	
//	public static void doSendKeys(By locator, String value) {
//		
//		getElement(locator).sendKeys(value);
//		
//	}
//	
//	
//	
//	public static WebElement getElement(By locator) {
//		
//		return driver.findElement(locator);
//		
//	}
//	
	
	

}
