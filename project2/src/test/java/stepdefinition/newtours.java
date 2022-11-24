package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newtours {
	WebDriver d;
	@Given("user is in newtours application")
	public void user_is_in_newtours_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	}

	@When("^user needs to enter(.*) and (.*)$")
	public void user_needs_to_enter_uname_and_password(String uname,String password) throws InterruptedException  {
		Thread.sleep(2000);
		d.findElement(By.name("userName")).sendKeys(uname);
		d.findElement(By.name("password")).sendKeys(password);
	}
	

	@Then("user click on  button")
	public void user_click_on_button() throws InterruptedException {
		 Thread.sleep(2000);
		  d.findElement(By.name("submit")).click();
	}

	@And("user navigated to home page")
	public void user_navigated_to_home_page() {
	  d.navigate().back();
	}

}
