package pkg1;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urldemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();  
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		driver.manage().window().maximize();
		
String title=	driver.getTitle();
System.out.print("The title is:" +  title);	

String title2=driver.getCurrentUrl();

System.out.print("The title is:" +  title2);
driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading");

Thread.sleep(5000);
driver.navigate().back();



Thread.sleep(5000);
driver.navigate().forward();
Thread.sleep(5000);
driver.navigate().refresh();

	}

}
