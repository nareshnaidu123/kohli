package expclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class OrganizationLookupimg extends WebDriverUtility {

	//Declaration
		@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement orgLookUpImg;
	//Initialization
		public OrganizationLookupimg(WebDriver driver) {
			PageFactory.initElements(driver,this);
		//Getters
			
	}
		public WebElement getOrgLookUpImg() {
			return orgLookUpImg;
		}
		//Business Library
		 
		public void clickOnLookUpImg() {
			orgLookUpImg.click();
		}
	}


