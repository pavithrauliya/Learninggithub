package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();  
		driver.get("https://accounts.google.com/signup/v2/createaccount?cc=IN&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue%26pli%3D1&dsh=S1343195033%3A1698995321134261&ec=GAlAwAE&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&service=accountsettings&theme=glif&authuser=0");
		driver.findElement(By.xpath("//input[@jsname='YP')]")).sendKeys("pavithra");
		driver.findElement(By.xpath("//input[contains(@jsname,'YPqjbf')]")).sendKeys("pavithra");
		driver.findElement(By.xpath("//input[starts-with(@jsname,'YPqjbf']")).sendKeys("pavithra");
		driver.findElement(By.xpath("//input[starts-with(@aria-label,'First')]")).sendKeys("pavithra");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	//parent to chilld
	driver.findElement(By.xpath("//div[@class='VfPpkd-dgl2Hf-ppHlrf-sM5MNb']/child::button"));
	//child t0 parent
	driver.findElement(By.xpath("//input[@aria-label='Last name (optional)']/parent::div)"));
	//sibbling-forward
	driver.findElement(By.xpath("//input[@aria-label='Last name (optional)']/following-sibling::div)"));
	//sibbling-bacward
	driver.findElement(By.xpath("//input[@aria-label='Last name (optional)']/following-sibling::div)"));
//preciding sibling
	driver.findElement(By.xpath("//div[text()='Last name (optional)']/preceding-sibling::input)"));
	//or 
	driver.findElement(By.xpath("//input[@type='text'or @name='lastName']"));
	}
}