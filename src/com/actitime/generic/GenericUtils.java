package com.actitime.generic;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericUtils
{
	public static void getScreenShot(WebDriver driver, String name)
	{		
	    try 
	    {
	    	TakesScreenshot t = (TakesScreenshot)driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFileToDirectory(src, new File("./screenshot/"+ name +" .png"));
		} 
	    catch (Exception e) 
	    {
			
		}
	}
	
	

}
