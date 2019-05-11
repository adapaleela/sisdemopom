package pomframework;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;

public class Myrunnerclass 
{

	public static void main(String[] args) throws Exception 
	{
		//open excel file for reading
		File f=new File("E:\\leelajava\\sisdemoaddnewstudent.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		try
		{
		//launch site
    	System.setProperty("webdriver.chrome.driver","E:\\leelajava\\chromedriver.exe");
    	ChromeDriver driver=new ChromeDriver();
    	driver.get("http://www.sisdemo.in");
	
        //data driven with Pom
        for(int i=1;i<nour;i++)
        {
        	Thread.sleep(10000);
        	String fields=rsh.getCell(0,i).getContents();
        	String x=rsh.getCell(1,i).getContents();
        	
        	
        	//create objects to page classes
        	Adminpage ap=new Adminpage(driver);
        	Loginpage lp=new Loginpage(driver);
        	Homepage hp=new Homepage(driver);
        	Studentpage sp=new Studentpage(driver);
        	AddnewStudentpage asp=new AddnewStudentpage(driver);
        	Finalpage fp=new Finalpage(driver);
        	WebDriverWait wait=new WebDriverWait(driver,20);
        	wait.until(ExpectedConditions.visibilityOf(ap.admin));
        	driver.manage().window().maximize();
        	ap.adminclick();
        	wait.until(ExpectedConditions.visibilityOf(lp.userid));
        	lp.filluserid();
        	wait.until(ExpectedConditions.visibilityOf(lp.pwd));
        	lp.fillpwd();
        	wait.until(ExpectedConditions.visibilityOf(lp.login));
        	lp.loginclick();
        	wait.until(ExpectedConditions.visibilityOf(hp.student));
        	hp.studentclick();
        	wait.until(ExpectedConditions.visibilityOf(sp.addnewstudent));
        	sp.addnewclick();
        	//Thread.sleep(10000);
        	wait.until(ExpectedConditions.visibilityOf(asp.fname));
            asp.fillFname(x);
            wait.until(ExpectedConditions.visibilityOf(asp.mname));
            asp.fillMname(x);
            wait.until(ExpectedConditions.visibilityOf(asp.lname));
            asp.fillLname(x);
            wait.until(ExpectedConditions.visibilityOf(asp.dob));
            asp.clickdob(x);;
            wait.until(ExpectedConditions.visibilityOf(asp.gender));
            asp.selectGender(x);
            wait.until(ExpectedConditions.visibilityOf(asp.standard));
            asp.selectClass(x);
            wait.until(ExpectedConditions.visibilityOf(asp.occupation));
            asp.fillfatheroccupation(x);
            wait.until(ExpectedConditions.visibilityOf(asp.income));
            asp.fillincome(x);
            wait.until(ExpectedConditions.visibilityOf(asp.religion));
            asp.selectReligion(x);
            wait.until(ExpectedConditions.visibilityOf(asp.community));
            asp.selectCommunity(x);
            wait.until(ExpectedConditions.visibilityOf(asp.paddress));
            asp.fillpermanentaddress(x);
            wait.until(ExpectedConditions.visibilityOf(asp.caddress));
            asp.fillcommunicationaddress(x);
            wait.until(ExpectedConditions.visibilityOf(asp.mothertongue));
            asp.fillmothertongue(x);
            wait.until(ExpectedConditions.visibilityOf(asp.moles));
            asp.fillmoles(x);
            wait.until(ExpectedConditions.visibilityOf(asp.aadharno));
            asp.fillaadharno(x);
            wait.until(ExpectedConditions.visibilityOf(asp.section));
            asp.selectSection(x);
            wait.until(ExpectedConditions.visibilityOf(asp.rollno));
            asp.fillrollno(x);
            wait.until(ExpectedConditions.visibilityOf(asp.lastschoolname));
            asp.filllastschoolname(x);
            wait.until(ExpectedConditions.visibilityOf(asp.admissionno));
            asp.filladmissionno(x);
            wait.until(ExpectedConditions.visibilityOf(asp.regno));
            asp.fillregno(x);
            wait.until(ExpectedConditions.visibilityOf(asp.housename));
            asp.fillhousename(x);
            wait.until(ExpectedConditions.visibilityOf(asp.fathername));
            asp.fillfathername(x);
            wait.until(ExpectedConditions.visibilityOf(asp.mothername));
            asp.fillmothername(x);
            wait.until(ExpectedConditions.visibilityOf(asp.mobileno));
            asp.fillmobileno(x);
            wait.until(ExpectedConditions.visibilityOf(asp.areacode));
            asp.fillareacode(x);
            wait.until(ExpectedConditions.visibilityOf(asp.landlineno));
            asp.filllandlineno(x);
            wait.until(ExpectedConditions.visibilityOf(asp.email));
            asp.fillemail(x);
            wait.until(ExpectedConditions.visibilityOf(asp.country));
            asp.selectCountry(x);
            wait.until(ExpectedConditions.visibilityOf(asp.state));
            asp.selectState(x);
            wait.until(ExpectedConditions.visibilityOf(asp.nationality));
            asp.fillnationality(x);
            wait.until(ExpectedConditions.visibilityOf(asp.district));
            asp.filldistrict(x);
            wait.until(ExpectedConditions.visibilityOf(asp.pincode));
            asp.fillpincode(x);
            wait.until(ExpectedConditions.visibilityOf(asp.height));
            asp.fillheight(x);
            wait.until(ExpectedConditions.visibilityOf(asp.weight));
            asp.fillweight(x);
            wait.until(ExpectedConditions.visibilityOf(asp.bloodgroup));
            asp.fillbloodgroup(x);
            wait.until(ExpectedConditions.visibilityOf(asp.vleft));
            asp.fillvisionleft(x);
            wait.until(ExpectedConditions.visibilityOf(asp.vright));
            asp.fillvisionright(x);
            wait.until(ExpectedConditions.visibilityOf(asp.teeth));
            asp.fillteeth(x);
            wait.until(ExpectedConditions.elementToBeClickable(asp.save));
            asp.clicksave();
            wait.until(ExpectedConditions.visibilityOf(fp.signout));
            fp.clicksignout();
            
        }
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
        
        rwb.close();
        	
	}

}
