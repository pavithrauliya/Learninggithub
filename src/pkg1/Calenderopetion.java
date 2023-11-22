package pkg1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderopetion {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.goibibo.com/flights/");
		driver.manage().window().maximize();
		Alert a=driver.switchTo().alert();
		a.dismiss();
	//	driver.findElement(By.xpath("//span[@class='header-sprite logo']")).click();
		// select date
		
}
}