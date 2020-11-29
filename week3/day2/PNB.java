package week3.day2;

public class PNB implements RBI {

	public void ITLoan() {
		System.out.println(500000);

	}
	
	public void minimumBalance() {
		System.out.println(1000);
		
	}

	
	public void maximumLoanAmount() {
		System.out.println(2000000);
		
	}
	
	public static void main(String[] args) {
		
		PNB pnb = new PNB();
		
		pnb.minimumBalance();
		pnb.maximumLoanAmount();
		
		pnb.ITLoan();
		
	}

}
