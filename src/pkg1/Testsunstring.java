package pkg1;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

 
		
public class Testsunstring {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx"); 
		driver.findElement(By.cssSelector(("input[id^=ctl00_Main]"))).sendKeys("Tester");
        driver.findElement(By.cssSelector(("input[id$=password]"))).sendKeys("test");
        driver.findElement(By.cssSelector(("input[id*=MainContent_login]"))).click();
	}

}