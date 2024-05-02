package expclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class LoginPage extends WebDriverUtility {


	//Declaration
		@FindBy(xpath="//input[@name='user_name']")private WebElement untxt;
		@FindBy(xpath="//input[@name='user_password']")private WebElement pwdtxt;
		@FindBy(xpath="//input[@id='submitButton']")private WebElement loginBtn;
	//Initialization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	//getters
		public WebElement getUntxt() {
			return untxt;
		}
		public WebElement getPwdtxt() {
			return pwdtxt;
		}
		public WebElement getLoginBtn() {
			return loginBtn;
		}
	//Business Library
		public void loginToApp(String UN,String PWD) {
			
			untxt.sendKeys(UN);
			pwdtxt.sendKeys(PWD);
			loginBtn.click();
		}
	}

