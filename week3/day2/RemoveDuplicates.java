package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String[] input = {"HCL", "Wipro",  "Infosys", "Aspire Systems", "CTS","Infosys"};
		
		Set<String> setValues = new LinkedHashSet<String>();
		
		for (String eachInput : input) {
			
			setValues.add(eachInput);
			
		}
		
				
		for (String eachData : setValues) {
			System.out.println(eachData);
			
		}
		

	}

}
