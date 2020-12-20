package testng.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] readData(String fileName) throws IOException {
		// Step1: To get inside the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");

		// step2: get into the worksheet using sheet name
		//XSSFSheet ws = wb.getSheet("Sheet1");
		
		// step2: get into the worksheet using index
		XSSFSheet ws = wb.getSheetAt(0);

		// to count including the first row
		// int rowCount = ws.getPhysicalNumberOfRows();

		// to exclude the first row
		int rowCount = ws.getLastRowNum();
		// System.out.println(rowCount);

		// to get the number of cells
		int cellCount = ws.getRow(0).getLastCellNum();
		//System.out.println(cellCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		for (int i = 1; i <= rowCount; i++) {
			//int cellCount = ws.getRow(i).getLastCellNum();
			for (int j = 0; j < cellCount; j++) {
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j] = cellValue;
							
				
				System.out.println(cellValue);
			}

		}

		// to close the workbook
				wb.close();
		// step3: to get into the row
		// XSSFRow row = ws.getRow(1);

		// step4: to get into the cell
		// XSSFCell cell = row.getCell(1);

		// Step5: to read the data from the cell
		// String cellValue = cell.getStringCellValue();
		// System.out.println(cellValue);

	 return data;

	}

}
