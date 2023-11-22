package pkg1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();  
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
	}

}
