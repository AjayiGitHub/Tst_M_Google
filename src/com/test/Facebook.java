package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	
	

	public static void main(String[] args) throws Exception
	{
//		facebookLogin();
		
	} 
	

	public static void facebookLogin() throws Exception
	{ 
		
		
//		String projectlocation = System.getProperty("user.dir");
		
//		System.setProperty("webdriver.chrome.driver", projectlocation + "/lib/driver/geckodriver v29");
		
		System.setProperty("webdriver.chrome.driver", "/Users/josephajayi/Desktop/Selenium Drivers/web-Drivers-2020/driver.Chrome/chromedriver1010495141");

		
//		System.setProperty("webdriver.gecko.driver", "/Users/josephajayi/Desktop/Selenium Drivers/web-Drivers-2020/driver.Firefox/geckodriver-v31");;

		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("ayotomjoeph@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Skynet@2180");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_h_wP")).click();
	
		driver.close();
	}
	
}
