package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithXpath {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.microchip.com/prochiplicensing/#/");
//		WebElement design = driver.findElement(By.xpath("//label[text() = 'When is your design planned for production?']/preceding-sibling::select"));
//		Select select = new Select(design);
//		select.selectByVisibleText("2023");
		
		doSelectValuesFromTheList("When is your design planned for production?", "2023");
		doSelectValuesFromTheList("What is your HDL preference?", "Verilog");
		doSelectValuesFromTheList("Which CPLD will you be using?", "ATF1504");
		doSelectValuesFromTheList("What are the potential quantities per year(or total CPLD volume) you plan to use in your design(s)?", "1000 - 5000 units");
		

	}
	
	public static void doSelectValuesFromTheList(String label, String value) {
		WebElement design = driver.findElement(By.xpath("//label[text() = '"+label+"']/preceding-sibling::select"));
		Select select = new Select(design);
		select.selectByVisibleText(value);
	}

}
