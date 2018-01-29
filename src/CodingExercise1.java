import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw
String color = JOptionPane.showInputDialog("Would you like your robot to draw in green or blue?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
	 Robot budgie = new Robot();
if(color.equals("green")) {
	budgie.setPenColor(Color.green);
}else {
	budgie.setPenColor(Color.BLUE);
}
   	 // 2. set the pen width to 10
    	  budgie.setPenWidth(10);
   	 // 1. make the Robot draw a shape
    	  for (int i = 0; i < 4; i++) {
    		 budgie.penDown();
    	   	 budgie.move(100);
    	   	 budgie.turn(90);
    	  }
    }

}
