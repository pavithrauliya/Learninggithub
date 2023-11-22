package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javscroll {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();  
	driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
	WebElement ele=	driver.findElement(By.linkText("Shadow DOM"));
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(true);", ele);
	
//	 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
