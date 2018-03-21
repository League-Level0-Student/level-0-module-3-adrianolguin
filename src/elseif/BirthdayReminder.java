
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 7th";
		String dadsBirthday = "June 30th";
		String myBirthday = "May 7th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String userBday = JOptionPane.showInputDialog(null, "Who's birthday do you want to know?");
		// 3. Print out what the user typed
		System.out.println("" + userBday );
		// 4. if user asked for "mom"
		if(userBday.equalsIgnoreCase("mom")) {
			System.out.println("" + momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		else if(userBday.equalsIgnoreCase("dad")) {
			System.out.println("" + dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
		else if(userBday.equalsIgnoreCase("Adrian")) {
			System.out.println("" + myBirthday);
		}
	
		else{
		JOptionPane.showMessageDialog(null, "Sorry I don't know " + userBday + "'s birthday"); 
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	
	}
}

