package com.artoftesting.base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	protected static WebDriver driver;

	public void setUp() throws InterruptedException {

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("test timeout start .............");
		driver.get("https://artoftesting.com/samplesiteforselenium");
		System.out.println("test timeout start");

	}

}
