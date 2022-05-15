package FBkPOModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBkObjects {
	
	WebDriver driver;

	public FBkObjects(WebDriver idriver)
	{
		this.driver = idriver;
	}
	
	
	@FindBy(xpath = "//input[@id='email']") 
	WebElement uNameField;
	
	@FindBy(xpath = "//input[@id='pass']")  
	WebElement pwdField  ;
	

//	@FindBy(xpath = "//button[@id='u_0_h_qR']") 
	@FindBy(tagName = "button")	
	WebElement loginBtn;
	
	
	public void login(String userName, String passWord) throws Exception
	{
		driver.get("http://facebook.com/");
		uNameField.sendKeys(userName); 
		Thread.sleep(2000);
		pwdField.sendKeys(passWord);
		Thread.sleep(2000);
		loginBtn.click();
//		driver.close();
	}
}
