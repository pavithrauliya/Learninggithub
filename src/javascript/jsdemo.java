package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();  
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//click on login
WebElement username1=	driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]"));
username1.sendKeys("Admin");
JavascriptExecutor js= (JavascriptExecutor)driver;
// js.executeScript("agruments[0].value='Admin'",  username1);
	// text
	 js.executeScript("document.getElementsByName('password').value='Admin'");
// button
WebElement ele= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
js.executeScript("arguments[0].click()", ele);
// get url
String web1=js.executeScript("return document.URL").toString();
System.out.println("get url of page" + web1);

// get title

String web2=js.executeScript("return document.title").toString();
System.out.println("get url of page" + web2);


	}
}
