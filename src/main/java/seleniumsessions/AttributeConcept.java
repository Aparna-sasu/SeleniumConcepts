package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AttributeConcept {
	
	static WebDriver driver;

	/* Every webelement will have attribute and property. getDOMAttribute method is used to fetch the value of attribites within the html tags in DOM
	 * and on the right section , under properties, to access those values, whihc are not present in DOMAttribite,
	 * getDOMProperty method is used.
	 *
	 */
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		String placeHolder = "placeholder";
		
		ElementUtil eleUtil = new ElementUtil(driver);
		String placeHolderVal = eleUtil.getElementDomAttributeValue(firstName, placeHolder);
		System.out.println(placeHolderVal);
		
		
		//WebElement firstName = driver.findElement(By.id("input-firstname"));
		
		//String placeHolderVal = firstName.getDomAttribute("placeholder");
		//System.out.println(placeHolderVal);
		
//		String tagName = firstName.getDomProperty("tagName");
//		System.out.println(tagName);
		
	
		String isDisabled = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).getDomProperty("disabled");
		System.out.println(isDisabled);
		
		
	}

	
	
	
	
	
}
