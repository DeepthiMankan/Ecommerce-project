package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillLogin 
{
	@FindBy(name="q")
	private WebElement coretype;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn;
	
	public SkillLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void coreType()
	 {
		 coretype.sendKeys("core java for selenium");
	 }
	 
    public void searchButton()
    {
   	 searchbtn.click();
    }

}
