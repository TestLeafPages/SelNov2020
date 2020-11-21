package week2.day1;

public class LearnSwitch {

	public static void main(String[] args) {

		//int day = 4;
		int a = 2;
		int b = 3;
		
		String day = "mul";

		switch (day) {
		case "add":
			System.out.println(a+b);
			break;
		case "sub":
			System.out.println(b-a);
			break;
		case "mul":
			System.out.println(a * b);
			break;
		case "div":
			System.out.println(b / a);
			break;
		
		default:
			System.out.println("invalid operator");

		}

		/*
		 * if (day == 1) { System.out.println("Monday"); } else if (day == 2) {
		 * System.out.println("Tuesday"); } else if (day == 3) {
		 * System.out.println("Wednesday"); } else if (day == 4) {
		 * System.out.println("Thursday"); } else if (day == 5) {
		 * System.out.println("Friday"); } else { System.out.println("Weekend"); }
		 */

	}

}
