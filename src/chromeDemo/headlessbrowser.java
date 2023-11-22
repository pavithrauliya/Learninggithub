package chromeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessbrowser {

	public static void main(String[] args) {
	ChromeOptions options= new 	ChromeOptions();
	options.addArguments("---headless");
		WebDriver driver=new ChromeDriver(options);  
	driver.get("https://www.google.com/");
	
	
		driver.manage().window().maximize();
String ele1= driver.getTitle();
String ele2=driver.getCurrentUrl();

System.out.print("the url" +ele1);
System.out.print("the url" +ele2);
	}

}
