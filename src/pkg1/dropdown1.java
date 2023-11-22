package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();  
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
WebElement dropdn1=		driver.findElement(By.id("dropdown"));
Select selctdropwn= new Select(dropdn1);
selctdropwn.selectByIndex(2);
//get selected value
WebElement selectedoption= selctdropwn.getFirstSelectedOption();
String  value= selectedoption.getText();
System.out.print("value of option dispayed"+  value);
}
}