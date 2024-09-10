package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AllCategories extends BasePage{

	public AllCategories(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath="//p[text()='Office Stationery & Supplies']")
	WebElement Stationery_click;
	
	@FindBy (xpath="//p[text()='Printers']")
	WebElement printer_click;
	
	@FindBy (xpath="//p[text()='Ink Tank Printer']")
	WebElement ink_click;
	
	public void stationary() {
		Stationery_click.click();
	Actions act = new Actions(driver);
	act.moveToElement(Stationery_click).build().perform();
	act.moveToElement(Stationery_click);
	}
	public void printers() {
		printer_click.click();
		Actions act= new Actions(driver);
		act.moveToElement(printer_click).build();
		act.moveToElement(printer_click);
	}
	public void inkprinters() {
		ink_click.click();
		Actions act=new Actions(driver);
		act.moveToElement(ink_click).doubleClick().perform();
		act.moveToElement(ink_click);
			
	}
	
	

}
