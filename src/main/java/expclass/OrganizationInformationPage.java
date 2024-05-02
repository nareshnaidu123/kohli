package expclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class OrganizationInformationPage extends WebDriverUtility{

	@FindBy(xpath = "//span[@class='dvHeaderText']")private WebElement OrgHeaderText;

	public OrganizationInformationPage (WebDriver driver) // test script
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgHeaderText() {
		return OrgHeaderText;
	}
	//Business Library
	
	public String getHeader() {
		return OrgHeaderText.getText();
	}
	
}


