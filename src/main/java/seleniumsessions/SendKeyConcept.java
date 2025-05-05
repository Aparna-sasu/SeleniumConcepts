package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyConcept {
	
	// in characSeq... we always send array. 
	// inout type of send keys will always accept the charsquence... where the three dot represent array where it will accept
	// string sb, sbf .... example is address field.
	// Exceptions:
	// 1. IllegalArgument - when trying to send null value in send keys
	// 2. ElementNotInteractable - when trying to interact with disabled field 
	
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstName= driver.findElement(By.id("input-firstname"));
		WebElement lastName= driver.findElement(By.id("input-lastname"));
		
		String fN = "Testing";
		String lN = "Automation";
		StringBuilder sb = new StringBuilder("Selenium");
		StringBuffer sbf = new StringBuffer("Training");
		
	
		
		firstName.sendKeys(fN," ", lN, " ", sb , " ", sbf);
		
		lastName.sendKeys(null);// send keys don 't accept null values and throws illegal Argument Exception.
		
		
				
		
		

	}

}
