package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
	WebDriver driver=new ChromeDriver();  
	@Test
	public void assertTrueequals () {
			WebDriver driver=new ChromeDriver();  
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
// boolean login=driver.findElement(By.linkText("/web/index.php/admin/viewAdminModule")).isDisplayed();
	// assertion
	// Assert.assertTrue(login);
	
	}
	//close browser
	public void close() {
		driver.close();
}	
}
