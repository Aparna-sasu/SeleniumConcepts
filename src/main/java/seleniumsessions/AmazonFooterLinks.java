package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonFooterLinks {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(8000);
		
		List<WebElement> footerLinksList = driver.findElements(By.xpath("(//div[contains(@class,'navFooterLinkCol')]//a)[last()]"));
		System.out.println(footerLinksList.size());
		
		for(WebElement e: footerLinksList) {
			System.out.println(e.getText());
			String text = e.getText();
			if(text.equals("Help")) {
				
				e.click();
			//	Thread.sleep(8000);
				System.out.println("clicked the element");
				break;
			}
		}
	}

}
