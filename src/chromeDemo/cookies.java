package chromeDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();  
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			//object of cookies
			Cookie ck1=new Cookie("test1", "test2");
			driver.manage().addCookie(ck1);
			//get cookies
	Set<Cookie> allcookies=	driver.manage().getCookies();
		for(Cookie ck:  allcookies)	{
System.out.print("cookies vales"+ck.getDomain()+""+ck.getName());

// delete cookie
driver.manage().getCookieNamed("orangehrm");
System.out.print("====");
Set<Cookie> allcookiesdelete=	driver.manage().getCookies();
for(Cookie ck2:  allcookiesdelete)	{
System.out.print("cookies vales"+ck1.getDomain()+""+ck1.getName());






}
		}
	}

		}
	


