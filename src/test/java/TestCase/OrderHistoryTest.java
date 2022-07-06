package TestCase;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Utlity.DataReader;
import Utlity.DataReader2;
import pages.BaseClass;
import pages.LoginPage;
import pages.OrderHistoryPage;
import pages.RestuaranatPage;

public class OrderHistoryTest extends BaseClass{
OrderHistoryPage op;
RestuaranatPage rp;
LoginPage lp;
DataReader dr;
@Test(priority=9,description="Verify Order History page",enabled=false)
public void searchOrder() throws InterruptedException, IOException{
	op=new OrderHistoryPage(driver);
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
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", op.getOrder_hist());
	Thread.sleep(5000);
//	op.getRefresh().click();
//	Thread.sleep(3000);
	op.getStart_date().sendKeys(Keys.chord(Keys.COMMAND, Keys.chord("a")));
	Thread.sleep(1000);
	op.getStart_date().sendKeys(Keys.DELETE);
	Thread.sleep(1000);
	op.getStart_date().sendKeys("2022");
	Thread.sleep(1000);
	op.getStart_date().sendKeys("-");
	Thread.sleep(1000);
	op.getStart_date().sendKeys("04");
	Thread.sleep(1000);
	op.getStart_date().sendKeys("-");
	Thread.sleep(1000);
	op.getStart_date().sendKeys("22");
	Thread.sleep(1000);
	op.getStart_date().sendKeys(Keys.SPACE);
	Thread.sleep(1000);
	op.getStart_date().sendKeys("00");
	Thread.sleep(1000);
	op.getStart_date().sendKeys(":");
	Thread.sleep(1000);
	op.getStart_date().sendKeys("00");
	Thread.sleep(1000);
	op.getStart_date().sendKeys(":");
	Thread.sleep(1000);
	op.getStart_date().sendKeys("00");
	Thread.sleep(1000);
	op.getStart_date().sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	op.getOk().click();
	Thread.sleep(2000);
	op.getRefresh().click();
//	op.getOk().click();
	Thread.sleep(5000);
//	op.getFinal_date().sendKeys(Keys.TAB);
//	op.getFinal_date().sendKeys(Keys.chord(Keys.COMMAND, Keys.chord("a")));
//	Thread.sleep(1000);
//	op.getFinal_date().sendKeys(Keys.DELETE);
//	Thread.sleep(1000);
//	op.getFinal_date().sendKeys("2022");
//	Thread.sleep(1000);
//	op.getStart_date().sendKeys("-");
//	Thread.sleep(1000);
//	op.getFinal_date().sendKeys("04");
//	Thread.sleep(1000);
//	op.getFinal_date().sendKeys("-");
//	Thread.sleep(1000);
//	op.getFinal_date().sendKeys("22");
//	Thread.sleep(1000);
//	op.getFinal_date().sendKeys(Keys.SPACE);
//	Thread.sleep(1000);
//	op.getFinal_date().sendKeys("23");
//	Thread.sleep(1000);
//	op.getFinal_date().sendKeys(":");
//	Thread.sleep(1000);
//	op.getFinal_date().sendKeys("59");
//	Thread.sleep(1000);
//	op.getFinal_date().sendKeys(":");
//	Thread.sleep(1000);
//	op.getFinal_date().sendKeys("23");
//	Thread.sleep(1000);
//	op.getFinal_date().sendKeys("59");
//	Thread.sleep(1000);
//	op.getOk().click();
	
	
	
}

}
