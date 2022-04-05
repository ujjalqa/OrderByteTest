package TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.LoginPage;

public class LoginTest extends BaseClass{
	LoginPage lp;
	
	
	@Test(priority=1,description="Verify user is able to login into the application",enabled=false)
	public void verify_login() throws InterruptedException{
		lp=new LoginPage(driver);
		lp.getUserName();//enters the user name
		lp.getPassword();//enter the password
		lp.clickLogin();//click on login button
		Thread.sleep(2000);
		System.out.println("Login successful");
		Thread.sleep(2000);
	
	}
	

	
}
	




