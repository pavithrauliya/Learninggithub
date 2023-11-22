package TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testdemo1 {
@Test
	public void launchgoogle() {
		WebDriver driver=new ChromeDriver();  
		// driver.navigate().to("http://www.google.com/");
		driver.get("http://www.google.com/");
	}

}
