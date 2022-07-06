package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuSwitchPage extends BaseClass {
	public MenuSwitchPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);

}
	
	@FindBy(xpath="(//button[@class='ant-switch'])[2]")
	private WebElement switch1;
    @FindBy(xpath="//button[@class='ant-btn button-img settings']")
    private WebElement sw1;
    @FindBy(xpath="//div[@id='subdomain']//input")
    private WebElement input_site;
    @FindBy(xpath="//span[contains(text(),'OK')]")
    private WebElement button_ok;
    @FindBy(xpath="//div[@class='wl-url-link']/a")
    private WebElement url;
    @FindBy(xpath="//div[@class='brand-item-image']")
    private WebElement brand_add;
    
	public WebElement getBrand_add() {
		return brand_add;
	}
	public WebElement getUrl() {
		return url;
	}
	public WebElement getButton_ok() {
		return button_ok;
	}
	public WebElement getInput_site() {
		return input_site;
	}
	public WebElement getSw1() {
		return sw1;
	}
	public WebElement getSwitch1() {
		return switch1;
	}
	
	
}
