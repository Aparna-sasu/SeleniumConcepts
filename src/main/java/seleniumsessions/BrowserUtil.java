package seleniumsessions;


import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class BrowserUtil {
	
	private WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		
		System.out.println("Browser Name: " + browserName);
		switch(browserName.trim().toLowerCase()) {
		
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
			
			default:
				System.out.println("Please provide valid browser name...");
				throw new BrowserException("invalid browser name");
		
		}
		return driver;
		
	}
	
	
	private void lengthCheck(String value) {
		
		if(value.length()==0) {
			System.out.println("value length is zero");
			throw new BrowserException("invalid browser name");
		
		}
		
		
	}
	
private void nullCheck(String value) {
		
		if(value == null) {
			System.out.println("value is null");
			throw new BrowserException("the value is null");
		
		}
		
	}

private void httpCheck(String urlValue) {
	
	if(urlValue.indexOf("http")!=0) {
		System.out.println("http is missing in the url...");
		throw new BrowserException("http in url is missing...");
	}
	
}

	
	
	public void launchUrl(String url) {
		
		lengthCheck(url);
		httpCheck(url);
		nullCheck(url);
		driver.get(url);
		
	}

public void launchUrl(URL url) {
	
	String appUrl = String.valueOf(url);
		
	lengthCheck(appUrl);
	httpCheck(appUrl);
	nullCheck(appUrl);
	driver.navigate().to(appUrl);
	
	}


public String getPageTitle() {
	
	String title = driver.getTitle();
	return title;
}

public String getPageURL() {
	
	String pageUrl = driver.getCurrentUrl();
	System.out.println("current page url is: "+ pageUrl);
	
	return pageUrl;
}


public void closeBrowser() {
	if(driver!=null) {
		driver.close();
		System.out.println("Browser is closed...");
	}
}

public void quitBrowser() {
	if(driver!=null) {
		driver.quit();
		System.out.println("Browser is closed...");
	}
}

}
