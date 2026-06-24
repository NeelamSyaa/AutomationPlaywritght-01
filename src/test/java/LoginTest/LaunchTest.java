//package LoginTest;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import  com.microsoft.playwright.Browser;
//import com.microsoft.playwright.BrowserContext;
//import com.microsoft.playwright.BrowserType;
//import com.microsoft.playwright.BrowserType.LaunchOptions;
//import com.microsoft.playwright.Locator;
//import com.microsoft.playwright.Page.GetByRoleOptions;
//import com.microsoft.playwright.options.AriaRole;
//import com.microsoft.playwright.Page;
//import com.microsoft.playwright.Playwright;
//import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
//
//import java.util.Arrays;
//
//
////@Test
//public class LaunchTest {
//
////	@Test
//	public void setup() {
//		Playwright p =  Playwright.create();
//		
//	     BrowserType.LaunchOptions options = new BrowserType.LaunchOptions()
//	             .setHeadless(false) 
//	             .setSlowMo(1500); 
//		      Browser browser = p.chromium().launch(options);
//		   BrowserContext context = browser.newContext();
//		  Page page = context.newPage();
//	       page.navigate("https://testautomationpractice.blogspot.com/");
//		    
//		 // Locator PlaywrightPractice = page.getByRole(AriaRole.TEXTBOX, new GetByRoleOptions().setName("text =PlaywrightPractice"));
//         // PlaywrightPractice.click();
//	       Locator PlaywrightPractice = page.locator("//div[@class='widget-content']/ul[1]/li[5]");
//	       PlaywrightPractice.click();
//	      Locator textdata = page.getByText("Submit Form");
//  textdata.click();
//  
//	    assertThat(page.getByText("Another paragraph with ")).isVisible();
//         
//       
//		      page.close();
//		      browser.close();
//	}
//
//	@Test
//	public void website() {
//		//login page 
//		Playwright p =  Playwright.create();
//		
//	     BrowserType.LaunchOptions options = new BrowserType.LaunchOptions()
//	             .setHeadless(false) 
//	             .setSlowMo(1500)
//	               .setArgs(Arrays.asList("--start-maximized"));
//		      Browser browser = p.firefox().launch(options);
//		   BrowserContext context = browser.newContext();
//		  Page page = context.newPage();
//	       page.navigate("https://alpsboemp-dev.syaa.xyz/oem/login");
//		   
//		page.getByPlaceholder("Enter your Username").fill("ashok_leyland_psb_admin");
//		page.getByPlaceholder("Enter your Password").fill("n4fCWub8");
//		page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("Login")).click();
//		
//    Locator deshboadpage = page.getByText("ASHOK LEYLAND PSB PORTAL");
//    String headerText = deshboadpage.innerText();
// System.out.println("Extracted Portal Header: " + headerText);
// assertThat(deshboadpage).isVisible();
// 
// Locator successAlert = page.getByText("Logged in successfully.");
// assertThat(successAlert).isVisible();
////handle the management 
//    Locator delaer =page.locator("li:has-text('dealers')");
//   
//    delaer.click();
//   Locator icon = page.locator("div[class^= 'relative text-white px-3 ']");
//   icon .click();
//    assertThat(icon).isEnabled();
//    page.getByPlaceholder("VIN NUMBER").fill("865510081236020");
//    page.locator("svg[class^='lucide lucide-search absolute right-3 top-1/2 transform -translate-y-1/2 text-[#37E7E7E']").click();
//     System.out.println( page.getByText("No content found for this VIN number").innerText());
//     assertThat(page.getByText("No content found for this VIN number")).isVisible();
//     
//     //seach by  for dealer page 
//   Locator searchtable = page.getByPlaceholder("Search");
//   searchtable.fill("Rajkamal_1");
//   //   assertThat(searchtable).isVisible(");
//		      page.close();
//		      browser.close();
//	}
//
//	
//
//	
//}
