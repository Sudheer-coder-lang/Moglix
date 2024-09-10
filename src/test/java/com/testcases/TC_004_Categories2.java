package com.testcases;

import org.testng.annotations.Test;

import com.pageobjects.Categories2;
import com.testbase.BaseClass;

public class TC_004_Categories2 extends BaseClass {
	@Test
	public void setNavigations2() throws InterruptedException {
		Categories2 ca= new Categories2(driver);
		Thread.sleep(2000);
		ca.Euipments();
		ca.fans();
	}

}
