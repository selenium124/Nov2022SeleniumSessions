package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String doElementGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public boolean getElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public String getElementAttribute(By locator, String value) {
		return getElement(locator).getAttribute(value);
	}
	
	public int getTotalElementsCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println("total elements for : " + locator +"--->"+ eleCount);
		return eleCount;
	}
	
	public void getElementAttributes(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		System.out.println(eleList.size());
		for(WebElement e : eleList) {
			
			String attrVal = e.getAttribute(attrName);
			System.out.println(attrVal);
			
		}
		
	}
	
	public List<String> getElementsTextLinks(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for(WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		
		return eleTextList;
	}
	
	
	// *************************Select based drop down utils****************//
	
	public void doDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public void doDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}

	public void selectDropDownValue(By locator, String expValue) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(expValue)) {
				e.click();
				break;
			}
		}
	}

	public int getTotalDropDownOptions(By locator) {
		int optionsCount = getDropDownOptionsList(locator).size();
		System.out.println("total options ==> " + optionsCount);
		return optionsCount;
	}

}
