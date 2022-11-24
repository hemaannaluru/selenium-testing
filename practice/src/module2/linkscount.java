package module2;//linkscount in itera page

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class linkscount extends scenario1 {
public void count() {
	//d.findElement(By.xpath("/html/body/nav")).click();
	WebElement b=d.findElement(By.xpath("/html/body/nav"));
	List<WebElement>a=d.findElements(By.tagName("a"));
	System.out.println(a.size());
	for(int i=1;i<a.size();i++) {
		System.out.println(a.get(i).getText());
	}
}

public static void main(String[] args) {
	linkscount l=new linkscount();
	l.open_browser();
	//l.register();
	l.count();
}
}


