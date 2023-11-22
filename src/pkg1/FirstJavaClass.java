package pkg1;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

 
public class FirstJavaClass {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();  
		// driver.navigate().to("http://www.google.com/");
		driver.get("http://www.google.com/");
		// driver.navigate().to("http://www.facebook.com/");
       // driver.findElement(By.id("APjFqb")).sendKeys("Selenium");              
     //  driver.findElement(By.name("btnK")).click();
	}

}

