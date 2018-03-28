//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		robot.setSpeed(20);
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String input1 = JOptionPane.showInputDialog(null, "How dizzy do you want to make the robot");
int input1v2 = Integer.parseInt(input1);
 // 1. Use the dance method to make the robot spin.

for (int spinNum = 0; spinNum < input1v2; spinNum++) {
	dance(5);
	}
}
	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

