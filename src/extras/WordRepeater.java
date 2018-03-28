package extras;

import javax.swing.JOptionPane;

public class WordRepeater {
	public static void main(String[] args) {
		
		String wrdInput = JOptionPane.showInputDialog(null, "Enter a word");
		
		String numInput1 = JOptionPane.showInputDialog(null, "Enter a number");
		int numInput2 = Integer.parseInt(numInput1);
		
		for(int times = 0; times < numInput2; times++) {
			System.out.println("" + wrdInput);
			
		}
}
}