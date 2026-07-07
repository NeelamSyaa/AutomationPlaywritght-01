package LoginTest;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.ConnectOptions;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class alldataTest {
	 
	 Playwright p;
	  Browser browser ;
	 BrowserContext context;
	 Page page;
@BeforeClass
public  void Setup() {

	  p = Playwright.create();
	      browser = p.chromium().launch(
	        		   new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000));
	 context = browser.newContext();
	 page = context.newPage();
	   page.navigate("https://testautomationpractice.blogspot.com/");
	   
}


@Test(priority = 1)
public void  autosuggstionSearchfiled() throws InterruptedException {
	
	page.locator("input.wikipedia-search-input").fill("testing");
	page.locator("input.wikipedia-search-button").click();

	Locator suggestions = page.locator(".wikipedia-search-results a");
	

	suggestions.first().waitFor();

	int count = suggestions.count();
	System.out.println("Total Suggestions: " + count);

	for (int i = 0; i < count; i++) {
	    String text = suggestions.nth(i).textContent().trim();
	    System.out.println(text);

	    if (text.equalsIgnoreCase("Testing effect")) {
	        suggestions.nth(i).click();
	        break;
	    }
	}
    
}
@Test(priority = 2)
public void code() {
	
 Locator link = page.locator("//a[text()='PlaywrightPractice']");
 link.click();
 System.out.println(page.title());
 

//1. Handle Simple Alert
 // ============================
 page.onceDialog(dialog -> {
     System.out.println("Alert Message: " + dialog.message());
     dialog.accept();
 });

 page.locator("#alertBtn").click();

 // ============================
 // 2. Handle Confirmation Alert
 // ============================
 page.onceDialog(dialog -> {
     System.out.println("Confirmation Message: " + dialog.message());
     dialog.dismiss();      // Use accept() to click OK
 });

 page.locator("//button[text()='Confirmation Alert']").click();

 // ============================
 // 3. Handle Prompt Alert
 // ============================
 page.onceDialog(dialog -> {
     System.out.println("Prompt Message: " + dialog.message());
     dialog.accept("Testing");
 });

 page.locator("//button[text()='Prompt Alert']").click();
 page.waitForTimeout(2000);
 
}
@Test
public void handlemultipletab() {

    Page newTab = page.waitForPopup(() -> {
        page.locator("//button[text()='New Tab']").click();
    });

    newTab.waitForLoadState();

    System.out.println("New Tab Title: " + newTab.title());

    newTab.bringToFront();

    newTab.close();
}


@AfterClass
public void teardwon() {
	
		page.context().browser().close();
	
}
}
	

