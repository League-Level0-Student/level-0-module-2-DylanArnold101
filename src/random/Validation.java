//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie:
		// http://vimeo.com/2485018

		// 2. On paper, write all the numbers that get printed when you run this class
		// 10 times
		// 3,1,2,0,1,1,0,1,1,1

		for (int i = 0; i < 100; i++) {
			int rn = new Random().nextInt(6);
			System.out.println(rn);
			// 3. Use each value of randomNumber to give the user a random compliment.
			if (rn == 0) {
				JOptionPane.showMessageDialog(null, "You truly are the mystery gender");

			} else if (rn == 1) {

				JOptionPane.showMessageDialog(null, "That pimple on your face sings like an angel");
			} else if (rn == 2) {
				JOptionPane.showMessageDialog(null, "Your a winner and winners become lost wages");
			} else if (rn == 3) {
				JOptionPane.showMessageDialog(null,
						"That bald spot on your head reflects light like god and the sun  ");
			} else if (rn == 4) {
				JOptionPane.showMessageDialog(null, "I never knew that your hidden talent was jewish mucus");
			} else if (rn == 5) {
				JOptionPane.showMessageDialog(null, "You will end up just like charles manson");
			}

			// 4. Repeat all the code above 10 times

			// 5. Find someone to test out your program. They will like it :)
		}
	}
}