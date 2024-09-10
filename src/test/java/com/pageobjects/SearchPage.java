package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy (xpath="//input[@class='search_bar-input ng-pristine ng-invalid ng-touched']")
	WebElement clk_search;
	
	public void search() {
		clk_search.click();
	}
	
	@FindBy (xpath="//input[@class='search_bar-input ng-pristine ng-invalid ng-touched']")
	WebElement txt_searchproduct;
	
	public void setsearchproduct(String pname) {
		txt_searchproduct.sendKeys(pname);
	}
	
	@FindBy (xpath="//input[@class='search_bar-input ng-pristine ng-invalid ng-touched']")
	WebElement btn_submit;
	
	public void submit() {
		btn_submit.submit();
	}
	
	
	
}
