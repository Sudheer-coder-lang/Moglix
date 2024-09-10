package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SelectAddCart extends BasePage{

	public SelectAddCart(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath="//span[text()='Epson Ecotank L3210 Black All-In-One Colour Ink Tank Printer with USB Connectivity ']")
	WebElement product_click;
	
	@FindBy (xpath="//span[@class='remove-qty qty-block']")
	WebElement txt_quantity;
	
	@FindBy (xpath="//span[text()='ADD TO CART']")
	WebElement  btn_addcart;
	
	public void product() {
		Actions act = new Actions(driver);
		act.moveToElement(product_click).build().perform();
		act.moveToElement(product_click);
		
	}
	public void setquantity() {
		Actions act = new Actions(driver);
		act.moveToElement(txt_quantity).doubleClick().perform();
		act.moveToElement(txt_quantity);

		
	}
	public void addcart() {
	Actions act = new Actions(driver);
	act.moveToElement(btn_addcart).build().perform();
	act.moveToElement(btn_addcart);
	}

}


