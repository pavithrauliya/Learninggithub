import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();  
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			driver.manage().window().maximize();
WebElement ele=	driver.findElement(By.xpath("//span[text()='right click me']"));
	Thread.sleep(5000);
		Actions a= new Actions(driver);	
		a.contextClick(ele).build().perform();
	}

}
