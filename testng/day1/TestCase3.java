package testng.day1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase3 extends BaseClass{
	
	@BeforeMethod
	public void beforeMethodInClass() {
		System.out.println("before method from Testcase3");

	}
	
	@Test
	  public void test3() {
		  System.out.println("test3");
	  }
}
