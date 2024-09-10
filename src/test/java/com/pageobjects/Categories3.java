package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Categories3 extends BasePage{

	public Categories3(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath="//p[text()='Packaging & Material Handling']")
	WebElement navigation1_click;
	
	@FindBy (xpath="//p[text()='Material Lifts']")
	WebElement navigation2_click;
	
	@FindBy (xpath="//p[text()='Slings']")
	WebElement navigation3_click;
	
	public void Packaging() {
	navigation1_click.click();
	Actions act = new Actions(driver);
	act.moveToElement(navigation1_click).build().perform();
	act.moveToElement(navigation1_click);
	}
	public void MaterialLifts() {
		navigation2_click.click();
		Actions act= new Actions(driver);
		act.moveToElement(navigation2_click).build();
		act.moveToElement(navigation2_click);
	}
	public void Slings() {
		navigation3_click.click();
		Actions act=new Actions(driver);
		act.moveToElement(navigation3_click).doubleClick().perform();
		act.moveToElement(navigation3_click);
			
	}
	

}
