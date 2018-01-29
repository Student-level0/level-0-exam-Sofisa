

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		int year = 2018;
String age = JOptionPane.showInputDialog("What's your age?");
int agenew = Integer.parseInt(age);
int years = year -= agenew;
JOptionPane.showMessageDialog(null,years);
if(agenew >= 30) {
	JOptionPane.showMessageDialog(null, "You are too old to play this game!");
}
}
}


