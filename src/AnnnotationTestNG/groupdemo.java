package AnnnotationTestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groupdemo {
@BeforeGroups(groups = "A")
	public void beforegroup() {
		System.out.print("Befire");
	}
	@AfterGroups(groups = "A")
		public void Aftergroup() {
			System.out.print("value a");
		}
	@Test(groups = "A")
	public void login() {
		System.out.print("value b");
	}
	@Test(groups = "B")
		public void logout() {
			System.out.print("after");
		}
}

