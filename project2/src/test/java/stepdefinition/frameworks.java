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

public class frameworks {
	WebDriver d;
	@Given("user opens newtours page")
	public void user_opens_newtours_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 d=new ChromeDriver();
		 d.get("https://demo.guru99.com/test/newtours/");
		 d.manage().window().maximize();

	   	}

	@When("user needs to click on register")
	public void user_needs_to_click_on_register() {
		d.findElement(By.linkText("REGISTER")).click();
		
		
	}

	@Then("user gets countrynames from dropdown")
	public void user_gets_countrynames_from_dropdown() throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\hema\\Downloads\\frameworks.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		Cell c=null;
	
		WebElement b=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
		List<WebElement>a=d.findElements(By.tagName("option"));
		System.out.println(a.size());
		for(int i=1;i<a.size();i++) {
			System.out.println(a.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(a.get(i).getText());
			a.get(i).click();
			if(!a.get(i).isSelected()) {
				r.createCell(1).setCellValue("fail");
				
			}
			else {
				r.createCell(1).setCellValue("pass");
			}
			
			
			}
		
		FileOutputStream f2=new FileOutputStream("C:\\Users\\hema\\Downloads\\frameworks.xlsx");
		wb.write(f2);
		
		}
	    
	

	@And("user naviagates to home page and close the browser")
	public void user_naviagates_to_home_page_and_close_the_browser() {
		d.navigate().back();
	   
	}


}
