package pageclass;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;

public class deshBoadPage {


	 private Locator dealerlink ;
    private Locator AddMultipleDealers;
    private Locator DownloadSampleTemplate;
    private Locator SearchRole;
    private Locator Role_Name01data;
    private Locator uploadexcelsheet;
    private Locator clecksave;
    private Locator table;
    
    private Locator single;
	private Page page;

	public deshBoadPage(Page  page) throws InterruptedException {
		this.page  = page;
		  page.getByText("dealers").wait(4);
		 dealerlink = page.locator("/html/body/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/div[1]/ul//li[1]");
		 AddMultipleDealers = page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Add Multiple Dealers"));
		                       
		  DownloadSampleTemplate = page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Download Sample Template"));
		  SearchRole     =    page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Select Role"));
		  Role_Name01data     =    page.getByRole(AriaRole.LINK, new GetByRoleOptions().setName("Role_Name01"));
		  uploadexcelsheet     = page.getByLabel("Drag and drop an Excel file here, or browse");
		   clecksave = page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Save"));    
		         table = page.locator("//table//tbody//tr[3]//td[4]");
		         page.goBack();
		   single  =    page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Add Dealer"));
	}
	public void  dealerpage(String Role_Name01 , String fielpath ) {
		dealerlink.check();
		AddMultipleDealers.click();
		DownloadSampleTemplate.click();
		SearchRole.click();
		Role_Name01data.fill(Role_Name01);
		uploadexcelsheet.fill(fielpath);
		clecksave.click();
		System.out.println( table.innerText());
		single.click();
	}

	
}
