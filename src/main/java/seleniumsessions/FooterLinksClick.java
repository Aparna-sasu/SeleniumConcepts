package seleniumsessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FooterLinksClick {

	// get the element
	// check if the element is equal to the string
	// if it is equal then click the link
	static WebDriver driver;
	public static void main(String[] args) {

		BrowserUtil browserUtil = new BrowserUtil();
		driver = browserUtil.initDriver("chrome");
		browserUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	
		By footerLinks = By.xpath("//footer//div[@class='row']//a");

		ElementUtil elementUtil = new ElementUtil(driver);
		elementUtil.clickElement(footerLinks,  "Brands");
		
		
		browserUtil.quitBrowser();
		
		
	}

}
