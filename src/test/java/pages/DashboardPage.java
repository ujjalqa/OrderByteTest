package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BaseClass {
	public DashboardPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this); 
		}
	@FindBy(xpath="(//span[@class='ant-menu-title-content'])[4]/a/span")
	private WebElement menu_cntrl;
	@FindBy(xpath="//button[@class='triggerBtn menuCollapsed']//*[name()='svg']")
	private WebElement menu;
	@FindBy(xpath="(//div[@class='brand-item-image'])[1]")
	private WebElement brand_select;
	@FindBy(xpath="//div[@class='product-item-buttons-edit']")
	private WebElement edit_category;
	@FindBy(xpath="//button[@class='ant-btn sc-csTbgd kglWtV add-option-group']")
	private WebElement option_grp;
	@FindBy(xpath="(//button[@class='ant-btn'])[3]")
	private WebElement option;
	@FindBy(id="ingredientsGroups_0_name")
	private WebElement option_grp_text;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement save;
	public WebElement getSave() {
		return save;
	}
	public WebElement getOption_grp_text() {
		return option_grp_text;
	}
	public WebElement getOption() {
		return option;
	}
	public WebElement getOption_grp() {
		return option_grp;
	}
	public WebElement getEdit_category() {
		return edit_category;
	}
	public WebElement getBrand_select() {
		return brand_select;
	}
	public WebElement getMenu() {
		return menu;
	}
	public WebElement getMenu_cntrl() {
		return menu_cntrl;
	}
	
}
