package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSectionConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElements(By.xpath("//h5[text() = 'Information']/following-sibling::ul//a"));
		List<String> secNamesList = getFooterSectionList("Information");
		System.out.println(secNamesList);
		secNamesList = getFooterSectionList("Customer Service");
		System.out.println(secNamesList);
		secNamesList = getFooterSectionList("Extras");
		System.out.println(secNamesList);
		secNamesList = getFooterSectionList("My Account");
		System.out.println(secNamesList);
		

	}
	
	public static List<String> getFooterSectionList(String secName) {
		List<WebElement> sectionNames = driver.findElements(By.xpath("//h5[text() = '"+secName+"']/following-sibling::ul//a"));
		System.out.println(sectionNames.size());
		List<String> secNames = new ArrayList<String>();
		for(WebElement e : sectionNames) {
			String text = e.getText();
			secNames.add(text);
		
		}
		
		return secNames;
	}

}
