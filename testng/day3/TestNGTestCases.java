package testng.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestNGTestCases {
	
	@Test
	public void createLead() {
		System.out.println("CreateLead");

	}
	
	@Test
	public void editLead() {
		System.out.println("editLead");
		throw new NoSuchElementException();

	}
	
	@Test
	public void deleteLead() {
		System.out.println("deleteLead");
		
	}

}
