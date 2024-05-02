package pclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage {
	
	@FindBy(xpath="//a[.='Opportunities']")private WebElement opportunitiesmod;
	@FindBy(xpath="//img[@title='Create Opportunity...']")private WebElement clickimg;
	@FindBy(xpath="//input[@name='potentialname']")private WebElement enteroppname;
	@FindBy(xpath="//input[@name='button']")private WebElement savebutton;

	
	OpportunitiesPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}


	public WebElement getOpportunitiesmod() {
		return opportunitiesmod;
	}


	public WebElement getClickimg() {
		return clickimg;
	}


	public WebElement getEnteroppname() {
		return enteroppname;
	}


	public WebElement getSavebutton() {
		return savebutton;
	}

	public void ClickonOpportunities() {
		opportunitiesmod.click();
	}
	
	public void ClickonlookImg() {
		
		clickimg.click();
	}
	
	public void EnteroppName() {
		enteroppname.sendKeys();
		
	}
	
	public void Savebutton() {
		savebutton.click();
	}
	
	
}
