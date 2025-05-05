package seleniumsessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementUseCases {

	/*get the url
	 *   find the element
	 *    check if that element is displayed
	 *     check if more than once gthe element is displayed
	 */


	static WebDriver driver;

	public static void main(String[] args) {


		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailField = By.id("input-email");
		By forgottenPassword = By.linkText("Forgotten Password");

		ElementUtil elementUtil = new ElementUtil(driver);
//		boolean result = elementUtil.checkElementIsDisplayed(emailField);
//
//		
//		int forgotternPasswordLinkCOunt = elementUtil.getElementsCount(forgottenPassword);
//		boolean checkForgotternPasswordLinks = elementUtil.checkElementIsDisplayed(forgottenPassword,forgotternPasswordLinkCOunt);
//		
//		System.out.println("element is displayed and result is "+ result);
//		System.out.println("forgotten password element is displayed and result is "+ checkForgotternPasswordLinks);

	}


	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);


	}

}
