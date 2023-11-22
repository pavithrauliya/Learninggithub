package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssvaliodationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();  
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		driver.manage().window().maximize();
	WebElement button=	driver.findElement(By.id("form_submit"));

	//CSS Validation
String text=	button.getCssValue("text-align");
System.out.print("The align:" + text);	

String text1=	button.getCssValue("border-color");
System.out.print("Theborfer :" + text1);

String text2=	button.getCssValue("background-color");
System.out.print("Theborfer :" + text2);

	}

}
