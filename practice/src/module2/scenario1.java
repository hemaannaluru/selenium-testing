package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario1 {
	WebDriver d;
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://itera-qa.azurewebsites.net/UserRegister/NewUser");
		d.manage().window().maximize();
	}
	/*public void sign_up() throws InterruptedException {
		d.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);
		
	}*/
	public void register() {
		d.findElement(By.id("FirstName")).sendKeys("hema");
		d.findElement(By.id("Surname")).sendKeys("annaluru");
		d.findElement(By.id("E_post")).sendKeys("123456");
		d.findElement(By.id("Mobile")).sendKeys("989766369");
		d.findElement(By.id("Username")).sendKeys("hema123");
		d.findElement(By.id("Password")).sendKeys("12345");
		d.findElement(By.id("ConfirmPassword")).sendKeys("12345");
		d.findElement(By.id("submit")).click();
		WebElement txt=d.findElement(By.xpath("/html/body/div/form/div/div[10]/div/label"));
		System.out.println(txt.getText());
	}
	/*public static void main(String[] args) throws InterruptedException {
		scenario1 s=new scenario1();
		s.open_browser();
		//s.sign_up();
		s.register();
		
	}*/
}
