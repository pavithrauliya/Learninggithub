package AnnnotationTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testannotaion {
	@BeforeTest
	public void openbrowser() {
		System.out.print("browser in"+'\n');
	}
	@AfterTest
	public void closebrowser() {
		System.out.print("browser closedin"+'\n');
	}
	@Test
	public void login() {
		System.out.print("logined in"+'\n');
	}
	@Test
	public void logout() {
		System.out.print("logout from application"+'\n');
	}
	@Test
		public void addtocart() {
			System.out.print("Add to the cart"+'\n');
}
}
