package LoginTest;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Testiing {

	@Test
	public void setdata() {
Playwright p = Playwright.create();
        
        // Corrected instantiation and launch method
        Browser browser = p.chromium().launch(
            new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000)
        );
        
       BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate(null);
      page.goBack();
      page.goForward();
}}
