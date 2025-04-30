package com.artoftesting.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.artoftesting.base.BaseClass;
import com.artoftesting.pages.E_CheckBoxVerify;

public class E_CheckBoxTest extends BaseClass {

	@BeforeMethod
	public void setUpDriver() throws InterruptedException {
        setUp();
	}
	
	@Test
	public void CheckRadioButton() 
	{
		E_CheckBoxVerify varCheckBox= new E_CheckBoxVerify(driver);
		varCheckBox.scrollpage(0, 900);
		varCheckBox.verifyCheckBox();
	}
	
	
}
