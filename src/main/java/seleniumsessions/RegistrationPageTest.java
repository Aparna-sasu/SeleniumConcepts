package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();

		WebDriver driver = brUtil.initDriver("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");


		By registerLink = By.xpath("//*[@id=\"column-right\"]/div/a[2]");
		By fName = By.id("input-firstname");
		By lName = By.name("lastname");
		By email = By.cssSelector("#input-email");
		By telephone = By.xpath("//*[@id=\"input-telephone\"]");
		By pswd = By.cssSelector("#input-password");
		By pswdConfirm = By.xpath("//*[@id=\"input-confirm\"]");
		By privacyPolicy = By.name("agree");
		By confirmButton = By.className("btn-primary");
		By header = By.tagName("h1");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doClick(registerLink);
		eleUtil.doSendKeys(fName, "Jamne");
		eleUtil.doSendKeys(lName, "Doe");
		eleUtil.doSendKeys(email, "jase@123gmail.com");
		eleUtil.doSendKeys(telephone, "9872098740");
		eleUtil.doSendKeys(pswd, "tester@123");
		eleUtil.doSendKeys(pswdConfirm, "tester@123");

		eleUtil.doClick(privacyPolicy);
		eleUtil.doClick(confirmButton);

		String headerMessage = eleUtil.getTextAlert(10);
		String actualTitle = brUtil.getPageTitle();

		if(("Your Account Has Been Created!").equals(headerMessage) && ("Your Account Has Been Created!").equals(actualTitle)) {
			System.out.println("Account creation :  PASS");
		}
		else
		{
			System.out.println("Account creation :  FAIL");
		}

		brUtil.quitBrowser();	
	}
}
