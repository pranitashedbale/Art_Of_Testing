package com.artoftesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class D_RadioButtonVerify {

	
	
	WebDriver driver;
	
	public D_RadioButtonVerify(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	By MRadioButton= By.id("male");
	By FRadioButton= By.id("female");
	
	
	
	public void scrollpage(int x, int y) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
	}
	
	
	
	public void testRadioButton()
	{
		
		try
		{
	WebElement maleRadioElement= driver.findElement(MRadioButton);
	WebElement femaleRadioElement= driver.findElement(FRadioButton);
	maleRadioElement.click();
	boolean radiobuttonm = maleRadioElement.isSelected();
	boolean radiobuttonf = femaleRadioElement.isSelected();
	Assert.assertTrue(radiobuttonm,"Male button is selected");
	Assert.assertFalse(radiobuttonf, "Female button should not be selected");
	System.out.println("Test passed");
		}catch(Exception e)
		{
			System.out.println("Test failed");
		} 
		}
	}
	




