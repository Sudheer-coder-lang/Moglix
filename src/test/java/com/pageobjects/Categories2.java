package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Categories2 extends BasePage{

	public Categories2(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath="//p[text()='Electrical Tools & Equipment']")
	WebElement navigation1;
	
	@FindBy (xpath="//p[text()='Fans']")
	WebElement navigation2;
	
	
	public void Euipments() {
		Actions act = new Actions(driver);
		act.moveToElement(navigation1).build().perform();
		act.moveToElement(navigation1);
		
	}
	public void fans(){
		Actions act = new Actions(driver);
		act.moveToElement(navigation2).build().perform();
		act.moveToElement(navigation2);
		
	}
}
