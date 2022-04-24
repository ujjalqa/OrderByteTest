package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestuaranatPage extends BaseClass {
	public RestuaranatPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this); 
		}
	
	@FindBy(xpath="(//span[@class='ant-menu-title-content'])[6]/a/span")
	private WebElement restuarant;
	@FindBy(xpath="//button[@class='ant-btn add-table-button']")
	private WebElement table;
    @FindBy(id="number")
    private WebElement table_no;
    @FindBy(id="pos_table_id")
    private WebElement pos_id;
    @FindBy(id="table_name")
    private WebElement zone;
    @FindBy(id="person_number")
    private WebElement landing;
    @FindBy(id="comment")
    private WebElement comment;
    @FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
    private WebElement ok;
    @FindBy(xpath="(//div[@class='ant-tabs-tab'])[1]")
    private WebElement manager;
    @FindBy(xpath="(//button[@class='ant-btn add-table-button'])[2]")
    private WebElement add_manager;
    @FindBy(id="first_name")
    private WebElement firstname;
    @FindBy(id="last_name")
    private WebElement last_name;
    @FindBy(id="pos_waiter_id")
    private WebElement pos_id1;
    @FindBy(xpath="//input[@type='tel']")
    private WebElement telephone;
    @FindBy(id="telegram")
    private WebElement telegram;
    @FindBy(xpath="(//div[@class='ant-tabs-tab-btn'])[3]")
    private WebElement waiter;
    @FindBy(xpath="(//button[@class='ant-btn add-table-button'])[3]")
    private WebElement add_waiter;
    @FindBy(id="claim_id")
    private WebElement claim;
    @FindBy(xpath="(//div[@class='ant-tabs-tab-btn'])[4]")
    private WebElement reviews;
	public WebElement getReviews() {
		return reviews;
	}
	public WebElement getClaim() {
		return claim;
	}
	public WebElement getAdd_waiter() {
		return add_waiter;
	}
	public WebElement getWaiter() {
		return waiter;
	}
	public WebElement getLast_name() {
		return last_name;
	}
	public WebElement getPos_id1() {
		return pos_id1;
	}
	public WebElement getTelephone() {
		return telephone;
	}
	public WebElement getTelegram() {
		return telegram;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getAdd_manager() {
		return add_manager;
	}
	public WebElement getManager() {
		return manager;
	}
	public WebElement getOk() {
		return ok;
	}
	public WebElement getTable_no() {
		return table_no;
	}
	public WebElement getPos_id() {
		return pos_id;
	}

	public WebElement getZone() {
		return zone;
	}

	public WebElement getLanding() {
		return landing;
	}

	public WebElement getComment() {
		return comment;
	}

	public WebElement getTable() {
		return table;
	}

	public WebElement getRestuarant() {
		return restuarant;
	}
	

}
