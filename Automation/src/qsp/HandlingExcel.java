package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// WAP to read the data from the Excel file.
public class HandlingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		//get the control of the sheet ,then row, then cell then read the data 
		String data = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();
		System.out.println(data);
	}
	
}

