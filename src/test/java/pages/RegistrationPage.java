package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass{
	public RegistrationPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="lastName")
	private WebElement lastname;
	@FindBy(id="firstName")
	private WebElement firstname;
	@FindBy(id="middleName")
	private WebElement middlename;
	@FindBy(id="restaurant_name")
	private WebElement restaurant_name;
	@FindBy(xpath="(//input[@class='ant-input'])[6]")
	private WebElement address;
	@FindBy(xpath="(//input[@type='tel'])[1]")
	private WebElement tel1;
	@FindBy(xpath="(//input[@type='tel'])[2]")
	private WebElement tel2;
	@FindBy(id="mail_for_incoming_orders")
	private WebElement mail;
	@FindBy(id="legal_entity_of_restaurant")
	private WebElement legal_entity;
	@FindBy(id="offer_agreement")
	private WebElement offer;
	@FindBy(id="privacy_policy")
	private WebElement privacy;
	@FindBy(xpath="(//button[@class='ant-btn'])[2]")
	private WebElement next;
	@FindBy(xpath="(//button[@class='ant-btn'])[1]")
	private WebElement previous;
	@FindBy(xpath="(//div[@class='selected-flag'])[1]")
	private WebElement flag1;
	@FindBy(xpath="(//div[@class='selected-flag'])[2]")
	private WebElement flag2;
	@FindBy(xpath="//span[@class='country-name']")
	private WebElement country_name;
	public WebElement getCountry_name() {
		return country_name;
	}
	public WebElement getFlag() {
		return flag1;
	}
	public WebElement getFlag2() {
		return flag2;
	}
	public WebElement getPrevious() {
		return previous;
	}
	public WebElement getNext() {
		return next;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getMiddlename() {
		return middlename;
	}
	public WebElement getRestaurant_name() {
		return restaurant_name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getTel1() {
		return tel1;
	}
	public WebElement getTel2() {
		return tel2;
	}
	public WebElement getMail() {
		return mail;
	}
	public WebElement getLegal_entity() {
		return legal_entity;
	}
	public WebElement getOffer() {
		return offer;
	}
	public WebElement getPrivacy() {
		return privacy;
	}
	

}
