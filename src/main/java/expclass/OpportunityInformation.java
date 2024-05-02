package expclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class OpportunityInformation extends WebDriverUtility {
	
	@FindBy(xpath="//span[@class='dvHeaderText']")private WebElement OppTicket;
	
public OpportunityInformation(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getOppTicket() {
	return OppTicket;
}

//business library

public String getHeader() {
	return OppTicket.getText();
}

}
