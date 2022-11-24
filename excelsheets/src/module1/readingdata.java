package module1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingdata {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\hema\\Downloads\\read.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);//opening workbook
		XSSFSheet ws=wb.getSheet("sheet1");//opening sheet
		Row r=null;
		Cell c=null;
		Iterator<Row>row=ws.iterator();//counting no.of rows of sheet1
		while(row.hasNext())//if there is any column heading
		{
			r=row.next();//moves to next rows
			Iterator<Cell>cell=r.iterator();
			while(cell.hasNext()) {
				c=cell.next();
				if(c.getCellType()==c.CELL_TYPE_NUMERIC){
					System.out.println(c.getNumericCellValue());
					
				}
				else if(c.getCellType()==c.CELL_TYPE_STRING) {
					System.out.println(c.getStringCellValue());
				}
			}
		}
		

	}

}
