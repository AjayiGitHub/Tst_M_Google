 package FBkPOModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FBkRunner {

	@Test
	public void startTest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "/Users/josephajayi/Desktop/Selenium Drivers/web-Drivers-2020/driver.Chrome/chromedriver1010495141");
													   
//		System.setProperty("webdriver.gecko.driver", "/Users/josephajayi/Desktop/Selenium Drivers/web-Drivers-2020/driver.Firefox/geckodriver-v31");
		
		
		WebDriver driver = new ChromeDriver   ();
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		// this will call the FBobjects class 
		FBkObjects obj = new FBkObjects(driver);
	
		PageFactory.initElements(driver, obj);
		
		obj.login("ayotomjoeph@yahoo.com", "Omolara@1980");
		
		Thread.sleep(10000);
		driver.quit( );
	}
	
	
}
