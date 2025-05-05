package seleniumsessions;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUserDetailsXpathAxes {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// 1. Select User
		// Get user details
		
		
		 driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(4000);
		selectUser("Joe.Root");
		List<String> s = getUserDetails("Joe.Root");
		System.out.println(s);
		
		
		}

	
	public static void selectUser(String userName) {
		
		driver.findElement(By.xpath("//a[text()='"+userName+"']/ancestor::tr/child::td/input[@name='chkSelectRow[]']")).click();
		
	}
	
	public static List<String> getUserDetails(String userName) {
		
		List<WebElement> userDetails = driver.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
		System.out.println(userDetails.size());
		
		List<String> detailsList = new ArrayList<>();
		
		for(WebElement e: userDetails) {
			
			String details = e.getText();
			detailsList.add(details);
		}
		return detailsList;
	}
	
}
