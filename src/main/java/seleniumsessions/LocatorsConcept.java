package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*/
 * 1. id
 * 2. name
 * 3. class ( make sure it is unique)
 * 4. xpath ( not an attribute. it is the address of the element). If i need to traverse inside the dom and when id , name not available, xpath should be used.
 * 5. cssSelector
 * 6. LinkText : work only for links.
 * 7. Partial LinkText
 * 8. tagName : h1, h2, p - all these are tags.

In  the above 8 locators, only first 3 are attributes. 
 * Between 6 and 7 options, partiallinktext is very risky. if you have forgottern paswd and forgotten usernmae, it will click whichever comes first.
 *  So, here it will be a problem. PartialLinkText will be used only for a phrase or lengthy para. Very rarely used.
 */

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	
	//1. id: it should be unique. if ids are duplicate no error will be shown but will be against industry standard. Generally it is unique.
	
	driver.findElement(By.id("input-firstname")).sendKeys("Jaya");
	
	//2. name: it is an attribute. It can be duplicate. but is rare. always choose id if not avauable select name.
	
	driver.findElement(By.name("lastname")).sendKeys("testing");
	
	//3. class: another attribute which can be duplicate(most of the time it will be duplicate).
	//Always selenium works from top and when an attribute is duplicate then the first option is always selected as it happens in this case. 
	//Instead of populating the email field , the first search field in registration page is populated since it also has class attirbute with same value.
	//thus, most of the time, class attribute is avoided.
	
	//driver.findElement(By.className("form-control")).sendKeys("jayatesting@gmail.com");
	// form-control : result is 1 of 7
	// img-rersponsive :  1 of 1
	//driver.findElement(By.className("img-responsive")).sendKeys("jayatesting@gmail.com");
	
	//4. xpath: not an attribute. it will return By. 
	
	driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("1234567890");
	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("jayatesting@gmail.com");
	
	//5. cssSelector : not an attribute. 
	
	driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
	driver.findElement(By.cssSelector("#input-confirm")).sendKeys("test@123");
	
	
	 //6. LinkText: not attribute.
	// html tag : <a>
	// if id not available, go with linktext. In most of the links, no id or name will be present. since the link will be unique and text will be available.
	
	 driver.findElement(By.linkText("Login")).click();
	//driver.findElement(By.linkText("Forgotten Password")).click();
	
	// 7. Partial LinkText : only for links.
	// partial part of the link text. 
	
	 //driver.findElement(By.partialLinkText("Forgotten")).click();
	
	
	// 8. tagName : only for the tags. very very rarely used. If there are more than one headers and want to seldct second headewr, then use xpath or css.
	
//	   String h2 = driver.findElement(By.tagName("h2")).getText();
      
	 By header = By.tagName("h2");
//	   System.out.println(h2);
	 
	 ElementUtil eleUtil = new ElementUtil(driver);
	 String headerName = eleUtil.doElementGetText(header);
	 if(("New Customer").equals(headerName)) {
		 System.out.println("element matches:"+ headerName);
	 }
	 else {
		 System.out.println("element does not match:"+ headerName);
	 }
	 //System.out.println(headerName);
	 
	
	
	}

}
