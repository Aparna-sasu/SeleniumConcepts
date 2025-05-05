package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support. locators. RelativeLocator.with;

public class RelativeLocatorCheckbox {


	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(4000);
		
		WebElement ele = driver.findElement(By.cssSelector("a.agree"));
		
		//String baseElement = driver.findElement(with(By.tagName("b"))).getText();
		//System.out.println(baseElement);
		
		//String leftText = driver.findElement(with(By.xpath("//div[@class = \"pull-right\"]")).toLeftOf(By.cssSelector("a.agree"))).getText();
		By leftText = By.xpath("//div[@class = \"pull-right\"]");
		System.out.println(leftText);
		
		driver.findElement(with(By.cssSelector("input.agree")).toRightOf(leftText)).click();
		
	}
}
