//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String input1 = JOptionPane.showInputDialog(null, "Do you like Bananas");
		//2. if they say no, 
		if(input1.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Your crazy!");
			System.exit(0);
		}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		else if (input1.equalsIgnoreCase("yes")) {
		String input2 = JOptionPane.showInputDialog(null, "What is your favortite hobby?");
		JOptionPane.showMessageDialog(null, "" + input2 + " is much better with bananas");
		}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
		else {
			JOptionPane.showMessageDialog(null,"You're Bananas");
		}
	
	}

}
