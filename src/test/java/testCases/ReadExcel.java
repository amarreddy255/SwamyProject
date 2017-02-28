package testCases;
//first comment -- balaji
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String excelFilePath = "./Assets/TestData.xlsx";
		String strTestDataValue;
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	       
		Workbook workbook = new XSSFWorkbook(inputStream);
		//System.out.println("No.of sheets: "+workbook.getNumberOfSheets());
		int intSheetcount = workbook.getNumberOfSheets();
		System.out.println("**************************************  Reading Test Data Sheet  *****************************************");
		System.out.println();
	 	int j=1;			
	    for (int i=0;i<intSheetcount;i++){
	    	Sheet Sheets = workbook.getSheetAt(i);
	      	System.out.println("Test Data Sheet"+ j++ + " - Row Count: "+Sheets.getLastRowNum());
	      	System.out.println();
	      	//Iterator<Row> iterator = firstSheet.iterator();
	      
	      	for (int rowno=0;rowno<Sheets.getLastRowNum();rowno++) {
	      		Row nextRow = Sheets.getRow(rowno+1);//iterator.next();
	      		//Iterator<Cell> cellIterator = nextRow.cellIterator();
	      		
	      		Cell ObjTestDataName = nextRow.getCell(0);
	      		System.out.println(ObjTestDataName.getCellType());
	      		if(ObjTestDataName.getCellType()==1){
	      			String strTestDataName = ObjTestDataName.getStringCellValue();
	      			System.out.print("String Output "+strTestDataName);
	      		}else{
	      			int strTestDataName = (int) ObjTestDataName.getNumericCellValue();
	      			System.out.print("Int Output "+strTestDataName);
	      		}
	      		
	      		Cell ObjTestDataValue = nextRow.getCell(1);
	      		System.out.println(ObjTestDataValue.getCellType());
	      		
	      		if(ObjTestDataValue.getCellType()==1){
	      			strTestDataValue = ObjTestDataValue.getStringCellValue();
	      			System.out.print("String Output "+strTestDataValue);
	      		}else{
	      			int intvalue = (int) ObjTestDataValue.getNumericCellValue();
	      			strTestDataValue = ""+intvalue;
	      			System.out.print("Int Output "+strTestDataValue);
	      		}
	      	
	      		//mapTestData.put(strTestDataName, strTestDataValue);
				//System.out.println(i+" Column Value: "+ParameterValue);
		    	//System.out.println("Test Data Map Value: "+mapTestData.get(strTestDataName));
		    	System.out.println();
	      	}
	    } 
	    workbook.close();
	    inputStream.close();

	}

}
