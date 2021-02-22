package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot [] roboArray = new Robot [5];
		//3. use a for loop to initialize the robots.
		Random ran = new Random();
		for (int i = 0; i < roboArray.length; i++) {
			roboArray[i] = new Robot("Bob");
		}
		//4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < roboArray.length; i++) {
			roboArray[i].setSpeed(100);
			roboArray[i].setX(150 + i*100);
		}
		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
		for (int i = 0; i < roboArray.length; i++) {
			roboArray[i].move(ran.nextInt(49));
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
			while (roboArray[i].getY() > 0) {
				roboArray[i].move(ran.nextInt(49));
			}
		//7. declare that robot the winner and throw it a party!
			if (roboArray[i].getY() <= 0) {
				System.out.println("You won!");
			}
		}	
		//8. try different races with different amounts of robots.
		    	
		//9. make the robots race around a circular track.
	}
}
