package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {

	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception {
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
	}

	@Test
	public void testcase_1() throws InterruptedException //Go to Ebay
	{
		
		String title = "Get the Title";
		Assert.assertEquals(title, " ");
	}

	@Test
	public void testcase_2() throws InterruptedException 
      {
	       
               
		 String get =  "first product name";
		 Assert.assertEquals(get, " ");
	}
	@Test
	public void testcase_3() throws InterruptedException 
      {
	      
               
		 String product = "Get The nth product";
		 Assert.assertEquals(product, " ");
	}

		
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
