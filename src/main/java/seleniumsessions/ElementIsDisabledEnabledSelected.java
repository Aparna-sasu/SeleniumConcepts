package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisabledEnabledSelected {
	
	/* isDisplayed
	 * isEnabled
	 * isSelected
	 * 
	 * 1. go to https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html
	 * 2. find the password element
	 * 3. check if it is displayed
	 * 4. check if it is enabled
	 * 5. navigate to https://naveenautomationlabs.com/opencart/index.php?route=account/register
	 * 6. cherck if the checkbox is Selected
	 * 
	 * 
	 * if the element locator is given wrong or if not there and try to check whether the element is displayed or not,  then NoSuchElement Exception occurs.
	 */
	public static void main(String[] args) {

		BrowserUtil browserUtil = new BrowserUtil();
		WebDriver driver = browserUtil.initDriver("chrome");
		browserUtil.launchUrl("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

		ElementUtil elementUtil = new ElementUtil(driver);

		By pswdField = By.name("lname");
		boolean pswdisDisplayed = elementUtil.isElementDisplayed(pswdField);
		boolean pswdIsEnabled = elementUtil.isElementDisplayed(pswdField);
		
	    driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	    
	    By privacyCheckBox = By.name("agree");

        boolean isPrivacyCheckBoxSelected = elementUtil.isElementSelected(privacyCheckBox);
		System.out.println("password displayed : "+ pswdisDisplayed);
		System.out.println("password enabled : "+ pswdIsEnabled);
		System.out.println("privacy checkbox selected  : "+isPrivacyCheckBoxSelected);
		
		
		
		browserUtil.quitBrowser();

	}


}
