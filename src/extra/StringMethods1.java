//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

public class StringMethods1 {
	public static void main(String[] args) {

		// 1. Create a String variable and initialize it to whatever you want
		String flavvy = "oyyvyh";
		// 2. Print the 3rd char of your String to the console.

		System.out.println(flavvy.charAt(2));
		// HINT: .charAt
		// 3. Print the length of your String to the console.
		// HINT: .length

		System.out.println(flavvy.length());
		// 4. Using a for loop, print one char at time to the console.
		// HINT: use .length() to determine how many loops

		for (int i = 0; i < flavvy.length(); i++) {
			System.out.print(flavvy.charAt(i));

		}
		// 5. Pick a char inside your String, and use a loop to determine

		char letter = 'h';
		for (int i = 0; i < flavvy.length(); i++) {
			if (flavvy.charAt(i) == letter) {
				System.out.println(" letter h is located at " + i);
			}
		}
		// what position/index in the String the char is located.
		// Print the char's position to the console.
		// EXAMPLE: if your string is "abc" and you are searching
		// for char 'b', then print "b is at index 1"

	}
}
