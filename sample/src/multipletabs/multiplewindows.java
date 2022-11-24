package multipletabs;//parent window to child window

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		String parent_id=d.getWindowHandle();
		System.out.println(parent_id);
		d.findElement(By.id("windowButton")).click();
		//d.findElement(By.id("messageWindowButton")).click();
		Set<String>child_id=d.getWindowHandles();
		System.out.println(child_id);
		for(String handle:child_id) {
			if(!handle.equalsIgnoreCase(parent_id)) {
				d.switchTo().window(handle);
				WebElement text=d.findElement(By.id("sampleHeading"));
				//WebElement text=d.findElement(By.xpath("/html/body"));
				System.out.println(text.getText());
				Thread.sleep(3000);
				d.close();
			}
		}

	}

}
