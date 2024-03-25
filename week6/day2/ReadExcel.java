package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//step 1 ---> Open the Excel
		XSSFWorkbook wb = new XSSFWorkbook("./data/createLeads.xlsx");
		
		//Step ---> get the sheet 
		//XSSFSheet sheet = wb.getSheet("Sheet1"); By using Sheet Name
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//Get the no of row in the Excel
		int rowCount = sheet.getLastRowNum();
		System.out.println("rowCount ---> " +rowCount );
		
		short colCount = sheet.getRow(0).getLastCellNum();		
		System.out.println("Column count ---> " +colCount);
		
		String data11 = sheet.getRow(1).getCell(1).getStringCellValue();		
		System.out.println("data[1][1] ---> " +data11);
		
		XSSFCell cell23 =sheet.getRow(2).getCell(3);
		String data23 = cell23.getStringCellValue();
		System.out.println(data23);
		//First row
		
		//First data
		XSSFCell cell10 = sheet.getRow(1).getCell(0);
		String data00 = cell10.getStringCellValue();
		// Second data
		XSSFCell cell11 = sheet.getRow(1).getCell(1);
		String data01 = cell11.getStringCellValue();
		//Third data
		XSSFCell cell12 = sheet.getRow(1).getCell(2);
		String data02 = cell11.getStringCellValue();
		//Fourth data
		XSSFCell cell13 = sheet.getRow(1).getCell(3);
		String data03 = cell11.getStringCellValue();
		
		//To iterate each row
		for(int i=-1; i<=rowCount; i++) {
			XSSFRow row =sheet.getRow(i);
			for(int j=0;j<colCount;j++) {//To iterate each cell in the row
				XSSFCell cell =row.getCell(j);//To get Cell from the sheet
				String cellValue = cell.getStringCellValue();//To get data from te cell
				System.out.println(cellValue);
			}
			
		}
		
		wb.close();//Mandatory

	}

}
