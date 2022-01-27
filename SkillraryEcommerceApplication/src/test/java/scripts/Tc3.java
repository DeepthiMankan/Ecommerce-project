package scripts;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pompages.CoreJava;
import pompages.SkillLogin;
import pompages.Training;
//import pompages.SkillraryLoginPage;

public class Tc3 extends BaseClass

{
	@Test(groups= {"Regression Test"})
	public void tc3() throws InterruptedException
	{
		SkillLogin s=new SkillLogin(driver);
	    s.coreType();
	    s.searchButton();
	
	    CoreJava c=new CoreJava(driver);
	    c.coreSelenium();
	    
	    Training t=new Training(driver);
	    
	    //us.switchTabs(driver);
	    //us.switchtoFrame(driver);
	    //Thread.sleep(3000);
	    //t.playButton();
	    //Thread.sleep(3000);
	    //t.pauseButton();
	    //us.switchbackFrame(driver);
	    Thread.sleep(3000);
	    t.shareButton();
	    
	    
	}
	
	
	

}
