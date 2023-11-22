package Altert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alterdemo1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();  
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
Thread.sleep(5000);
// alter
Alert a1= driver.switchTo().alert();

String MSG=a1.getText();
System.out.print("The MSG is:" +  MSG);	
Thread.sleep(5000);
//
a1.accept();
	}

}
