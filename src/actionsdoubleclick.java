import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionsdoubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();  
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
WebElement ele=		driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
Thread.sleep(5000);
	Actions a= new Actions(driver);	
	a.doubleClick(ele).build().perform();
	
	
	}

}
