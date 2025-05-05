package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		String actTitle = driver.getTitle();
		
		
		if(("Google").equals(actTitle)) {

			System.out.println("title is correct: PASS " + actTitle);
		}
		else {

			System.out.println("title is not correct: FAIL " +  actTitle);
		}
		driver.quit();


	}

}
