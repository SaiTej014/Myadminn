package uTiles;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtiles {
	public static String [] readExcelData(String Name) throws IOException {
		String Path = System.getProperty("user.dir")+"\\testData\\MyAdmin.xlsx";
		FileInputStream Fi = new FileInputStream(Path);
		XSSFWorkbook Wb = new XSSFWorkbook(Fi);
		XSSFSheet Sh = Wb.getSheet(Name);
		XSSFRow Rw = Sh.getRow(0);
		//XSSFCell Cl = Rw.getCell(0);
		int c_no = Rw.getLastCellNum();
		String Data[] = new String[c_no];
		for(int j=0;j<c_no;j++) {
			Data[j]=String.valueOf(Rw.getCell(j));
		}
		return Data;
		
	}

}
