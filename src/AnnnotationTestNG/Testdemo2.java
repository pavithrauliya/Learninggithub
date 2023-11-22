package AnnnotationTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testdemo2 {
	@BeforeSuite
	public void databaseconnection() {
		System.out.print("databaseconnection created"+'\n');
	}
	@AfterSuite
	public void databaseconnectionclosed() {
		System.out.print("databaseconnection closed"+'\n');
	}
	@Test
	public void login() {
		System.out.print("logined is completed"+'\n');
}
}