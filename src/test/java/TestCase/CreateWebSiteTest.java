package TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import Utlity.DataReader;
import pages.BaseClass;
import pages.CreateWebSitePage;

public class CreateWebSiteTest extends BaseClass{
	CreateWebSitePage cp;
	DataReader dr;
	@Test(priority=6,description="Verify that website can be customized")
	public void getWebSite() throws IOException{
		cp=new CreateWebSitePage(driver);
		dr=new DataReader();
		cp.getUsername().sendKeys(dr.getUsername());
		cp.getPwd().sendKeys(dr.getPassword());
		cp.getSend().click();
		
		
		
	}

}
