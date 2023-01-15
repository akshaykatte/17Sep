package AdvSel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prog {

	public static void main(String[] args) throws Exception {
            FileInputStream file = new FileInputStream("C:\\Users\\91899\\eclipse-workspace\\SEP17\\TestData/RedifData.xlsx");
             Sheet excel = WorkbookFactory.create(file).getSheet("Sheet3");
             for(int row=0;row<4;row++)
             {
            	 for(int col=0;col<3;col++)
            	 {
            		 String a =excel.getRow(row).getCell(col).getStringCellValue();
            		 System.out.print(a + "\t");
            	 }
            	 System.out.println();
             }
             
             
             
             
             
             
             
	}

}

