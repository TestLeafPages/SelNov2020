package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		
		//String literal
		
		String str = " Hello World ";
		
		System.out.println(str.trim());
		
		
		/*
		 * String str1 = "welcome to java session"; //each character will be saved with
		 * index; index starts with 0
		 * 
		 * String[] words = str1.split(" "); //{"welcome","to","java","session"}
		 * 
		 * 
		 * 
		 * for (int i = words.length-1; i >= 0 ; i--) { System.out.print(words[i]+" ");
		 * }
		 */
		
		
		
		//System.out.println(str1.substring(2));
		
		//System.out.println(str1.substring(1, 5)); // elco
		
		//System.out.println(str1.replace('e', 'x'));
		
	//	System.out.println(str1.replace("e", ""));
		
	//	System.out.println(str1.replaceAll("e", ""));
		
		
		
		
		
		
		/*
		 * char[] charArray = str1.toCharArray(); //{'w','e','l','c','o','m','e'}
		 * 
		 * for (int i = 0; i < charArray.length; i++) {
		 * 
		 * System.out.println(charArray[i]);
		 * 
		 * }
		 */
		
		
		
		
		//method to get single character
		//System.out.println(str1.charAt(0));
		
		
		//method to get the number characters in a String
		//int len = str1.length();
		//System.out.println(len);
		
		//last character index will be length()-1
		//System.out.println(str1.charAt(len-1));
		
		
		/*
		 * for (int i = str1.length()-1; i >= 0; i--) {
		 * 
		 * System.out.print(str1.charAt(i));
		 * 
		 * }
		 */
		
		
		
		
		
		
		//String str2 = "come";
		
		//int num = 1234;
		
		// using new keyword
		//String str3 = new String("Welcome");
		
		
		
		//System.out.println(str1 == str2);
		
		//System.out.println(str1 == str3);
		
		//System.out.println(str1.equals(str3));
		
		//method to compare 2 strings
		//System.out.println(str1.equals(str2));
		
		//method to compare 2 strings and ignore the case 
		//System.out.println(str1.equalsIgnoreCase(str2));
		
		//Method to concatenate 2 strings
		//System.out.println(str1.concat(" ").concat(str2));
		
		//+ is used to concatenate string with other datatype
		//System.out.println(str1+num);
		
		//to do partial match
		//System.out.println(str1.contains(str2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
