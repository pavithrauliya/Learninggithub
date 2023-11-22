package TestNG;

import org.testng.annotations.Test;

public class groupdemo {
	@Test(groups = {"login","sanity"})
	public void login_1() {
		System.out.print("value a");
		
	}
		@Test(groups = "login")
	public void login_2() {
		System.out.print("value b");
	}
		@Test(groups = "reset")
		public void reset_1() {
			System.out.print("value c");
		}
		@Test(groups = { "reset","sanity"})
		public void reset_2() {
			System.out.print("value d");
		}
}
