package pkg1;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  

public class TestApplication {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();  
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx"); 
		WebElement element = driver.findElement(By.id("ctl00_MainContent_username"));
        boolean status = element.isEnabled();
        if(status){  
            element.sendKeys("Tester");  
            }  	
		
		
		//driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
     //   driver.getCurrentUrl();
        System.out.println( driver.getCurrentUrl());
      //  driver.quit(); 
       //  driver.close();
      
	}

}
