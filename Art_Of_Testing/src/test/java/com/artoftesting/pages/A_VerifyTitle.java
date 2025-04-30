package com.artoftesting.pages;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class A_VerifyTitle {

	WebDriver driver;
	public A_VerifyTitle(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	
	
	public void verifytitle()
	{
		String actual_title = driver.getTitle();
		
		String expected_title = "Sample Webpage for Selenium Automation Practice | ArtOfTesting";
		Assert.assertEquals(actual_title, expected_title);
	}
	
}
