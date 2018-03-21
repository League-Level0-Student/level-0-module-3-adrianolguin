//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt((100 - 1) + 1) + 15;
		
		// 2. Print out the random variable above
		System.out.println("" + random);
		// 11. Repeat steps 1 to 10 ten times
		for(int rounds = 0; rounds < 10; rounds++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String input1 = JOptionPane.showInputDialog(null,"Make a guess");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guess = Integer.parseInt(input1);
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			if (guess == random) {
				JOptionPane.showMessageDialog(null, "You win!");
						System.exit(0);
			}
			// 7. if the guess is high
				// 8. Tell them it's too high
			if(guess > random){
				JOptionPane.showMessageDialog(null, "your guess was too high, try again");
			}
			// 9. if the guess is low
				// 10. Tell them it's too low
			if(guess < random){
				JOptionPane.showMessageDialog(null, "your guess was too low, try again");
			}
		}
		// 13. Tell them they lose
		
	}

}


