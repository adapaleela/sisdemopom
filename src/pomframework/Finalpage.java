package pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finalpage 
{
	@FindBy(name="filterselect")
	public WebElement filter;
	
	@FindBy(xpath="[contains(text(),'Sign Out')]")
	public WebElement signout;
	
	public Finalpage(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }
    public void clicksignout()
    {
    	signout.click();
    }
}
