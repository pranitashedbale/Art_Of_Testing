package com.artoftesting.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.artoftesting.base.BaseClass;
import com.artoftesting.pages.H_BrokenLinkVerify;

public class H_BrokenLinkTest extends BaseClass {

	@BeforeMethod
	public void setUpDriver() throws InterruptedException {
		setUp();
	}

	@Test
	public void verifyBrokenLink() throws Exception {
		H_BrokenLinkVerify verifyBrLink = new H_BrokenLinkVerify(driver);
		verifyBrLink.getLinkURL();
	}

}
