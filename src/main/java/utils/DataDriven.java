package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven {
	
	public static void XlsxReader() throws EncryptedDocumentException, FileNotFoundException, IOException {
		File file = new File(System.getProperty("user.dir") + "/src/test/resources/fakhry2.xls");
		Workbook workbook = WorkbookFactory.create(new FileInputStream(file));
		Sheet sheet = workbook.getSheetAt(0);
		int column_index_1 = 0;
		int column_index_2 = 0;
		int column_index_3 = 0;
		Row row = sheet.getRow(0);
		for (Cell cell : row) {
			// Column header names.
			switch (cell.getStringCellValue()) {
			case "num":
				column_index_1 = cell.getColumnIndex();
				break;
			case "name":
				column_index_2 = cell.getColumnIndex();
				break;
			case "mmm":
				column_index_3 = cell.getColumnIndex();
				break;
			}
		}

		for (Row r : sheet) {
			if (r.getRowNum()==0) continue;//Headers
			Cell c_1 = r.getCell(column_index_1);
			Cell c_2 = r.getCell(column_index_2);
			Cell c_3 = r.getCell(column_index_3);
			if (c_1 != null && !c_1.getCellType().toString().isEmpty()
					&&c_2 != null && !c_2.getCellType().toString().isEmpty()
					&&c_3 != null && !c_3.getCellType().toString().isEmpty()) {
				System.out.print("  "+c_1 + "   " + c_2+"   "+c_3+"\n");
			}
		}
	}
}


