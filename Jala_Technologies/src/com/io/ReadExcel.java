package com.io;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;  
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.ss.usermodel.Row; 


public class ReadExcel {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		FileInputStream inputStream = new FileInputStream(new File("resources/studnets.xls"));
		
		try (HSSFWorkbook wb = new HSSFWorkbook(inputStream)) {
			HSSFSheet sheet=wb.getSheetAt(0);  
			//evaluating cell type   
			FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
			for(Row row: sheet)     //iteration over row using for each loop  
			{  
			for(Cell cell: row)    //iteration over cell using for each loop  
			{  
			switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
			{  
			case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type  
			//getting the value of the cell as a number  
			System.out.print(cell.getNumericCellValue()+ "\t\t");   
			break;  
			case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
			//getting the value of the cell as a string  
			System.out.print(cell.getStringCellValue()+ "\t\t");  
			break;  
			}  
			}  
			System.out.println();  
			}
		} 

	}

}
