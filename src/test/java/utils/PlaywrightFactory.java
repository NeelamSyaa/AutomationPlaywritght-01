package utils;

import java.util.ArrayList;
import java.util.Arrays;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFactory {
	static Browser browser;
	 static BrowserContext context;
	  static Page page;
	public static Page initBrowser() {
		
		ConfigReader cg =  new ConfigReader();
		
		Playwright p =  Playwright.create();
		       browser = p.chromium().launch(
		    		 new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1500).setArgs(Arrays.asList("--start-maximized")));
           context = browser.newContext();
           page = context.newPage();

		   page.navigate(
				   cg.getProperty("url"));
		   
		   return page;
        		   
        		   
	
	}


	
}
