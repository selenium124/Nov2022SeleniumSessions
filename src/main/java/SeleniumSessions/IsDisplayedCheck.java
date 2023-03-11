package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class IsDisplayedCheck {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		boolean logoCheck = driver.findElement(By.className("img-responsive")).isDisplayed();
//		if(logoCheck) System.out.println("Pass");
//		
//		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Mac");
//		driver.findElement(By.cssSelector("#search > span > button")).click();
		
		By logoImage = By.className("img-responsive");
		By searchText = By.xpath("//*[@id=\"search\"]/input");
		By elementClick = By.cssSelector("#search > span > button");
		
		boolean logoCheck = getElementIsDisplayed(logoImage);
		if(logoCheck) System.out.println("Pass");
		doSendKeys(searchText, "Mac");
		doClick(elementClick);

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean getElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	

}
