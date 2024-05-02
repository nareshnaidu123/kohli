package expclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class HomePage extends WebDriverUtility {
	
	//Declarartion
		@FindBy(linkText = "Organizations")
		private WebElement OrganizationsLnk;

		@FindBy(linkText = "Contacts")
		private WebElement ContactsLnk;

		@FindBy(linkText = "Opportunities")
		private WebElement opportunitiesLnk;

		@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
		private WebElement AdministratorImg;

		@FindBy(linkText = "Sign Out")
		private WebElement SignOutLnk;
	//Initialization
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	//Getters
		public WebElement getOrganizationsLnk() {
			return OrganizationsLnk;
		}
		public WebElement getContactsLnk() {
			return ContactsLnk;
		}
		public WebElement getOpportunitiesLnk() {
			return opportunitiesLnk;
		}
		public WebElement getAdministratorImg() {
			return AdministratorImg;
		}
		public WebElement getSignOutLnk() {
			return SignOutLnk;
		}
		//Business Library
		
		public void clickonorgLink() {
			OrganizationsLnk.click();
		}
		
		public void clickonContlink() {
			 ContactsLnk.click();
			
		}
		public void clickonopplink() {
			opportunitiesLnk.click();;

			
		}
		
		public void logoutfromApp(WebDriver driver) {
			mouseovertoele(driver,AdministratorImg);
			SignOutLnk.click();
			
		}
		
			
		}
		
	



