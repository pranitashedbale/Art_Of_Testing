package com.artoftesting.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.artoftesting.base.BaseClass;
import com.artoftesting.pages.G_AlertPopupVerify;

public class G_AlertPopupTest extends BaseClass{
	
	@BeforeMethod
	public void setUpDriver() throws InterruptedException {
        setUp();
	}

	
	@Test
	public void verifyAlertPopup() throws InterruptedException
	{
		G_AlertPopupVerify verifyalert = new G_AlertPopupVerify(driver);
		verifyalert.scrollpage(0, 500);
		verifyalert.verifyAlertPopup();
		
	}
	
	
	
	
}
