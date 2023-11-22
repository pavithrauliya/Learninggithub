package AnnnotationTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Methoddemon {
	@BeforeMethod
	
	public void login() {
		System.out.print("logined in"+'\n');
	}
	@AfterMethod
		public void logout() {
			System.out.print("logout from application"+'\n');
		}
		@Test
		public void addtocart() {
			System.out.print("Add to the cart"+'\n');
		}
@Test
			public void remove() {
				System.out.print("Removed from cart"+'\n');
			}
}
