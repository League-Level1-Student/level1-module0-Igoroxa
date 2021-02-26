package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot igor = new Robot();
	Random value = new Random();

	public void run() {
		

		igor.setSpeed(100);
		igor.turn(180);
		igor.move(150);
		igor.turn(90);
		igor.move(250);
		igor.penDown();
		igor.turn(180);

		for (int i = 0; i <= 9; i++) {
			
			drawHouse();

		}

	}
	
	void drawHouse() {
		int newvalue = value.nextInt(100);
		igor.setPenColor(0, 255, 0);
		igor.move(25);
		igor.setRandomPenColor();
		igor.turn(270);
		igor.move(newvalue);
		if (newvalue >= 50) {
			igor.turn(90);
			igor.move(25);
			igor.turn(90);
		}
		else if (newvalue <= 50) {
			
		
			igor.turn(45);
			igor.move(17);
			igor.turn(90);
			igor.move(17);
			igor.turn(45);
		}
		igor.move(newvalue);
		igor.turn(270);
	}
	
	void drawHouse(int height) {
		
		
		igor.setPenColor(0, 255, 0);
		igor.move(25);
		igor.setRandomPenColor();
		igor.turn(270);
		igor.move(height);
		igor.turn(90);
		igor.move(25);
		igor.turn(90);
		igor.move(height);
		igor.turn(270);
	}
	
}
