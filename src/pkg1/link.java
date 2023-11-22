package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();  
		driver.get("https://the-internet.herokuapp.com/redirector");
		driver.manage().window().maximize();
		WebElement Links1= driver.findElement(By.linkText("Elemental Selenium"));
		// is displayed
		boolean isDisplayedStatus= Links1.isDisplayed();
		System.out.print("Is displayed status is:"+ isDisplayedStatus);
		//  enbaled

		boolean isEnableddStatus= Links1.isEnabled();
		System.out.print("Is displayed status is:"+ isEnableddStatus);

		Thread.sleep(5000);
//get text
		String  LinkName= Links1.getText();
		System.out.print("value of option dispayed"+ LinkName);
	
		Links1.click();
}
}