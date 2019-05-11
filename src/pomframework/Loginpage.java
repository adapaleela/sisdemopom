package pomframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	@FindBy(name="username")
	public WebElement userid;
	
	@FindBy(name="password")
	public WebElement pwd;
	
	@FindBy(name="admin_login")
	public WebElement login;
	
	public Loginpage(WebDriver driver)
	  {
		  PageFactory.initElements(driver,this);
	  }
	public void filluserid()
	  {
		  userid.sendKeys("admin");
	  }
	public void fillpwd()
	  {
		  pwd.sendKeys("3xq@123");
	  }
	public void loginclick()
	  {
		  login.click();
	  }
}
