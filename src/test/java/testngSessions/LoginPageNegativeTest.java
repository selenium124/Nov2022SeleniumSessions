package testngSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {
	
	public WebDriver driver;
	
	public boolean doLogin(String userName, String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String errorMsg = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errorMsg);
		if(errorMsg.contains("No match for E-Mail Address and/or Password.")) {
			return true;
		}
		return false;
		
	}
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@DataProvider
	public Object[][] getLoginNegativeData() {
		return new Object[][] {
			{"ramya@gmail.com", "Test@123"},
			{"jishna@gmail.com", "Test@123"},
			{"ramya@gmail.com"," "},
			{" ", "Test@123"},
		};
		
	}
	
	@Test(dataProvider = "getLoginNegativeData")
	public void loginTest(String userName, String password) {
		
		boolean flag = doLogin(userName, password);
		
		Assert.assertTrue(flag);
		
	}
	
	@DataProvider
	public Object[][] getRegTestData() {
		return new Object[][] {
			{"Ramya","Kishore","ramya@gmailcom","2345678965","Ramya@123"},
			{"Lavanya","Hari","lavanya@gmailcom","9876543678","Lavanya@123"},
			{"Kishore","Bhaskar","Kishore@gmailcom","8765432456","Kishore@123"},
		};
	}
	
	@Test(dataProvider="getRegTestData")
	public void registerTest(String fn, String ln, String email, String phNo, String password ) {
		
	}
	
//	@AfterTest 
//	public void tearDown() {
//		driver.quit();
//	}

}
