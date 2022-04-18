package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelUtility implements FrameworkConstant{

	public Workbook workbook;
	public static File filePath=new File(EXCEL_PATH);

//	public String getExcelData(String sheetName , int rowNum , int colNum) throws Throwable {
//		FileInputStream fis = new FileInputStream(FrameworkConstant.EXCEL_PATH);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet(sheetName);
//		Row row = sh.getRow(rowNum);
//		wb.close();
//		return row.getCell(colNum).getStringCellValue();
//				
//	}	
//	
	public String getExcelData(String sheetName , String expTestID , String expColHEader) throws Throwable {
		
		int expTestRow = 0;
		int expHeader = 0;
		FileInputStream fis = new FileInputStream(FrameworkConstant.EXCEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rowCount = sh.getLastRowNum();
	    
    for(int i=0; i<rowCount ; i++) {		
		Row row = sh.getRow(i);
		String zeroColData= row.getCell(0).getStringCellValue();
        if(expTestID.contentEquals(zeroColData)) {
        	//System.out.println("test is available");
        	expTestRow = i;
        	break;
        }
    }
    
    int expColHeader = expTestRow-1;
    
        int colCount = sh.getRow(expColHeader).getLastCellNum();
         for(int j=0 ; j <colCount ; j++) {
        	   String actColHeader = sh.getRow(expColHeader).getCell(j).getStringCellValue();
        	   if(actColHeader.equals(expColHEader)) {
        		        //System.out.println("header is available ");
        		        expHeader = j;
        		        break;
        	   }
         }
         
return sh.getRow(expTestRow).getCell(expHeader).getStringCellValue();		
}	
}

