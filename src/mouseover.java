import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
WebElement ele=	driver.findElement(By.id("nav-link-accountList"));
			Actions a= new Actions(driver);
			a.moveToElement(ele).build().perform();
			Thread.sleep(5000);
		WebElement ele2=	driver.findElement(By.xpath("//span[text()='Orders']/parent::a"));
	a.click(ele2)	.build()	.perform();
			
		WebElement ele3= driver.findElement(By.id("ap_email"));
		a.sendKeys("pavithra").build().perform();
	}

}
