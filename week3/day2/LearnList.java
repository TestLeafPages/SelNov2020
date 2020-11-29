package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class LearnList {

	public static void main(String[] args) {

		List<String> values = new LinkedList<String>();

		// method to add values into list ; all the values saved as index
		// values.add(100);
		// values.add(200);

		values.add("Naveen"); //index starts with 0
		values.add("Sam");
		values.add("Hari");
		values.add("Bowya");
		values.add("Sarath");
		values.add("Dhivya"); // size() - 1
		
		values.add("Hari");
		
		//method to remove a value
		values.remove("Hari");
		
		//new list
		List<String> newValues = new LinkedList<String>(values); //to copy data from one list to another list
		
		//to copy values from 1 list to another list
		//newValues.addAll(values);
				
		
		
		int size = values.size();
		
		//System.out.println(values.get(size-1));
		
		//method to sort the collection
		
		Collections.sort(newValues);
		//Collections.reverse(newValues);
		
		
		/*
		 * for (int i = 0; i < size; i++) {
		 * 
		 * System.out.println(values.get(i)+" -- "+newValues.get(i));
		 * 
		 * }
		 */
		
		
		
		  for (String eachValue : newValues) {
		  
		  System.out.println(eachValue);
		  
		  }
		 
		
		
		
		
		

		// method to remove 1 item
		//values.remove("Hari");

		// to get the size of the list
	//	System.out.println(values.size());

	}

}
