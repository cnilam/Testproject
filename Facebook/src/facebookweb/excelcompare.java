package facebookweb;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelcompare {
	public static void main(String args[]) throws EncryptedDocumentException, IOException
	{
		String path="C:\\Book1";
		InputStream file=new FileInputStream(path);
        Workbook wb= WorkbookFactory.create(file);

        //creating a Sheet object
        Sheet sheet=wb.getSheet("velocity1");
	   // String username=WorkbookFactory.create(file).getSheet("velocity1").getRow(1).getCell(0).getStringCellValue();
		//String password=WorkbookFactory.create(file).getSheet("velocity1").getRow(1).getCell(1).getStringCellValue();
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        
        //iterate over all the row to print the data present in each cell.
        for(int i=0;i<=rowCount;i++){
            
            //get cell count in a row
            int cellcount=sheet.getRow(0).getLastCellNum();
            
          
            
            for(int j=0;j<cellcount;j++){
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +"," );
               
            }
            System.out.println();
        
	}

}
}