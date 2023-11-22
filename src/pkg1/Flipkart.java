package pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("5679900");
		
		
	}

}
