package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoName {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/wpl-2024-25-1463356/gujarat-giants-women-vs-up-warriorz-women-15th-match-1469312/full-scorecard");
		
		
		String name = driver.findElement(By.xpath("((//span[text()='Dayalan Hemalatha'])/ancestor::td)[1]/following-sibling::td")).getText();
		System.out.println(name);
		
	}

}
