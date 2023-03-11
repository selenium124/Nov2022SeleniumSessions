 package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class RegPageTest {
	
	//static WebDriver driver;

	public static void main(String[] args) {
		
		//driver = new ChromeDriver();
		String browserName = "Chrome";
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
		//By locators: OR
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By ppCheck = By.name("agree");
		By continueButton = By.className("btn-primary");
		By checkText = By.tagName("h1");
		By confirmButton = By.linkText("Continue");
		By myAccountCheck = By.tagName("h2");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(firstName, "Ramya");
		eUtil.doSendKeys(lastName, "Kishore");
		eUtil.doSendKeys(email, "Ramya12@gmail.com");
		eUtil.doSendKeys(telephone, "987654321");
		eUtil.doSendKeys(password, "Test@123");
		eUtil.doSendKeys(confirmPassword, "Test@123");
		eUtil.doClick(ppCheck);
		eUtil.doClick(continueButton);
		String confirmationText = eUtil.doElementGetText(checkText);
		if(confirmationText.contains("Your Account Has Been Created!")) {
			System.out.println("Account is created Successfully");
		}
		else {
			System.out.println("Fail");
		}
		
		eUtil.doClick(confirmButton);
		
		String accountCheck = eUtil.doElementGetText(myAccountCheck);
		if(accountCheck.contains("My Account")) {
			System.out.println("Home page is launched");
		}
		else {
			System.out.println("Home page is not launched");
		}
		
		//brUtil.quitBrowser();
		
		
		
		

	}

}
