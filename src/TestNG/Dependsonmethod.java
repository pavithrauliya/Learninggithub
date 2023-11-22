package TestNG;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class Dependsonmethod {
@Test
public void applyleave() {
	Assert.assertEquals(true, true);
	System.out.print("value applyleave");
}
@Test(dependsOnMethods = "applyleave")
public void approveleave() {
	System.out.print("value approveleave");
}
}

