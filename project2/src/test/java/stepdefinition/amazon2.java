package stepdefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazon2 {
	WebDriver d;
	@Given("an amazon page and opening amazon page")
	public void an_amazon_page_and_opening_amazon_page() {
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	 d=new ChromeDriver();
	 
	}

	@When("page is opened")
	public void page_is_opened() {
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
	    
	}

	@Then("store into excel sheet and close the browser")
	public void store_into_excel_sheet_and_close_the_browser() throws IOException {
		//FileInputStream f=new FileInputStream("C:\\Users\\hema\\Downloads\\amazon.xlsx");
		//XSSFWorkbook wb=new XSSFWorkbook(f);
		//XSSFSheet ws=wb.getSheet("sheet1");
		//Row r=null;
		//Cell c=null;
		WebElement b=d.findElement(By.xpath("//*[@id=\"nav-xshop\"]"));
		List<WebElement>a=b.findElements(By.tagName("a"));
		for(int i=0;i<a.size();i++) {
			//r=ws.createRow(i);
			//r.createCell(0).setCellValue(a.get(i).getText());
			//a.get(i).click();
			System.out.println(a.get(i).getText());
		
		}
		//FileOutputStream f1=new FileOutputStream("C:\\Users\\hema\\Downloads\\amazon.xlsx");
		//wb.write(f1);
		
	  
	}
	@And("close the browser")
	public void close_the_browser() {
	    d.close();
	}




}
