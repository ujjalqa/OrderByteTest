package TestCase;

import java.io.IOException;
import java.util.Calendar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utlity.DataReader;
import Utlity.DataReader2;
import pages.BaseClass;
import pages.CreateWebSitePage;

public class CreateWebSiteTest extends BaseClass{
	CreateWebSitePage cp;
	DataReader2 dr;
	Select se,se1,se2,se3,se4;
	@Test(priority=6,description="Verify that website can be customized",enabled=true)
	public void getWebSite() throws IOException, InterruptedException{
		cp=new CreateWebSitePage(driver);
		dr=new DataReader2();
		driver.get(dr.getUrl());
		cp.getUsername().sendKeys(dr.getUsername());
		cp.getPwd().sendKeys(dr.getPassword());
		cp.getSend().click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
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
		
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-350)", "");
//		cp.getName().sendKeys("TestName");
//		cp.getBank().sendKeys("TestBank");
//		cp.getAgrn().sendKeys("100");
//		cp.getInn().sendKeys("500");
//		cp.getChecking_account().sendKeys("ABCD00001");
//		cp.getSave_acq().click();
//		Thread.sleep(2000);commented these lines
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");//scroll to the bottom
//		cp.getNext2().click();
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
//		Calendar cal=Calendar.getInstance();
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
//			Calendar cal=Calendar.getInstance();
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
		     .executeScript("arguments[0].scrollIntoView(true);",cp.getNext2());
		     cp.getNext2().click();
		     Thread.sleep(2000);
		}
		
		
		
	}


