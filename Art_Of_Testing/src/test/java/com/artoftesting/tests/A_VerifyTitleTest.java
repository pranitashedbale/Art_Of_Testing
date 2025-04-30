package com.artoftesting.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.artoftesting.base.BaseClass;
import com.artoftesting.pages.A_VerifyTitle;


public class A_VerifyTitleTest extends BaseClass{
	
	@BeforeMethod
	public void setUpDriver() throws InterruptedException {
        setUp();
    }

	@Test
	public void verifytitle()
	{
		A_VerifyTitle vrtitle=new A_VerifyTitle(driver);
		vrtitle.verifytitle();
	}

	
}
