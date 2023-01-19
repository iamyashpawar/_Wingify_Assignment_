package wibgngify_assignment_.assignment__baseclass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utility_class
{

	public static String datafetch(int row, int col) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Testdata\\assignment_testdata.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("Testdata");
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
		
	}
	
	
}

