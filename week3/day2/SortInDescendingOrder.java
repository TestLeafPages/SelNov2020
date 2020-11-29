package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortInDescendingOrder {

	public static void main(String[] args) {
		String[] input = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		
		List<String> listValues = new ArrayList<String>();
		
		for (String eachInput : input) {
			
			listValues.add(eachInput);
			
		}
		
		Collections.sort(listValues);
		//to reverse the values in the list
		Collections.reverse(listValues);
		
		for (String eachData : listValues) {
			System.out.println(eachData);
			
		}
		

	}

}
