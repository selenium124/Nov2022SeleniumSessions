package testngSessions;

import org.testng.annotations.Test;

public class CRUDOperations {
	
	public void createUser() {
		
		System.out.println("Create user");
		
	}
	
	public void getUser(int userId) {
		System.out.println("Get user: " + userId);
	}
	
	public void updateUser() {
		
	}
	
	public void deleteUser() {
		
	}
	
	@Test
	public void createUserTest() {
		createUser();
	}
	
	@Test
	public void getUserTest() {
		createUser();
		getUser(123);
	}
	
	@Test
	public void updateUserTest() {
		createUser();
		getUser(123);
		updateUser();
		getUser(123);
	}
	
	@Test
	public void deleteUserTest() {
		createUser();
		getUser(123);
		deleteUser();
		getUser(123);
	}
	
	
	//This is a bad approach
	@Test
	public void getUserTesting() {
		int userId = 123;
		//QA --> staging
		getUser(userId);
	}

}
