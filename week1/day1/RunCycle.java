package week1.day1;

public class RunCycle {

	public static void main(String[] args) {
		
     // Write any code here if you like to run the code
		// Syntax: ClassName.methodName();
		String bodyColor = Bicycle.getBodyColor();
		// shortcut to print value : type syso + ctrl + space + then do enter
		System.out.println("The body color of my cycle is "+bodyColor);
		
		// Call the other static method
		Bicycle.rideCycle();
		
		
		/*
		 * Shortcut to store local variable
		 * 0) Click the line where you like to store the variable
		 * 1) Press Ctrl & 2 {at same time}
		 * 2) Release your keys
		 * 3) You will see Quick assistance appearing
		 * 4) Press L
		 */
		
		
		// Call non-static method
		// Create Object for the class
			//ClassName reference = new ClassName();

		// Call the method
			//reference.methodName();
		
		Bicycle cycle = new Bicycle();
		boolean puncture = cycle.isPuncture();
		System.out.println("Is my cycle punctured: "+puncture);
		
		String bodyColors = cycle.getBodyColors("Babu", 2);
		System.out.println("The color of Babu's bicyle is "+bodyColors);
		
		
	}

}
