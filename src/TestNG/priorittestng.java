package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class priorittestng {
	@Ignore
	@Test(priority = 2)
public void a() {
	System.out.print("value a");
	
}
	@Test(priority = 1, enabled = false)
public void c() {
	System.out.print("value a");
}
	@Test(priority = 3)
	public void d() {
		System.out.print("value a");
	}
}
