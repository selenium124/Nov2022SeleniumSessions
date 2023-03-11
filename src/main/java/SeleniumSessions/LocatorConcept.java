package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		//create a webelement + perform action (click, sendkeys, gettext, isDisplayed....)
		
		//create a webelement: need a locator
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1. id
		//1st
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen@123");
		
		//2nd
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		emailId.sendKeys("ramya@gmail.com");
//		password.sendKeys("ramya@123");
		
		//3rd By Locator
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		WebElement eId = driver.findElement(emailId);
//		WebElement pwd = driver.findElement(password);
//		eId.sendKeys("ramya@gmail.com");
//		pwd.sendKeys("Ramya@123");
		
		//4th: By locator + generic method for webelement
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailId).sendKeys("ramya@gmail.com");
//		getElement(password).sendKeys("Ramya@123");
		
		
		//5th: By locator + generic methods for webelement and actions
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		doSendKeys(emailId,"ramya@gmail.com");
//		doSendKeys(password, "Ramya@123");
		
		//6th: By locator + generic methods for webelement and actions in a ElementUtil class
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.doSendKeys(emailId, "ramya@gmail.com");
		eUtil.doSendKeys(password, "Ramya@123");
		
	}
		
		
		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static void doSendKeys(By locator, String value) {
			getElement(locator).sendKeys(value);
		}

	 

}
