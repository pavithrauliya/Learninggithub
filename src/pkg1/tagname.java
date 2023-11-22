package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();  
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	driver.manage().window().maximize();
		List <WebElement> alllink= driver.findElements(By.tagName("a"));
		System.out.println("no of msg:" +alllink.size());
		
		for(int i=0; i<=alllink.size(); i++) {
			System.out.println("no of msg:" +alllink.size());
		}
}
}