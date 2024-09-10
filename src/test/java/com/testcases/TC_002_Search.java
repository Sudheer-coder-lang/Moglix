package com.testcases;

import com.pageobjects.HomePage;
import com.pageobjects.SearchPage;
import com.testbase.BaseClass;

public class TC_002_Search extends BaseClass {
	
	public void search() {
		
		SearchPage Sp = new SearchPage(driver);
		
		Sp.search();
		Sp.setsearchproduct();
		Sp.submit();
		
		
		
		
	}
	

}
