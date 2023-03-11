package testngSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	WebDriver driver;
	@Parameters({"url","browser"})
	@BeforeTest
	public void setup(String url, String browserName) {
		System.out.println("Running test on " + browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
		
		driver = new ChromeDriver();
		}
		
		if(browserName.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
			}
		
		if(browserName.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
			}
		else {
			System.out.println("Pass the correct browser name");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);	
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
