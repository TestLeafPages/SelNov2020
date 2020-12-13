package testng.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite from base class");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite from base class");
	}
	
	

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test from base class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test from base class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method from base class");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method from base class");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class from base class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class from base class");
	}

}
