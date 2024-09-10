package com.testcases;

import org.testng.annotations.Test;

import com.pageobjects.HomePage;
import com.testbase.BaseClass;

public class TC_001_Registration extends BaseClass {
	
	@Test
	
	public void loginnNow() throws Exception {
		HomePage hp = new HomePage(driver);
		hp.loginNow();
		hp.phonenumber();
		Thread.sleep(30000);
		hp.cont();
	}
		

}
