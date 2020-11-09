package week1.day1;

public class Bicycle {
	
	// add our methods
	//rideCycle
	
	/*
	 * Method Signature
	1) Access Modifier    - public (any one)
							private (only you can see it)
							protected (package + your inherited (child))
							package / default (yourself, your family/apartment (within package))
	*2) Return Type (Output Argument) -> Can be class or primitive data type
	*3) Method Name
	4) Input Arguments  (can be zero arguments or multiple arguments)
	
	*/
	
	public static String getBodyColor() {
		// Here is where you need to write logic
		return "black";
	}
	
	public boolean isPuncture() { // private can be accessible only within the class
		return false;
	}
	
	protected static void rideCycle() {
		System.out.println("I started riding the cycle");
	}
	
	String getBodyColors(String whom, int numWheels) {
		return "green";
	}
	
	
	
	// add our variables
	public String bodyColor = "red";
	public int numWheels = 2;
	boolean isBellPresent = true;
	private float price = 15999.99f;
	double value = 3.33333333;
	protected char logo = 'B';
	
	// Selenium
	// char, boolean, int, String

}
