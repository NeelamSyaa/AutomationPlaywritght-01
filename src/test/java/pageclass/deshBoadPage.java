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
	private Page page;

	public deshBoadPage(Page  page) {
		this.page  = page;
	
		 dealerlink = page.locator("li:has-text('dealers')");
		 AddMultipleDealers = page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Add Multiple Dealers"));
		  DownloadSampleTemplate = page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Download Sample Template"));
		  SearchRole     =    page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Select Role"));
		  Role_Name01data     =    page.getByRole(AriaRole.LINK, new GetByRoleOptions().setName("Role_Name01"));
		  uploadexcelsheet     = page.getByLabel("Drag and drop an Excel file here, or browse");
		   clecksave = page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Save"));                          
	}
	
	public void  dealerpage(String Role_Name01 , String fielpath ) {
		dealerlink.check();
		AddMultipleDealers.click();
		DownloadSampleTemplate.click();
		SearchRole.click();
		Role_Name01data.fill(Role_Name01);
		uploadexcelsheet.fill(fielpath);
		clecksave.click();;
	}

	
}
