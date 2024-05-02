package pclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganInfoPage {

	@FindBy(xpath="//span[@class='dvHeaderText']")private WebElement orgname;
}
