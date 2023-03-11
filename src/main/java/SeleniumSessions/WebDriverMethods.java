package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("amazon.com")) {
			System.out.println("Pass");
		}
		
//		else {
//			System.out.println("Fail");
//		}
		
//		String pgSrc = driver.getPageSource();
//		System.out.println(pgSrc);
//		if(pgSrc.contains("NAVYAAN FOOTER END")) {
//			System.out.println("Pass");
//		}
		
//		else {
//			System.out.println("Fail");
//		}
		
		driver.quit();
		
		

	}

}
