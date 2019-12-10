package TestObject;

import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectPage.Basepage;
import ObjectPage.Homepage;

public class HomePageTests {
	
//	Basepage bp;
//	Homepage hp;
	
//	public HomepageTest() //constructor 
//	{
	//	bp= new Basepage();
	//	hp= new Homepage();
	// }

//	@Test
	// public void verifyTag() {
		// Assert.assertTrue(bp.elementFound(hp.getWomentag()), "Failed to displayed");
		// Assert.assertTrue(bp.elementFound(hp.getDressTag()), "Failed to displayed");
		//Assert.assertTrue(bp.elementFound(hp.getTshirtsTag()),"Failed to displayed");
	// }
	
// }
	HomePageObjects homePage;
	BasePage bp;
	
	int random=new Random().nextInt(500000);
	String email="snehaba890" + random + "@gmail.com";
	
	public HomePageTests() {
		homePage = new HomePageObjects();
		bp = new BasePage();
	}
	
   @Test
   public void verifyTabs()
   {
	   Assert.assertTrue(bp.elementFound(homePage.getWomen()));
	   Assert.assertTrue(bp.elementFound(homePage.getDresses()));
	   Assert.assertTrue(bp.elementFound(homePage.gettshirts()));
   }
   
   @Test
   public void verifyNavigation()
   {
	  homePage.clickWomen();
	  String msg=homePage.getTitleWomen();
	  Assert.assertTrue(msg.equals("WOMEN"), "Failed:Women not displayed");
	  
	  homePage.clickDresses();
	  String msg1=homePage.getTitleDresses();
	  Assert.assertTrue(msg1.equals("DRESSES"), "Failed:Dresses not displayed");
	  
	  homePage.clickTshirts();
	  String msg2=homePage.getTitleTshirts();
	  Assert.assertTrue(msg2.equals("T-SHIRTS"), "Failed:Tshirts not displayed");
   }
   
   
   @Test
   public void verifySubscription()
   {
	   homePage.setNewsLetter(email);
	   String msg=homePage.getTxtNewsletterMessage();
	   Assert.assertTrue(msg.contains("successful"), "Failed:Subscription message is not displayed");
   }
   
  
}

