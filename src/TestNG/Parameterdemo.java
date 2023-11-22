package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterdemo {
@Parameters({"username1", "password1"})	
	@Test
	public void assertTrueequals (@Optional("super1") String username1, String password1 ) {
		WebDriver driver=new ChromeDriver();  
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.name("username1")).sendKeys(username1);
driver.findElement(By.name("password1")).sendKeys(password1);
// driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}
}
