package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> strings = new ArrayList<String>();
		
		
		//   Don't forget to import the ArrayList (java.util) class
strings.add("one");
strings.add("two");
strings.add("three");
strings.add("four");
strings.add("five");

for (int i = 0; i < strings.size(); i++) {
	String j = strings.get(i);
	System.out.println(j);
}
for (String j:strings) {
	System.out.println(j);
	
}
for (int i = 0; i < strings.size(); i+=2) {
	String j=strings.get(i);
	System.out.println(j);
}

for (int i = strings.size()-1; i >= 0; i--) {
	String j=strings.get(i);
	System.out.println(j);
	
}
for (String string : strings) {
	if (string.contains("e")) {
		System.out.println(string);
	}
}


		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
		
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
