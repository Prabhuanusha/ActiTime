package com.actitime.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	@Test(priority=1)
	public void testValidLoginLogout()
	{
		String loginTitle = ExcelData.getData(file_path, "TC01", 1, 2);
		String un = ExcelData.getData(file_path, "TC01", 1, 0);
		String pw = ExcelData.getData(file_path, "TC01", 1, 1);
		String enterTitle = ExcelData.getData(file_path, "TC01", 1, 3);
		
		LoginPage lp = new LoginPage(driver);
		 EnterTimeTrackPage ep = new EnterTimeTrackPage(driver);
		 
		 //verify login page title
		 lp.verifyTitle(loginTitle);
		 
		 //enter valid username
		 Reporter.log("user name: "+un, true);
	   	 lp.enterUserNme(un);
		 
		 //enter valid password
		 Reporter.log("password: "+pw, true);
		 lp.enterPassword(pw);
		 		 
		 //click on login
		 lp.clickOnLogin();
		 
		 //verify enter time track page title
		 lp.verifyTheTitle(enterTitle);
		 
		 //click on logout
		 ep.clickOnLogout();
		 
		 //verify login page title
		 lp.verifyTheTitle(loginTitle);
		 
	}
}
