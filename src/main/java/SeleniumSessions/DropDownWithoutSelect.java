package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.id("Form_getForm_Country");
		By options = By.xpath("//select[@id='Form_getForm_Country']/option");
		
//		List<WebElement> optionsList = driver.findElements(options);
//		System.out.println(optionsList.size());
//		
//		for(WebElement e : optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//				if(text.equals("India")) {
//					e.click();
//					break;
//				}
				
			//arraylist<String>
			//add it with text
			
//		}
		
		List<String> dropDownOtionsValue = getDropDownOptionsText(options);
		System.out.println(dropDownOtionsValue);
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static List<String> getDropDownOptionsText(By locator) {
		List<WebElement> optionsList = getElements(locator);
		List<String> optionsText = new ArrayList<String>();
		System.out.println(optionsList.size());
		for(WebElement e : optionsList) {
			
			String text = e.getText();
			optionsText.add(text);
			
		}
		return optionsText;
		
	}

}
