package week3.day1;

public class Auto extends Vehicle{
	
	public void handStart() {
		System.out.println("hand start");

	}
	
	public static void main(String[] args) {
		
		Auto auto = new Auto();
		
		auto.applyBreak();
		auto.soundHorn();
		auto.handStart();
		
	}

}
