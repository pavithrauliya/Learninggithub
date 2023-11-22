package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@Test(dataProvider = "getTestdata")
	public void dataprovidermethod(String username1, String password1) {
			WebDriver driver=new ChromeDriver();  
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.name("username1")).sendKeys(username1);
	driver.findElement(By.name("password1")).sendKeys(password1);
}
	@DataProvider
	public Object[][] getTestdata(){
		Object[][] data= new Object[2][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][0]="super";
		data[1][1]="super123";
		return data;
		
	}
}