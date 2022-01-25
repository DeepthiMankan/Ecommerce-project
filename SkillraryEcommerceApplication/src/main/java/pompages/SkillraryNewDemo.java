package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryNewDemo 
{
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement selenium;
	
	public SkillraryNewDemo(WebDriver driver)
	{
		PageFactory.initElements(driver,this); 
	}

	public WebElement getCoursetab() {
		return coursetab;
	}

	public void setCoursetab(WebElement coursetab) {
		this.coursetab = coursetab;
	}
	
	public void seleniumTraining()
	{
		selenium.click();
	}
	
	

}
