package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPage extends BaseClass {
	public OrderHistoryPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this); 

}
	@FindBy(xpath="(//span[@class='ant-menu-title-content'])[2]/a/span")
	private WebElement order_hist;
	@FindBy(id="date_start")
	private WebElement start_date;
	@FindBy(xpath="//div[@class='ant-picker-input ant-picker-input-active']")
	private WebElement final_date;
	@FindBy(xpath="//li[@class='ant-picker-ok']")
	private WebElement ok;
	@FindBy(xpath="(//button[@class='ant-btn button'])[2]")
	private WebElement refresh;
	@FindBy(xpath="//button[@class='ant-btn button-gray']")
	private WebElement filter;
	public WebElement getRefresh() {
		return refresh;
	}
	public WebElement getOk() {
		return ok;
	}
	public WebElement getOrder_hist() {
		return order_hist;
	}
	public WebElement getStart_date() {
		return start_date;
	}
	public WebElement getFinal_date() {
		return final_date;
	}
	
}
