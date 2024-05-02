package expclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class Contactticketpage extends WebDriverUtility {
	
	@FindBy(xpath="//span[@class='dvHeaderText']")private WebElement ConTicket;
	
	public Contactticketpage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}

	public WebElement getConTicket() {
		return ConTicket;
	}
	
public String getHeader() {
	return  ConTicket.getText();
}
}
