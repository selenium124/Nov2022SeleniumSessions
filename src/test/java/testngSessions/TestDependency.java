package testngSessions;

import org.testng.annotations.Test;

public class TestDependency {
	
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test(dependsOnMethods = "searchTest")
	public void addToCart() {
		System.out.println("add to cart");
	}
	
	@Test(dependsOnMethods = "addToCart")
	public void makePayment() {
		System.out.println("make payment");
	}

}
