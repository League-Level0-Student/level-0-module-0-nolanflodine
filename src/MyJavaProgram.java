import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot jeff=new Robot("vic");
	jeff.setSpeed(999);
	jeff.penDown();
	for (int i = 0; i < 1000; i++) {
		jeff.move(300);
		jeff.setRandomPenColor();
		jeff.turn(120);
		
	}
	
	
		
	}
}
