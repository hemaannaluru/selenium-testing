package module2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class scenario3 {

	public static void main(String[] args) throws IOException {
		scenario2 s=new scenario2();
		FileInputStream f=new FileInputStream("C:\\Users\\hema\\Downloads\\keys.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		Cell c=null;
		Iterator<Row> row=ws.iterator();
		while(row.hasNext()) {
			r=row.next();
			r=ws.getRow(2);
			c=r.getCell(2);
			String s1=c.getStringCellValue() ;
			if(s1.equals("Opening_Browser")) {
				s.Opening_browser();
			    
			}
			else if(s1.equals("Navite")) {
				s.Navigate();
			}
			else if(s1.equals("User_Name")) {
				s.usernameenter();
			}
			else if(s1.equals("Password")) {
				s.passwordenter();
			}
			else if(s1.equals("Click")) {
				s.click();
			}
			else {
				s.close();
			}
		}
		

	}

}
