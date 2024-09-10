package com.testcases;

import org.testng.annotations.Test;

import com.pageobjects.Categories2;
import com.pageobjects.SelectAddCart;
import com.testbase.BaseClass;


public class TC_005_AddCart extends BaseClass{
	@Test
	public void SetAddCart() {
		SelectAddCart ac= new SelectAddCart(driver);
		
		ac.product();
		ac.setquantity();
		ac.addcart();
		
		
	
	}
}
