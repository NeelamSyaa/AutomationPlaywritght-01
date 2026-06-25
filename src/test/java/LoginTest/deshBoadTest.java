package LoginTest;

import org.testng.annotations.Test;

import baseclass.BaseTest;
import pageclass.LoginPage;
import pageclass.deshBoadPage;
import utils.ConfigReader;

public class deshBoadTest  extends BaseTest {
	LoginPage lp ;
	deshBoadPage dp;
	ConfigReader  cg;
	@Test
	public void dealertTest() throws InterruptedException {
		
		  cg = new ConfigReader();
		 lp = new LoginPage(page);
		 lp.loginbtn(cg.getProperty("username"), cg.getProperty("password"));
		 dp = new  deshBoadPage(page);
		String filepath ="C:\\Users\\Admin\\eclipse-workspace\\AutomationPlaywritght-01\\data\\sample-template.xlsx";
		dp.dealerpage("Role_Name01", filepath);
		
	}
}
