package com.artoftesting.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.artoftesting.base.BaseClass;
import com.artoftesting.pages.C_ButtonClick;

public class C_ButtonClickTest extends BaseClass {
	
	@BeforeMethod
	public void setUpDriver() throws InterruptedException {
        setUp();
	}
	
	@Test
	
	public void ButtonClick()
	{
		C_ButtonClick button= new C_ButtonClick(driver);
		button.scrollpage(0, 900);
		button.ButtonClick();
	}
	

}
