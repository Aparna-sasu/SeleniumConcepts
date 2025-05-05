package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		 String browser = "chrome";
		 
		 switch(browser.trim().toLowerCase()) {
		 
		 case "chrome":
			driver =  new ChromeDriver();
			 break;
		 case "firefox":
			 driver = new FirefoxDriver();
			 break;
		 case "edge":
			 driver =  new EdgeDriver();
			 break;
		 case "safari":
			 driver =  new ChromeDriver();
			 break;
		 default:
				 throw new RuntimeException("Please provide valid browser name...");
		 
		 }
		 
		 driver.get("https://www.google.com");
		 String st = driver.getTitle();
		 
		 if(("Google").equals(st)){
			 System.out.println("PASS");
		 }
		 else {
			 System.out.println("FAIL");
		 }
		 
		 driver.quit();
	}

}
