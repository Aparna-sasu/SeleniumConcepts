package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker {

	//(//div[@class='c-ulo-viewport'])[2]
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kayak.com/flights?lang=en&skipapp=true&gclid=Cj0KCQjw782_BhDjARIsABTv_JAKWLhZZm2Yl9201uv6SFDRJ4mF6zdohQtO4RBC-s0sRcnccokIyxkaAm6fEALw_wcB&aid=103175289976");
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		WebElement popUp = driver.findElement(By.xpath("(//div[@class='c-ulo-viewport'])[2]"));
		wait.until(ExpectedConditions.visibilityOf(popUp));
		if(popUp.isDisplayed()) {
			System.out.println("pop up present");
			driver.findElement(By.xpath("//div[text()='I understand']")).click();
		}
		
		
		driver.findElement(By.xpath("//div[@class = 'nUC_']/span[text() = 'Departure']")).click();
		futureDate("June 2025","25");
		

	}

	
	public static void futureDate(String expmotnYear, String day) {
		
		
	}
}
