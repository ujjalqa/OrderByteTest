package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuCreationPage extends BaseClass{
	public MenuCreationPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="(//ul[@role='menu']/li)[5]")
	private WebElement menu;
	
	@FindBy(xpath="(//div[@class='brand-item-image'])[2]")
	private WebElement brand;
	
	@FindBy(id="mainVendor")
	private WebElement main_vendor;
	
	@FindBy(xpath="(//div[@class='ant-modal-footer']/button)[2]")
	private WebElement ok_btn;
	@FindBy(xpath="//div[@class='list-brands']/div//div[@class='brand-item-content']")
	private List<WebElement> ls;
	@FindBy(xpath="(//button[@class='ant-btn'])[2]")
	private WebElement next;
	@FindBy(xpath="(//div[@class='menu-kategory-title']/following-sibling::*)[2]/button")
	private WebElement category;
	@FindBy(id="categoryTitle")
	private WebElement catagory_title;
	@FindBy(xpath="//span[normalize-space()='OK']")
	private WebElement ok;
	@FindBy(xpath="//div[@class='stoplists-item-add-text']")
	private WebElement dish;
	@FindBy(id="productName")
	private WebElement product;
	@FindBy(id="price")
	private WebElement price;
	@FindBy(id="description")
	private WebElement desc;
	@FindBy(id="weight")
	private WebElement weight;
	@FindBy(id="energyValue")
	private WebElement energy;
	@FindBy(id="proteinValue")
	private WebElement protein;
	@FindBy(id="fatValue")
	private WebElement fat;
	@FindBy(id="carbohydrateValue")
	private WebElement carbohydrate;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	@FindBy(xpath="(//button[@class='ant-btn'])[4]")
	private WebElement next1;
	@FindBy(xpath="//input[@class='ant-input blueInput']")
	private WebElement name;
	public WebElement getName() {
		return name;
	}

	public WebElement getNext1() {
		return next1;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getDesc() {
		return desc;
	}

	public WebElement getWeight() {
		return weight;
	}

	public WebElement getEnergy() {
		return energy;
	}

	public WebElement getProtein() {
		return protein;
	}

	public WebElement getFat() {
		return fat;
	}

	public WebElement getCarbohydrate() {
		return carbohydrate;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getDish() {
		return dish;
	}

	public WebElement getOk() {
		return ok;
	}
	
	public WebElement getCatagory_title() {
		return catagory_title;
	}
	public WebElement getCategory() {
		return category;
	}
	public WebElement getNext() {
		return next;
	}
	public List<WebElement> getLs() {
		return ls;
	}
	public WebElement getOk_btn() {
		return ok_btn;
	}
	public WebElement getMain_vendor() {
		return main_vendor;
	}
	public WebElement getBrand() {
		return brand;
	}
	public WebElement getMenu() {
		return menu;
	}
	public void clickMenu(){
		menu.click();
		
	}
}
