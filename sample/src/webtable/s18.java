package webtable;//capturing first column elements

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s18 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		String s="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String s1="]/td[1]";
		for(int i=1;i<=36;i++) {
			String res=d.findElement(By.xpath(s+i+s1)).getText();
			System.out.println(res);
		}

	}

}
