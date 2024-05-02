package actualtestpage;

import org.testng.Assert;
import org.testng.annotations.Test;

import expclass.CreateNewOrganizationPage;
import expclass.HomePage;
import expclass.OrganizationInformationPage;
import expclass.OrganizationLookupimg;
import genericutilities.Baseclass;
import pclass.OrganizationPage;

public class CretaeNewOrganizationPage extends Baseclass {
	
	
	@Test
	
	public void createorg() {
		
		//click on orgmodule
		
	HomePage hp=new HomePage(wd);
	hp.clickonorgLink();
	
	//click on lookup image 
	
	OrganizationLookupimg op=new OrganizationLookupimg(wd);
	op.clickOnLookUpImg();
		
	//give org name
	
	CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(wd);
	cnop.createNewOrganization("jacks"+ju.getRandomNumber());
	
	//get the header and verify
	
	OrganizationInformationPage oip=new OrganizationInformationPage(wd);
	String header=oip.getHeader();
	
	//verify
	Assert.assertTrue(header.contains("jacks"));
	System.out.println("====ORGANIZATION IS Created and TC is PASS====");
	
	
	}

}
