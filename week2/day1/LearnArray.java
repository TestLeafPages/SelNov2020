package week2.day1;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// max limit of the array has to be declared at the starting
		// We can not increase / decrease the size of the array at runtime
		// all the data in array will be saved with index
		// index starts from 0
		// int[] values = new int[3];

		 int[] values = {10, 20, 30, 5, 15};
		 
		 
		 for (int tempVar : values) {
			 
			 System.out.println(tempVar);
			
		}
		 
		 
		 
		 
		 

		// values[0] = 10; // first data index always be 0 in array
		// values[1] = 20;
		// values[2] = 30; // index for the last data in an array will be size - 1

		// int size = values.length;

		// System.out.println(size);

		// to sort the array in ascending order
		// Arrays.sort(values);

		
		/*
		 * for (int i = values.length-1; i >= 0 ; i--) {
		 * 
		 * System.out.println(values[i]);
		 * 
		 * }
		 */
		 

		/*
		 * int[][] values = new int[3][2];
		 * 
		 * values[0][0] = 10; values[0][1] = 20;
		 * 
		 * values[1][0] = 30; values[1][1] = 40;
		 * 
		 * values[2][0] = 50; values[2][1] = 60;
		 * 
		 * int rows = values.length; // to get the number of rows in 2D array
		 * 
		 * // System.out.println(rows);
		 * 
		 * // System.out.println(values[0].length);
		 * 
		 * for (int i = 0; i < rows; i++) {
		 * 
		 * for (int j = 0; j < values[i].length; j++) {
		 * 
		 * System.out.println(values[i][j]);
		 * 
		 * }
		 * 
		 * }
		 */

	}

	

}
