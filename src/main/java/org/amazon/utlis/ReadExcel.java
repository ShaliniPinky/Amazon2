package org.amazon.utlis;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public String[][] readExcel(String ExcelFilePath,String sheetname) throws IOException {
		
		XSSFWorkbook book=new XSSFWorkbook("./Excel/"+ExcelFilePath+".xlsx");
		XSSFSheet sheet=book.getSheet(sheetname);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		String[][] data=new String[lastRowNum][lastCellNum];
		
		for(int i=1;i<=lastRowNum;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<lastCellNum;j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				data[i-1][j]=stringCellValue;
			}
		}
		
		return data;
		
	}
	

}
