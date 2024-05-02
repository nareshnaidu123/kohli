package genericutilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {

	public String readDataFromExcel(String SheetName,int rowNum,int cellNum) throws Throwable{
		FileInputStream fise = new FileInputStream("C:\\Users\\Madhu\\eclipse-workspace\\swaglabregret\\src\\test\\resources\\Excelsheet1.xlsx");
		Workbook wb = WorkbookFactory.create(fise);
		return wb.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		} 

}
