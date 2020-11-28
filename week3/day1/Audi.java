package week3.day1;

public class Audi extends Car{
	
	public void airBag() {
		System.out.println("open airBag");

	}
	
	
	public static void main(String[] args) {
		Audi audi = new Audi();
		
		audi.applyBreak();
		audi.soundHorn();
		audi.driveUsingStearing();
		audi.airBag();
		
	}
	

}
