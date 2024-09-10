package com.testcases;

import org.testng.annotations.Test;

import com.pageobjects.Categories2;
import com.pageobjects.Categories3;
import com.testbase.BaseClass;

public class TC_006_Categories3 extends BaseClass{
	@Test
	public void setNavigations3() throws InterruptedException {
		Categories3 ca= new Categories3(driver);
		Thread.sleep(2000);
		ca.Packaging();
		ca.MaterialLifts();
		ca.Slings();
		
		
	}

}
