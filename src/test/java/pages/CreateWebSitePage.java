package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateWebSitePage extends BaseClass {
	public CreateWebSitePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//input[@name='Login']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='Password']")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@class='submit']")
	private WebElement send;

	public WebElement getSend() {
		return send;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}
	
	
}
