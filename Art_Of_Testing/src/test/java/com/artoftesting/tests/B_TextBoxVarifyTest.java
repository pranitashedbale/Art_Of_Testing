package com.artoftesting.tests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.artoftesting.base.BaseClass;
import com.artoftesting.pages.B_TextBoxVerify;



public class B_TextBoxVarifyTest extends BaseClass {

	@BeforeMethod
	public void setUpDriver() throws InterruptedException {
        setUp();
	}
	
	
	@Test
	 public void TxtBox()
	 {
		B_TextBoxVerify txtFieldVal=new B_TextBoxVerify(driver);
		txtFieldVal.scrollpage(0,500);
		 txtFieldVal.TxtBox("John Doe");
		 txtFieldVal.verifyText("John Doe"); 
		
	
	
}
}

