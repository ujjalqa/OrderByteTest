package TestCase;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utlity.DataReader;
import Utlity.DataReader2;
import pages.BaseClass;
import pages.CreateWebSitePage;
import pages.DashboardPage;
import pages.MenuCreationPage;
import pages.MenuSwitchPage;

public class MenuSwitchTest extends BaseClass{
	MenuSwitchPage msp;
	DashboardPage dp;
	CreateWebSiteTest cwt;
	CreateWebSitePage cp;
	DataReader2 dr;
	Select se,se1,se2,se3,se4;
	MenuCreationPage mp;
@Test(priority=11,description="Verify toggling the switch different site is created")
public void toggleSwitch() throws InterruptedException, IOException{
	msp=new MenuSwitchPage(driver);
	dp=new DashboardPage(driver);
	cp=new CreateWebSitePage(driver);
	mp=new MenuCreationPage(driver);
//	cwt=new CreateWebSiteTest();
	Actions act=new Actions(driver);
	
//	dp.getMenu().click();
//	Thread.sleep(1000);
	act.moveToElement(dp.getMenu_cntrl()).click().build().perform();
	
//	dp.getMenu_cntrl().click();
	Thread.sleep(5000);
	act.moveToElement(msp.getBrand_add()).click().build().perform();
	Thread.sleep(2000);
	mp.getMain_vendor().sendKeys("Test");
	mp.getOk().click();
	Thread.sleep(2000);
	dp.getBrand_select().click();
	Thread.sleep(2000);
	((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollIntoView();", msp.getSwitch1());
	msp.getSwitch1().click();
	Thread.sleep(1000);
	msp.getSw1().click();
	Thread.sleep(2000);
	msp.getInput_site().sendKeys(DataReader.getsiteName());
	Thread.sleep(1000);
	msp.getButton_ok().click();
	driver.navigate().refresh();
	Thread.sleep(10000);
	((JavascriptExecutor) driver)
    .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	msp.getSwitch1().click();
	msp.getSw1().click();
//	cwt.getWebSite();
	Thread.sleep(4000);
	
	
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	((JavascriptExecutor) driver)
    .executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	driver.close();
//	ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
//	driver.switchTo().window(tabs.get(0));
////	driver.navigate().refresh();
//	((JavascriptExecutor) driver)
//    .executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	msp.getUrl().click();
//	Thread.sleep(5000);
////	driver.switchTo().window(tabs.get(1));
//	
//	Thread.sleep(4000);
	cp.getNext1().click();
	for(WebElement el:cp.getWeek_day()){
	 se=new Select(el);
	
	
	se.selectByIndex(1);}
	for(int i=0;i<cp.getOpening_hours().size();i++){
		cp.getOpening_hours().get(i).sendKeys("09");
		
		
		cp.getOpening_hours().get(i).sendKeys("00");
		

		cp.getOpening_hours().get(i).sendKeys("AM");
		
	}
	
	for(int i=0;i<cp.getClosing_hours().size();i++){
		cp.getClosing_hours().get(i).sendKeys("09");
		cp.getClosing_hours().get(i).sendKeys("00");
		cp.getClosing_hours().get(i).sendKeys("PM");
		
	}
	Thread.sleep(2000);
	cp.getSave().click();
	Thread.sleep(2000);
	((JavascriptExecutor) driver)
    .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	cp.getNext2().click();
	Thread.sleep(2000);
	((JavascriptExecutor) driver)
    .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	cp.getNext2().click();
	Thread.sleep(2000);
	
//	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-350)", "");
//	cp.getName().sendKeys("TestName");
//	cp.getBank().sendKeys("TestBank");
//	cp.getAgrn().sendKeys("100");
//	cp.getInn().sendKeys("500");
//	cp.getChecking_account().sendKeys("ABCD00001");
//	cp.getSave_acq().click();
//	Thread.sleep(2000);commented these lines
	((JavascriptExecutor) driver)
    .executeScript("window.scrollTo(0, document.body.scrollHeight)");//scroll to the bottom
//	cp.getNext2().click();
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", cp.getNext2());
	Thread.sleep(2000);
	cp.getPromo_create().click();
	Thread.sleep(2000);
	cp.getPromo_name().sendKeys("TestPromo");

	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	se1=new Select(cp.getPromo_type());
	se1.selectByValue("discount_in_total");
	cp.getDiscount_amt().sendKeys("200");
	cp.getMin_amt().sendKeys("100");
	cp.getValidity().sendKeys("06");
	Thread.sleep(1000);
	cp.getValidity().sendKeys("22");
	Thread.sleep(1000);
	cp.getValidity().sendKeys("//");
	Thread.sleep(1000);
	cp.getValidity().sendKeys("2023");
	Thread.sleep(1000);
	cp.getValidity().sendKeys("10");
	Thread.sleep(1000);
	cp.getValidity().sendKeys("00");
	Thread.sleep(1000);
	cp.getValidity().sendKeys("AM");
	Thread.sleep(1000);
	se2=new Select(cp.getFrequency());
	se2.selectByValue("unlimited");
	se3=new Select(cp.getStatus());
	se3.selectByValue("active");
	cp.getSave().click();
	Thread.sleep(2000);
	((JavascriptExecutor) driver)
    .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	cp.getNext2().click();
	Thread.sleep(2000);
	((JavascriptExecutor) driver)
    .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	cp.getCreate_promotion().click();
	Thread.sleep(2000);
	se4=new Select(cp.getDiscount_type());
	se4.selectByValue("percentage_discount");
	String validity=cp.getValidity_date().getAttribute("value");
	String validitiy_end_year=validity.substring(validity.length()-4);
	System.out.println("Validity period:"+validitiy_end_year);
//	Calendar cal=Calendar.getInstance();
	int next_year=(Integer.parseInt(validitiy_end_year)+1);
	String nextyear=String.valueOf(next_year);
	String new_validity_end=validity.substring(0, validity.length() - 4) + nextyear;

	System.out.println("New Validity period:"+new_validity_end);
	cp.getValidity_date().clear();
	cp.getValidity_date().sendKeys(new_validity_end);
	Thread.sleep(2000);
	cp.getApply().click();
	Thread.sleep(2000);
	cp.getOpening_hour().sendKeys("10");
	Thread.sleep(1000);
	cp.getOpening_hour().sendKeys("00");
	Thread.sleep(1000);
	cp.getOpening_hour().sendKeys("AM");
	
	cp.getClosing_hour().sendKeys("10");
	Thread.sleep(1000);
	cp.getClosing_hour().sendKeys("00");
	Thread.sleep(1000);
	cp.getClosing_hour().sendKeys("PM");
	Thread.sleep(2000);
	((JavascriptExecutor) driver)
    .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	cp.getAll_menu_check().click();
	cp.getSave().click();
	Thread.sleep(1000);
	((JavascriptExecutor) driver)
    .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    cp.getNext2().click();
    Thread.sleep(2000);
    cp.getAdd_dish().click();
    Thread.sleep(1000);
    cp.getSelect_dish().click();
    cp.getSave_dish().click();
    Thread.sleep(2000);
    String validity1=cp.getValidity_date().getAttribute("value");
		String validitiy_end_year1=validity.substring(validity1.length()-4);
		System.out.println("Validity period:"+validitiy_end_year1);
//		Calendar cal=Calendar.getInstance();
		int next_year1=(Integer.parseInt(validitiy_end_year1)+1);
		String nextyear1=String.valueOf(next_year);
		String new_validity_end1=validity1.substring(0, validity1.length() - 4) + nextyear;
	
		System.out.println("New Validity period:"+new_validity_end1);
		cp.getValidity_date().clear();
		cp.getValidity_date().sendKeys(new_validity_end);
		Thread.sleep(2000);
		cp.getApply().click();
		Thread.sleep(2000);
		cp.getOpening_hour().sendKeys("10");
		Thread.sleep(1000);
		cp.getOpening_hour().sendKeys("00");
		Thread.sleep(1000);
		cp.getOpening_hour().sendKeys("AM");
		
		cp.getClosing_hour().sendKeys("10");
		Thread.sleep(1000);
		cp.getClosing_hour().sendKeys("00");
		Thread.sleep(1000);
		cp.getClosing_hour().sendKeys("PM");
		cp.getSave().click();
		Thread.sleep(1000);
		 cp.getNext2().click();
		 Thread.sleep(2000);
		 ((JavascriptExecutor) driver)
		    .executeScript("window.scrollTo(0, document.body.scrollHeight)");
	     cp.getNext2().click();
	     Thread.sleep(2000);
//	msp.getInput_site().sendKeys("Test1");
//	msp.getButton_ok().click();
//	Thread.sleep(1000);
//	msp.getUrl().click();
//	Thread.sleep(5000);
//	driver.switchTo().newWindow(WindowType.WINDOW);
//	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//	driver.switchTo().window(tabs.get(1));
//	Thread.sleep(2000);
}
}
