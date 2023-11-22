package pkg1;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;  

public class Pg2Byname {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();  
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx"); 
// driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
	//	 driver.findElement(By.cssSelector("input#ctl00_MainContent_btnDelete"));
	

	//	driver.findElement(By.cssSelector( input[id="ctl00_MainContent_btnDelete"]));
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
driver.findElement(By.id("ctl00_MainContent_login_button")).click();
driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/ul/li[3]/a")).click();
//driver.findElement(By.className("btnDeleteSelected"));
WebElement testDropDown = driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));  
Select dropdown = new Select(testDropDown);  
//dropdown.selectByIndex(0);
//dropdown.selectByValue("MyMoney");
dropdown.selectByVisibleText("FamilyAlbum");
	}
	
}

