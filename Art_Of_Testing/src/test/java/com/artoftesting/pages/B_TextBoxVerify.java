package com.artoftesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class B_TextBoxVerify {

	WebDriver driver;

	public B_TextBoxVerify(WebDriver driver) {
		this.driver = driver;
	}
	//input[@name="firstName"]

	//input[@name="firstName"]
			


	By txtBox = By.name("firstName");

	public void scrollpage(int x, int y) {
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
    	//js.executeScript("window.scroll(0, 1000)","");
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
	}

	public void TxtBox(String textBox) {
		driver.findElement(txtBox).sendKeys(textBox);
		

	}

	public void verifyText(String expectedtextdata) {

		String textdata = driver.findElement(txtBox).getAttribute("value");
		
		Assert.assertEquals(textdata, expectedtextdata);

	}
}
