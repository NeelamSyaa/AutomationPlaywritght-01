package pageclass;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class EmployeePAge {

	
	private Page page;
	private Locator emplyreelink;
 private	 Locator StartDate;
	 private Locator backbtn;
	 private  Locator daydate;

	public EmployeePAge  (Page page){
		this.page = page;
		
	  emplyreelink = page.locator("li[class=\"text-white bg-primary cursor-pointer rounded-lg\"]");
	  StartDate  =  page.getByText("Start Date");
	  backbtn = page.locator("button[name=\"previous-month\"]");
	  daydate = page.locator("//table[@class=\"w-full border-collapse space-y-1\"]//tr[3]//td[6]");
		   
	  
	}
	
	public void empModule( String date) {
		emplyreelink.check();
		StartDate.click();
		backbtn.click();
		daydate.fill(date);
	}
}
