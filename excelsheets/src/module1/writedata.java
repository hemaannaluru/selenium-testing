package module1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("C:\\Users\\hema\\Downloads\\write.xlsx");//file path
		XSSFWorkbook wb=new XSSFWorkbook(f);//opening workbook
		XSSFSheet ws=wb.getSheet("Sheet1");//opening sheet //sheet number
		Row r=null;
		Cell c=null;
		r=ws.createRow(2);//creating 2 nd row
		r.createCell(1).setCellValue("manual testing");//in 2 nd row frst column
		
		r=ws.createRow(3);//creating 3 rd row
		r.createCell(2).setCellValue("automation testing");//in 3rd row second column
		
		r=ws.createRow(4);//creating 4th row
		r.createCell(3).setCellValue("selenium testing");//in 4th row third column
		FileOutputStream f1=new FileOutputStream("C:\\Users\\hema\\Downloads\\write.xlsx");//same path
		wb.write(f1);
		f1.close();


	}

}
