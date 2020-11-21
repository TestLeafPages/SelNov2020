package week2.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		
		//for final verification
		int orgNum = input;
			
		int sum = 0;
		
		while(input > 0) {
			
			int rem = input % 10 ; 
								
			sum = sum + (rem * rem * rem);
			
			input = input / 10;
			
		}
		
		if (sum == orgNum) {
			System.out.println("Given input is an Armstrong number");
		}
		else {
			System.out.println("Given input is not an Armstrong number");
		}
		
		
		
		
		
		

	}

}
