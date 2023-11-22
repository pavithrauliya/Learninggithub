package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();  
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input.oxd-input oxd-input--active")).sendKeys("Admin");
//	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
	driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}
}