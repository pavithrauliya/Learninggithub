package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframedemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();  
		driver.get("https://jqueryui.com/dialog/");
		driver.manage().window().maximize();
		
		// i frame
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@title='Close']")).click();
		
		// to comeout of frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Demos")).click();
		
		
	}

}
