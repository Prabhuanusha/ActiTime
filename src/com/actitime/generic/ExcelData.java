package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	public static String getData(String filePath,String SheetName , int rn, int cn)
	{
		try
		{
			FileInputStream fis = new FileInputStream(new File(filePath));
			Sheet sh = WorkbookFactory.create(fis).getSheet(SheetName);
			String data = sh.getRow(rn).getCell(cn).getStringCellValue();
			return data;
			
		}
		catch (Exception e) 
		{
			return "";
		}
	}
	public static int getRowcount(String filePath,String SheetName )
	{
			try
			{
				FileInputStream fis = new FileInputStream(new File(filePath));
				Sheet sh = WorkbookFactory.create(fis).getSheet(SheetName);
				int rc = sh.getLastRowNum();
				return rc;
				
			}
			catch (Exception e) 
			{
				return 0;
			}
	}
	public static int getCellcount(String filePath,String SheetName,int rn )
	{
			try
			{
				FileInputStream fis = new FileInputStream(new File(filePath));
				 Row sh = WorkbookFactory.create(fis).getSheet(SheetName).getRow(rn);
				int cc = sh.getLastCellNum();
				return cc;
				
			}
			catch (Exception e) 
			{
				return 0;
			}
	}

}
