package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumOfLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> numOfLinks = driver.findElements(By.tagName("a"));
		int linksCount = numOfLinks.size();
		System.out.println(linksCount);
		int newTotal = 0;
		for(int i=0;i<linksCount;i++) {
			String linkText =numOfLinks.get(i).getText();
			
			if(linkText.length() > 0) {
			
				
			System.out.println(linkText);
			newTotal = newTotal + 1;

			
			}
								
		}
		
		System.out.println(newTotal);
		int blanks = linksCount - newTotal;
		System.out.println("The number of blanks are: " + blanks);
		
//		//for each:
//				int count = 0;
//				for(WebElement e : numOfLinks) {
//					String text = e.getText();
//						if(text.length()>0) {
//							System.out.println(count + ":" + text);
//						}
//						int i = count++;
//						System.out.println(i);
//				}
//		
		

	}

}
