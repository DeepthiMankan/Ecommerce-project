package scripts;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pompages.AddtoCartPage;
import pompages.SkillraryLoginPage;
import pompages.SkillraryNewDemo;

public class Tc1 extends BaseClass
{
	@Test(groups= {"Smoke Test"})
	public void tc1() throws Throwable 
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoapp();
		
		SkillraryNewDemo sd=new SkillraryNewDemo(driver);
		us.switchTabs(driver);
		us.mouseOver(driver, sd.getCoursetab());
		sd.seleniumTraining();
		
		AddtoCartPage ad=new AddtoCartPage(driver);
		us.doubleClick(driver,ad.getPlusbtn());
		Thread.sleep(3000);
		ad.addtoCart();
		Thread.sleep(3000);
		us.alertPopup(driver);
	}
	
}
	

	


