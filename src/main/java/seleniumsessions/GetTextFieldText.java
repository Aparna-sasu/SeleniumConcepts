package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldText {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendKeys(emailId, "pop@selenium.com");
		
		String checkemailtextField = eleUtil.getElementDomPropertyValue(emailId, "value");
		
		//String checkemailtextField = driver.findElement(emailId).getDomProperty("value");
		System.out.println(checkemailtextField);
		
	
		
	
		
		
		
		
	}

}
