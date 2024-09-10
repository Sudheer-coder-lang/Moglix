package com.testcases;

import org.testng.annotations.Test;

import com.pageobjects.AllCategories;
import com.testbase.BaseClass;

public class TC_003_AllCategories extends BaseClass{
	@Test
	public void navigation() throws Exception {
		AllCategories ac = new AllCategories(driver);
		Thread.sleep(2000);
		ac.stationary();
		ac.printers();
		ac.inkprinters();
		
	}

}
