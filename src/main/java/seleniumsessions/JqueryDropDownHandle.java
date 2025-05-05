package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JqueryDropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		WebElement choice = driver.findElement(By.xpath("(//input[@class = 'comboTreeInputBox'])[3]"));
		choice.click();
		Thread.sleep(2000);
		List<WebElement> choices = driver.findElements(By.xpath("(//div[@class = 'comboTreeDropDownContainer'])[3]/ul//li"));
		System.out.println(choices.size());
		
		
		for(WebElement e: choices) {
			System.out.println(e.getText());
			String value = e.getText();
			System.out.println("*"+ value + "*");
			if(value.trim().equals("choice 1")) {
				System.out.println("**"+ value + "**");
				e.click();
				break;
				
				
			}
			
		}
 		//driver.close();
	}

}
