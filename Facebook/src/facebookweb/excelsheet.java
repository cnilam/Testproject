package facebookweb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet {
	
	public static void main(String args[]) 
	{
		String path="C:\\Excel\\Facebook1";
		InputStream file=new FileInputStream(path);
		String data=WorkbookFactory.create(file).getSheet("sheet1").getRow(3).getCell(1).getStringCellValue();
		System.out.println(data);
	}
	
	/*public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		String path="c:\\Book1";
		InputStream file=new FileInputStream(path);
		//String data=WorkbookFactory.create(file).getSheet("velocity").getRow(3).getCell(1).getStringCellValue();
		//double data=WorkbookFactory.create(file).getSheet("velocity").getRow(3).getCell(0).getNumericCellValue();
		Date data=WorkbookFactory.create(file).getSheet("velocity").getRow(3).getCell(2).getDateCellValue();
		System.out.println(data);
	}*/

}
