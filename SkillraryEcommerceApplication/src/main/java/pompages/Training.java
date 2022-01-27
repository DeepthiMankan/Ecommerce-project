package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Training 
{
	 @FindBy(xpath="//div[@class='play-icon']")
	 private WebElement playbtn;
	 
	 @FindBy(xpath="//div[@class='pause-icon']")
	 private WebElement pausebtn;
	 
	 @FindBy(xpath="//span[@class='entypo-twitter']")
	 private WebElement sharebtn;
	 
	 public Training(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void playButton()
	 {
		 playbtn.click();
		 
		 
	 }
	 public void pauseButton()
	 {
		 pausebtn.click();
	 }
	 
	 public void shareButton() 
	 {
		 sharebtn.click();
		 
	 }
	 
	 

}
