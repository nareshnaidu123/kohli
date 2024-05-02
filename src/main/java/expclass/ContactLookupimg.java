package expclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class ContactLookupimg extends WebDriverUtility {
	
	//Declaration
	
	@FindBy(xpath="//img[@title='Create Contact...']")private WebElement ContLookupImg;
	
	//Initialization
	public ContactLookupimg(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	 //Getters

	public WebElement getContLookupImg() {
		return ContLookupImg;
	}
	
	//Business Library
	
	public void clickOnContalookupImg() {
		ContLookupImg.click();
		
	}
}
