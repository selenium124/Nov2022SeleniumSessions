package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromPageSection {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		List<WebElement> panelLinksList = driver.findElements(By.xpath("//aside[@id = 'column-right']//a"));
//		System.out.println(panelLinksList.size());
//		for(WebElement e : panelLinksList) {
//			System.out.println(e.getText());
//		}
		
		By panelLinksList = By.xpath("//aside[@id = 'column-right']//a");
		By footerLinks = By.xpath("//footer//a");
		
		//getElementsTextLinks(panelLinksList);
		//System.out.println(panelLinksList.size());
		List<String> rightPanelLinks = getElementsTextLinks(panelLinksList);
		List <String> footerLinksText = getElementsTextLinks(footerLinks);
		System.out.println(rightPanelLinks.size());
		System.out.println(rightPanelLinks);
		System.out.println(rightPanelLinks.contains("Login"));
		System.out.println(rightPanelLinks.contains("Downloads"));
		System.out.println(rightPanelLinks.contains("My Account"));
		System.out.println(footerLinksText);

	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static List<String> getElementsTextLinks(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for(WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		
		return eleTextList;
	}

}
