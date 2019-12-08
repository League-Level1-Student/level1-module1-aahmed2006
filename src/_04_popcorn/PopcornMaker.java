package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		new Microwave();
		String flavor = JOptionPane.showInputDialog("What flavor of popcorn would you like?");
		Microwave.putInMicrowave(new Popcorn(flavor));
		String time = JOptionPane.showInputDialog("How long would you like to cook your popcorn for? (minutes)");
		int t = Integer.parseInt(time);
		Microwave.setTime(t);
		Microwave.startMicrowave();
		Popcorn.eat();
	}
}
