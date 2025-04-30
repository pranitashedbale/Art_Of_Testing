package com.artoftesting.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class I_DragDropVerify {

	WebDriver driver;

	public I_DragDropVerify(WebDriver driver) {
		this.driver = driver;

	}

	public void scrollpage(int x, int y) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
	}

	public void verifydragDrop() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // using explicit wait

		// Wait for source element to be visible/clickable
		WebElement source = wait.until(ExpectedConditions.elementToBeClickable(By.id("myImage")));

		// Wait for target element to be visible/clickable
		WebElement target = wait.until(ExpectedConditions.elementToBeClickable(By.id("targetDiv")));

		// Perform drag and drop
		Actions action = new Actions(driver);
		action.clickAndHold(source).moveToElement(target).release().build().perform();

	}

}
