package AdvSel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prog1 {

	public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("C:\\Users\\91899\\eclipse-workspace\\SEP17\\TestData/RedifData.xlsx");
        Sheet 	excel	=	WorkbookFactory.create(file).getSheet("Sheet4");
        for(int	row=0;row<=excel.getLastRowNum();row++)	//	lastRowNum	=	5	(0	1	2	3	4)
        {
        for(int	col=0;col<excel.getRow(row).getLastCellNum();col++)	//5	4	3	2	1
        {
        String	value	=	excel.getRow(row).getCell(col).getStringCellValue();
        System.out.print(value	+	"\t");
        }
        System.out.println();
        }
        
        
	}

}
