package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CricInfoResult {

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil browserUtil = new BrowserUtil();
		driver = browserUtil.initDriver("chrome");
		browserUtil.launchUrl("https://www.espncricinfo.com/series/wpl-2024-25-1463356/gujarat-giants-women-vs-up-warriorz-women-15th-match-1469312/full-scorecard");

		List<String> playerScore =  getPlayerDetails("Harleen Deol");
		//List<String> playerScore =  getPlayerDetails("Beth Mooney");

		System.out.println(playerScore);
		
		browserUtil.quitBrowser();
	}


	public static List<String> getPlayerDetails(String playerName) {

		List<WebElement> playerDetailList = driver.findElements(By.xpath("(//span[text()='"+playerName+"'])/ancestor::td/following-sibling::td"));
		List<String> detailedScore = new ArrayList<String>();

		for(WebElement playerDetails : playerDetailList) {
			String scoreList = playerDetails.getText();
			detailedScore.add(scoreList);

		}

		return detailedScore;
	}
	
	
	
	
}
