package pages;

import java.util.List;

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
    @FindBy(xpath="//button[@class='btun next']")
    private WebElement next1;
    @FindBy(xpath="//select[@name='working_days[]']")
    private List<WebElement> week_day;
    @FindBy(xpath="//input[@name='opening_hours[]']")
    private List<WebElement>opening_hours;
    @FindBy(xpath="//input[@name='closing_hours[]']")
    private List<WebElement>closing_hours;
    
 
    @FindBy(xpath="//a[@class='btun next']")
    private WebElement next2;
    @FindBy(xpath="//input[@name='legal_entity_of_restaurant']")
    private WebElement name;
    @FindBy(xpath="//input[@name='bank']")
    private WebElement bank;
    @FindBy(xpath="//input[@name='inn']")
    private WebElement inn;
    @FindBy(xpath="//input[@name='ogrn']")
    private WebElement agrn;
    @FindBy(xpath="//input[@name='checking_account']")
    private WebElement checking_account;
    @FindBy(xpath="(//button[@class='btun float-right'])[1]")
    private WebElement save_acq;
    @FindBy(xpath="//a[@class='btun float-right']")
    private WebElement promo_create;
    @FindBy(xpath="//input[@name='promocode_name']")
    private WebElement promo_name;
    @FindBy(id="promo_type")
    private WebElement promo_type;
    @FindBy(xpath="//input[@name='discount_amount']")
    private WebElement discount_amt;
    @FindBy(xpath="//input[@name='min_sum']")
    private WebElement min_amt;
    @FindBy(xpath="//input[@name='validity']")
    private WebElement validity;
    @FindBy(xpath="//select[@name='use_frequency']")
    private WebElement frequency;
    @FindBy(xpath="//select[@name='status']")
    private WebElement status;
    @FindBy(xpath="//a[@class='btun promo-btn float-right']")
    private WebElement create_promotion;
    @FindBy(id="type_of_discount")
    private WebElement discount_type;
    @FindBy(xpath="//input[@name='dates']")
    private WebElement validity_date;
    @FindBy(xpath="//input[@name='opening_hours']")
    private WebElement opening_hour;
    @FindBy(xpath="//input[@name='closing_hours']")
    private WebElement closing_hour;
    @FindBy(xpath="//button[contains(text(),'Apply')]")
    private WebElement apply;
    @FindBy(xpath="(//span[@class='checkmark'])[2]")
    private WebElement all_menu_check;
    @FindBy(xpath="//button[@class='btun float-right']")
    private WebElement save;
    @FindBy(xpath="//button[@class='btun promo-btn']")
    private WebElement add_dish;
    @FindBy(xpath="//span[@class='checkmark']")
    private WebElement select_dish;
    @FindBy(xpath="//div[@class='butn-box']/button")
    private WebElement save_dish;
	public WebElement getSave_dish() {
		return save_dish;
	}



	public WebElement getAdd_dish() {
		return add_dish;
	}



	public WebElement getSelect_dish() {
		return select_dish;
	}



	public WebElement getAll_menu_check() {
		return all_menu_check;
	}



	public WebElement getApply() {
		return apply;
	}



	public WebElement getOpening_hour() {
		return opening_hour;
	}



	public WebElement getClosing_hour() {
		return closing_hour;
	}



	public WebElement getValidity_date() {
		return validity_date;
	}



	public WebElement getDiscount_type() {
		return discount_type;
	}



	public WebElement getCreate_promotion() {
		return create_promotion;
	}



	public WebElement getDiscount_amt() {
		return discount_amt;
	}



	public WebElement getMin_amt() {
		return min_amt;
	}



	public WebElement getValidity() {
		return validity;
	}



	public WebElement getFrequency() {
		return frequency;
	}



	public WebElement getStatus() {
		return status;
	}



	public WebElement getPromo_type() {
		return promo_type;
	}



	public WebElement getPromo_name() {
		return promo_name;
	}



	public WebElement getPromo_create() {
		return promo_create;
	}



	public WebElement getSave_acq() {
		return save_acq;
	}



	public WebElement getName() {
		return name;
	}



	public WebElement getBank() {
		return bank;
	}



	public WebElement getInn() {
		return inn;
	}



	public WebElement getAgrn() {
		return agrn;
	}



	public WebElement getChecking_account() {
		return checking_account;
	}



	public WebElement getNext2() {
		return next2;
	}



	public WebElement getSave() {
		return save;
	}



	public List<WebElement> getClosing_hours() {
		return closing_hours;
	}



	public List<WebElement> getWeek_day() {
		return week_day;
	}

	

	public List<WebElement> getOpening_hours() {
		return opening_hours;
	}



	public WebElement getNext1() {
		return next1;
	}

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
