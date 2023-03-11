package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		String browserName = "Chrome";
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver(browserName);
		brUtil.launchURL("https://www.amazon.com");
		String title = brUtil.getPageTitle();
		if(title.contains("Amazon")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		String url = brUtil.getPageURL();
		if(url.contains("amazon.com")) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}
		
		brUtil.quitBrowser();

	}

}
