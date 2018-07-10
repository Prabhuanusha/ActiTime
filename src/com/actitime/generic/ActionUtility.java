package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtility 
{
	public Actions act;
	public void ActionsUtility( WebDriver driver)
	{
		act = new Actions(driver);
	}
	
	public void moveToElement(WebElement target)
	{
		act.moveToElement(target).perform();
	}
	
	public void doubleClick(WebElement target)
	{
		act.doubleClick(target).perform();
	}

}
