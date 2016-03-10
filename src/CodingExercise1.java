/* Level 0 Exam: Coding  Exercise #1 */
import java.awt.Color;
import java.awt.Robot;

import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class CodingExercise1
{
	public static void main(String[] args)
	{
			String x;
		// 3. ask the user what color they would like the tortoise to draw
		x =	JOptionPane.showInputDialog("What color would you like the tortoise to draw?");
		
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if (x.equalsIgnoreCase("green")){
			Tortoise.setPenColor(Color.green); 
		}
		else if(x.equalsIgnoreCase("red")){
			Tortoise.setPenColor(Color.red);
		}
		else if (x.equalsIgnoreCase("blue")){
		Tortoise.setPenColor(Color.BLUE);
		}
		else if(x.equalsIgnoreCase("orange")){
			Tortoise.setPenColor(Color.ORANGE);
		}
		else if (x.equalsIgnoreCase("yellow")){
		Tortoise.setPenColor(Color.yellow);
		}
		else if(x.equalsIgnoreCase("magenta")){
			Tortoise.setPenColor(Color.MAGENTA);
		}
		else {
		Tortoise.setPenColor(Color.BLACK);
		}

		
		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape
		for (int i = 0; i < 4; i++) {
			
		
		Tortoise.move(20);
		Tortoise.turn(90);
		}
	}
}

