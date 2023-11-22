package Synchorinzation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentwait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	// fluent wait
// Wait<WebDriver> wait= new FluentWait<>
        driver.findElement(By.name("username")).sendKeys("Admin");
	}

}
