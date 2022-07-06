package TestCase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.OrderHistoryPage;
import pages.ReportPage;

public class ReportTest extends BaseClass {
	ReportPage rp;
	OrderHistoryPage op;
	@Test(priority=10,description="Verify Report page",enabled=false)
	public void getReport() throws InterruptedException{
		rp=new ReportPage(driver);
		op=new OrderHistoryPage(driver);
		Actions act=new Actions(driver);
		act.moveToElement(rp.getReport()).click().build().perform();
		Thread.sleep(3000);
		rp.getFilter().click();
		Thread.sleep(2000);
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
//		op.getOk().click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
	     .executeScript("arguments[0].scrollIntoView(true);",rp.getFooter());
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
	     .executeScript("arguments[0].scrollIntoView(true);",rp.getRefresh());
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",rp.getAggregator());
//		rp.getAggregator().click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
	     .executeScript("arguments[0].scrollIntoView(true);",rp.getFooter());
		((JavascriptExecutor) driver)
	     .executeScript("arguments[0].scrollIntoView(true);",rp.getRefresh());
		Thread.sleep(2000);
		rp.getModel().click();
		Thread.sleep(1000);
		rp.getBrand().click();
		Thread.sleep(1000);
		rp.getDishes().click();
		Thread.sleep(1000);
		rp.getOrders().click();
		Thread.sleep(1000);
		rp.getSettings().click();
		Thread.sleep(2000);
		
	}

}
