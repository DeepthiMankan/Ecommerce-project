package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJava 

{
 @FindBy(linkText="Core Java For Selenium Trainin")
 private WebElement corejavaselenium;
 

 
 public CoreJava(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 
 
 public void coreSelenium()
 {
	 corejavaselenium.click();
	 
 }
 }

