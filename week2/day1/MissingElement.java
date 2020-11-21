package week2.day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,7,6,8};
		
		Arrays.sort(data); // 1,2,3,4,6,7,8
		
		for (int i = 1; i <= data.length; i++) {
			
			if(i != data[i-1]) {
				
				System.out.println(i);
				break;
			}
			
		}

	}

}
