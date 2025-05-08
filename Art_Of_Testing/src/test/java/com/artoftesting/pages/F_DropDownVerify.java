package com.artoftesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class F_DropDownVerify {

	WebDriver driver;

	public F_DropDownVerify(WebDriver driver) {
		this.driver = driver;

	}

	By DropDown = By.id("testingDropdown");

	public void scrollpage(int x, int y) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
	}

	public void verifyDropDown() {
		

		WebElement ddown = driver.findElement(DropDown);

		Select dd = new Select(ddown);
		
		
		
	
		String ManualCheck = "Manual Testing";
		dd.selectByVisibleText(ManualCheck);
		Assert.assertEquals(dd.getFirstSelectedOption().getText(), ManualCheck, "Manual Testing option is selected");
		
		

		dd.selectByIndex(1);
		String PerCheck= dd.getFirstSelectedOption().getText();
		Assert.assertEquals(PerCheck, "Performance Testing", "Performance Testing should be selected");
		
		
		
		String AutoCheck = "Automation Testing";
		dd.selectByValue(AutoCheck);
		Assert.assertEquals(dd.getFirstSelectedOption().getText(), AutoCheck, "Automation Testing option is selected");

		 
	}

}
