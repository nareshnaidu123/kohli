package pclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	@FindBy(xpath="//a[.='Contacts']")private WebElement clickcontact;
	@FindBy(xpath="//img[@title='Create Contact...']")private WebElement lookupimg2;
	@FindBy(xpath="//input[@name='lastname']")private WebElement enterlstname;
	@FindBy(xpath="//input[@name='button']")private WebElement savebtn;

	
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}


	public WebElement getClickcontact() {
		return clickcontact;
	}


	public WebElement getLookupimg2() {
		return lookupimg2;
	}


	public WebElement getEnterlstname() {
		return enterlstname;
	}


	public WebElement getSavebtn() {
		return savebtn;
	}
	
	public void Clickcontacts() {
	clickcontact.click();
	}
	
	public void Clicklookupimg() {
		
		lookupimg2.click();
	}
	
	public void Enterlastname() {
		enterlstname.sendKeys();
	}
public void Clicksavebtn() {
	savebtn.click();
	
	
	
}
}
