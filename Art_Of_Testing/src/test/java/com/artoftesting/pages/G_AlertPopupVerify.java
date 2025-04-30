package com.artoftesting.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class G_AlertPopupVerify {
	

		WebDriver driver;
		
		public G_AlertPopupVerify(WebDriver driver)
		{
			this.driver = driver;
			
		}

		By AlertButton = By.id("dblClkBtn");
		
		
		public void scrollpage(int x, int y) {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
		}
		
		
		
		public void verifyAlertPopup() 
		{
			Actions action = new Actions(driver);
			WebElement AlertButtonElement= driver.findElement(AlertButton);
			action.doubleClick(AlertButtonElement).perform();
			
			Alert alert = driver.switchTo().alert();
			String textOnAlert = alert.getText();
		
			System.out.println(textOnAlert);
			alert.accept();
			driver.findElement(By.name("firstName")).sendKeys("Pranita");
			
			
			
		}









}
