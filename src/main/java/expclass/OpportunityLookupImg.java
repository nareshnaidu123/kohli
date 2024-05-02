package expclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class OpportunityLookupImg  extends WebDriverUtility {
	
	@FindBy(xpath="//img[@title='Create Opportunity...']")private WebElement Opplookupimg;
	
	public OpportunityLookupImg(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
	}

	public WebElement getOpplookupimg() {
		return Opplookupimg;
	}
	
	//Business Library
	
	public void clickonOppLookImg() {
		Opplookupimg.click();
		
	}

}