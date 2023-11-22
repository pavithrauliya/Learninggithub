package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();  
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver.manage().window().maximize();
		
	WebElement ele=	driver.findElement(By.xpath("//button[text()='Add Element']"));
	boolean isDisplayedStatus= ele.isDisplayed();
	System.out.print("Is displayed status is:"+ isDisplayedStatus);
	//  enbaled

	boolean isEnableddStatus= ele.isEnabled();
	System.out.print("Is displayed status is:"+ isEnableddStatus);

	Thread.sleep(5000);
	
	// get button value
	String vale=ele.getText();
	System.out.print("value of option dispayed"+  vale);
	
	
	ele.click();
	}
	
	

}
