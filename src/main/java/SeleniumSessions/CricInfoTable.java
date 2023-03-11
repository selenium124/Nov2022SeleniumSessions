package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/sa20-2022-23-1335268/mi-cape-town-vs-pretoria-capitals-20th-match-1343960/full-scorecard");
		
		//span[text()='Will Jacks']/ancestor::td/following-sibling::td//span/span
		String wkName = getWicketTakerName("Will Jacks");
		System.out.println(wkName);
		wkName = getWicketTakerName("Rilee Rossouw");
		System.out.println(wkName);
		
		List<String> playerScoreList = getScoreCardList("Will Jacks");
		System.out.println(playerScoreList);

	}
	
	public static String getWicketTakerName(String playerName) {
		return
				driver.findElement(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td//span/span")).getText();
	}
	
	public static List<String> getScoreCardList(String playerName) {
		List<WebElement> scoreList = driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td//following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> playerScoreList = new ArrayList<String>();
		for(WebElement e : scoreList) {
			String text = e.getText();
			playerScoreList.add(text);
			
			}
		return playerScoreList;
	}

}
