package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class LaunchTest {

	public static void main(String[] args) {
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.get(null);
//		driver.navigate().back();
		 File file = new File("non_existing_file.txt");
        // Scanner scanner = new Scanner(file); // This line may throw FileNotFoundException
         System.out.println("File opened successfully");
		
		
	}

}
