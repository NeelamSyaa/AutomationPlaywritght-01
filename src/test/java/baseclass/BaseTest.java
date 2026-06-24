package baseclass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import utils.PlaywrightFactory;

public class BaseTest {

	protected Page page;
	@BeforeMethod
	public void setup() {
		
		 page = PlaywrightFactory.initBrowser();
		
}
	
	@AfterMethod
	public void teardwon() {
		page.context().browser().close();
  
}
}
