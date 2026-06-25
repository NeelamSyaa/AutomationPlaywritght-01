package LoginTest;

import baseclass.BaseTest;
import pageclass.EmployeePAge;
import pageclass.LoginPage;
import utils.ConfigReader;

public class EmployeeTest  extends BaseTest {

	
	public void  empdata() {
		ConfigReader   CR = new ConfigReader();
		
		LoginPage lp = new LoginPage(page);
		lp.loginbtn(CR.getProperty("username"), CR.getProperty("password"));
		EmployeePAge ep = new EmployeePAge(page);
		ep.empModule("15");
		
		
	}
}
