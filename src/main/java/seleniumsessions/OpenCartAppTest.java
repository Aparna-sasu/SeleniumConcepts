package seleniumsessions;

import org.openqa.selenium.WebDriver;

/**
 * 1. get driver
 * 2. launch url
 * 3. get title page
 * 4. get currentpage url
 * 5. close browser
 */

public class OpenCartAppTest {

	public static void main(String[] args) {
		
		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.initDriver("chrome");
		brutil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String actualTitle = brutil.getPageTitle();
		
		if("Account Login".equals(actualTitle)) {
			
			System.out.println("title is correct --PASS");
			
		}
		else {
			System.out.println("title is not correct -- FAIL");
		}
		
		
		String actUrl = brutil.getPageURL();
		
		if(actUrl.contains("route=account/login")) {
			
			System.out.println("Login page url is correct -- PASS");
		}
		else {
			System.out.println("Login page url is not correct -- FAIL");
		}
		

		brutil.quitBrowser();
	}

}
