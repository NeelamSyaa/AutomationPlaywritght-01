package LoginTest;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;

import baseclass.BaseTest;
import pageclass.LoginPage;
import utils.ConfigReader;

public class LoginTest  extends BaseTest{
	LoginPage lp;
	ConfigReader cg;
	@Test
	public void verifyLogin() throws InterruptedException {
		 lp  = new LoginPage(page);
		  cg = new ConfigReader();    
		 lp.loginbtn(cg.getProperty("username"), cg.getProperty("password"));
		 
		 
		 
	}
}
