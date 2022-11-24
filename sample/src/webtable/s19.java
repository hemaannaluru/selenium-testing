package webtable;//capturing elements with 2 columns

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s19 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		String s="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String s1="]/td[";
		String s2="]";
		for(int i=1;i<=36;i++) {      //for rows 
			for(int j=1;j<=8;j++) { //for columns
				 String s3=d.findElement(By.xpath(s+i+s1+j+s2)).getText();    
				 System.out.println(s3);
				
			}
		}

	}

}
