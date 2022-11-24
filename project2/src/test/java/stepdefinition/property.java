package stepdefinition;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class property {
	WebDriver d;
	@Given("user is in newtours page")
	public void user_is_in_newtours_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	    	}

	@When("user need to enter username and password")
	public void user_need_to_enter_username_and_password() throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\hema\\Documents\\java programs\\excelsheets\\src\\internalfile\\p1.properties");
	   Properties p1=new Properties();
	   p1.load(f);
	   d.findElement(By.name("userName")).sendKeys(p1.getProperty("username"));
	   d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
	   
	}

	@Then("user clicks the button")
	public void user_clicks_the_button() throws InterruptedException {
		d.findElement(By.name("submit")).click();
		Thread.sleep(2000);
	   
	}

	@And("user takes screenshot and closes window")
	public void user_takes_screenshot_and_closes_window() throws IOException {
		File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	   Files.copy(a1,new File("C:\\Users\\hema//newtours.png"));
	}

}
