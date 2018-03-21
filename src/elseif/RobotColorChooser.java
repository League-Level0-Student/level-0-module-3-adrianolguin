//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot kevin = new Robot("batman");
		kevin.hide();
		kevin.penDown();
		kevin.setSpeed(1000000000);
		//3. Ask the user what color they would like the robot to draw
	for( int times = 0; times < 10; times++) {	
	String input1 = JOptionPane.showInputDialog(null, "What color would you like? Red or blue");
		//5. Use an if/else statement to set the pen color that the user requested
if (input1.equalsIgnoreCase("red")) {
	kevin.setPenColor(255,0,0);
}

else if (input1.equalsIgnoreCase("blue")) {
	kevin.setPenColor(0,10,255);
}
        //6. If the user doesn’t enter anything, choose a random color
else {
	kevin.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
	
		//4. Set the pen width to 10
		kevin.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
for(int x = 0; x < 4; x++) {
	kevin.move(100);
	kevin.turn(90);
}
	}

	}
}
