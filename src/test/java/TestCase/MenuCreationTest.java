package TestCase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utlity.DataReader;
import pages.BaseClass;
import pages.MenuCreationPage;

public class MenuCreationTest extends BaseClass{
	MenuCreationPage mp;
	Actions act;
	@Test(priority=3,description="Verify the creation of menu",enabled=true)
	public void createMenu() throws InterruptedException{
//		mp.clickMenu();
		Thread.sleep(4000);
		 act=new Actions(driver);
		act.moveToElement(mp.getBrand()).click().build().perform();
		
//		mp.getBrand().click();
		mp.getMain_vendor().sendKeys("Test");
		mp.getOk_btn().click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		for(WebElement el:mp.getLs()){
		System.out.println("Brand name is:"+el.getText());
			if(el.getText().equalsIgnoreCase("Test"))
				el.click();
			break;
		}
		
		Thread.sleep(5000);
		mp.getNext().click();
		Thread.sleep(2000);
		
		
	}
	@Test(priority=4,description="Category can be created",enabled=true)
	public void createCategory() throws InterruptedException{
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView();", mp.getCategory());
		mp.getCategory().click();
		mp.getCatagory_title().sendKeys(DataReader.getCategory());
		mp.getOk().click();
		Thread.sleep(2000);

		mp.getDish().click();
		mp.getProduct().sendKeys("TestProd");
		mp.getPrice().sendKeys("100");
		mp.getDesc().sendKeys("Test Desc");
		mp.getWeight().sendKeys("10");
		mp.getSubmit().click();
		mp.getNext1().click();
		Thread.sleep(2000);
	
	}
	@Test(priority=5,description="Verify that website can be created",enabled=true)
	public void createWebSite() throws InterruptedException{
		Thread.sleep(2000);
		mp.getName().sendKeys("UjjalTest");
		((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView();", mp.getNext());
		mp.getNext().click();
		Thread.sleep(2000);
	}
	
	
@BeforeClass
public void initClass(){
	mp=new MenuCreationPage(driver);
}
}
