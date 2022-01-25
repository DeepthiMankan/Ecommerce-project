package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage 
{
	@FindBy(id="add")
	private WebElement plusbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocartbtn;
	
	public WebElement getPlusbtn() {
		return plusbtn;
	}

	public void setPlusbtn(WebElement plusbtn) {
		this.plusbtn = plusbtn;
	}

	public AddtoCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void addtoCart()
	{
		addtocartbtn.click();
	}

}
