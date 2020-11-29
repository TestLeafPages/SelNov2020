package week3.day2;

public class SBI implements RBI , CIBIL{

	
	public void getCreditScore() {
		System.out.println("90");
		
	}

	
	public void minimumBalance() {
		System.out.println(2000);
		
	}


	public void maximumLoanAmount() {
		System.out.println(500000);
		
	}
	
	public static void main(String[] args) {
		SBI sbi = new SBI();
		
		sbi.maximumLoanAmount();
		sbi.minimumBalance();
		sbi.getCreditScore();
		
		sbi.validScore();
		
		
	}


	
	public void validScore() {
		System.out.println("70%");
		
	}

	
	

}
