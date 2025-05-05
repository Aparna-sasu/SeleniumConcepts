package seleniumsessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClick {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// create webelement+ perform action (click)

		//		driver.findElement(By.linkText("Register")).click();
		//		
		//		driver.findElement(By.name("agree")).click();

		By register = By.linkText("Register");

		By termsCheckbox = By.name("agree");

		doClick(register);
		doClick(termsCheckbox);
	}



	public static void doClick(By locator) {

		getElement(locator).click();
	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}
}
