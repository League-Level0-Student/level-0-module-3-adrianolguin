package extras;

import javax.swing.JOptionPane;

public class LetterGrade {
	
	public static void main(String[] args) {
		
	String input = JOptionPane.showInputDialog("what did you get on the test, from 0-100");
	
	Double input1 = Double.parseDouble(input);
	
	if (input1 > 100) {
		JOptionPane.showMessageDialog(null, "Error, between 0-100");
	}

	if(input1 >= 97.0 && input1 <= 100) {
		JOptionPane.showMessageDialog(null, "Your letter grade is an A+");
	} else if (input1 >= 94 && input1 <= 96.99) {
		JOptionPane.showMessageDialog(null, "Your letter grade is an A");
	} else if (input1 >= 90 && input1 <= 93.99) {
		JOptionPane.showMessageDialog(null, "Your letter grade is an A-");
	} else if (input1 >= 87 && input1 <= 89.99) {
		JOptionPane.showMessageDialog(null, "Your letter grade is a B+");
	} else if (input1 >= 84 && input1 <= 86.99) {
		JOptionPane.showMessageDialog(null, "Your letter grade is a B");
	} else if (input1 >= 80 && input1 <= 83.99) {
		JOptionPane.showMessageDialog(null, "Your letter grade is a B-");
	} else if (input1 >= 77 && input1 <= 79.99) {
		JOptionPane.showMessageDialog(null, "Your letter grade is a C+");
	} else if (input1 >= 74 && input1 <= 76.99) {
		JOptionPane.showMessageDialog(null, "Your letter grade is a C");
	} else if (input1 >= 70 && input1 <= 73.99) {
		JOptionPane.showMessageDialog(null, "Your letter grade is a C+");
	} else if (input1 >= 67 && input1 <= 69.99) {
		JOptionPane.showMessageDialog(null, "Your letter grade is a D+");
	} else if (input1 >= 64 && input1 <= 66.99) {
		JOptionPane.showMessageDialog(null, "Your letter grade is a D");
	} else if (input1 >= 60 && input1 <= 63.99) {
		JOptionPane.showMessageDialog(null, "Your letter grade is a D-");
	} else if (input1 >= 0 && input1 <= 59.99) {
		JOptionPane.showMessageDialog(null, "Your letter grade is a F");
	}
	
	

}
}