package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utlity.DataReader;



public class LoginPage extends BaseClass {
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
@FindBy(id="register_name")
private WebElement username;
@FindBy(id="register_password")
private WebElement password;
@FindBy(xpath="(//button[@type='submit'])[1]")
private WebElement loginbtn;

public void getUserName(){
	try {
		dr=new DataReader();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getCause());
	}
	username.sendKeys(dr.getUsername());
}

public void getPassword(){
	try {
		dr=new DataReader();
	} catch (IOException ex) {
		
		System.out.println(ex.getCause());
	}
	password.sendKeys(dr.getPassword());
}

public void clickLogin(){
	loginbtn.click();
}
}
