package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserMultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		/**
		1. open url.
		2. get the parentwindowID and store it in a String variable.
		3. go to fb link (switch to this window) and get the title, close it. go back to parent window.
		4. go to linkedin link, get the title, close this window and come back to parent.
		5. go to third yt link, get the title and close, go back to parent window.

		 */

		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.orangehrm.com/en/30-day-free-trial");// parent

		String parentWindowId = driver.getWindowHandle();
		By faceBookbWindow = By.xpath("//img[@alt='facebook logo']");
		By linkedInWindow = By.xpath("//img[@alt='linkedin logo']");
		By youtubeWindow = By.xpath("//img[@alt='youtube logo']");

		doClickSocialMediaLinks(driver, faceBookbWindow, parentWindowId);

		Thread.sleep(2000);

		doClickSocialMediaLinks(driver, linkedInWindow, parentWindowId);
		Thread.sleep(2000);

		doClickSocialMediaLinks(driver, youtubeWindow, parentWindowId);

	}


	public static void doClickSocialMediaLinks(WebDriver driver, By locator, String parentWindowId) throws InterruptedException {


        
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		WebElement childWindow = driver.findElement(locator);
		Thread.sleep(4000);
		childWindow.click();

		System.out.println(driver.getWindowHandles().size());

		Set<String> handles = driver.getWindowHandles();

		for(String e : handles) {

			if(!e.equals(parentWindowId)){

				driver.switchTo().window(e);
				System.out.println("child id : " +e);
				Thread.sleep(2000);
				System.out.println("child title: "+ driver.getTitle());
				System.out.println("child window is closed");
				driver.close();
			}

		}
		Thread.sleep(2000);
		driver.switchTo().window(parentWindowId);
		System.out.println("parent title" + driver.getTitle());

	}

}
