import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer= JOptionPane.showInputDialog("what type of tree have fingers");
	// 4. If they got the answer right, pop up "correct!" and increase the score by one

if (answer.equals("plam trees")) {JOptionPane.showMessageDialog(null,"you got it correct");
score = score + 1;
}
else {
	JOptionPane.showMessageDialog(null, "WRONG");
}
	JOptionPane.showMessageDialog(null, "YOUR CURRENT SCORE IS "+ score);
	// 5. Otherwise, say "wrong" and tell them the answer
String cow = JOptionPane.showInputDialog("what do you call a cow with no legs");
 if (cow.equals("Ground beef")) {JOptionPane.showMessageDialog(null, "you got it right");
 }
 else {
	 JOptionPane.showMessageDialog(null, "Wrong :(");
 }
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

