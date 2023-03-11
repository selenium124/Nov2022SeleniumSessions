package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
//		List<WebElement> languageLinks = driver.findElements(By.xpath("//div[@id= 'SIvCob']/a"));
//		System.out.println(languageLinks.size());
//		for(WebElement e : languageLinks) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("తెలుగు")) {
//				e.click();
//				break;
//			}
//		}
		
		By langLinksXpath = By.xpath("//div[@id= 'SIvCob']/a");
		
		//div[@class='KxwPGc AghGtd']/a
		// //a[@class='pHiOh']
		By footerLinks = By.className("pHiOh");
		
		List<String> allLangs = getListOfLanguages(langLinksXpath);
		System.out.println(allLangs);
		
		List<String> allFooterLinks = getListOfLanguages(footerLinks);
		System.out.println(allFooterLinks);
		
//		int numOfFooterLinks = getElements(footerLinks).size();
//		System.out.println(numOfFooterLinks);
		
//		List<String> footerLinksText = getListOfFooterLinksText(footerLinks);
//		System.out.println(footerLinksText);
		
		doClickOnLanguageLink(langLinksXpath, "తెలుగు");

	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void doClickOnLanguageLink(By locator, String value) {
		List<WebElement> languageLinks = getElements(locator);
		for(WebElement e : languageLinks) {
			String text = e.getText();			
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		
		
		
	}
	
	public static List<String> getListOfLanguages(By locator) {
		List<WebElement> languageLinks = getElements(locator);
		List<String> langLinksText = new ArrayList<String>();
		for(WebElement e : languageLinks) {
			String text = e.getText();
			langLinksText.add(text);
		}
		
		return langLinksText;
	}
	
	public static List<String> getListOfFooterLinksText(By locator) {
		List<WebElement> footerLinks = getElements(locator);
		List<String> footerLinksText = new ArrayList<String>();
		System.out.println(footerLinks.size());
		for(WebElement e : footerLinks) {
			String text = e.getText();
			footerLinksText.add(text);
		}
		
		return footerLinksText;
	}

}
