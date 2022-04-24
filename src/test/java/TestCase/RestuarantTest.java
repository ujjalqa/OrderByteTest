package TestCase;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Utlity.DataReader;
import pages.BaseClass;
import pages.DashboardPage;
import pages.LoginPage;
import pages.RestuaranatPage;

public class RestuarantTest extends BaseClass{
RestuaranatPage rp;
LoginPage lp;
DataReader dr;
@Test(priority=8,description="Verfiy resurant details",enabled=false)
public void getRestuarantDetails() throws IOException, InterruptedException{
	lp=new LoginPage(driver);
	rp=new RestuaranatPage(driver);
	dr=new DataReader();
	driver.get(dr.getUrl());
	lp.getUserName();
	lp.getPassword();
	lp.clickLogin();
	Thread.sleep(4000);
//	dp.getMenu().click();
//	Thread.sleep(1000);
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", rp.getRestuarant());
	Thread.sleep(5000);
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", rp.getTable());
	rp.getTable_no().sendKeys("1234");
	rp.getPos_id().sendKeys("Table_1234");
	rp.getZone().sendKeys("TestZone");
	rp.getLanding().sendKeys("100");
	rp.getComment().sendKeys("This is a test comment");
	rp.getOk().click();
	Thread.sleep(1000);
	rp.getManager().click();
	rp.getAdd_manager().click();
	rp.getFirstname().sendKeys("TestFname");
	rp.getLast_name().sendKeys("TestLName");
	rp.getPos_id1().sendKeys("POS_123456");
	rp.getTelephone().sendKeys("1234567890");
	rp.getTelegram().sendKeys("1234567890");
	rp.getOk().click();
	Thread.sleep(1000);
	rp.getWaiter().click();
	rp.getAdd_waiter().click();
	Thread.sleep(1000);
	rp.getFirstname().sendKeys("TestFname");
	rp.getLast_name().sendKeys("TestLName");
	rp.getPos_id1().sendKeys("POS_123456");
	rp.getClaim().sendKeys("TestClaim_123");
	rp.getTelephone().sendKeys("1234567890");
	rp.getTelegram().sendKeys("1234567890");
	rp.getComment().sendKeys("Test Comment");
	rp.getOk().click();
	Thread.sleep(1000);
	rp.getReviews().click();
	Thread.sleep(1000);
	
	
}
}
