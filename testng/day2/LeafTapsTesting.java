package testng.day2;

import org.testng.annotations.Test;

public class LeafTapsTesting {
	
	@Test(alwaysRun = true, enabled = false)
	public void duplicateLead() {
		System.out.println("duplicate Lead");

	}

}
