package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestediframe {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();  
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		//html page to parent page
		driver.switchTo().frame("frame-top");
		// parent to child
		driver.switchTo().frame("frame-middle");
		// idenity the element
	WebElement text=	driver.findElement(By.id("content"));
		//
		System.out.print("text of second iframe" + text);	
		
		
		
		
		
		

	}

}
