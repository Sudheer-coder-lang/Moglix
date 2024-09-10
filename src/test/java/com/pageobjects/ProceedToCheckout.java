package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProceedToCheckout extends BasePage{

	public ProceedToCheckout(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//span[@class='payable-amount']")
	WebElement clk_CheckOut;
	
	@FindBy(xpath="//button[@class='btn primary-full-btn proceedTo-Paybtn']")
	WebElement clk_Pay;
	
	
	
	
	@FindBy(xpath="//input[@class='ng-pristine ng-invalid ng-touched']")
	WebElement txt_PhNum;
	
	@FindBy(xpath="//input[@formcontrolname='alternatePhone']")
	WebElement txt_AltPh;
	
	@FindBy(xpath="//input[@formcontrolname='addressLineFirst']")
	WebElement txt_HoNo;
	
	@FindBy(xpath="//input[@formcontrolname='addressLine']")
	WebElement txt_Str;
	
	@FindBy(xpath="//input[@formcontrolname='landmark']")
	WebElement txt_LndMk;
	
	@FindBy(xpath="//input[@formcontrolname='postCode']")
	WebElement txt_Pinc;
	
	
	@FindBy(xpath="//button[@class='btn secondry-btn']")
	WebElement btn_Save;
	
	

}
