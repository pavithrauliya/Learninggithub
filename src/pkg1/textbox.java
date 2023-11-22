package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();  
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		driver.manage().window().maximize();
		// identy
	WebElement emailtxt=	driver.findElement(By.name("email"));
		// selected
	boolean disableStatus= emailtxt.isDisplayed();
	System.out.print("Is displayed status is:"+ disableStatus);
	
	//enabled
	boolean enableStatus= emailtxt.isEnabled();
	System.out.println("Is enable status:"+ enableStatus);
	
	 emailtxt.sendKeys("selenium");
	
	 Thread.sleep(5000);
	// get attribute
	String getmail= emailtxt.getAttribute("value");
	System.out.print("enter the msg"+ getmail);
	
	emailtxt.clear();
	
	
	
	}

}
