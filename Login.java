package TEST_1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	@BeforeTest
	public void loginToApplication()
	{
		System.out.println("Login to application");
	}
		
		
	@AfterTest
	public void logoutFromApplication()
	{
		System.out.println("Logout from Application");
	}
	
	@BeforeMethod
	public void connectToDB() {
		
		System.out.println("DB Connected");
	}
	
	@AfterMethod
	public void disconnectFromDB() {
		
		System.out.println("Disconnect DB Connected");
	}
	
	
	
	@Test(priority = 1, description = "This is a login test",groups = "Reggression")
	public void login() {
		
		System.out.println("Login is successfull");
	}
	
	@Test(priority = 2, description = "This is a logout test")
	public void logoutTest()
	{
	
		System.out.println("Logout is successfull");

	}

}
