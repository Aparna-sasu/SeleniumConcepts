package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {
		//find total n o: of links ont he page
		// print text of each link on the console
		// html tag = <a>
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.com");
		By links = By.tagName("a");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		int totalCount = eleUtil.getElementsCount(links);
		
		if(totalCount>300) {
			System.out.println("proper links are present: PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		List<String> linksTextList = eleUtil.getElementTextList(links);
		
		if(linksTextList.contains("Corporate Information")) {
			System.out.println("Test PASS");
		}
		else {
			System.out.println("Test FAIL");
		}
		
		
//		List<WebElement> linkList = driver.findElements(By.tagName("a"));
//		
//		System.out.println(linkList.size());
//		
//		for(WebElement e : linkList)
//		{
//			String text = e.getText();
//			if(text.length()!=0) {
//				System.out.println(text);
//			}
//		}
		

	}

}
