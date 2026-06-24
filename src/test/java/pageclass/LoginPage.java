package pageclass;

import com.microsoft.playwright.Page;

public class LoginPage  {
	
	Page  page;

	public LoginPage(Page  page) {
		this.page  = page;
	}
	
    private String username  =   "#email";
    private String Password  = "#password";
     private String login  ="//button[contains(text(),'Login')]";
    
    
    
    public void  loginbtn( String  u, String p) {
    	page.locator(username).fill(u);
    	page.locator(Password).fill(p);
    	page.locator(login).click();
    }
    
}

