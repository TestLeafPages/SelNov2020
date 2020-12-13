package testng.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LeafTapsTestCases {
	
	@Test(priority=1)
	public void createLead() {
		System.out.println("create lead");
		throw new NoSuchElementException();
	}
	
	@Test(priority=2, dependsOnMethods = "testng.day2.LeafTapsTestCases.createLead", alwaysRun = true)
	public void editLead() {
		System.out.println("edit lead");
	}
	
	@Test(priority=3)
	public void deleteLead() {
		System.out.println("delete lead");
	}

}
