package com.artoftesting.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class C_ButtonClick {

	WebDriver driver;

	public C_ButtonClick(WebDriver driver) {
		this.driver = driver;
	}
	
		
	By SubmitButton=By.id("idOfButton");
	
	public void scrollpage(int x, int y) {
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
    	//js.executeScript("window.scroll(0, 1000)","");
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
	}
	
	public void ButtonClick()
	{
		try
		{
		WebElement colorElement= driver.findElement(SubmitButton);
		String initialColor= colorElement.getCssValue("background-color");
		System.out.println(initialColor);
		colorElement.click();
		String afterColor= colorElement.getCssValue("background-color");
		System.out.println(afterColor);
		Assert.assertNotEquals(initialColor, afterColor, "The color should change to blue");
		System.out.println("Test case pass");
		}catch(Exception e)
		{
			System.out.println("Test case fail");
		}
	}
	
	
	
}

