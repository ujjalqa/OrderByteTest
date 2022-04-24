package TestCase;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utlity.DataReader;
import Utlity.DataReader2;
import pages.BaseClass;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTest extends BaseClass {
	LoginPage lp;
	DashboardPage dp;
	DataReader dr;
	@Test(priority=7,description="verify Menu Control option",enabled=false)
	public void menuControl() throws IOException, InterruptedException{
		lp=new LoginPage(driver);
		dp=new DashboardPage(driver);
		dr=new DataReader();
		driver.get(dr.getUrl());
		lp.getUserName();
		lp.getPassword();
		lp.clickLogin();
		Thread.sleep(2000);
//		dp.getMenu().click();
//		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", dp.getMenu_cntrl());
//		dp.getMenu_cntrl().click();
		Thread.sleep(2000);
		dp.getBrand_select().click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		dp.getEdit_category().click();
		Thread.sleep(1000);
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		dp.getOption_grp().click();
		Thread.sleep(1000);
		dp.getOption_grp_text().sendKeys(Keys.chord(Keys.COMMAND, Keys.chord("a")));
		Thread.sleep(1000);
		dp.getOption_grp_text().sendKeys(DataReader.getOptionGroupName());
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		dp.getOption().click();
		Thread.sleep(1000);
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		dp.getSave().click();
		Thread.sleep(1000);
	}

}
