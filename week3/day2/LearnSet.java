package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebElement;

public class LearnSet {

	public static void main(String[] args) {

		Set<String> values = new TreeSet<String>();

		// method to add values into list ; all the values saved as index
		// values.add(100);
		// values.add(200);

		values.add("Naveen"); //index starts with 0
		values.add("Sam");
		System.out.println(values.add("Hari"));
		values.add("Bowya");
		values.add("Sarath");
		values.add("Dhivya"); // size() - 1
		System.out.println(values.add("Hari"));
		
		//copy the set values into list
		List<String> listValues = new ArrayList<String>(values);
		
		System.out.println(listValues.get(2));
		
		/*
		 * for (String eachValues : values) {
		 * 
		 * System.out.println(eachValues);
		 * 
		 * }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
