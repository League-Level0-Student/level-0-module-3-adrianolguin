
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		
for (int x = 0; x < 10; x++) {
	star(50,100 + (x*100),200);
}
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}



static public void star(int starSize, int x, int y) {
	Robot rob = new Robot();
	rob.setSpeed(999999999);
	rob.hide();
	rob.penDown();
	rob.moveTo(x, y);
	for(int star = 0; star < 5; star++) {
	rob.turn(144);
	rob.move(starSize);
	
}
}
}