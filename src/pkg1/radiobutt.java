package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx"); 
		driver.manage().window().maximize();
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
	driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
	driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Process.aspx");
WebElement RadioButton=	driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
RadioButton.click();

// is displayed
boolean isDisplayedStatus= RadioButton.isDisplayed();
System.out.print("Is displayed status is:"+ isDisplayedStatus);
//  enbaled

boolean isEnableddStatus= RadioButton.isEnabled();
System.out.print("Is displayed status is:"+ isEnableddStatus);

Thread.sleep(5000);

//unselect
WebElement RadioButton1=	driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_1']"));
RadioButton1.click();
	}

}
