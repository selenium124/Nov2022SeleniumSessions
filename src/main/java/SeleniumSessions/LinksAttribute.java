package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
//		List<WebElement> linksList = getElements(links);
//		System.out.println("total links ==> " + linksList.size());
//		for(WebElement e : linksList) {
//			String hrefVal = e.getAttribute("href");
//			String linkText = e.getText();
//			System.out.println(hrefVal + " ----------> " + linkText);
//			}
//		
//		List<WebElement> imagesList = getElements(images);
//		System.out.println("total images ==> " + imagesList.size());
//		for(WebElement e : imagesList) {
//			String srcVal = e.getAttribute("src");
//			//String imageText = e.getText();
//			System.out.println(srcVal);
//			}
		
		getElementAttributes(links, "href");
		System.out.println("-----------------------");
		System.out.println("-----------------------");
		getElementAttributes(images, "src");
		

	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void getElementAttributes(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		System.out.println(eleList.size());
		for(WebElement e : eleList) {
			
			String attrVal = e.getAttribute(attrName);
			System.out.println(attrVal);
			
		}
		
	}

}
