package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("what flavor of popcorn would you like to make?");
	new Microwave();
	Microwave.putInMicrowave(new Popcorn(flavor));
	String time = JOptionPane.showInputDialog("how long would you like to microwave your popcorn for? (seconds)");
	int t = Integer.parseInt(time);
	Microwave.setTime(t);
	Microwave.startMicrowave();
	Popcorn.eat();
}
}
