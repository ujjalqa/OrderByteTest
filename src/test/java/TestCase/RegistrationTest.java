package TestCase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utlity.DataReader;
import pages.BaseClass;
import pages.RegistrationPage;

public class RegistrationTest extends BaseClass {
	JavascriptExecutor executor;
	
	RegistrationPage rp;
	@Test(priority=2,description="registration Step-1",enabled=false)
	public void registerStep1() throws InterruptedException{
		rp=new RegistrationPage(driver);
		executor = (JavascriptExecutor) driver; 
		driver.navigate().refresh();
		Thread.sleep(4000);
		rp.getFirstname().sendKeys(DataReader.getFirstName());
		rp.getLastname().sendKeys(DataReader.getLastName());
		rp.getMiddlename().sendKeys(DataReader.getMiddlename());
		
		rp.getAddress().sendKeys("TestAddress");
		executor.executeScript("arguments[0].click();",rp.getFlag());
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();",rp.getCountry_name());
		rp.getTel1().sendKeys("1234567890");
		executor.executeScript("arguments[0].click();",rp.getFlag());
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();",rp.getCountry_name());
		rp.getTel2().sendKeys("1234567890");
		rp.getMail().sendKeys("aa@bb.com");
		rp.getLegal_entity().sendKeys("abcd");
		((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView();", rp.getOffer());
		Thread.sleep(2000);
		rp.getOffer().click();
		rp.getPrivacy().click();
//		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(rp.getNext()));
		 
		executor.executeScript("arguments[0].click();",rp.getPrevious());
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",rp.getNext());
		Thread.sleep(2000);
		((JavascriptExecutor) driver)
	    .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		rp.getFirstname().sendKeys(DataReader.getFirstName());
		Thread.sleep(2000);
		rp.getLastname().sendKeys(DataReader.getLastName());
		Thread.sleep(2000);
		rp.getMiddlename().sendKeys(DataReader.getMiddlename());
		Thread.sleep(2000);
		rp.getRestaurant_name().sendKeys("Test_Name");
		Thread.sleep(2000);
		rp.getAddress().sendKeys("TestAddress");
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",rp.getFlag());
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();",rp.getCountry_name());
		rp.getTel1().sendKeys("1234567890");
		executor.executeScript("arguments[0].click();",rp.getFlag2());
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();",rp.getCountry_name());
		rp.getTel2().sendKeys("1234567890");
		Thread.sleep(2000);
		rp.getMail().sendKeys("aa@bb.com");
		Thread.sleep(2000);
		rp.getLegal_entity().sendKeys("abcd");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView();", rp.getOffer());
		Thread.sleep(2000);
		rp.getOffer().click();
		rp.getPrivacy().click();
		wait.until(ExpectedConditions.elementToBeClickable(rp.getNext()));
//		JavascriptExecutor executor = (JavascriptExecutor) driver; 
		executor.executeScript("arguments[0].click();",rp.getNext());
		rp.getOffer().click();
		rp.getPrivacy().click();
//		rp.getNext().click();
		Thread.sleep(2000);
		rp.getFirstname().sendKeys(DataReader.getFirstName());
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rp.getFlag());
//		Thread.sleep(2000);
//		executor.executeScript("arguments[0].click();",rp.getFlag2());
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();",rp.getCountry_name());
//		Thread.sleep(1000);
//		rp.getTel2().sendKeys("1234567890");
		Thread.sleep(2000);
		
		executor.executeScript("arguments[0].click();",rp.getNext());
	}

}
