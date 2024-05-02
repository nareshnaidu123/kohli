package pclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerHomePage {

	
	@FindBy(xpath="//a[.='Organizations']")private WebElement orgmod;
	@FindBy(xpath="//a[.='Contacts']")private WebElement contactmod;
	@FindBy(xpath="//a[.='Opportunities']")private WebElement opportunitymod;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")private WebElement admimg;
	@FindBy(xpath="//a[.='Sign Out']")private WebElement signoutlnk;
	
	
	public VtigerHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);		
	}


	public WebElement getOrgmod() {
		return orgmod;
	}


	public WebElement getContactmod() {
		return contactmod;
	}


	public WebElement getOpportunitymod() {
		return opportunitymod;
	}


	public WebElement getAdmimg() {
		return admimg;
	}


	public WebElement getSignoutlnk() {
		return signoutlnk;
	}
	
	
	public void ClickonOrganizations() {
		
	orgmod.click();	
	}
	
	public void ClickonContacts() {
		contactmod.click();
	}
	
	public void ClickonOpportunities() {
		opportunitymod.click();
	}
	
	public void ClickonAdmin() {
		
		admimg.click();
	}
	
	public void Clickonsignout() {
		
		signoutlnk.click();
	}
																																																																																																																																																														}
