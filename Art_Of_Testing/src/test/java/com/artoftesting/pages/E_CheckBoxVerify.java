package com.artoftesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class E_CheckBoxVerify {
WebDriver driver;
	
	public E_CheckBoxVerify(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	//By AutoCheckBox=  By.xpath("(//input[@class=\"Automation\"]");
	//By PerCheckBox=  By.xpath("(//input[@class=\"Performance\"]");
	
	
	By AutoCheckBox= By.className("Automation");
	By PerCheckBox= By.className("Performance");
	public void scrollpage(int x, int y) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
	}
	
	
	public void verifyCheckBox()
	{
	WebElement AutoTestElement= driver.findElement(AutoCheckBox);
	if(!AutoTestElement.isSelected())
	{
		driver.findElement(AutoCheckBox).click();
		System.out.println("Automation Testing checkBox is checked ");
		Assert.assertTrue(AutoTestElement.isSelected(), "Automation is checked");
		
		
	}
	
	WebElement PerTestElement= driver.findElement(PerCheckBox);
	if(!PerTestElement.isSelected())
	{
		driver.findElement(PerCheckBox).click();
		System.out.println("Performance Testing checkBox is checked ");
		Assert.assertTrue(PerTestElement.isSelected(), "Performance is checked");
	
		
	}
	
	}
	
}
