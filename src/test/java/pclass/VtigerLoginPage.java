package pclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerLoginPage {
	
	
	@FindBy(xpath="//input[@name='user_name']")private WebElement usernametxt;
	@FindBy(xpath="//input[@name='user_password']")private WebElement pwdtxt;
	@FindBy(xpath="//input[@value='Login']")private WebElement loginbtn;
	
	public VtigerLoginPage(WebDriver driver){
		
		PageFactory.initElements(driver,this);
	}

	public WebElement getUntxt() {
		return usernametxt;
	}

	public WebElement getPwdtxt() {
		return pwdtxt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	public void LoginToApp(String un,String pwd) {
		
		usernametxt.sendKeys();
		pwdtxt.sendKeys();
		loginbtn.click();
	}

}
