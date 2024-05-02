package actualtestpage;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import expclass.ContactLookupimg;
import expclass.Contactticketpage;
import expclass.CreateNewContact;
import expclass.HomePage;
import genericutilities.Baseclass;

public class CreateNewContactPage extends Baseclass {
	
	@Test
	
	public void createCont() {
		
		//click on contlink
		HomePage hp=new HomePage(wd);
		hp.clickonContlink();
		
		//click on lookupimg
		
	ContactLookupimg ci=new ContactLookupimg(wd);
	ci.clickOnContalookupImg();
	
	// give contactname
	
CreateNewContact cnc=new CreateNewContact(wd);
cnc.createNewContact("monster"+ju.getRandomNumber());

//get contactticket

Contactticketpage ctp=new Contactticketpage(wd);
 String header=ctp.getHeader();
 
 //verify
 Assert.assertTrue(header.contains("monster"));
	System.out.println("====CONTACT IS Created and TC is PASS====");
	
 		
	}

}
