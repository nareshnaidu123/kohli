package expclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class CreateNewContact extends WebDriverUtility{
	
	@FindBy(xpath="//input[@name='lastname']")private WebElement ContactName;
	@FindBy(xpath="//input[@type='submit']")private WebElement Clicksavebutn;
	
	//Initialization
	 public CreateNewContact(WebDriver  driver) {
		 PageFactory.initElements(driver,this);
		
	 }
//getters
	public WebElement getContactName() {
		return ContactName;
	}

	public WebElement getClicksavebutn() {
		return Clicksavebutn;
	}
	 
	 //Business Library
	public void createNewContact(String CNTNAME) {
		ContactName.sendKeys(CNTNAME);
		Clicksavebutn.click();
	}
	  

}
