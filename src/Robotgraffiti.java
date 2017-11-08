import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Robotgraffiti {
public static void main(String[] args) {
	Robot jeff = new Robot("vic");
	jeff.penDown();
	jeff.setSpeed(50);
	jeff.setPenColor(Color.cyan);
	jeff.move(200);
	jeff.turn(160);
	jeff.move(200);
	jeff.turn(-160);
	jeff.move(200);
	
}
}
