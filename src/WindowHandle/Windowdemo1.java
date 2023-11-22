package WindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
public class Windowdemo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
		//click on login
		driver.findElement(By.id("login-btn")).click();
String firstTabWindowID =	driver.getWindowHandle();

			driver.findElement(By.linkText("About Us")).click();
		//switch from 1 tab to 2nd tab
	Set <String> allWindowIds = driver.getWindowHandles();
	for (String s:allWindowIds) {
		if(!s.equals(firstTabWindowID)) {
			driver.switchTo().window(s);
		}
	}
driver.findElement(By.linkText("History")).click();
//switch focus 2nd to 1st tab

		
		
		
		
	}

}
*/