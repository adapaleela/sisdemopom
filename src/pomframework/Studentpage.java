package pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Studentpage 
{
	@FindBy(xpath="(//*[text()='ADD NEW STUDENT'])[1]")
	public WebElement addnewstudent;
	  
	public Studentpage(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }
	public void addnewclick()
	  {
		  addnewstudent.click();
	  }
}
