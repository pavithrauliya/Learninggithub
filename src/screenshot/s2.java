package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s2 {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();  
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    TakesScreenshot screenshot= (TakesScreenshot) driver;
    File image= screenshot.getScreenshotAs(OutputType.FILE);
    File myfile= new File("C:\\Users\\PU64320\\eclipse-workspace\\Selenium\\Screenshot\\image2.PNG");
    FileUtils.copyFile(image, myfile);
	}
}
