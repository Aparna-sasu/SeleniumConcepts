package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NaveenAutomationLabFooterlinkClcik {

	public static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil browserUtil = new BrowserUtil();
		driver = browserUtil.initDriver("chrome");
		browserUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstFooterLink = By.cssSelector("div.row div.col-sm-3:nth-child(1)");
		getFooterLinksList(firstFooterLink);

	}

	public static void getFooterLinksList(By locator) {

		getElement(locator);
		List<WebElement> footerInformationLinks = driver.findElements(By.cssSelector("div.row div.col-sm-3:nth-child(1) a"));
		for(WebElement e: footerInformationLinks) {
			System.out.println(e.getText());
		}
	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}
}
