package testngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {

	// Not Valid Format
	// @Test
	// public void amazonPageTest() {
	// System.out.println("Checking Titlr...........");
	// String title = driver.getTitle();
	// Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.11");
	//
	// System.out.println("Checking Search.....");
	// boolean flag =
	// driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
	// Assert.assertTrue(flag);
	//
	// System.out.println("Checking Help.....");
	// boolean flag1 = driver.findElement(By.linkText("Help")).isDisplayed();
	// Assert.assertTrue(flag1);
	//
	// }
	
	
	@Test(priority = 1)
	public void titleTest() {

		String title = driver.getTitle();
		System.out.println("page title: " + title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");

	}

	@Test(priority = 2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);

	}

	@Test(priority = 3)
	public void helpExistTest() {
		boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);

	}

}
