package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();  
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
WebElement CheckBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		     // is displayed
boolean isDisplayedStatus =CheckBox1.isDisplayed();
System.out.print("Is displayed status is:"+ isDisplayedStatus);
		

//enabled
boolean isEnabledStatus =CheckBox1.isEnabled();
System.out.print("Is displayed status is:"+ isEnabledStatus);
		
CheckBox1.click();
Thread.sleep(5000);

// selected
boolean isSelectedStatus =CheckBox1.isSelected();
System.out.print("Is displayed status is:"+ isSelectedStatus);

CheckBox1.click();	

	}
	

}
