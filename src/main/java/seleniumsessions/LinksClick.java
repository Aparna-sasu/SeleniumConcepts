package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksClick {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By footerLinks = By.xpath("//div[@class = \"row\"]/div[@class = \"col-sm-3\"]/ul[@class = \"list-unstyled\"]/li/a");
		
		List<WebElement> linksList = driver.findElements(footerLinks);
		
		System.out.println(linksList.size());
		
	for(WebElement e: linksList) {
		System.out.println(e.getText());
	}

	}

}
