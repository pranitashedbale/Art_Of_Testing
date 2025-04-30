package com.artoftesting.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.artoftesting.base.BaseClass;
import com.artoftesting.pages.I_DragDropVerify;

public class I_DragDropTest extends BaseClass {

	@BeforeMethod
	public void setUpDriver() throws InterruptedException {
		setUp();
	}

	@Test
	public void verifydragDrop() {
		I_DragDropVerify verifyDD = new I_DragDropVerify(driver);
		verifyDD.scrollpage(0, 800);
		verifyDD.verifydragDrop();
	}

}
