package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplescreenshot {

	public static void main(String[] args) {
		
			
			WebDriver driver=new ChromeDriver();  
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    captureScreen(driver, "login");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    driver.findElement(By.name("username")).sendKeys("admin");
	    
	    captureScreen(driver, "user");
	    
	    
	    driver.findElement(By.name("password")).sendKeys("admin1");
	    
	    captureScreen(driver, "password");
	    
	    
	}
	public  static void captureScreen(WebDriver driver, String fileName) {
	    TakesScreenshot screenshot= (TakesScreenshot) driver;
        File image= screenshot.getScreenshotAs(OutputType.FILE);
        File myfile= new File("C:\\Users\\PU64320\\eclipse-workspace\\Selenium\\Screenshot\\"+fileName+".PNG");
        try {
			FileUtils.copyFile(image, myfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
