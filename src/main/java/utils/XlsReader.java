package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

/**
 *
 * @author Fakhry
 */
public class XlsReader {
	
	static Sheet sheet;
	
	public static int rows=9 ;
	
	public static int colomns = 7;
	
	public static void main(String[] args) throws EncryptedDocumentException,FileNotFoundException, IOException, InvalidFormatException {


		//		 int coluString  out = sheet.getRow(4).getCell(3).getStringCellValue();
		//		 readXls("fakhry.xls");
		for(int i = 1 ; i< rows; i++) {
			for(int j = 0 ; j< colomns ; j++) {
				if(getCell(i,j,false).isEmpty()) 
					System.out.println("7amada");
				else {
					String out = getCell(i,j,false);
					System.out.println(out);
					
				}
				
			}
			System.out.println("----");
			}
	}

	static void readXls (String filename) throws EncryptedDocumentException, FileNotFoundException, IOException,InvalidFormatException {

		File file = new File(System.getProperty("user.dir") + "/src/test/resources/"+filename);
		Workbook workbook = WorkbookFactory.create(new FileInputStream(file));
		sheet = workbook.getSheetAt(0);

		int column_index_1 = 0;
		int column_index_2 = 0;
		int column_index_3 = 0;
		int column_index_4 = 0;
		int column_index_5 = 0;
		int column_index_6 = 0;
		int column_index_7 = 0;

		Row row = sheet.getRow(0);
		for (Cell cell : row) {
			// Column header names.
			switch (cell.getStringCellValue()) {
			case "phy in":
				column_index_1 = cell.getColumnIndex();
				break;
			case "Dig in":
				column_index_2 = cell.getColumnIndex();
				break;
			case "Break in":
				column_index_3 = cell.getColumnIndex();
				break;
			case "Break out":
				column_index_4 = cell.getColumnIndex();
				break;  
			case "phy out":
				column_index_5 = cell.getColumnIndex();
				break; 
			case "Dig out":
				column_index_6 = cell.getColumnIndex();
				break;  
			case "Calculate":
				column_index_7 = cell.getColumnIndex();
				break;  
				

			}
		}

		for (Row r : sheet) {
			if (r.getRowNum()==0) continue;//Headers

			 r.getCell(column_index_1);
			 r.getCell(column_index_2);
			 r.getCell(column_index_3);
			 r.getCell(column_index_4);
			 r.getCell(column_index_5);
			 r.getCell(column_index_6);
			 r.getCell(column_index_7);

			//			        if (	     c_1 != null && !c_1.getCellType().toString().isEmpty()
			//			                &&c_2 != null && !c_2.getCellType().toString().isEmpty()
			//			                &&c_3 != null && !c_3.getCellType().toString().isEmpty()
			//			                &&c_4 != null && !c_4.getCellType().toString().isEmpty()
			//			                &&c_5 != null && !c_5.getCellType().toString().isEmpty()
			//			               ) 
			//			        	System.out.print("" +c_1 + "        " + c_2+"        "+c_3+"        "+c_4+"        "+c_5+"\n");

		}

	}

	static public String getCell(int Row,int Col, boolean type) 
			throws EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException {

		String out=null;
		double out2;

		readXls("fakhry2.xls");

		if(type) {
			out2 = sheet.getRow(Row).getCell(Col).getNumericCellValue();
			return Double.toString(out2);
		}
		else {
			out = sheet.getRow(Row).getCell(Col).getStringCellValue();
			return out;
		}
	}


}

