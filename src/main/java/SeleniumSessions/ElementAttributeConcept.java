package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		String ph = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		System.out.println(ph);
//		
//		String srcVal = driver.findElement(By.className("img-responsive")).getAttribute("src");
//		String titleVal = driver.findElement(By.className("img-responsive")).getAttribute("title");
//		
//		System.out.println(srcVal + "------->" + titleVal);
		
		By firstName = By.id("input-firstname");
		By logo = By.className("img-responsive");
		String ph = getElementAttribute(firstName, "placeholder");
		String srcValue = getElementAttribute(logo, "src");
		String titleVal = getElementAttribute(logo, "title");
		System.out.println(ph);
		System.out.println(srcValue + "------->" + titleVal);
		
		
		
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String getElementAttribute(By locator, String value) {
		return getElement(locator).getAttribute(value);
	}

}
