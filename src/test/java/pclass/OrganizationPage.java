package pclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	@FindBy(xpath="//a[.='Organizations']")private WebElement organizationmod;
	@FindBy(xpath="//img[@title='Create Organization...']")private WebElement lookupimg;
	@FindBy(xpath="//input[@name='accountname']")private WebElement enterorgname;
	@FindBy(xpath="//input[@name='button']")private WebElement clicksavebtn;
	
	public OrganizationPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
		
	}

	public WebElement getOrganizationmod() {
		return organizationmod;
	}

	public WebElement getLookupimg() {
		return lookupimg;
	}

	public WebElement getEnterorgname() {
		return enterorgname;
	}

	public WebElement getClicksavebtn() {
		return clicksavebtn;
	}
	
	
	public void ClickonOrganization() {
		
		organizationmod.click();
	}
	 
	public void ClickonLookupimg() {
		
		lookupimg.click();
	}
	
	public void EnterOrgName() {
		
		enterorgname.sendKeys();
	}
	
	public void ClickOnSavebtn() {
	clicksavebtn.click();
	}
	
}
