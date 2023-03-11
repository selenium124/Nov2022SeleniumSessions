package testngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {

	// tcs should be independent
	// AAA : Arrange, Act, Assert
	// 1 tc with 1 assertion
	@Test(priority = 1)
	public void titleTest() {
		
		String title = driver.getTitle();
		System.out.println("page title: " + title);
		Assert.assertEquals(title, "Your Store");

	}

	@Test(priority = 2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(flag);

	}

}
