//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {
String reyna = "high jumps";
String Ayden = "laser eyes";
String Jacob = "speaking to animals";
String Tam = "power of cats";
String name = JOptionPane.showInputDialog("Enter a name of someone on earth");
if(name.equals("jacob")) {
	JOptionPane.showMessageDialog(null, Jacob);
}
	if(name.equals("reyna")) {
		JOptionPane.showMessageDialog(null, reyna);
	}
	if(name.equals("Ayden")) {
		JOptionPane.showMessageDialog(null, Ayden);
}
	if(name.equals("Tam")) {
	JOptionPane.showMessageDialog(null, Tam);
}
		// 1. Save the superpower for each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. Show the superpower in a pop-up, depending on the name entered. 

	}
}

