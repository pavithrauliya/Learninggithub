package screenshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Fullscreenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();  
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
		Screenshot screenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	    File myfile= new File("C:\\Users\\PU64320\\eclipse-workspace\\Selenium\\Screenshot\\image5.PNG");
	 	ImageIO.write(screenshot.getImage(), "png", myfile);
	
		
		
		
		
	}

}
