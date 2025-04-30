package com.artoftesting.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.artoftesting.base.BaseClass;
import com.artoftesting.pages.D_RadioButtonVerify;

public class D_RadioButtonTest extends BaseClass {

	@BeforeMethod
	public void setUpDriver() throws InterruptedException {
        setUp();
	}
	
	@Test
	public void testRadioButton()
	{
		D_RadioButtonVerify varRadioButton= new D_RadioButtonVerify(driver);
		varRadioButton.scrollpage(0, 700);
		varRadioButton.testRadioButton();
	}

}
