package com.artoftesting.pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H_BrokenLinkVerify {

	WebDriver driver;

	public H_BrokenLinkVerify(WebDriver driver) {
		this.driver = driver;

	}

	public void getLinkURL() {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links are " + links.size());

		for (WebElement e : links) {
			String url = e.getAttribute("href");
			checkBrokenLink(url);

		}

		driver.quit();
	}

	public static void checkBrokenLink(String linkurl) {
		try {

			URL url = new URL(linkurl);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();

			if (httpUrlConnection.getResponseCode() == 200) {

				System.out.println(linkurl + "--->" + httpUrlConnection.getResponseMessage() );

			} else {
				System.out.println(linkurl + "--->" + httpUrlConnection.getResponseMessage() +"Broken URL");
			}
			
			httpUrlConnection.disconnect();
		}

		catch (Exception e) {
			System.out.println("Test Case failed");
		}

	}

}
