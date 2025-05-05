package seleniumsessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithDisabledElements {

	public static void main(String[] args) {
	
//https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html
		
		WebDriver driver = new  ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		By pswd = By.xpath("//*[@id=\"pass\"]");
		
		WebElement pswdField = driver.findElement(pswd);
		String isDisabled = pswdField.getDomProperty("disabled");
		pswdField.sendKeys("testing");// org.openqa.selenium.ElementNotInteractableException: element not interactable
		
		System.out.println(isDisabled);
		
		pswdField.click(); // no exception.

	}

}
