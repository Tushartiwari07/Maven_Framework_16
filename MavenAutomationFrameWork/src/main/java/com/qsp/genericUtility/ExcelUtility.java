package com.qsp.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility
{
	public String getStringDataFromExcel(String sheetname, int rowIndex ,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/ExcelTestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);	
		return workbook.getSheet(sheetname).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	}
	public double getNumberDataFromExcel(String sheetname, int rowIndex ,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/ExcelTestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);	
		return workbook.getSheet(sheetname).getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
	}
	public boolean getBooleanDataFromExcel(String sheetname, int rowIndex ,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/ExcelTestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);	
		return workbook.getSheet(sheetname).getRow(rowIndex).getCell(cellIndex).getBooleanCellValue();
	}


}
