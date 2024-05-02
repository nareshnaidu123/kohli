package actualtestpage;

import org.testng.Assert;
import org.testng.annotations.Test;

import expclass.Contactticketpage;
import expclass.CreateNewOpportunity;
import expclass.HomePage;
import expclass.OpportunityLookupImg;
import genericutilities.Baseclass;

public class CreateNewOpportunityPage extends Baseclass {

	@Test
	
	public void createopp() {
		
		//click on opp
		HomePage hp=new HomePage(wd);
		hp.clickonopplink();
		
		//Click on lookupimg
		
		OpportunityLookupImg oli=new OpportunityLookupImg(wd);
		oli.clickonOppLookImg();
		
		//Give oppname
		CreateNewOpportunity cno=new CreateNewOpportunity(wd);
		cno.createNewopportunity("mmmm"+ju.getRandomNumber());
		
		//get oppticket
		
		Contactticketpage ctp=new Contactticketpage(wd);
		String header=ctp.getHeader();
		
		Assert.assertTrue(header.contains("mmmm"));
		System.out.println("====OPPORTUNITY IS Created and TC is PASS====");
		
		
	}
}
