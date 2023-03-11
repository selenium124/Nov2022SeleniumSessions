package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		// 1. open browser: chrome, ff, safari, edge
		// ChromeDriver driver = new ChromeDriver();
		WebDriver driver = null;
		String browser = "Firefox";
		
		// cross browser logic
		if(browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("Edge")) {
			driver = new EdgeDriver();
		}
		
		else {
			System.out.println("Please pass the right browser " + browser);
		}
		
		// 2. enter url:
		driver.get("https://www.google.com");
		
		// 3. get the title:
		String title = driver.getTitle();
		System.out.println(title);
		
		// validation point/checkpoint:
		if(title.equals("Google")) {
			System.out.println("Google is launched successfully");
		}
		
		else {
			System.out.println("Fail");
		}
		
		// Automation steps (selenium code) + validation/assertions = Automation Testing
		driver.quit();// close the browser

	}

}
