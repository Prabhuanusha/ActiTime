package com.actitime.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.generic.ExcelData;
import com.actitime.pages.LoginPage;

public class invalidLoginTest extends BaseTest
{
	@Test(priority=1)
public void testinvalidLoginTest() throws InterruptedException
{
	String loginTitle = ExcelData.getData(file_path, "TC01", 1, 2);
	String eErrMessge = ExcelData.getData(file_path, "TC02", 1, 2);
	
	LoginPage lp = new LoginPage(driver);
		 
	 //verify login page title
	 lp.verifyTitle(loginTitle);
	 
	 int rc=ExcelData.getRowcount(file_path, "TC02");
	 
	 for(int i=1;i<=rc;i++)
	 {
		String  un = ExcelData.getData(file_path, "TC02", i , 0);
		String  pw = ExcelData.getData(file_path, "TC02", i , 1);
		
		Reporter.log("UserName:"+un, true);
		Reporter.log("Password:"+pw, true);
	 
	 //enter invalid username
   	 lp.enterUserNme(un);
	 
	 //enter invalid password
	 lp.enterPassword(pw);
	 		 
	 //click on login
	 lp.clickOnLogin();
	 
	 //verify error message
	 String aErrMessge = lp.verifyErrorMessage();
	 Reporter.log("Expected error message:"+eErrMessge, true);
	 Reporter.log("Actual error message:"+aErrMessge, true);
	 Assert.assertEquals(aErrMessge, eErrMessge);
	 Thread.sleep(2000);
	 Reporter.log(" ======== ", true);
	 }
	

}
}
