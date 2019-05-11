package pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	@FindBy(xpath="//*[text()=' STUDENT']")
	public WebElement student;
	  
	public Homepage(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }
	public void studentclick()
	  {
		  student.click();
	  }
}
