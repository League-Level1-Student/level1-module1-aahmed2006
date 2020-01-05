package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		new Microwave();
		String flavor = JOptionPane.showInputDialog("what flavor of popcorn would you like to make?");
		Microwave.putInMicrowave(new Popcorn(flavor));
		String time = JOptionPane.showInputDialog("how long would you like to cook your popcorn? (minutes)");
	int t = Integer.parseInt(time);
	Microwave.setTime(t);
	Microwave.start();
	Popcorn.eat();
	}
}
 