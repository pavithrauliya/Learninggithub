package chromeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationdisable {

	public static void main(String[] args) {
		
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-javascript");
		option.addArguments("---disable-notification");
		WebDriver driver=new ChromeDriver(option);  
		driver.get("https://www.justdial.com/");

	}

}
