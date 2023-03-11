package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();
		
		//a[text() = 'Ligon Farber']/parent::td/preceding-sibling::td/input[@type = 'checkbox']
		//driver.findElement(By.xpath("//a[text() = 'Ligon Farber']/parent::td/preceding-sibling::td/input[@type = 'checkbox']")).click();
		//a[text() = 'Fatima Sana']/parent::td/following-sibling::td/span[@context = 'phone']
		//a[text() = 'Ali khan']/parent::td/following-sibling::td/a[contains(text(),'.com')]
		
		
		Thread.sleep(4000);
		
		selectUser("Ligon Farber");
		selectUser("Ramya pingili");
		
		String userCompanyAndEmail = getUserCompanyNameAndEmail("deepti gupta");
		System.out.println(userCompanyAndEmail);
		userCompanyAndEmail = getUserCompanyNameAndEmail("Georgia Foster");
		System.out.println(userCompanyAndEmail);
		
		List<String> userContactNums = getUserContactNum("Ali khan");
		System.out.println(userContactNums);
		userContactNums = getUserContactNum("Fatima Sana");
		System.out.println(userContactNums);
		

	}
	
	public static void selectUser(String userName) {
		
		driver.findElement(By.xpath
				("//a[text() = '"+userName+"']/parent::td/preceding-sibling::td/input[@type = 'checkbox']")).click();
		
		
		}
	
	public static String getUserCompanyNameAndEmail(String userName) {

		String companyName = driver.findElement(By.xpath
				("//a[text() = '"+userName+"']/parent::td/following-sibling::td/a[@context = 'company']")).getText();

		try {
			String userEmail =  driver.findElement(By.xpath("//a[text() = '"+userName+"']/parent::td/following-sibling::td/a[contains(text(),'.com')]")).getText();
			return companyName + " email:" + userEmail;
		} 
		catch (Exception e) {
			System.out.println("No email Id for the user");
			return companyName;
			
			
		}

	}
	
	public static List<String> getUserContactNum(String userName) {
		List<WebElement> contactNum = driver.findElements(By.xpath("//a[text() = '"+userName+"']/parent::td/following-sibling::td/span[@context = 'phone']"));
		List<String> userContactNum = new ArrayList<String>();
		for(WebElement e :contactNum ) {
			String Num = e.getText();
			userContactNum.add(Num);
			
		}
		return userContactNum;
		
	}

}
