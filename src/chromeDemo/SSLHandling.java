package chromeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLHandling {

	public static void main(String[] args) {
		ChromeOptions options= new 	ChromeOptions();
		options.setAcceptInsecureCerts(true);
			WebDriver driver=new ChromeDriver(options);  
		driver.get("https://www.google.com/");
		
		
			driver.manage().window().maximize();

	}

}
