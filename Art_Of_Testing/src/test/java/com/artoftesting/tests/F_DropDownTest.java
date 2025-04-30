package com.artoftesting.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.artoftesting.base.BaseClass;
import com.artoftesting.pages.F_DropDownVerify;

public class F_DropDownTest extends BaseClass {

	@BeforeMethod
	public void setUpDriver() throws InterruptedException {
		setUp();
	}

	@Test
	public void verifyDropDown() {
		F_DropDownVerify varDropDown = new F_DropDownVerify(driver);
		varDropDown.scrollpage(0, 700);
		varDropDown.verifyDropDown();
	
	}

}
