package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class google {
	WebDriver d;
	@Given("user is in google page")
	public void user_is_in_google_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 d=new ChromeDriver();
		 d.get("https://www.google.co.in/");
		 d.manage().window().maximize();
		 
	}

	@When("user searches some text")
	public void user_searches_some_text() {
	   d.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("wallpapers");
	   
	}

	@Then("user clicks on button")
	public void user_clicks_on_button() {
		d.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).click();
	   
	}

	@And("user goes to home page")
	public void user_goes_to_home_page() throws InterruptedException {
	    Thread.sleep(3000);
	    d.navigate().back();
	    
	}


}
