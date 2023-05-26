package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example5_getAllDataInARow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		FileInputStream file=new FileInputStream("C:\\Users\\sanja\\OneDrive\\Desktop\\Study\\28Th Jan Eve\\28thJan.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
	
		int lastCellIndex = sh.getRow(0).getLastCellNum()-1;
		
		//           4<=3
		for(int i=0; i<=lastCellIndex; i++)
		{    //                                  3
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
		
		//abc1 abc2 abc3 xyz	
	}
}
