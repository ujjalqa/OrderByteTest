package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportPage extends BaseClass {
	public ReportPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this); 

}
@FindBy(xpath="(//span[@class='ant-menu-title-content'])[3]/a/span")	
private WebElement report;
@FindBy(xpath="//button[@class='ant-btn button']")
private WebElement refresh;
@FindBy(xpath="//button[@class='ant-btn button-gray']")
private WebElement filter;
@FindBy(xpath="//footer[@class='ant-layout-footer']")
private WebElement footer;
@FindBy(id="rc-tabs-1-tab-aggregators")
private WebElement aggregator;
@FindBy(id="rc-tabs-1-tab-models")
private WebElement model;
@FindBy(id="rc-tabs-1-tab-brands")
private WebElement brand;
@FindBy(xpath="//div[@id='rc-tabs-1-tab-products']")
private WebElement dishes;
@FindBy(id="rc-tabs-1-tab-orders")
private WebElement orders;
@FindBy(id="rc-tabs-1-tab-settings")
private WebElement settings;

public WebElement getModel() {
	return model;
} 
public WebElement getBrand() {
	return brand;
}
public WebElement getDishes() {
	return dishes;
}
public WebElement getOrders() {
	return orders;
}
public WebElement getSettings() {
	return settings;
}
public WebElement getAggregator() {
	return aggregator;
}
public WebElement getFooter() {
	return footer;
}
public WebElement getFilter() {
	return filter;
}
public WebElement getReport() {
	return report;
}
public WebElement getRefresh() {
	return refresh;
}


}
