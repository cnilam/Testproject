package com.tutorialninja.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utilities {
	
	public static final int IMPLICIT_WAIT_TIME=20;
	public static final int PAGE_LOAD_TIME=15;
	
	public static String generateEmailTimestamp()
	{
		Date date=new Date();
		String Timestamp=date.toString().replace(" ", "_").replace(":" ,"_");
		return "nilphale"+Timestamp+"@yahoo.com";
	}
	public static Object[][] getTestdata(String sheetName)
	{ 
		File excelfile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\tutorialsninja\\testdata\\tutorialsninjaworkbook.xlsx");
    	XSSFWorkbook workbook=null;	
	   try
		{
	    FileInputStream fis=new FileInputStream(excelfile);
		workbook=new XSSFWorkbook(fis);
		}catch(Throwable e)
		{
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		int rows=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum();
		Object[][] data=new Object[rows][col];
		XSSFRow row;
		
		for(int i=0;i<rows;i++)
			{
			 row=sheet.getRow(i+1);
			for(int j=0;j<col;j++)
			{
				XSSFCell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				switch(cellType){
				case STRING:
					data[i][j]=cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j]=Integer.toString((int)cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data[i][j]=cell.getBooleanCellValue();
					break;
					
				}
						
			}
			}
		return data;
	}
	
	
	
		
	}


