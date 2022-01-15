package generic;

import java.io.FileInputStream;

import com.google.common.collect.Table.Cell;

public class ddt {
	public static String getData(String sheet,int row,int cell){
		String val="";
		try{
			FileInputStream fis=new FileInputStream("./excel/niran.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Cell c=wb.getSheet(sheet).getRow(row).getCell(cell);
			val=c.getStringcellvalue();
		}
		catch(Expection e){
			System.out.println("unable to fecth");
		}
		return val;
			
		}
		
	}


