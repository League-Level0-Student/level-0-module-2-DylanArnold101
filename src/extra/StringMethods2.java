//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

public class StringMethods2 {
	public static void main(String[] args) {

		// 1. Create a String variable and initialize it with
		// random upper and lower case characters.
		String r = "hIvVVVVVjbVjEbolaJamagsaeg";
		// 2. Print your String to the console in upper case.
		System.out.println(r.toUpperCase());
		// 3. Print your String to the console in lower case.
		System.out.println(r.toLowerCase());
		// 4. Print the first 3 char's of your String
		System.out.println(r.substring(0, 2));
		// HINT: .substring(start,end)

		// 5. Print a single char somewhere in the middle of your String
		// REMINDER: char's in string start at index 0
		System.out.println(r.charAt(10));
		// 6. BONUS -- print the LAST 3 char's of your string using
		System.out.println(r.substring((r.length() - 3), r.length()));
		// .length() to determine WHERE the last 3 char's are located.
	}
}
