package expclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class CreateNewOpportunity extends WebDriverUtility{
	
	@FindBy(xpath="//input[@name='potentialname']")private WebElement EnterOppotunityname;
	@FindBy(xpath="//img[@title='Select']")private WebElement ClickonOppluImg;
	@FindBy(xpath="//a[.='congess']")private WebElement Clickonorgname;
	@FindBy(xpath="//input[@type='submit']")private WebElement ClicksaveButn;
	
	public  CreateNewOpportunity(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getEnterOppotunityname() {
		return EnterOppotunityname;
	}

	public WebElement getClickonOppluImg() {
		return ClickonOppluImg;
	}

	public WebElement getClickonorgname() {
		return Clickonorgname;
	}

	public WebElement getClicksaveButn() {
		return ClicksaveButn;
	}
	
	//Businesslibrary
	
	public void createNewopportunity(String OPPname) {
		EnterOppotunityname.sendKeys(OPPname);
		ClickonOppluImg.click();
		 Clickonorgname.click();
		 ClicksaveButn.click();
		
	}
	
		
		
	}

