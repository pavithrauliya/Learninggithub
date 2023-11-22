import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();  
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
WebElement ele=	driver.findElement(By.id("draggable"));
WebElement ele2=	driver.findElement(By.id("droppable"));
Thread.sleep(5000);
	Actions a= new Actions(driver);	
a.dragAndDrop(ele, ele2).build().perform();

	}

}
