package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	private WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		System.out.println("Browser name is : " + browserName);
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();			
			break;
		case "firefox":
			driver = new FirefoxDriver();			
			break;
		case "safari":
			driver = new SafariDriver();			
			break;
		case "edge":
			driver = new EdgeDriver();			
			break;	

		default:
			System.out.println("Please pass the right browser...." + browserName);
			break;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public void launchURL(String url) {
		if(url == null) {
			System.out.println("url cannot be null");
		}
		
		if(url.indexOf("https") == 0) {
			driver.get(url);
		}
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page title: " + title);
		return title;
	}
	
	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("Page title: " + url);
		return url;
	}
	
	public void quitBrowser() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
